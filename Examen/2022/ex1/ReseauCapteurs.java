import java.util.TreeMap;
import java.util.*;

public class ReseauCapteurs {
    TreeMap<Integer,Capteur> list;

    public ReseauCapteurs(){
        list = new TreeMap<>();
    }
    public void add(Capteur c){
        list.put(c.ID, c);
    }
    public void remove(Capteur c){
        list.remove(c.ID);
    }
    public String getDescriptif(int ID){
        for (int id : list.keySet()) {
            return list.get(id).desc;
        }
        return "";
    }
    public int getMaxIG(){
        int maxID = 0;
        for (int id : list.keySet()){
            maxID = id;
        }
        return maxID;
    }
    public int getMin(){
        /*Iterator it = list.iterator();
        return ((Capteur) it.next()).ID; */
        for(int id : list.keySet()){
            return list.get(id).ID;
        }
        return 0;
    }
    public int size(){
        return list.keySet().size();
    }
    public static void main(String[] args) {
        ReseauCapteurs TCP = new ReseauCapteurs();
        TCP.add(new Capteur(12,"raed gay"));
        TCP.add(new Capteur(11," Amer top g"));
        TCP.add(new Capteur(15, "yassine stfu"));
        TCP.add(new Capteur(1, "bagga"));
        TCP.remove(new Capteur(15, "yassine stfu"));
        System.out.println(TCP.getMaxIG());
    }
}
