public class Course_c {
    int courseId;
    String courseName;
    public Course_c(int courseId, String courseName){
        this.courseId=courseId;
        this.courseName=courseName;
    }

    public String getCourseName() {
        return courseName;
    }

}
