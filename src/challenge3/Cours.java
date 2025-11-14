package challenge3;

import java.util.ArrayList;
import java.util.List;

public class Cours {
    private int id;
    private String title;
    List<Etudiant> inscrits;
    public Cours(int id, String title) {
        this.id = id;
        this.title = title;
        inscrits = new ArrayList<Etudiant>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Etudiant> getInscrits() {
        return inscrits;
    }

    public void setInscrits(List<Etudiant> inscrits) {
        this.inscrits = inscrits;
    }
    public void addInscrits(Etudiant inscrit) {
        if(!inscrits.contains(inscrit)) {
            inscrits.add(inscrit);
            inscrit.coursSuivis(this);
        }
    }
}
