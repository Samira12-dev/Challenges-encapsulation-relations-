package challenge1;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Personne p1 =new Personne("Samira",25);

        Passeport pa1 = new Passeport(1, "Marocaine","2027-12-31");
        //p1.setPasseport(pa1);
        p1.assignerPass(pa1);
        p1.AfficherInfo();
       // p1.toString();
       // System.out.println(p1);
      //  challenge1.Personne p2 =new challenge1.Personne("Samira",25);

    }
}