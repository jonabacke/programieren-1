
/**
 * In dieser Klasse werden die einzelnen Elemente (Wagen) der Liste erstellt
 * 
 * 
 * @author Jonathan Backes
 * @version 31.05.2018
 */
public class Wagen
{
    Wagen _nextWagen;
    String _string;
    boolean _istPalindrom;
    
    /**
     * In den Konstruktoren werden die neuen Wagen erstellt und ihnen 
     * ein String Wert und ggf. ein Bool wert zugeordnet
     * 
     * @param string String den der Wagen haben soll
     * @param bool Boolean Wert den das Element haben soll
     */
    public Wagen(String string){
        setString(string);
        _nextWagen = null;
    }
    
    public Wagen(String string, boolean bool){
        setString(string);
        setBool(bool);
        _nextWagen = null;
    }
    
    /**
     * Hier kann der Boolwert verändert werden
     * @param bool neuer bool Wert
     */
    public void setBool(boolean bool){
        _istPalindrom = bool;
    }
    
    /**
     * Diese Methode gibt den Wagen zurück auf den die Referenz _nextWagen 
     * zeigt
     * @return Wagen nächster Wagen
     */
    public Wagen getNextWagen(){
        return _nextWagen;
    }
    
    /**
     * gibt den String des Wagens zurück
     * @return String String im Element
     */
    public String getString(){
        return _string;
    }
    
    /**
     * gibt booleanwert des elements
     * @return boolean bool des Elements
     */
    public boolean getBool(){
        return _istPalindrom;
    }
    
    /**
     * hier kann der String im Element geändert werden
     * @param string der rein zu schreibende String
     */
    public void setString(String string){
        _string = string;
    }
   
    /**
     * hier kann die Referenz auf den nächsten Wagen geändert werden
     * @param wagon nächster anzuhängender Wagen
     */
    public void setNextWagen(Wagen wagon){
        _nextWagen = wagon;
        //this._nextWagen = wagon; Unterschied????
    }
}
