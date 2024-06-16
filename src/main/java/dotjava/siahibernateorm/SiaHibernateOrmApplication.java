package dotjava.siahibernateorm;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;


public class SiaHibernateOrmApplication {

    public static void main(String[] args) {
        // Load the configuration and build the session factory
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();

        // Start a transaction
        session.beginTransaction();

//        create Entity Student
        Student student1 = null;
        Student student2 = null;
        Student student3 = null;
        Student student4 = null;
        Student student5 = null;
        Student student6 = null;
        Student student7 = null;
        Student student8 = null;
        Student student9 = null;
        Student student10 = null;
        Student student11 = null;
        Student student12 = null;
        Student student13 = null;
        Student student14 = null;
        Student student15 = null;
        Student student16 = null;
        Student student17 = null;
        Student student18 = null;
        Student student19 = null;
        Student student20 = null;


        // Create Teacher Entity
        Teacher teacher1 = new Teacher();
        teacher1.setName("Gojo Satoruu");
        teacher1.getStudentSupervised().add(student1);
        teacher1.getStudentSupervised().add(student2);
        teacher1.getStudentSupervised().add(student3);
        teacher1.getStudentSupervised().add(student4);
        teacher1.getStudentSupervised().add(student5);
        session.save(teacher1);

        Teacher teacher2 = new Teacher();
        teacher2.setName("Kento Nanami");
        teacher2.getStudentSupervised().add(student6);
        teacher2.getStudentSupervised().add(student7);
        teacher2.getStudentSupervised().add(student8);
        teacher2.getStudentSupervised().add(student9);
        teacher2.getStudentSupervised().add(student10);
        session.save(teacher2);

        Teacher teacher3 = new Teacher();
        teacher3.setName("Voxy D Forge");
        teacher3.getStudentSupervised().add(student11);
        teacher3.getStudentSupervised().add(student12);
        teacher3.getStudentSupervised().add(student13);
        teacher3.getStudentSupervised().add(student14);
        teacher3.getStudentSupervised().add(student15);
        session.save(teacher3);

        Teacher teacher4 = new Teacher();
        teacher4.setName("Papa Zola");
        teacher4.getStudentSupervised().add(student16);
        teacher4.getStudentSupervised().add(student17);
        teacher4.getStudentSupervised().add(student18);
        teacher4.getStudentSupervised().add(student19);
        teacher4.getStudentSupervised().add(student20);
        session.save(teacher4);

        // Create Student Entity
        student1 = new Student();
        student1.setName("Fushiguro Megumi");
        student1.setSupervisor(teacher1);
        session.save(student1);

        student2 = new Student();
        student2.setName("Yuji Itadori");
        student2.setSupervisor(teacher1);
        session.save(student2);

        student3 = new Student();
        student3.setName("Nobara Kugisaki");
        student3.setSupervisor(teacher1);
        session.save(student3);

        student4 = new Student();
        student4.setName("Alavaro Marcelino");
        student4.setSupervisor(teacher1);
        session.save(student4);

        student5 = new Student();
        student5.setName("Emma Johnson");
        student5.setSupervisor(teacher1);
        session.save(student5);

        student6 = new Student();
        student6.setName("Olivia Brown");
        student6.setSupervisor(teacher2);
        session.save(student6);

        student7 = new Student();
        student7.setName("Ava Jones");
        student7.setSupervisor(teacher2);
        session.save(student7);

        student8 = new Student();
        student8.setName("Sophia Garcia");
        student8.setSupervisor(teacher2);
        session.save(student8);

        student9 = new Student();
        student9.setName("Isabella Martinez");
        student9.setSupervisor(teacher2);
        session.save(student9);

        student10 = new Student();
        student10.setName("Mia Davis");
        student10.setSupervisor(teacher2);
        session.save(student10);

        student11 = new Student();
        student11.setName("Rafhael Sumbayak");
        student11.setSupervisor(teacher3);
        session.save(student11);

        student12 = new Student();
        student12.setName("Harper Wilson");
        student12.setSupervisor(teacher3);
        session.save(student12);

        student13 = new Student();
        student13.setName("Prima Haganta");
        student13.setSupervisor(teacher3);
        session.save(student13);

        student14 = new Student();
        student14.setName("Adli Hidayat");
        student14.setSupervisor(teacher3);
        session.save(student14);

        student15 = new Student();
        student15.setName("Evelyn Thomas");
        student15.setSupervisor(teacher3);
        session.save(student15);

        student16 = new Student();
        student16.setName("Abigail Hernandez");
        student16.setSupervisor(teacher4);
        session.save(student16);

        student17 = new Student();
        student17.setName("Emily Lopez");
        student17.setSupervisor(teacher4);
        session.save(student17);

        student18 = new Student();
        student18.setName("Ella Gonzalez");
        student18.setSupervisor(teacher4);
        session.save(student18);

        student19 = new Student();
        student19.setName("Elizabeth Moore");
        student19.setSupervisor(teacher4);
        session.save(student19);

        student20 = new Student();
        student20.setName("Camila Taylor");
        student20.setSupervisor(teacher4);
        session.save(student20);


//        Create Course Entity
        Course course1 = new Course();
        course1.setCourseName("History 101");
        course1.setCourseCode("Hist101");
        course1.setTeacherTaught(teacher1);
        session.save(course1);

        Course course2 = new Course();
        course2.setCourseName("Math 101");
        course2.setTeacherTaught(teacher2);
        course2.setCourseCode("Math101");
        session.save(course2);

        Course course3 = new Course();
        course3.setCourseName("Pyhsics 101");
        course3.setTeacherTaught(teacher3);
        course3.setCourseCode("Phy101");
        session.save(course3);

        Course course4 = new Course();
        course4.setCourseName("Computer Science 101");
        course4.setTeacherTaught(teacher4);
        course4.setCourseCode("Comp101");
        session.save(course4);

        Class class1 = new Class();
        class1.setClass_name("Kom A");
//        added courses to class
        class1.getCourses().add(course1);
        class1.getCourses().add(course2);
        class1.getCourses().add(course3);
        class1.getCourses().add(course4);
//        added Student to class
        class1.getStudents().add(student2);
        class1.getStudents().add(student1);
        session.save(class1);

        Class class2 = new Class();
        class2.setClass_name("Kom B");
//        added courses to class
        class2.getCourses().add(course1);
        class2.getCourses().add(course2);
        class2.getCourses().add(course3);
        class2.getCourses().add(course4);
//        added Student to class
        class2.getStudents().add(student3);
        class2.getStudents().add(student4);
        session.save(class2);

        Class class3 = new Class();
        class3.setClass_name("Kom C");
//        added courses to class
        class3.getCourses().add(course1);
        class3.getCourses().add(course2);
        class3.getCourses().add(course3);
        class3.getCourses().add(course4);
//        added Student to class
        class3.getStudents().add(student5);
        class3.getStudents().add(student6);
        session.save(class3);

        Class class4 = new Class();
        class4.setClass_name("Kom D");
//        added courses to class
        class4.getCourses().add(course1);
        class4.getCourses().add(course2);
        class4.getCourses().add(course3);
        class4.getCourses().add(course4);
//        added Student to class
        class4.getStudents().add(student7);
        class4.getStudents().add(student8);
        session.save(class4);


//        Entity Score
        // Assuming you have already declared and created student1 to student20 and course1 to course3

        Score score1 = new Score();
        score1.setStudent(student1);
        score1.setCourse(course1);
        score1.setScore(95);
        session.save(score1);

        Score score2 = new Score();
        score2.setStudent(student1);
        score2.setCourse(course2);
        score2.setScore(88);
        session.save(score2);

        Score score3 = new Score();
        score3.setStudent(student1);
        score3.setCourse(course3);
        score3.setScore(78);
        session.save(score3);

        Score score4 = new Score();
        score4.setStudent(student2);
        score4.setCourse(course1);
        score4.setScore(70);
        session.save(score4);

        Score score5 = new Score();
        score5.setStudent(student2);
        score5.setCourse(course2);
        score5.setScore(90);
        session.save(score5);

        Score score6 = new Score();
        score6.setStudent(student2);
        score6.setCourse(course3);
        score6.setScore(85);
        session.save(score6);

        Score score7 = new Score();
        score7.setStudent(student3);
        score7.setCourse(course1);
        score7.setScore(82);
        session.save(score7);

        Score score8 = new Score();
        score8.setStudent(student3);
        score8.setCourse(course2);
        score8.setScore(77);
        session.save(score8);

        Score score9 = new Score();
        score9.setStudent(student3);
        score9.setCourse(course3);
        score9.setScore(69);
        session.save(score9);

        Score score10 = new Score();
        score10.setStudent(student4);
        score10.setCourse(course1);
        score10.setScore(91);
        session.save(score10);

        Score score11 = new Score();
        score11.setStudent(student4);
        score11.setCourse(course2);
        score11.setScore(85);
        session.save(score11);

        Score score12 = new Score();
        score12.setStudent(student4);
        score12.setCourse(course3);
        score12.setScore(79);
        session.save(score12);

        Score score13 = new Score();
        score13.setStudent(student5);
        score13.setCourse(course1);
        score13.setScore(80);
        session.save(score13);

        Score score14 = new Score();
        score14.setStudent(student5);
        score14.setCourse(course2);
        score14.setScore(87);
        session.save(score14);

        Score score15 = new Score();
        score15.setStudent(student5);
        score15.setCourse(course3);
        score15.setScore(90);
        session.save(score15);

        Score score16 = new Score();
        score16.setStudent(student6);
        score16.setCourse(course1);
        score16.setScore(92);
        session.save(score16);

        Score score17 = new Score();
        score17.setStudent(student6);
        score17.setCourse(course2);
        score17.setScore(84);
        session.save(score17);

        Score score18 = new Score();
        score18.setStudent(student6);
        score18.setCourse(course3);
        score18.setScore(76);
        session.save(score18);

        Score score19 = new Score();
        score19.setStudent(student7);
        score19.setCourse(course1);
        score19.setScore(88);
        session.save(score19);

        Score score20 = new Score();
        score20.setStudent(student7);
        score20.setCourse(course2);
        score20.setScore(81);
        session.save(score20);

        Score score21 = new Score();
        score21.setStudent(student7);
        score21.setCourse(course3);
        score21.setScore(73);
        session.save(score21);

        Score score22 = new Score();
        score22.setStudent(student8);
        score22.setCourse(course1);
        score22.setScore(89);
        session.save(score22);

        Score score23 = new Score();
        score23.setStudent(student8);
        score23.setCourse(course2);
        score23.setScore(82);
        session.save(score23);

        Score score24 = new Score();
        score24.setStudent(student8);
        score24.setCourse(course3);
        score24.setScore(74);
        session.save(score24);

        Score score25 = new Score();
        score25.setStudent(student9);
        score25.setCourse(course1);
        score25.setScore(90);
        session.save(score25);

        Score score26 = new Score();
        score26.setStudent(student9);
        score26.setCourse(course2);
        score26.setScore(83);
        session.save(score26);

        Score score27 = new Score();
        score27.setStudent(student9);
        score27.setCourse(course3);
        score27.setScore(75);
        session.save(score27);

        Score score28 = new Score();
        score28.setStudent(student10);
        score28.setCourse(course1);
        score28.setScore(91);
        session.save(score28);

        Score score29 = new Score();
        score29.setStudent(student10);
        score29.setCourse(course2);
        score29.setScore(84);
        session.save(score29);

        Score score30 = new Score();
        score30.setStudent(student10);
        score30.setCourse(course3);
        score30.setScore(76);
        session.save(score30);

        Score score31 = new Score();
        score31.setStudent(student11);
        score31.setCourse(course1);
        score31.setScore(92);
        session.save(score31);

        Score score32 = new Score();
        score32.setStudent(student11);
        score32.setCourse(course2);
        score32.setScore(85);
        session.save(score32);

        Score score33 = new Score();
        score33.setStudent(student11);
        score33.setCourse(course3);
        score33.setScore(77);
        session.save(score33);

        Score score34 = new Score();
        score34.setStudent(student12);
        score34.setCourse(course1);
        score34.setScore(93);
        session.save(score34);

        Score score35 = new Score();
        score35.setStudent(student12);
        score35.setCourse(course2);
        score35.setScore(86);
        session.save(score35);

        Score score36 = new Score();
        score36.setStudent(student12);
        score36.setCourse(course3);
        score36.setScore(78);
        session.save(score36);

        Score score37 = new Score();
        score37.setStudent(student13);
        score37.setCourse(course1);
        score37.setScore(94);
        session.save(score37);

        Score score38 = new Score();
        score38.setStudent(student13);
        score38.setCourse(course2);
        score38.setScore(87);
        session.save(score38);

        Score score39 = new Score();
        score39.setStudent(student13);
        score39.setCourse(course3);
        score39.setScore(79);
        session.save(score39);

        Score score40 = new Score();
        score40.setStudent(student14);
        score40.setCourse(course1);
        score40.setScore(95);
        session.save(score40);

        Score score41 = new Score();
        score41.setStudent(student14);
        score41.setCourse(course2);
        score41.setScore(88);
        session.save(score41);

        Score score42 = new Score();
        score42.setStudent(student14);
        score42.setCourse(course3);
        score42.setScore(80);
        session.save(score42);

        Score score43 = new Score();
        score43.setStudent(student15);
        score43.setCourse(course1);
        score43.setScore(96);
        session.save(score43);

        Score score44 = new Score();
        score44.setStudent(student15);
        score44.setCourse(course2);
        score44.setScore(89);
        session.save(score44);

        Score score45 = new Score();
        score45.setStudent(student15);
        score45.setCourse(course3);
        score45.setScore(81);
        session.save(score45);

        Score score46 = new Score();
        score46.setStudent(student16);
        score46.setCourse(course1);
        score46.setScore(97);
        session.save(score46);

        Score score47 = new Score();
        score47.setStudent(student16);
        score47.setCourse(course2);
        score47.setScore(90);
        session.save(score47);

        Score score48 = new Score();
        score48.setStudent(student16);
        score48.setCourse(course3);
        score48.setScore(82);
        session.save(score48);

        Score score49 = new Score();
        score49.setStudent(student17);
        score49.setCourse(course1);
        score49.setScore(98);
        session.save(score49);

        Score score50 = new Score();
        score50.setStudent(student17);
        score50.setCourse(course2);
        score50.setScore(91);
        session.save(score50);

        Score score51 = new Score();
        score51.setStudent(student17);
        score51.setCourse(course3);
        score51.setScore(83);
        session.save(score51);

        Score score52 = new Score();
        score52.setStudent(student18);
        score52.setCourse(course1);
        score52.setScore(99);
        session.save(score52);

        Score score53 = new Score();
        score53.setStudent(student18);
        score53.setCourse(course2);
        score53.setScore(92);
        session.save(score53);

        Score score54 = new Score();
        score54.setStudent(student18);
        score54.setCourse(course3);
        score54.setScore(84);
        session.save(score54);

        Score score55 = new Score();
        score55.setStudent(student19);
        score55.setCourse(course1);
        score55.setScore(100);
        session.save(score55);

        Score score56 = new Score();
        score56.setStudent(student19);
        score56.setCourse(course2);
        score56.setScore(93);
        session.save(score56);

        Score score57 = new Score();
        score57.setStudent(student19);
        score57.setCourse(course3);
        score57.setScore(85);
        session.save(score57);

        Score score58 = new Score();
        score58.setStudent(student20);
        score58.setCourse(course1);
        score58.setScore(96);
        session.save(score58);

        Score score59 = new Score();
        score59.setStudent(student20);
        score59.setCourse(course2);
        score59.setScore(94);
        session.save(score59);

        Score score60 = new Score();
        score60.setStudent(student20);
        score60.setCourse(course3);
        score60.setScore(86);
        session.save(score60);



        // Commit the transaction
        session.getTransaction().commit();

        System.out.println("Student Name : "+student1.getName() + " GPA : " +student1.getGPA(student1.getStudent_id()));
        System.out.println("Student Name : "+student2.getName() + " GPA : " +student2.getGPA(student2.getStudent_id()));
        System.out.println("Student Name : "+student15.getName() + " GPA : " +student15.getGPA(student15.getStudent_id()));
        System.out.println();


        student4.printStudyTranscript(student4.getStudent_id());

        // Close the session
        session.close();
        sessionFactory.close();



    }


}
