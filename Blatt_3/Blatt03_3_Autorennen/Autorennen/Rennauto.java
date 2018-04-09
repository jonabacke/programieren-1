class Rennauto{

  String _name;
  String _fahrzeugTyp;
  //@param _maxV in mm/s
  int _maxV;
  int _v_0;
  int _millimeterZaehler;
  //@param _maxVKurve gibt an um wie viel v runter geht
  int _maxVKurve;
  int _v_Kurve;
  int _v_Gerade;
  int _zeitK;
  int _zeitG;

  public Rennauto(String name, String fahrzeugTyp, int maxV){
    _name = name;
    _fahrzeugTyp = fahrzeugTyp;
    _maxV = maxV;
    _millimeterZaehler = 0;
    _maxVKurve = maxV / 3;
    _v_Kurve = 0;
    _zeitK = 0;
    _zeitG = 0;
  }

  public Rennauto(){
    _name = "berta";
    _fahrzeugTyp = "fahrzeugTyp";
    _maxV = 100000;
    _millimeterZaehler = 0;
    _maxVKurve = _maxV / 3;
    _v_Kurve = 0;
    _zeitK = 0;
    _zeitG = 0;
  }

  public void fahreKurve(int anfangZeit, int endZeit){
    _zeitK = endZeit;
    anfangZeit = anfangZeit - _zeitG;
    endZeit = endZeit - _zeitG;
    int gefahreneAbschnitt;
    for (int i = anfangZeit; i < endZeit; i++)
    {
      //gefahreneAbschnitt / Zeiteinheit ( 1Sekunde)
      if (_v_Gerade > _maxVKurve) {
        gefahreneAbschnitt = gompertzFunktion((-_maxVKurve), 10, i, _v_Gerade);
      }
      else {
        gefahreneAbschnitt = gompertzFunktion((_maxVKurve), 10, i, _v_Gerade);
      }
      _millimeterZaehler += gefahreneAbschnitt;
      print();
      // System.out.println((double)(_millimeterZaehler)/1000+
      // " Meter gefahren nach "+i+" Sekunden "
      // +(double)(gefahreneAbschnitt)/1000);
      _v_Kurve = gefahreneAbschnitt;
    }
  }

  public void fahreGerade(int anfangZeit, int endZeit){
    _zeitG = endZeit;
    int gefahreneAbschnitt;
    anfangZeit = anfangZeit - _zeitK;
    endZeit = endZeit - _zeitK;
    for (int i = anfangZeit; i < endZeit; i++)
    {
      //gefahreneAbschnitt / Zeiteinheit ( 1Sekunde)
      gefahreneAbschnitt = gompertzFunktion(_maxV-_v_Kurve, 10, i, _v_Kurve);
      _millimeterZaehler += gefahreneAbschnitt;
      print();
      // System.out.println((double)(_millimeterZaehler)/1000+
      // " Meter gefahren nach "+i+" Sekunden "
      // +(double)(gefahreneAbschnitt)/1000);
      _v_Gerade = gefahreneAbschnitt;

    }
  }

  //Benutzung der Gompertz-Funktion um ein stetigeres fahren zu simulieren
  //@web https://de.wikipedia.org/wiki/Gompertz-Funktion
  //@param faktor1 gibt die Asymptote an
  //@param faktor2 gibt den stauchungsfaktor an
  //@param laufvariable gibt den Zeitabschnitt an in dem wir uns befinden
  //@param faktor3 gibt v_0 an


  public int gompertzFunktion(int faktor1, int faktor2, int laufvariable, int faktor3){
    double b = 5;
    double c = faktor2 * (Math.random()+1);
    return (int) (faktor1*Math.exp(-b*Math.exp(-laufvariable/c))+faktor3);
  }

  public double gibStrecke(){
    return _millimeterZaehler;
  }

  public String gibName(){
    return _name;
  }

  public int gibGefahreneStrecke(){
    return _millimeterZaehler;
  }

  public void print(){
    System.out.printf("%10.3f",(double)(_millimeterZaehler)/1000);
  }
}
