package challenge4;

public class Produit {
    private String nom;
    private double prixUnitaire;
    private int quantite;
    public Produit(String nom, double prixUnitaire, int quantite) {
        this.nom = nom;
        this.prixUnitaire = prixUnitaire;
        this.quantite = quantite;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getPrixUnitaire() {
        return prixUnitaire;
    }

    public void setPrixUnitaire(double prixUnitaire) {
        this.prixUnitaire = prixUnitaire;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }
    public double total(){
        return quantite * prixUnitaire;
    }
    @Override
    public String toString() {
        return nom + " " + prixUnitaire + " " + quantite;
    }
  public void afficher(){
        System.out.println("Nom du produit: " + nom);
        System.out.println("Prix du produit: " + prixUnitaire);
        System.out.println("Quantite du produit: " + quantite);
      System.out.println("Total du produit: " + total());
  }

}
