package entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@ToString

@Entity
@Table(name = "meeting")
public class Meeting extends BaseEntity {

    @Column(name = "meeting_time")
    private LocalDateTime date;

    @ManyToMany
    @JoinTable(
            name = "employee_meetings",
            joinColumns = @JoinColumn(name = "meeting_id"),
            inverseJoinColumns = @JoinColumn(name = "employee_id")
    )
    private Set<Employee> participants = new HashSet<>();

    public Meeting(LocalDateTime date) {
        this.date = date;
    }

    public void addParticipants(Employee em){
        participants.add(em);
    }
}
