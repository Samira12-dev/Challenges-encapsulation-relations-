package challenge4;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
  Commande cd = new Commande(1);
  Produit p1= new Produit("book",12.5, 7);
  Produit p2= new Produit("Pen", 1.5 , 4);

  cd.aajouterProduit(p1);
  cd.aajouterProduit(p2);

        System.out.println("Produit commanded :");
        cd.afficherProduits();
        System.out.println("Total commandes ="+ cd.CalculerTotal());
    }
}