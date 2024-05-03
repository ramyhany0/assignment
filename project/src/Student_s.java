import java.util.Vector;

public class Student_s extends User{
    private Vector<Course_c> cours =new Vector<>();
    public Student_s(String username, String password){
        super(username,password);
    }

    @Override
    String getUserType() {
        return "Student_s";
    }

    public void printCourses(){
        System.out.println("List of Courses Available for " + this.getUsername());
        for(Course_c courseC : cours){
            System.out.println("- " + courseC.getCourseName());
        }
    }



    public Vector<Course_c> getCourses() {
        return cours;
    }

    public void setCourses(Vector<Course_c> cours) {
        this.cours = cours;
    }
}
