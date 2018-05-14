/**
 * Ein Spielfeld besteht aus drei Zeilen mit je drei Spalten. Man kann an den neun
 * Positionen einen der beiden Spieler als Besitzer eintragen und auslesen.
 *
 * @author Jonathan Backes
 * @version 14.05.2018
 */
class SpielfeldString implements Spielfeld{

  private String stringBelegung;

  /**
   * Initialisiert ein neues, leeres Spielfeld.
   */
  public SpielfeldString()
  {
      stringBelegung = "000000000";
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
    int besitzer;
    int point;
    int stringStelle;

    stringStelle = zeile * 3 + spalte;
    point = stringBelegung.codePointAt(stringStelle);

    switch (point){
      case 48:
        besitzer = 0;
        break;
      case 49:
        besitzer = 1;
        break;
      case 50:
        besitzer = 2;
        break;
      default:
        throw new IllegalArgumentException(String.valueOf(zeile));
    }

    return besitzer;
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
    char [] charBelegung = new char[9];
    int stringStelle;
    int point;
    String neuStringBelegung = "";

    point = spieler + 48;
    stringStelle = zeile * 3 + spalte;
    charBelegung = stringBelegung.toCharArray();
    charBelegung [stringStelle] = (char)point;

    for (int i = 0; i < 9; i++) {
      neuStringBelegung += charBelegung[i];
    }

    stringBelegung = neuStringBelegung;
  }
  /**
       * Gibt an, ob das Spielfeld an allen Positionen belegt ist.
       */
  public boolean istVoll(){
    boolean istVoll = true;

    for (int i = 0; i < 9; i++) {

      if (stringBelegung.charAt(i) == 48) {
        istVoll = false;
        break;
      }
      
    }

    return istVoll;
  }
}
