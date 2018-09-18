package entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.util.HashSet;
import java.util.Set;

@NoArgsConstructor
@Getter
@Setter
@ToString(exclude = "meetings")

@Entity
@Table(name = "employee")
public class Employee extends BaseEntity {

    @Column(name = "name")
    private String name;

    @Column(name = "position")
    private String position;

    @ManyToOne
    @JoinColumn(name = "organization_id")
    private Organization organization;

    @OneToOne(mappedBy = "employee")
    private Phone phone;

    @ManyToMany(mappedBy = "participants")
    private Set<Meeting> meetings = new HashSet<>();

    public Employee(String name, String position, Organization organization) {
        this.name = name;
        this.position = position;
        this.organization = organization;
    }

}
