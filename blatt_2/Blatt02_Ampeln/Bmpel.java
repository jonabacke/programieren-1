/**
 * Eine Bmpel besteht aus drei Lampen in den Farben rot, gelb und gruen.
 * Sie durchlaeuft periodisch vier Phasen: gruen, gelb, rot, rot/gelb.
 * In den ersten drei Phasen leuchtet also nur jeweils eine Lampe,
 * waehrend in der vierten Phase zwei Lampen gleichzeitig leuchten.
 * Der Zustand der einzelnen Lampen kann abgefragt werden,
 * und die Bmpel kann in die naechste Phase geschaltet werden.
 * Die Schaltung geschieht explizit durch einen Methodenaufruf
 * (und nicht etwa durch einen automatischen Timer).
 * 
 * @author Fredrik Winkler
 * @version 10/2016
 */
class Bmpel
{
    private int _phase;

    /**
     * Initialisiert eine neue Bmpel auf die erste Phase (gruen).
     */
    public Bmpel()
    {
        _phase = 0;
    }

    /**
     * Schaltet die Bmpel in die naechste Phase (gruen -> gelb -> rot -> rot/gelb -> gruen).
     */
    public void schalteWeiter()
    {
        _phase = (_phase + 1) % 4;
    }
    
    /**
     * Gibt an, ob die rote Lampe leuchtet.
     */
    public boolean leuchtetRot()
    {
        if (_phase == 2)
        {
            return true;
        }
        else if (_phase == 3)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    /**
     * Gibt an, ob die gelbe Lampe leuchtet.
     */
    public boolean leuchtetGelb()
    {
        if (_phase % 2 == 1)
        {
            return true;
        } 
        else
        {
            return false;
        }
    }
    
    /**
     * Gibt an, ob die gruene Lampe leuchtet.
     */
    public boolean leuchtetGruen()
    {
        return _phase == 0;
    }
}
