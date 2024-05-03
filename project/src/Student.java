import java.util.Vector;

public class Student extends User{
    private Vector<Course> courses=new Vector<>();
    public Student(String username,String password){
        super(username,password);
    }

    @Override
    String getUserType() {
        return "Student";
    }

    public void printCourses(){
        System.out.println("List of Courses Available for " + this.getUsername());
        for(Course course :courses){
            System.out.println("- " +course.getCourseName());
        }
    }



    public Vector<Course> getCourses() {
        return courses;
    }

    public void setCourses(Vector<Course> courses) {
        this.courses = courses;
    }
}
