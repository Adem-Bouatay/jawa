package ex2;
public class Dictionnaire extends Document {
    private String langue;
    private int numTome;

    public Dictionnaire(int numEnr, String titre, String langue, int numTome){
        super(numEnr, titre);
        this.langue = langue;
        this.numTome = numTome;
    }
    public String toString(){
        return super.toString() + " langue: " + langue + " num_tome: " + numTome;
    }
    public String getLangue() {
        return langue;
    }
    public void setLangue(String langue) {
        this.langue = langue;
    }
    public int getNumTome() {
        return numTome;
    }
    public void setNumTome(int numTome) {
        this.numTome = numTome;
    }
    
}
