import java.util.Objects;
import java.util.Scanner;
import java.util.Vector;

public class Authent {
    Vector<User> users=new Vector<>();
    public void login(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Username: ");
        String username=sc.nextLine();
        System.out.print("Enter Password: ");
        String password=sc.nextLine();
        User user=checkCredentials(username,password);
        if(user!=null){
            System.out.println("Login Successfully");
            String type=user.getUserType();
            if(Objects.equals(type, "Student_s")){
                ((Student_s) user).printCourses();
            } else if (Objects.equals(type, "Instructor")) {
                ((Instructor) user).printStudents();
            }
        }
        else{
            System.out.println("Invalid Username or Password! Try again.");
            login();
        }
    }
    public User checkCredentials(String username,String password){
        for( User user : users ){
            if(Objects.equals(user.getUsername(), username) && Objects.equals(user.getPassword(), password)){
                return user;
            }
        }
        return null;
    }

    public Vector<User> getUsers() {
        return users;
    }

    public void setUsers(Vector<User> users) {
        this.users = users;
    }
}
