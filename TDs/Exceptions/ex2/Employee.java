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

public class Employee {
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
