package entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@NoArgsConstructor
@Getter
@Setter
@ToString(exclude = "employee")

@Entity
@Table(name="phone")
public class Phone extends BaseEntity {

    @Column(name="phone_number")
    private Long phoneNumber;

    @OneToOne
    @JoinColumn(name = "employee_id", nullable = false, unique = true)
    private Employee employee;

    public Phone(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
