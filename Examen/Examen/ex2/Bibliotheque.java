import java.util.TreeMap;

import java.util.ArrayList;

public class Bibliotheque {
    TreeMap<Integer, Livre> Bib;
    public Bibliotheque(){
        Bib = new TreeMap<>();
    }
    public void ajouterLivre(Livre l) throws LivreException{
        if (Bib.containsKey(l.getId()))
            throw new LivreException("Livre Exists");
        Bib.put(l.getId(),l);
    }
    public ArrayList<Livre> rechercherLivresParAuteur(String auteur){
        ArrayList<Livre> list = new ArrayList<>();
        for(Integer key:  Bib.keySet())
        {
            if (Bib.get(key).getAuteur().equals(auteur)){
                list.add(Bib.get(key));
            }
        }
        return list;
    }
    public void afficherLivres(){
        for (Livre livre: Bib.values())
            System.out.println(livre);
    }
    public void supprimerLivre(int id){
        Bib.remove(id);
    }
}
