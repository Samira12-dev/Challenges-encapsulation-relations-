package challenge4;

import java.util.ArrayList;
import java.util.List;

public class Commande {
     private int id;
     List<Produit> produits;
     public static int count=1;
   public  Commande(int id) {
     this.id = count;
     produits = new ArrayList<Produit>();
   }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Produit> getProduits() {
        return produits;
    }

    public void setProduits(List<Produit> produits) {
        this.produits = produits;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Commande.count = count;
    }
    public void aajouterProduit(Produit p) {
        produits.add(p);
    }
    public double CalculerTotal() {
        double total = 0;
        for (Produit p : produits) {
          total += p.getPrixUnitaire();
        }
        return total;
    }
    public void afficherProduits() {
        for (Produit p : produits) {
            System.out.println(p);
        }
    }
}
