package by.kolbun.andersen;

import javax.persistence.*;

@Entity
@Table(name = "developers")
public class Developer {
    @Id
    @GeneratedValue
    private Integer id;
    @Column(name = "name", length = 50)
    private String name;
    @Column(name = "name", length = 50)
    private String specialty;
    @Column(name = "salary")
    private Integer salary;

    public Developer() {
    }

    public Developer(String name, String specialty, Integer salary) {
        this.name = name;
        this.specialty = specialty;
        this.salary = salary;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }
}
