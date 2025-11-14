package challenge1;

public class Passeport {
   private int numero;
   private String nationalite;
   private String dateExpiration;

   public Passeport(int numero, String nationalite, String dateExpiration) {
       this.numero = numero;
       this.nationalite = nationalite;
       this.dateExpiration = dateExpiration;
   }
   public int getNumero() {
       return numero;
   }
   public void setNumero(int numero) {
       this.numero = numero;
   }
   public String getNationalite() {
       return nationalite;
   }
   public void setNationalite(String nationalite) {
       this.nationalite = nationalite;
   }
   public String getDateExpiration() {
       return dateExpiration;
   }
   public void setDateExpiration(String dateExpiration) {
       this.dateExpiration = dateExpiration;
   }
   public void afficher() {
       System.out.println("numero :" + numero);
       System.out.println("nationalite :" + nationalite);
       System.out.println("dateExpiration :" + dateExpiration);
   }

}
