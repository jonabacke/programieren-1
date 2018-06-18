
/**
 * Beschreiben Sie hier die Klasse Membranpumpe.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Membranpumpe extends AbstraktePumpe
{
    private String _membranmaterial;
    
    
    public Membranpumpe(String membranmaterial, String bezeichnung, 
    float maximalerBetriebsdruck, int maximaleFoerdermenge, int tiefe , 
    int hoehe, int breite, int gewicht){
        super(bezeichnung, maximalerBetriebsdruck,maximaleFoerdermenge, tiefe, hoehe, breite, gewicht);
        _membranmaterial = membranmaterial;
    }
    
    public void infoAusgeben(){
        System.out.println("Bezeichnung: " + getBezeichnung());
        System.out.println("Membranmaterial: " + _membranmaterial);
        System.out.println("Maximaler Betriebsdruck: " + getMaximalerBetriebsdruck());
        System.out.println("Maximale Fördermenge: " + getMaximaleFoerdermenge());
        System.out.println("Tiefe: " + getTiefe());
        System.out.println("Höhe: " + getHoehe());
        System.out.println("Breite: " + getBreite());
        System.out.println("Gewicht: " + getGewicht());
    }
}
