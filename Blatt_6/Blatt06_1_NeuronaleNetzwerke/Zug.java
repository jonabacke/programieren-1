
/**
 * Beschreiben Sie hier die Klasse Liste.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Zug
{
    private Wagen _lock;
    
    public Zug (String string){
        _lock = new Wagen(string);
    }
    
    public Wagen getLastWagen(){
        Wagen schaffner = _lock;
        while (schaffner.getNextWagen() != null){
            schaffner = schaffner.getNextWagen();
        }
        return schaffner;
    }
    
    public Wagen getLock(){
        return _lock;
    }
    
    public void addLast(String string){
        Wagen wagon = new Wagen(string);
        Wagen lastWagon = getLastWagen();
        lastWagon.setNextWagen(wagon);
    }
}
