package entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.HashSet;
import java.util.Set;

@NoArgsConstructor
@Getter
@Setter

@Entity
@Table(name = "organization")
public class Organization extends BaseEntity{

    private String name;

    @OneToMany(mappedBy = "organization")
    private Set<Employee> employees = new HashSet<>();


    public Organization(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Organization{" +
                "name='" + name + '\'' +
                '}';
    }
}
