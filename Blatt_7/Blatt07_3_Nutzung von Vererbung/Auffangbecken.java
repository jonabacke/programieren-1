
/**
 * Beschreiben Sie hier die Klasse Auffangbecken.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Auffangbecken extends AbstraktePumpe
{
    private int _volumen;
    
    public Auffangbecken(String bezeichnung, int tiefe , int hoehe, int breite, int gewicht, int volumen){
        super(bezeichnung, tiefe, hoehe, breite, gewicht);
        this._volumen = volumen;
    }
    
    public void infoAusgeben(){
        System.out.println("Bezeichnung: " + getBezeichnung());
        System.out.println("Volumen: " + _volumen);
        System.out.println("Tiefe: " + getTiefe());
        System.out.println("Höhe: " + getHoehe());
        System.out.println("Breite: " + getBreite());
        System.out.println("Gewicht: " + getGewicht());
    }
}
