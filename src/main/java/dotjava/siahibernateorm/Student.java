package dotjava.siahibernateorm;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @PrimaryKeyJoinColumn
    private Integer student_id;

    @Column (name = "name", nullable = false)
    private String name;

    @ManyToOne
    @JoinColumn(name = "supervisor_teacher_id")
    private Teacher supervisor;

    @ManyToMany(mappedBy = "students")
    private Set<Class> classes = new HashSet<>();

    @OneToMany(mappedBy = "student", cascade = CascadeType.ALL)
    private Set<Score> scores= new HashSet<>();

    public Float getGPA(Integer studentId){
        Integer totalScore = 0;
        Integer totalTakenCourse = 0;


        for (Score score : scores) {
            if (score.getStudent().getStudent_id().equals(studentId)) {
                totalTakenCourse += 1;
                totalScore +=  score.getScore();
            }
        }

        return (float) (totalScore / totalTakenCourse) / 25;
    }


    public void printStudyTranscript(Integer studentId){
        System.out.print("Course Code   |");
        System.out.print("Course Name   |");
        System.out.println("Score |");
        for (Score score : scores) {
            if (score.getStudent().getStudent_id().equals(studentId)) {
                System.out.print(score.getCourse().getCourseCode() + "    |");
                System.out.print(score.getCourse().getCourseName() + "    |");
                System.out.println(score.getScore() + " |");
            }
        }
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getStudent_id() {
        return student_id;
    }

    public Teacher getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(Teacher supervisor) {
        this.supervisor = supervisor;
    }
}
