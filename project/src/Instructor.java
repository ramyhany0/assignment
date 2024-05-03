import java.util.Vector;

public class Instructor extends User{
    private Vector<Student> students=new Vector<>();

    public Instructor(String username, String password) {
        super(username, password);
    }

    @Override
    String getUserType() {
        return "Instructor";
    }

    public void printStudents(){
        System.out.println("List of Students Available for " + this.getUsername());
        for(Student student :students){
            System.out.println("- " +student.getUsername());
        }
    }
    public Vector<Student> getStudents() {
        return students;
    }

    public void setStudents(Vector<Student> students) {
        this.students = students;
    }
}
