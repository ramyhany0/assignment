import java.util.Vector;

public class Main {
    public static void main(String []args){
        Authent authent =new Authent();
        //Initializing Students
        Student_s studentS1 =new Student_s("studentS1", "stuPass1");
        Student_s studentS2 =new Student_s("studentS2", "stuPass2");
        Student_s studentS3 =new Student_s("studentS3", "stuPass3");
        Student_s studentS4 =new Student_s("studentS4", "stuPass4");
        //Initializing Instructors
        Instructor1 instructor1=new Instructor1("instructor1","instPass1");
        Instructor1 instructor12 =new Instructor1("instructor12","instPass2");
        Instructor1 instructor13 =new Instructor1("instructor13","instPass3");
        Instructor1 instructor14 =new Instructor1("instructor14","instPass4");
        //Initializing Courses
        Course_c courseC1 =new Course_c(1,"Java Programming");
        Course_c courseC2 =new Course_c(2,"Web Development");
        Course_c courseC3 =new Course_c(3,"Data Science");
        Course_c courseC4 =new Course_c(4,"Machine Learning");
        //Making a Vector of Courses to each Student_s
        Vector<Course_c> student1Cours =new Vector<>();
        Vector<Course_c> student2Cours =new Vector<>();
        Vector<Course_c> student3Cours =new Vector<>();
        Vector<Course_c> student4Cours =new Vector<>();
        student1Cours.add(courseC1);
        student1Cours.add(courseC3);
        student2Cours.add(courseC3);
        student2Cours.add(courseC4);
        student3Cours.add(courseC2);
        student3Cours.add(courseC3);
        student4Cours.add(courseC3);
        student4Cours.add(courseC4);
        studentS1.setCourses(student1Cours);
        studentS2.setCourses(student2Cours);
        studentS3.setCourses(student3Cours);
        studentS4.setCourses(student4Cours);
        //Making a Vector of Students for each Instructor1
        Vector<Student_s> instructor1StudentS =new Vector<>();
        Vector<Student_s> instructor2StudentS =new Vector<>();
        Vector<Student_s> instructor3StudentS =new Vector<>();
        Vector<Student_s> instructor4StudentS =new Vector<>();
        instructor1StudentS.add(studentS1);
        instructor1StudentS.add(studentS3);
        instructor2StudentS.add(studentS2);
        instructor2StudentS.add(studentS4);
        instructor3StudentS.add(studentS1);
        instructor3StudentS.add(studentS4);
        instructor4StudentS.add(studentS3);
        instructor4StudentS.add(studentS2);
        instructor1.setStudents(instructor1StudentS);
        instructor12.setStudents(instructor2StudentS);
        instructor13.setStudents(instructor3StudentS);
        instructor14.setStudents(instructor4StudentS);

        //Adding Users
        authent.getUsers().add(studentS1);
        authent.getUsers().add(studentS2);
        authent.getUsers().add(studentS3);
        authent.getUsers().add(studentS4);
        authent.getUsers().add(instructor1);
        authent.getUsers().add(instructor12);
        authent.getUsers().add(instructor13);
        authent.getUsers().add(instructor14);
        authent.login();

    }

}
