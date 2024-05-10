package TP4;

public class User {
    private String email;
    private String firstName;
    private String lastName;
    private Long cin;

    public User(String email, String firstName, String lastName, Long cin) {
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.cin = cin;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setCin(Long cin) {
        this.cin = cin;
    }

    public String getEmail() {
        return email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Long getCin() {
        return cin;
    }
}
