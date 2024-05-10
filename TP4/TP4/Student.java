package TP4;

enum Classe{
    IA1_1,
    IA1_2,
    GTE1
}

enum Status{
    REDOUBLANT,
    NON_REDOUBLANT
}

public class Student extends User{
    private Double average;
    private Classe classe;
    private Status status;

    public Student(String email, String firstName, String lastName, Long cin, Double average, Classe classe, Status status) {
        super(email, firstName, lastName, cin);
        this.average = average;
        this.classe = classe;
        this.status = status;
    }
    public void displayInfo(){
        System.out.println("Email: "+getEmail());
        System.out.println("First Name: "+getFirstName());
        System.out.println("Last Name: "+getLastName());
        System.out.println("CIN: "+getCin());
        System.out.println("Average: "+average);
        System.out.println("Classe: "+classe);
        System.out.println("Status: "+status);
    }
    public void updateProfile(String firstName, String lastName, String email){
        setEmail(email);
        setFirstName(firstName);
        setLastName(lastName);
    }

    public boolean authenticate(){
        return true;
    }
    public Double getAverage() {
        return average;
    }
    public void setAverage(Double average) {
        this.average = average;
    }
    public Classe getClasse() {
        return classe;
    }
    public void setClasse(Classe classe) {
        this.classe = classe;
    }
    public Status getStatus() {
        return status;
    }
    public void setStatus(Status status) {
        this.status = status;
    }
}
