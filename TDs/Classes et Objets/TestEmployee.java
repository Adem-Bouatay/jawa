import java.util.Scanner;
public class TestEmployee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Entreprise cts = new Entreprise("cts","sousse");
        while(true){
            int id;String firstName;String lastName;char raise;
            System.out.println("Employee id:");
            id = sc.nextInt();
            if (id == 0)
                break;
            System.out.println("Employee first name:");
            firstName = sc.next();
            System.out.println("Employee last name:");
            lastName = sc.next();
            System.out.println("Employee salary:");
            int salary = sc.nextInt();
            Employee e = new Employee(id,firstName,lastName,salary);
            System.out.println("Want to give him a raise? [Y/N]");
            raise = sc.next().charAt(0);
            if (raise == 'Y' || raise == 'y'){
                System.out.println("raise percentage: ");
                System.out.println(e.raiseSalary(sc.nextInt()));
            }
            cts.ajouter(e);
        }
        cts.afficher();
        sc.close();
    }
}
