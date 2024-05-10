package TP4;
import java.util.ArrayList;


public class StaffMember extends User{
    private String qualification;
    private Integer experience;
    private ArrayList<String> tasks;

    public StaffMember(String email, String firstName, String lastName, Long cin, String qualification, Integer experience, ArrayList<String> tasks) {
        super(email, firstName, lastName, cin);
        this.qualification = qualification;
        this.experience = experience;
        this.tasks = tasks;
    }

    public void displayInfo(){
        System.out.println("Email: "+getEmail());
        System.out.println("First Name: "+getFirstName());
        System.out.println("Last Name: "+getLastName());
        System.out.println("CIN: "+getCin());
        System.out.println("Qualification: "+qualification);
        System.out.println("Experience: "+experience);
    }

    public void addTask(String task){
        tasks.add(task);
    }

    public void updateProfile(String firstName, String lastName, String email){
        setEmail(email);
        setFirstName(firstName);
        setLastName(lastName);
    }

    public boolean authenticate(){
        return true;
    }

    public void finishTask(String task){
        tasks.remove(task);
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public Integer getExperience() {
        return experience;
    }

    public void setExperience(Integer experience) {
        this.experience = experience;
    }

    public ArrayList<String> getTasks() {
        return tasks;
    }

    public void setTasks(ArrayList<String> tasks) {
        this.tasks = tasks;
    }
}
