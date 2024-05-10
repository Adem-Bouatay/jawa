import java.util.LinkedList;
class PhoneException extends Exception{
    public PhoneException(String msg){
        super(msg);
    }
}

public class PhoneEntry {
    private String nom;
    private LinkedList<String> numeros;

    public PhoneEntry(String nom, String numero){
        this.nom = nom;
        numeros = new LinkedList<>();
        numeros.add(numero);
    }
    public void ajouter(String num) throws PhoneException{
        if (num.equals(""))
            throw new PhoneException("empty number");
        else if (numeros.contains(num))
            throw new PhoneException("Number exists");
        numeros.add(num);
    }
    public void enlever(String num) throws PhoneException{
        if (!numeros.contains(num))
            throw new PhoneException("phone doesnt exist");
        numeros.remove(num);
    }
    public void modifier(String origin, String newNum) throws PhoneException{
        if (!numeros.contains(origin))
            throw new PhoneException("phone doesnt exist");
        /*this.enlever(origin);
        this.ajouter(newNum);*/
        int index = numeros.indexOf(origin);
        numeros.set(index, newNum);
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }    
}
