import java.util.Vector;

public class Main {
    public static void main(String []args){
        Authenticator authenticator=new Authenticator();
        //Initializing Students
        Student student1=new Student("student1", "stuPass1");
        Student student2=new Student("student2", "stuPass2");
        Student student3=new Student("student3", "stuPass3");
        Student student4=new Student("student4", "stuPass4");
        //Initializing Instructors
        Instructor instructor1=new Instructor("instructor1","instPass1");
        Instructor instructor2=new Instructor("instructor2","instPass2");
        Instructor instructor3=new Instructor("instructor3","instPass3");
        Instructor instructor4=new Instructor("instructor4","instPass4");
        //Initializing Courses
        Course course1=new Course(1,"Java Programming");
        Course course2=new Course(2,"Web Development");
        Course course3=new Course(3,"Data Science");
        Course course4=new Course(4,"Machine Learning");
        //Making a Vector of Courses to each Student
        Vector<Course> student1Courses=new Vector<>();
        Vector<Course> student2Courses=new Vector<>();
        Vector<Course> student3Courses=new Vector<>();
        Vector<Course> student4Courses=new Vector<>();
        student1Courses.add(course1);
        student1Courses.add(course3);
        student2Courses.add(course3);
        student2Courses.add(course4);
        student3Courses.add(course2);
        student3Courses.add(course3);
        student4Courses.add(course3);
        student4Courses.add(course4);
        student1.setCourses(student1Courses);
        student2.setCourses(student2Courses);
        student3.setCourses(student3Courses);
        student4.setCourses(student4Courses);
        //Making a Vector of Students for each Instructor
        Vector<Student> instructor1Students=new Vector<>();
        Vector<Student> instructor2Students=new Vector<>();
        Vector<Student> instructor3Students=new Vector<>();
        Vector<Student> instructor4Students=new Vector<>();
        instructor1Students.add(student1);
        instructor1Students.add(student3);
        instructor2Students.add(student2);
        instructor2Students.add(student4);
        instructor3Students.add(student1);
        instructor3Students.add(student4);
        instructor4Students.add(student3);
        instructor4Students.add(student2);
        instructor1.setStudents(instructor1Students);
        instructor2.setStudents(instructor2Students);
        instructor3.setStudents(instructor3Students);
        instructor4.setStudents(instructor4Students);

        //Adding Users
        authenticator.getUsers().add(student1);
        authenticator.getUsers().add(student2);
        authenticator.getUsers().add(student3);
        authenticator.getUsers().add(student4);
        authenticator.getUsers().add(instructor1);
        authenticator.getUsers().add(instructor2);
        authenticator.getUsers().add(instructor3);
        authenticator.getUsers().add(instructor4);
        authenticator.login();

    }

}
