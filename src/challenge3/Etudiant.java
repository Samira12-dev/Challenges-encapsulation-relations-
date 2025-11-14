package challenge3;
import java.util.ArrayList;
import java.util.List;

public class Etudiant {
    private int id;
    private String nom;
    List<Cours> coursSuivis;
    public Etudiant(int id, String nom) {
        this.id = id;
        this.nom = nom;
        this.coursSuivis = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public List<Cours> getCoursSuivis() {
        return coursSuivis;
    }

    public void setCoursSuivis(List<Cours> coursSuivis) {
        this.coursSuivis = coursSuivis;
    }
    public void inscrits(Cours cour) {
        coursSuivis.add(cour);
    }
    public void addCoursSuivis(Cours cour) {
        coursSuivis.add(cour);
    }

}
