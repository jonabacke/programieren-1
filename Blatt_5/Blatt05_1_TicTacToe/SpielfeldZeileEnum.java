
/**
 * Modelliert eine Zeile eines Tic Tac Toe Spielfelds, welche aus drei Spalten
 * besteht. Die Spalten koennen von den Spielern besetzt werden.
 *
 * @author (Jonathan Backes)
 * @version (15.05.2018)
 */
public class SpielfeldZeileEnum
{
  Besitzer _spalte0;
  Besitzer _spalte1;
  Besitzer _spalte2;

  /**
	 * Initialisiert eine neue SpielfeldZeile
	 */
  public SpielfeldZeileEnum(){
    _spalte0 = Besitzer.SPIELER_0;
    _spalte1 = Besitzer.SPIELER_0;
    _spalte2 = Besitzer.SPIELER_0;
  }

/**
* Gibt den Besitzer der angegebenen Spalte in dieser Zeile.
*
* @param spalte
*            horizontale Position (0-2)
* @return SPIELER_0 (unbesetzt), SPIELER_1 (Spieler 1), SPIELER_2 (Spieler 2)
*/
  public Besitzer gibBesitzer(int spalte){
    Besitzer momentanerBesitzer;

    switch (spalte){
      case 0:
        momentanerBesitzer = _spalte0;
        break;
      case 1:
        momentanerBesitzer = _spalte1;
        break;
      case 2:
        momentanerBesitzer = _spalte2;
        break;
      default:
        throw new IllegalArgumentException(String.valueOf(spalte));
    }

    return momentanerBesitzer;
  }

  /**
	 * Besetze die angegebene Spalte in dieser Zeile.
	 *
	 * @param spalte
	 *        horizontale Position (0-2)
	 * @param spieler
	 *        SPIELER_0 (leer), SPIELER_1 (Spieler 1), SPIELER_2 (Spieler 2)
	 */
  public void besetze(int spalte, Besitzer spieler){
    switch (spalte){
      case 0:
        _spalte0 = spieler;
        break;
      case 1:
        _spalte1 = spieler;
        break;
      case 2:
        _spalte2 = spieler;
        break;
      default:
        throw new IllegalArgumentException(String.valueOf(spalte));
    }
  }

  /**
     * Gibt an, ob die Zeile an allen Positionen belegt ist.
     */
  public boolean istVoll(){
    return (_spalte0 != Besitzer.SPIELER_0) &&
           (_spalte1 != Besitzer.SPIELER_0) &&
           (_spalte2 != Besitzer.SPIELER_0);
  }
}
