import java.util.*;
import java.util.concurrent.TimeUnit;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;

class DateException extends Exception{
    public DateException(){
        super();
    }
}
class CreditInsuffisantException extends Exception{
    public  CreditInsuffisantException(){
        super();
    }
}

class Employee {
    String nom;
    String prenom;
    long conjes;

    public Employee(String nom, String prenom, long conjes){
        this.nom = nom;
        this.prenom = prenom;
        this.conjes = conjes;
    }
    public void poserConge(Date dateDebut, Date dateFin) throws DateException, CreditInsuffisantException{
        if ( dateFin.getTime() == dateDebut.getTime())
            throw new DateException();
        long diff = dateFin.getTime() - dateDebut.getTime();
        TimeUnit time = TimeUnit.DAYS;
        long diffrence = time.convert(diff, TimeUnit.MILLISECONDS);
        if (conjes < diff)
            throw new CreditInsuffisantException();
        conjes -= diffrence;
    }
}
public class TestEmployee {
    public static void main(String[] args) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy", Locale.ENGLISH);
            
            Date firstDate = sdf.parse("04/22/2020");
            Date secondDate = sdf.parse("04/27/2020");
            long diff = secondDate.getTime() - firstDate.getTime();
            TimeUnit time = TimeUnit.DAYS;
            long diffrence = time.convert(diff, TimeUnit.MILLISECONDS);
            System.out.println("The difference in days is : "+diffrence+" jours");
            
            if (firstDate.after(secondDate)) System.out.println("Order issue in dates!");
          
            Employee de8bel = new Employee("de8bel", "yasine mohmd", 10);
            de8bel.poserConge(firstDate, secondDate);
        }
        catch (ParseException ex) {
            System.out.println("parsing issue");
        }
        catch (CreditInsuffisantException d){
            System.out.println(d);
        }
        catch (DateException d){
            System.out.println(d);
        }
    }
}
