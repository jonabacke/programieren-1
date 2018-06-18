
/**
 * Beschreiben Sie hier die Klasse Main.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Main
{
    public static void main(String [] args){
        AbstraktePumpe kreispumpe = new Kreispumpe(5, 1000, "Superdreher", 20, 15, 22, 25, 25, 70);
        AbstraktePumpe membranpumpe = new Membranpumpe("Supermembran", "Membrinator", 10, 5, 20, 20, 15, 50);
        AbstraktePumpe auffangbecken = new Auffangbecken("Fänger", 10, 5, 34, 234, 54);
        kreispumpe.infoAusgeben();
        System.out.println("------------------------------------------------------------");
        membranpumpe.infoAusgeben();
        System.out.println("------------------------------------------------------------");
        auffangbecken.infoAusgeben();
    }
}