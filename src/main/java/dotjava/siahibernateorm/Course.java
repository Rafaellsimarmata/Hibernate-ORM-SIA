package dotjava.siahibernateorm;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "course")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @PrimaryKeyJoinColumn
    private
    Integer course_id;

    @Column (name = "course_name", nullable = false)
    private String courseName;

    @ManyToOne(fetch = FetchType.LAZY)
    private Teacher teacherTaught;

    @ManyToMany(mappedBy = "courses")
    private Set<Class> classes = new HashSet<>();


    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Teacher getTeacherTaught() {
        return teacherTaught;
    }

    public void setTeacherTaught(Teacher teacherTaught) {
        this.teacherTaught = teacherTaught;
    }

    public Integer getCourse_id() {
        return course_id;
    }
}
