package challenge1;

public class Personne {
      private  String nom;
      private int age;
      Passeport passeport;
      public Personne(String nom, int age) {
          this.nom = nom;
          this.age = age;
      }
      public String getNom() {
          return nom;
      }
     public void setNom(String nom) {
          this.nom = nom;
     }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Passeport getPasseport() {
        return passeport;
    }

    public void setPasseport(Passeport passeport) {
        this.passeport = passeport;
    }
    public void assignerPass( Passeport passeport ) {
           this.passeport = passeport;
    }
    @Override
    public String toString() {
          return "challenge1.Personne{" + "nom=" + nom + ", age=" + age + '}';
    }
    void AfficherInfo() {
        System.out.println("========Detail information=======");
        System.out.println("Nom: " + nom);
        System.out.println("Age: " + age);
        if(passeport != null){
        System.out.println("challenge1.Passeport: " + passeport);
        passeport.afficher();
        }else{
            System.out.println("This personne has not a passport");
        }

    }
}
