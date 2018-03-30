import java.util.Scanner;

class Main{



  public static void main(String[] args) {
    int Kontrolle = 0;
    System.out.println("--------------------------------------------------------");
    System.out.println("Bitte geben Sie ihre Kontonummer ein.");
    Scanner scan = new Scanner(System.in);
    int kontonummer = scan.nextInt();
    System.out.println("--------------------------------------------------------");
    System.out.println("Bitte geben Sie ihren gewuenschnten Dispo ein.");
    int dispo = scan.nextInt();
    Konto _konto = new Konto(kontonummer, dispo);
    while(Kontrolle != 1){
    System.out.println("--------------------------------------------------------");
    System.out.println("1 fuer Geld abheben");
    System.out.println("2 fuer Geld einzahlen");
    System.out.println("3 fuer Dispo aendern");
    System.out.println("Eine andere Zahl zum abbrechen");
    int i;
    i = scan.nextInt();
      switch (i) {
        case 1: System.out.println("--------------------------------------------------------");
                System.out.println("Wie viel Geld moechten Sie abheben?");
                int abheben = scan.nextInt();
                _konto.abheben(abheben);
                break;
        case 2: System.out.println("--------------------------------------------------------");
                System.out.println("Wie viel Geld moechten Sie einzahlen?");
                int einzahlen = scan.nextInt();
                _konto.einzahlen(einzahlen);
                break;
        case 3: System.out.println("--------------------------------------------------------");
                System.out.println("Wie hoch soll ihr neuer Dispo sein?");
                int neuDispo = scan.nextInt();
                _konto.dispoAendern(neuDispo);
                break;
        default:  System.out.println("--------------------------------------------------------");
                  System.out.println("Auf Wiedersehen");
                  Kontrolle = 1;
      }
    }


  }
}
