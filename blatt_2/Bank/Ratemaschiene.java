
/**
 * Beschreiben Sie hier die Klasse Ratemaschiene.
 *
 * @author (Ihr Name)
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Ratemaschiene
{
    // Hier werden die Feldvariablen deklariert
    private int randomNumber;
    private int counter = 1;

    /**
     * Konstruktor für Objekte der Klasse Ratemaschiene
     * Hier wird de zu ratene Zahl generiert
     */
    public Ratemaschiene()
    {
        // Instanzvariable initialisieren
        randomNumber = (int)(Math.random()*100);
    }

    /**
     * In dieser Methode wird verglchen ob man die richtige Zahl erraten hat
     * und wie viel Versuche man benötigt hat.
     * @param  der Ratewert
     */
    public void istEsDieseZahl(int vergleichswert)
    {
        if(vergleichswert == randomNumber){
            switch(counter)
            {
                case 1:
                    System.out.println("Das war doch nur Glück! " + counter);
                    break;
                case 2:
                    System.out.println("Das war doch nur Glück! " + counter);
                    break;
                case 3:
                    System.out.println("Das war doch nur Glück! " + counter);
                    break;
                case 4:
                    System.out.println("Das war doch nur Glück! " + counter);
                    break;
                case 5:
                    System.out.println("Das war doch nur Glück! " + counter);
                    break;
                case 6:
                    System.out.println("Gar nicht mal so gut! " + counter);
                    break;
                case 7:
                    System.out.println("Gar nicht mal so gut! " + counter);
                    break;
                case 8:
                    System.out.println("Gar nicht mal so gut! " + counter);
                    break;
                case 9:
                    System.out.println("Gar nicht mal so gut! " + counter);
                    break;
                case 10:
                    System.out.println("Gar nicht mal so gut! " + counter);
                    break;
                default:
                    System.out.println("Such dir besser ein anderes Hobby! " + counter);
            }
            System.out.println("Stimmt " + counter + " Versuche " + vergleichswert);
        }else if(vergleichswert < randomNumber){
            System.out.println("„Zu niedrig geraten! " + vergleichswert);
        }else{
            System.out.println("Zu hoch getippt! " + vergleichswert);
        }
        counter ++;
    }
}
