package TP4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("student1", "student1", "student@email.com", 12345L, 15.0, Classe.IA1_2, Status.NON_REDOUBLANT);
        student.displayInfo();
        student.updateProfile("student11", "student11", "john.doe.new@email.com");
        student.displayInfo();
        boolean isAuthenticatedStudent = student.authenticate();
        System.out.println("Student Authentication: " + isAuthenticatedStudent);
        Course mathCourse = new Course("Math", new ArrayList<String>(List.of("Algebra", "Calculus")), 2.0f);
        Course physicsCourse = new Course("Physics", new ArrayList<String>(List.of("Mechanics", "Thermodynamics")),
        1.5f);
        Teacher teacher = new Teacher("teacher1", "teacher1", "teacher1@email.com", 67890L, 12L, new ArrayList<Course>(List.of(mathCourse, physicsCourse)));
        teacher.setHIndex(10L);
        teacher.displayInfo();
        teacher.displayCoursesContent();
        StaffMember staffMember = new StaffMember("member1", "member1", "member1@email.com", 11111L,"Engineer",5, new ArrayList<String>(List.of("Task1", "Task2", "Task3")));
        staffMember.displayInfo();
        staffMember.finishTask("Task2");
        staffMember.displayInfo();
        }   
}
