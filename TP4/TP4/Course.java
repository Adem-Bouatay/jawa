package TP4;
import java.util.ArrayList;

public class Course{
    private String name;
    private Float coef;
    private ArrayList<String> contents;

    public Course(String name, ArrayList<String> contents, Float coef) {
        this.name = name;
        this.coef = coef;
        this.contents = contents;
    }

    public void addContent(String content){
        contents.add(content);
    }

    public String getName() {
        return name;
    }

    public Float getCoef() {
        return coef;
    }

    public ArrayList<String> getContents() {
        return contents;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCoef(Float coef) {
        this.coef = coef;
    }

    public void setContents(ArrayList<String> contents) {
        this.contents = contents;
    }
    
}
