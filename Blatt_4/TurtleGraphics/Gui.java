import java.util.*;
/**
 * Beschreiben Sie hier die Klasse Gui.
 *
 * @author (Jonathan Backes)
 * @version (06.05.2018)
 */
public class Gui{
  public static void main(String[] args) {
    int controler;
    Dompteur domteur = new Dompteur();
    Scanner scan = new Scanner(System.in);
    System.out.println("Koch oder n-Eck 1/2");
    controler  = scan.nextInt();
    if (controler == 1) {
      System.out.println("welcher grad? 1 < x < 7");
      controler = scan.nextInt();
      domteur.zeichneKochKurve(controler, 2000);
    }
    else {
      System.out.println("eins oder mehrere 1/2");
      controler  = scan.nextInt();
      System.out.println("Farbe, xPosition, yPosition, Ecken, Kantenlaenge");
      String farbe = scan.nextLine();
      int xPosition = scan.nextInt();
      int yPosition = scan.nextInt();
      int ecken = scan.nextInt();
      int kantenlaenge = scan.nextInt();

      if (controler == 1) {
        domteur.nEck(ecken, kantenlaenge, farbe, xPosition, yPosition);
      }
      else {
        System.out.println("versetzt 1/0");
        controler  = scan.nextInt();
        if (controler == 0) {
          domteur.mehrereNEck(ecken, kantenlaenge, farbe, xPosition, yPosition);
        }
        else {
          domteur.mehrereNEckenVerschoben(ecken, kantenlaenge, farbe, xPosition, yPosition);
        }
      }
    }
    scan.close();
  }
}
