import java.util.Vector;

public class Instructor1 extends User{
    private Vector<Student_s> studentS =new Vector<>();

    public Instructor1(String username, String password) {
        super(username, password);
    }

    @Override
    String getUserType() {
        return "Instructor1";
    }

    public void printStudents(){
        System.out.println("List of Students Available for " + this.getUsername());
        for(Student_s studentS : this.studentS){
            System.out.println("- " + studentS.getUsername());
        }
    }
    public Vector<Student_s> getStudents() {
        return studentS;
    }

    public void setStudents(Vector<Student_s> studentS) {
        this.studentS = studentS;
    }
}
