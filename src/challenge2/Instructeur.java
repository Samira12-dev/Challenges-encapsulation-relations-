package challenge2;
import java.util.ArrayList;
import java.util.List;
public class Instructeur {
  private int id;
  private String nom;
  private String specialisation;
  List<Cours> coursEnseign;
  private static int count=1;
  public Instructeur(int id, String nom, String specialisation) {
    this.id = count++;
    this.nom = nom;
    this.specialisation = specialisation;
    coursEnseign = new ArrayList<Cours>();
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

    public List<Cours> getCoursEnseign() {
        return coursEnseign;
    }

    public void setCoursEnseign(List<Cours> coursEnseign) {
        this.coursEnseign = coursEnseign;
    }

    public String getSpecialisation() {
        return specialisation;
    }

    public void setSpecialisation(String specialisation) {
        this.specialisation = specialisation;
    }
    public void AjouterCours(Cours cours) {
      coursEnseign.add(cours);
    }
    public void afficher() {
        System.out.println("Cours enseignes by  "+ nom + " : " + coursEnseign);
        if(coursEnseign.isEmpty()){
            System.out.println("Aucun cours pour le moment .");
        }else {
            for(Cours cours : coursEnseign){
                System.out.println("----------------------");
                cours.afficher();
            }
        }
    }
}
