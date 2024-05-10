public class Capteur {
    public int ID;
    public String desc;

    public Capteur(int ID, String desc){
        this.ID = ID;
        this.desc = desc;
    }
    public String toString(){
        return String.format("ID: %s desc:%s", ID, desc);
        /*return "ID: " + ID + " desc: " + desc;*/
    }
    public boolean equals(Object o){
        return ID == ((Capteur) o).ID;
    }
}
