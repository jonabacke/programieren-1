
/**
 * Beschreiben Sie hier die Klasse Kreispumpe.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Kreispumpe extends AbstraktePumpe
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private int _anzahlSchaufeln;
    private int _maximaleDrehzahl;
    public Kreispumpe (int anzahlSchaufeln, int maximaleDrehzahl,String bezeichnung, float maximalerBetriebsdruck,
    int maximaleFoerdermenge, int tiefe , int hoehe, int breite, int gewicht){
        super(bezeichnung, maximalerBetriebsdruck,maximaleFoerdermenge, tiefe, hoehe, breite, gewicht);
        this._anzahlSchaufeln = anzahlSchaufeln;
        this._maximaleDrehzahl = maximaleDrehzahl;
    }
    
    
    public void infoAusgeben(){
        System.out.println("Bezeichnung: " + getBezeichnung());
        System.out.println("Anzahl der Schaufeln: " + _anzahlSchaufeln);
        System.out.println("Maximale Drehzahl: " + _maximaleDrehzahl);
        System.out.println("Maximaler Betriebsdruck: " + getMaximalerBetriebsdruck());
        System.out.println("Maximale Fördermenge: " + getMaximaleFoerdermenge());
        System.out.println("Tiefe: " + getTiefe());
        System.out.println("Höhe: " + getHoehe());
        System.out.println("Breite: " + getBreite());
        System.out.println("Gewicht: " + getGewicht());
    }
}
