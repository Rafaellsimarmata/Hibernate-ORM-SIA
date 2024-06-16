package dotjava.siahibernateorm;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "teacher")
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @PrimaryKeyJoinColumn
    private Integer teacher_id;

    @NotNull
    private String name;

    @OneToMany(mappedBy = "supervisor", cascade = CascadeType.ALL)
    private Set<Student> studentSupervised = new HashSet<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getTeacher_id() {
        return teacher_id;
    }

    public Set<Student> getStudentSupervised() {
        return studentSupervised;
    }

    public void setStudentSupervised(Set<Student> studentSupervised) {
        this.studentSupervised = studentSupervised;
    }
}
