package clallenge5;

import challenge4.Commande;
import challenge4.Produit;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Voiture v1 =new Voiture("122-A-324", "Range Rover","RR");

        CartGrise c1=new CartGrise("CG-2024-01",v1,"11/192025");

        v1.LierCarteGrise(c1);

        System.out.println("===== Détails de la voiture =====");
        System.out.println(v1);

        System.out.println("\n===== Carte Grise associée =====");
        System.out.println(v1.getCartGrise());

    }
}