package challenge6;

import java.util.ArrayList;
import java.util.List;

public class Library {
  private String  nom;
  List<Book> livres;
  public Library(String  nom) {
    this.nom = nom;
    this.livres = new ArrayList<Book>();
  }

    public System getNom() {
        return nom;
    }

    public void setNom(System nom) {
        this.nom = nom;
    }

    public List<Book> getLivres() {
        return livres;
    }

    public void setLivres(List<Book> livres) {
        this.livres = livres;
    }
    public void addBook(Book book) {
      this.livres.add(book);
        System.out.println("Book added"+book);
    }
    public void removeBook(Book book) {
      Book bookAremoved = null;
      for (Book b : livres) {
          if (b.getTitre().equals(book.getTitre())) {
              bookAremoved = b;
              break;
          }
      }
      if(bookAremoved != null) {
          livres.remove(bookAremoved);
          System.out.println("Book removed"+bookAremoved);
      }else  {
          System.out.println("Book not found"+bookAremoved.getTitre());
      }
    }
    public  void afficherBooks() {
        if (livres.isEmpty()) {
            System.out.println("Aucun livre dans la bibliothèque.");
            return;
        }

        System.out.println("Liste des livres dans " + nom + " :");
        for (Book l : livres) {
            System.out.println(" - " + l);
        }
    }

}
