package dotjava.siahibernateorm;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class SiaHibernateOrmApplication {

    public static void main(String[] args) {
        // Load the configuration and build the session factory
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();

        // Start a transaction
        session.beginTransaction();

        // Create Teacher Entity
        Teacher teacher1 = new Teacher();
        teacher1.setName("Gojo Satoruu");
        Student student1 = null;
        teacher1.getStudentSupervised().add(student1);
        Student student2 = null;
        teacher1.getStudentSupervised().add(student2);
        session.save(teacher1);

        Teacher teacher2 = new Teacher();
        teacher2.setName("Kento Nanami");
        session.save(teacher2);

        // Create Student Entity
        student1 = new Student();
        student1.setName("Fushiguro Megumii");
        student1.setSupervisor(teacher1);
        session.save(student1);

        student2 = new Student();
        student2.setName("Yuji Itadori");
        student2.setSupervisor(teacher1);
        session.save(student2);


//        Create Course Entity
        Course course1 = new Course();
        course1.setCourseName("History 101");
        course1.setTeacherTaught(teacher1);
        session.save(course1);

        Course course2 = new Course();
        course2.setCourseName("Math 101");
        course2.setTeacherTaught(teacher2);
        session.save(course2);

        Course course3 = new Course();
        course3.setCourseName("Pyhsics 101");
        course3.setTeacherTaught(teacher2);
        session.save(course3);

        Class class1 = new Class();
        class1.setClass_name("Semester 1");
//        added courses to class
        class1.getCourses().add(course1);
        class1.getCourses().add(course2);
//        added Student to class
        class1.getStudents().add(student2);
        class1.getStudents().add(student1);
        session.save(class1);


//        Entity Score
        Score score1 = new Score();
        score1.setStudent(student1);
        score1.setClassEntity(class1);
        score1.setScore(80);
        session.save(score1);

        // Commit the transaction
        session.getTransaction().commit();

        // Close the session
        session.close();
        sessionFactory.close();


    }


}
