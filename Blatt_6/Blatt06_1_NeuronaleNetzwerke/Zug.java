
/**
 * Mit dieser Klasse wird eine Liste (Zug) erstellt die aus mehreren 
 * Elementen (Wagen ) bestehen kann
 * 
 * @author Jonathan Backes 
 * @version 31.05.2018
 */
public class Zug
{
    private Wagen _lock;
    
    /**
     * Im Konstruktor wird das erste Element der Liste erstellt (Lock)
     * 
     * @param string string der im ersten Element gespeichert werden soll
     */
    public Zug (String string){
        _lock = new Wagen(string);
    }
    
    /**
     * Mit dieser Methode wird das letzte Elemen t der Liste herausgefunden
     * 
     * @return Wagen letztes Element der Liste
     */
    public Wagen getLastWagen(){
        Wagen schaffner = _lock;
        while (schaffner.getNextWagen() != null){
            schaffner = schaffner.getNextWagen();
        }
        return schaffner;
    }
    
    /**
     * Diese Methode gibt das erste Element zurück
     * 
     * @return Wagen erstes Element
     */
    public Wagen getLock(){
        return _lock;
    }
    
    /**
     * Mit dieser Methode kann ein Element in die Liste hinzugefügt werden
     * 
     * @param string String den das Element beinhalten soll
     */
    public void addLast(String string){
        Wagen wagon = new Wagen(string);
        Wagen lastWagon = getLastWagen();
        lastWagon.setNextWagen(wagon);
    }
    
    /**
     * Mit dieser Methode kann ein Element in die Liste hinzugefügt werden
     * 
     * @param string String den das Element beinhalten soll
     * @param bool Booleanwert dass das Element haben soll
     */
    public void addLast(String string, boolean bool){
        Wagen wagon = new Wagen(string, bool);
        Wagen lastWagon = getLastWagen();
        lastWagon.setNextWagen(wagon);
    }
}
