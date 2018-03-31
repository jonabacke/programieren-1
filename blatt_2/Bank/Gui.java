import java.util.Scanner;


public class Gui{

  Konto konto;




  public void gui(){
    int Kontrolle = 0;

    System.out.println("--------------------------------------------------------");
    System.out.println("Bitte geben Sie ihre Kontonummer ein.");
    Scanner scan = new Scanner(System.in);
    int kontonummer = scan.nextInt();

    System.out.println("--------------------------------------------------------");
    System.out.println("Bitte geben Sie ihren gewuenschnten Dispo ein.");
    int dispo = scan.nextInt();
    konto = new Konto(kontonummer, dispo);

    while(Kontrolle != 1){
    System.out.println("--------------------------------------------------------");
    System.out.println("1 fuer Geld abheben");
    System.out.println("2 fuer Geld einzahlen");
    System.out.println("3 fuer Dispo aendern");
    System.out.println("4 fuer das Quiz");
    System.out.println("5 um Bankstatus abzurufen");
    System.out.println("Eine andere Zahl zum abbrechen");
    int i;
    i = scan.nextInt();
      switch (i) {
        case 1: System.out.println("--------------------------------------------------------");
                System.out.println("Wie viel Geld moechten Sie abheben?");
                int abheben = scan.nextInt();
                konto.abheben(abheben);
                break;
        case 2: System.out.println("--------------------------------------------------------");
                System.out.println("Wie viel Geld moechten Sie einzahlen?");
                int einzahlen = scan.nextInt();
                konto.einzahlen(einzahlen);
                break;
        case 3: System.out.println("--------------------------------------------------------");
                System.out.println("Wie hoch soll ihr neuer Dispo sein?");
                int neuDispo = scan.nextInt();
                konto.dispoAendern(neuDispo);
                break;
        case 4: quiz();
                break;
        case 5: konto.status();
                break;
        default: System.out.println("--------------------------------------------------------");
                 System.out.println("Auf Wiedersehen");
                 Kontrolle = 1;
      }
    }


  }
  public void quiz(){
    Scanner scan = new Scanner(System.in);
    System.out.println("--------------------------------------------------------");
    System.out.println("Bei diesem Quiz koennen Sie ihr Geld vom Konto setzen");
    System.out.println("1 fuer bestaetigen");
    System.out.println("2 fuer abbrechen");
    int komando;
    komando = scan.nextInt();
    if (komando == 1){
      int counter = 0;
      System.out.println("--------------------------------------------------------");
      System.out.println("Wie viel Geld wollen Sie setzen");
      int einsatz = scan.nextInt();
      System.out.println("--------------------------------------------------------");
      System.out.println("Geben Sie ihren ersten Tipp ab");
      Ratemaschiene rate = new Ratemaschiene();
      boolean i = false;
      int zahl;
      boolean test;
      zahl = scan.nextInt();
      test = rate.istEsDieseZahl(zahl);
      if (test == true)
      {
        i = true;
      }
      while(i==false)
      {


        System.out.println("probieren Sie es nocheinmal");
        System.out.println("--------------------------------------------------------");

        zahl = scan.nextInt();


        test = rate.istEsDieseZahl(zahl);

        counter ++;
        if (test == true){
          i = true;
        }
      }
      geldErhoen(counter, einsatz);
    }
  }

  public void geldErhoen(int counter, int einsatz){
    int gewinn;
  //  main main = new main("");

    if (counter == 1){
      gewinn = einsatz * 10;
      konto.einzahlen(gewinn);
    }
    else if (counter == 2)
    {
      gewinn = einsatz * 9;
      konto.einzahlen(gewinn);
    }
    else if (counter == 3)
    {
      gewinn = einsatz * 8;
      konto.einzahlen(gewinn);
    }
    else if (counter == 4)
    {
      gewinn = einsatz * 7;
      konto.einzahlen(gewinn);
    }
    else if (counter == 5)
    {
      gewinn = einsatz * 6;
      konto.einzahlen(gewinn);
    }
    else if (counter == 6)
    {
      gewinn = einsatz * 5;
      konto.einzahlen(gewinn);
    }
    else if (counter == 7)
    {
      gewinn = einsatz * 4;
      konto.einzahlen(gewinn);
    }
    else if (counter == 8)
    {
      gewinn = einsatz * 3;
      konto.einzahlen(gewinn);
    }
    else if (counter == 9)
    {
      gewinn = einsatz * 2;
      konto.einzahlen(gewinn);
    }
    else
    {
      gewinn = einsatz * 1;
      konto.einzahlen(gewinn);
    }
  }
}
