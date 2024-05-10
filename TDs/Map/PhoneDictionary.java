import java.util.TreeMap;
public class PhoneDictionary {
    private TreeMap<String,PhoneEntry> entries;

    public PhoneDictionary(){
        entries = new TreeMap<>();
    }
    public void addEntry(PhoneEntry pe) throws PhoneException{
        if (pe == null)
            throw new PhoneException("ENtry empty");
        if (entries.containsKey(pe.getNom()))
            throw new PhoneException("Entry exist");
        entries.put(pe.getNom(),pe);
    }
    public void removeEntry(PhoneEntry pe) throws PhoneException{
        if (!entries.containsKey(pe.getNom()))
            throw new PhoneException("el camion bagga gay 😒😒😒🍆🍆🍆");
        entries.remove(pe.getNom());
    }
    public void updateEntry(PhoneEntry origin, PhoneEntry updated) throws PhoneException{
        if (!entries.containsKey(pe.getNom()))
            throw new PhoneException("el camion bagga gay 😒😒😒🍆🍆🍆");
        entries.remove(pe.getNom());
        this.addEntry(updated);
    }
}
