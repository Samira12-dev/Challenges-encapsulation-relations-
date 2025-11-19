package clallenge5;

public class CartGrise {
   private String  numero;
   private  Voiture proprietaire ;
  private String dateEmission;
  public  CartGrise(String  numero, Voiture proprietaire , String dateEmission) {
      this.numero = numero;
      this.proprietaire = proprietaire;
      this.dateEmission = dateEmission;
  }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Voiture getProprietaire() {
        return proprietaire;
    }

    public void setProprietaire(Voiture proprietaire) {
        this.proprietaire = proprietaire;
    }

    public String getDateEmission() {
        return dateEmission;
    }

    public void setDateEmission(String dateEmission) {
        this.dateEmission = dateEmission;
    }
    @Override
    public String toString() {
        return "Carte Grise : " + numero +
                ", Date émission : " + dateEmission +
                "\nPropriétaire → " + proprietaire;
    }
}
