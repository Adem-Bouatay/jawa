package ExerciceX;
import java.util.*;

/**
 * Exercice1
 */
public class Exercice1 {
    public static void main(String[] args) {
    // Exemple de conversions explicites des références
    BankAccount account = new SavingsAccount(201, 3.5);
    SavingsAccount savingsAccount = (SavingsAccount) account;
    System.out.println("Conversion explicite réussie : " + (savingsAccount != null));
    BankAccount anotherAccount = new CheckingAccount(202, 1000.0);
    CheckingAccount checkingAccount = (CheckingAccount) anotherAccount;
    System.out.println("Conversion explicite réussie : " + (checkingAccount != null));
    // Test de fonctionnalité existante
    SavingsAccount savingsAccount1 = new SavingsAccount(101, 5.0);
    savingsAccount1.deposit(1000.0);
    savingsAccount1.withdraw(200.0);
    System.out.println("Solde du compte épargne : " + savingsAccount1.getBalance());
    CheckingAccount checkingAccount1 = new CheckingAccount(102, 500.0);
    checkingAccount1.deposit(1500.0);
    checkingAccount1.withdraw(800.0);
    System.out.println("Solde du compte chèque : " + checkingAccount1.getBalance());
    Customer customer = new Customer("John", "Doe");
    customer.addAccount(savingsAccount1);
    customer.addAccount(checkingAccount1);
    System.out.println("Solde total du client : " + customer.getTotalAccountBalance());
    Bank bank = new Bank();
    bank.addCustomer(customer);
    System.out.println("Solde total de la banque : " + bank.getTotalBalance());
    }
}

class BankAccount{
    protected int accountNumber;
    protected double balance;

    public BankAccount(double balance){
        accountNumber = 0;
        this.balance = balance;
    }
    public void deposit(double montant){
        balance += montant;
    }
    public void withdraw(double montant){
        balance -= montant;
    }
    public double getBalance(){
        return balance;
    }
}
class SavingsAccount extends BankAccount{
    private double interestRate;

    public SavingsAccount(double balance, double interestRate){
        super(balance);
        this.interestRate = interestRate;
    }
    public double calculateInterest(){
        return (balance + balance * interestRate);
    }
    public double getInterestRate(){
        return interestRate;
    }
    public void withdraw(double montant){
        balance -= montant + 10;
    }
}
class CheckingAccount extends BankAccount{
    private double overdraftAllowed;

    public CheckingAccount(double balance, double overdraftAllowed){
        super(balance);
        this.overdraftAllowed = overdraftAllowed;

    }
    public void setOverdraftAllowed(Double overdraftAllowed){
        this.overdraftAllowed = overdraftAllowed;
    }
    public double getOverdraftAllowed(){
        return overdraftAllowed;
    }
    public void withdraw(double montant){
        if (balance - montant < overdraftAllowed){
            System.out.println("montant excede");
        } else {
            balance -= montant;
        }
    }
}
class Customer{
    private String firstName;
    private String lastName;
    private ArrayList<BankAccount> accounts;

    public Customer(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        accounts = new ArrayList<BankAccount>();
    }
    public void addAccount(BankAccount account){
        accounts.add(account);
    }
    public void removeAccount(BankAccount account){
        accounts.remove(account);
    }
    public double getTotalAccountBalance(){
        double total = 0;
        for (BankAccount account : accounts){
            total += account.getBalance();
        }
        return total;
    }
    public void transferFunds(BankAccount sourceAccount, BankAccount destinationAccount, double montant){
        sourceAccount.withdraw(montant);
        destinationAccount.deposit(montant);
    }
}
class Bank{
    private ArrayList<Customer> clients;

    public Bank(){
        clients = new ArrayList<Customer>();
    }
    public void addCustomer(Customer customer){
        clients.add(customer);
    }
    public void removeCustomer(Customer customer){
        clients.remove(customer);
    }
    public double getTotalBalance(){
        double total = 0;
        for (Customer customer : clients){
            total += customer.getTotalAccountBalance();
        }
        return total;
    }
}
