
/**
 * Ein Spielfeld besteht aus drei Zeilen mit je drei Spalten. Man kann an den neun
 * Positionen einen der beiden Spieler als Besitzer eintragen und auslesen.
 *
 * @author (Jonathan Backes)
 * @version (15.05.2018)
 */
public class SpielfeldGeflechtEnum implements Spielfeld
{
  private SpielfeldZeileEnum _zeile0;
  private SpielfeldZeileEnum _zeile1;
  private SpielfeldZeileEnum _zeile2;

  public SpielfeldGeflechtEnum(){
    _zeile0 = new SpielfeldZeileEnum();
    _zeile1 = new SpielfeldZeileEnum();
    _zeile2 = new SpielfeldZeileEnum();
  }

  /**
   * Gibt den Besitzer der angegebenen Position auf dem Spielfeld.
   *
   * @param zeile
   *            vertikale Position (0-2)
   * @param spalte
   *            horizontale Position (0-2)
   * @return 0 (unbesetzt), 1 (Spieler 1), 2 (Spieler 2)
   */
  public int gibBesitzer(int zeile, int spalte){
    Besitzer besitzer;
    int beleger;
    switch (zeile){
      case 0:
        besitzer = _zeile0.gibBesitzer(spalte);
        break;
      case 1:
        besitzer = _zeile1.gibBesitzer(spalte);
        break;
      case 2:
        besitzer = _zeile2.gibBesitzer(spalte);
        break;
      default:
        throw new IllegalArgumentException(String.valueOf(spalte));
    }

    switch (besitzer){
      case SPIELER_0:
        beleger = 0;
        break;
      case SPIELER_1:
        beleger = 1;
        break;
      case SPIELER_2:
        beleger = 2;
        break;
      default:
        throw new IllegalArgumentException(String.valueOf(besitzer));
    }

    return beleger;
  }

  /**
   * Besetzt die angegebene Position auf dem Spielfeld fuer einen Spieler.
   *
   * @param zeile
   *            vertikale Position (0-2)
   * @param spalte
   *            horizontale Position (0-2)
   * @param spieler
   *            0 (leer), 1 (Spieler 1), 2 (Spieler 2)
   */
  public void besetzePosition(int zeile, int spalte, int spieler){
    Besitzer besitzer;
    switch (spieler){
      case 0:
        besitzer = Besitzer.SPIELER_0;
        break;
      case 1:
        besitzer = Besitzer.SPIELER_1;
        break;
      case 2:
        besitzer = Besitzer.SPIELER_2;
        break;
      default:
        throw new IllegalArgumentException(String.valueOf(spieler));
    }

    switch (zeile)
    {
    case 0:
        _zeile0.besetze(spalte, besitzer);
        break;
    case 1:
        _zeile1.besetze(spalte, besitzer);
        break;
    case 2:
        _zeile2.besetze(spalte, besitzer);
        break;
    default:
        throw new IllegalArgumentException(String.valueOf(zeile));
    }
  }

  /**
   * Gibt an, ob das Spielfeld an allen Positionen belegt ist.
   */
  public boolean istVoll(){
    return _zeile0.istVoll() && _zeile1.istVoll() && _zeile2.istVoll();
  }
}
