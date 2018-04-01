
/**
 * In der Klasse Konto wird ein Konto, mit einer vom Kunden eingegebenen Kontonummer,
 * erstellt. Desweiteren kann man Geld auf das Konto drauf zahlen und abheben.
 *
 * @author Jonathan Backes
 * @version 0.1
 */


public class Konto
{
    // Hier werden die Feldvariablen deklariert
    private int _saldo;
    private int _kontonummer;
    private int _dispo;




    /**
     * Der Konstruktor der Klasse setzt das Startsaldo sowie die Kontonummer
     * und das Dispo. Eine negative eingabe des Dispos ist nicht möglich.
     * @param kein negativer Dispo
     * @param alles Ganzzahlig
     */
    public Konto(int kontonummer, int dispo)
    {
        // Instanzvariable initialisieren
        _saldo = 10;
        _kontonummer = kontonummer;
        if(dispo < 0)
        {
            System.out.println("Sie können keinen negativen Dispo angeben");
        }else{
            _dispo = dispo;
        }
        status();
    }

    /**
     * Die Einzahlung wird dem Saldo hinzugefügt
     *
     * @param ganzzahlige Einzahlung
     */
    public void einzahlen(int einzahlung)
    {
        _saldo += einzahlung;
        status();
    }

    /**
     * Hier wird der abzuhebene Betrag vom Saldo abgezogen und kontroliert ob
     * der Dispo überschritten wird
     */
    public void abheben(int auszahlung)
    {
        if(_saldo + _dispo >= auszahlung){
            _saldo -= auszahlung;
        }else{
            System.out.println("Es ist zu wenig Geld auf ihrem Konto");
        }
        status();
    }

    /**
     * Mit dieser Methode kann der Dispo geändert werden
     * Dabei achtet die Methode darauf das der neue Dispo nicht kleiner ist
     * als der Betrag des geliehenen Geldes
     * Diese Methode wird nach dem ausführen jeder anderen Methode aufgerufen
     * um den Überblick über sein Konto zu bewahren.
     *
     * @param kein negativer Dispo (ganzzahlig)
     */

    public void dispoAendern(int neuDispo)
    {
        if(neuDispo < 0)
        {
            System.out.println("Sie koennen keinen negativen Dispo angeben.");
        }else if(neuDispo + _saldo < 0){
            System.out.println("Der angegebene Dispo ist zu klein für ihre Schulden.");
        }else{
            _dispo = neuDispo;
        }
        status();
    }

    /**
     * diese Methode gibt den Status des Kontos zurück
     * Kontonummer, Kontostand, Dispo, verfügbarer Dispo
     */
    public void status()
    {
        if(_saldo >= 0)
        {
            System.out.println("Kontonummer: " +_kontonummer);
            System.out.println("Kontostand: " + _saldo);
            System.out.println("Genutzter Dispo: " + 0);
            System.out.println("Verfuegbarer Dispo " + _dispo);
        }else{
            System.out.println("Kontonummer: " +_kontonummer);
            System.out.println("Kontostand: " + 0);
            System.out.println("Genutzter Dispo: " + Math.abs(_saldo));
            System.out.println("Verfuegbarer Dispo " + (_saldo + _dispo));
        }
    }
}
