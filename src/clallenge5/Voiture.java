package clallenge5;

public class Voiture {
    //
    private String immatriculation;
    private String marque;
    private String  modele;
    private CartGrise cartGrise;
    public Voiture(String  immatriculation, String marque, String  modele) {
        this.immatriculation = immatriculation;
        this.marque = marque;
        this.modele = modele;
    }

    public String  getImmatriculation() {
        return immatriculation;
    }

    public void setImmatriculation(String  immatriculation) {
        this.immatriculation = immatriculation;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String  getModele() {
        return modele;
    }

    public void setModele(String  modele) {
        this.modele = modele;
    }
    public void LierCarteGrise(CartGrise c) {
        this.cartGrise = c;
    }
    public  CartGrise getCartGrise() {
        return cartGrise;
    }

    @Override
    public String toString() {
        return  "Voiture :"+immatriculation+ "-"+marque+"-"+modele;
    }
}
