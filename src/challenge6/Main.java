package challenge6;

import challenge4.Commande;
import challenge4.Produit;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
   Library l1= new Library("Librrary");

   Book b1= new Book("1212","Harry poter",12);
   Book b2= new Book("4443","Antoni",12);
   Book b3= new Book("44444","David",12);

   l1.addBook(b1);
   l1.addBook(b2);
   l1.addBook(b3);

        System.out.println( "After add");

        System.out.println("remove book ");
        l1.removeBook("David");


    }
}