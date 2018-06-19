import java.util.List;
import java.util.Random;

/**
 * Tier ist eine abstrakte Superklasse für Tiere. 
 * Sie verwaltet Eigenschaften, die alle Tiere gemein haben.
 * 
 * @author David J. Barnes und Michael Kölling
 * @version 2016.03.18
 */
public abstract class Tier
{
    // Ist dieses Tier noch lebendig?
    private boolean lebendig;
    // Das Feld des Tieres
    private Feld feld;
    // Die Position dieses Tieres.
    private Position position;
    // Alter des Tiers
    private int _alter;
    // Ein gemeinsamer Zufallsgenerator, der die Geburten steuert.    
    private static final Random rand = Zufallssteuerung.gibZufallsgenerator();

    /**
     * Erzeuge ein neues Tier an der gegebenen Position im Feld.
     * 
     * @param feld      das aktuelle belegte Feld
     * @param position  die Position im Feld
     */
    public Tier(Feld feld, Position position)
    {
        lebendig = true;
        this.feld = feld;
        setzePosition(position);
        this._alter = 0;
    }
    
    /**
    * gibt die Gebaerwahrscheinlichkeit
    */
    abstract protected double gibGebaerwahrscheinlichkeit();
    
    /**
     * gibt die Wurfgroesse
     */
    abstract protected int gibMaxWurfgroesse();
    
    /**
     * gibt das maximalalter
     */
    abstract protected int gibMaxAlter();
    
    /**
     * gibt das Gebaeralter
     */
    abstract protected int gibGebaerAlter();
    
    /**
     * Erhöhe das Alter. 
     * Dies kann zum Tod führen.
     */
    public void alterErhoehen()
    {
        setAlter(getAlter() + 1);
        if(getAlter() > gibMaxAlter()) {
            sterben();
        }
    }
    /**
     * Erzeuge eine Zahl für die Wurfgroesse, wenn ein Tier
     * gebären kann.
     * @return  Wurfgroesse (kann null sein)
     */
   
    public int traechtig()
    {
        int wurfgroesse = 0;
        if(kannGebaeren() && rand.nextDouble() <= gibGebaerwahrscheinlichkeit()) {
            wurfgroesse = rand.nextInt(gibMaxWurfgroesse()) + 1;
        }
        return wurfgroesse;
    }
    
    /**
     * prüft ob Tier gebaeren kann
     */
    public boolean kannGebaeren()
    {
        return _alter >= gibGebaerAlter();
    }
    
    /**
     * gibt das Alter
     */
    public int getAlter(){
        return _alter;
    }
    
    /**
     * setzt das Alter
     */
    public void setAlter(int alter){
        _alter = alter;
    }
    
    /**
     * Lasse dieses Tier agieren - es soll das tun, was
     * es tun muss oder möchte.
     * @param neueTiere  eine Liste zum Aufnehmen neuer Tiere
     */
    abstract public void agiere(List<Tier> neueTiere);

    /**
     * Prüfe, ob dieses Tier noch lebendig ist.
     * @return true  wenn dieses Tier noch lebendig ist
     */
    protected boolean istLebendig()
    {
        return lebendig;
    }

    /**
     * Anzeigen, dass das Tier nicht mehr länger lebendig ist
     * Es wird aus dem Feld entfernt.
     */
    protected void sterben()
    {
        lebendig = false;
        if(position != null) {
            feld.raeumen(position);
            position = null;
            feld = null;
        }
    }

    /**
     * Liefere die Position dieses Tieres.
     * @return  die Position dieses Tieres
     */
    protected Position gibPosition()
    {
        return position;
    }
    
    /**
     * Setze das Tier auf die gegebene Position im aktuellen Feld.
     * @param neuePosition  die neue Position des Tieres
     */
    protected void setzePosition(Position neuePosition)
    {
        if(position != null) {
            feld.raeumen(position);
        }
        position = neuePosition;
        feld.platziere(this, neuePosition);
    }
    
    /**
     * Liefere das Feld des Tieres.
     * @return  das Feld des Tieres
     */
    protected Feld gibFeld()
    {
        return feld;
    }    
}
