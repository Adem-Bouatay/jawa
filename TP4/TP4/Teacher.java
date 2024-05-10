package TP4;
import java.util.*;

public class Teacher  extends User{
    private Long hIndex;
    private ArrayList<Course> courses;

    public Teacher( String firstName, String lastName, String email, Long cin, Long hIndex, ArrayList<Course> courses) {
        super(email, firstName, lastName, cin);
        this.hIndex = hIndex;
        this.courses = courses;
    }

    public void displayInfo(){
        System.out.println("Email: "+getEmail());
        System.out.println("First Name: "+getFirstName());
        System.out.println("Last Name: "+getLastName());
        System.out.println("CIN: "+getCin());
        System.out.println("H-Index: "+hIndex);
    }

    public void addCourse(Course course){
        courses.add(course);
    }

    public void updateProfile(String firstName, String lastName, String email){
        setEmail(email);
        setFirstName(firstName);
        setLastName(lastName);
    }

    public boolean authenticate(){
        return true;
    }

    public void displayCoursesContent(){
        for (Course course : courses) {
            System.out.println("Course: "+course.getName());
            System.out.println("Coef: "+course.getCoef());
            System.out.println("Contents: ");
            for (String content : course.getContents()) {
                System.out.println(content);
            }
        }
    }

    public Long getHIndex() {
        return hIndex;
    }

    public void setHIndex(Long hIndex) {
        this.hIndex = hIndex;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<Course> courses) {
        this.courses = courses;
    }
    
}
