/** In der Klasse Rennauto wird ein Auto erzeugt.
  * Dieses Auto kann geradeaus und um die Kurve fahren.
  * Beim um die Kurve fahren hat das Auto eine
  * Maximalgeschwindigkeit von 60 m/s.
  *
  * @author Jonathan Backes, Linus Kurz
  * @version 11.04.2018
  *
  */

class Rennauto {

  /**
    * Feldvariablen
    * @param _name Name des Fahrers
    * @param _fahrzeugTyp Typ des Fahrzeugs
    * @param _maxV Maximalgeschwindigkeit in mm/s
    * @param _v_0 Geschwindigkeit, die für die Formel gebraucht wird
    * @param _millimeterZahler gibt die bereits gefahrene Strecke in mm an
    * @param _maxVKurve gibt an um wie viel v runter geht
    * @param _v_Gerade Geschwindigkeit in der Kurve
    * @param _v_Gerade Geschwindigkeit auf der Geraden
    * @param _zeitK Zeit, die das Auto nach einer Kurve gefahren ist
    * @param _zeitG Zeit, die das Auto nach einer Geraden gefahren ist
    */

  String _name;
  String _fahrzeugTyp;
  int _maxV;
  int _v_0;
  int _millimeterZaehler;
  int _maxVKurve;
  int _v_Kurve;
  int _v_Gerade;
  int _zeitK;
  int _zeitG;

  /**
    * Mit den Konstruktoren Rennauto wird ein Rennauto erzeugt
    * @param name Den Namen des Fahrers eintragen maximal 10 Zeichen
    * @param fahrzeugTyp Fahrzeugtyp eintragen
    * @param maxV Maximalgeschwindigkeit eintragen
    */

  public Rennauto(String name, String fahrzeugTyp, int maxV) {
    _name = name;
    _fahrzeugTyp = fahrzeugTyp;
    _maxV = maxV;
    _millimeterZaehler = 0;
    _maxVKurve = 60000;
    _v_Kurve = 0;
    _zeitK = 0;
    _zeitG = 0;
  }

  public Rennauto() {
    _name = "berta";
    _fahrzeugTyp = "fahrzeugTyp";
    _maxV = 100000;
    _millimeterZaehler = 0;
    _maxVKurve = 60000;
    _v_Kurve = 0;
    _zeitK = 0;
    _zeitG = 0;
  }

  /**
      In der Methode fahreKurve wird das Auto auf 60 m/s gebremmst
      die Geschwindigkeit wird mit der Gombertzfunktion berechnet
      @param anfangZeit zeitpunkt vom Kurvenanfagn
      @param endZeit zeitpunkt vom Kurvenende
    */

  public void fahreKurve(int anfangZeit, int endZeit) {
    int gefahreneAbschnitt;
    _zeitK = endZeit;
    anfangZeit = anfangZeit - _zeitG;
    endZeit = endZeit - _zeitG;
    for (int i = anfangZeit; i < endZeit; i++) {
      //gefahreneAbschnitt / Zeiteinheit ( 1Sekunde)
      if (_v_Gerade > _maxVKurve) {
        gefahreneAbschnitt = gompertzFunktion((-_maxVKurve), 5, i, _v_Gerade);
      } else {
        gefahreneAbschnitt = gompertzFunktion((_maxVKurve), 5, i, _v_Gerade);
      }
      _millimeterZaehler += gefahreneAbschnitt;
      _v_Kurve = gefahreneAbschnitt;
      print();
    }
  }

  /**
    *  In der Methode fahreGerade wird das Auto auf seine
    *  Maiximaleschwindigkeit mit der Gombertzfunktion beschleunigt
    *  @param anfangZeit zeitpunkt vom Geradenanfagn
    *  @param endZeit zeitpunkt vom Geradenende
    */

  public void fahreGerade(int anfangZeit, int endZeit) {
    int gefahreneAbschnitt;
    _zeitG = endZeit;
    anfangZeit = anfangZeit - _zeitK;
    endZeit = endZeit - _zeitK;
    for (int i = anfangZeit; i < endZeit; i++) {
      //gefahreneAbschnitt / Zeiteinheit ( 1Sekunde)
      gefahreneAbschnitt = gompertzFunktion(_maxV - _v_Kurve, 5, i, _v_Kurve);
      _millimeterZaehler += gefahreneAbschnitt;
      _v_Gerade = gefahreneAbschnitt;
      print();
    }
  }

  /**
    * Benutzung der Gompertz-Funktion um ein stetigeres fahren zu simulieren
    * @see https://de.wikipedia.org/wiki/Gompertz-Funktion
    * @param faktor1 gibt die Asymptote an
    * @param faktor2 gibt den stauchungsfaktor an
    * @param laufvariable gibt den Zeitabschnitt an in dem wir uns befinden
    * @param faktor3 gibt v_0 an also die Anfangsgeschwindigkeit
    */

  public int gompertzFunktion(int faktor1, int faktor2, int laufvariable, int faktor3) {
    double b = 5;
    double c = faktor2 * (Math.random() + 1);
    return (int) (faktor1 * Math.exp(-b * Math.exp(-laufvariable / c)) + faktor3);
  }

  /**
    * Mit der Methode gibStrecke wird die bisher
    * gefahrenre Strecke zurückgegeben.
    */

  public int gibStrecke() {
    return _millimeterZaehler;
  }

  /**
    * Mit der Methode gibName wird der Name des
    * Fahrers zurückgegeben.
    */

  public String gibName() {
    return _name;
  }

  /**
    * Mit der Methode print wird der Momentane
    * Meterstand zurückgegeben.
    */

  public void print() {
    System.out.printf("%10.3f", (double) (_millimeterZaehler) / 1000);
  }

  /**
    * Mit der Methode aufNullSetzen wird der
    * Meterstand auf null gesetzt.
    */

  public void aufNullSetzen() {
    _millimeterZaehler = 0;
  }
}
