package challenge2;

public class Cours {
    private int id;
    private String titre;
    private String description;
    private static int counter=1;
    public Cours( int id, String titre, String description) {
        this.id = counter++;
        this.titre = titre;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }
    public void afficher() {
        System.out.println("Cours id: " + id + "\n titre: " + titre + "\n description: " + description);

    }
}
