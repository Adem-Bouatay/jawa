import java.util.ArrayList;

public class Entreprise {
    @SuppressWarnings("unused")
    private String nom;
    @SuppressWarnings("unused")
    private String adresse;
    private ArrayList<Employee> list;

    public Entreprise(String nom, String adresse){
        this.nom = nom;
        this.adresse = adresse;
        list = new ArrayList<>();
    }
    public void ajouter(Employee e){
        list.add(e);
    }
    public  boolean chercher(int id){
        for(Employee e : list){
            if (e.getID() == id)
                return true;
        }
        return false;
    }
    public void afficher(){
        for(Employee e: list){
            System.out.println(e);
        }
    }
}
