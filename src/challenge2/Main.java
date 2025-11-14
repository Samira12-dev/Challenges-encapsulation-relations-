package challenge2;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Instructeur ins = new Instructeur(1,"Ali","Programming");
        Cours c1 = new Cours(1,"Java","cours complete sur java");
        Cours c2 = new Cours(2,"Python","Introduction to python");
        ins.AjouterCours(c1);
        ins.AjouterCours(c2);
        ins.afficher();
    }
}