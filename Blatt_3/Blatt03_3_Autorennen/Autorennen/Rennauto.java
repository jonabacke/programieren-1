class Rennauto{

  String _name;
  String _fahrzeugTyp;
  //@param _maxV in mm/s
  int _maxV;
  int _millimeterZaehler;

  public Rennauto(String name, String fahrzeugTyp, int maxV)
  {
    _name = name;
    _fahrzeugTyp = fahrzeugTyp;
    _maxV = maxV;
    _millimeterZaehler = 0;
  }

  public Rennauto()
  {
    _name = "berta";
    _fahrzeugTyp = "fahrzeugTyp";
    _maxV = 100000;
    _millimeterZaehler = 0;
  }

  public void fahre(int anfangZeit, int endZeit)
  {
    for (int i = anfangZeit; i < endZeit; i++)
    {
      //gefahreneAbschnitt / Zeiteinheit ( 1Sekunde)
      int gefahreneAbschnitt = gompertzFunktion(_maxV, 10, i);
      _millimeterZaehler += gefahreneAbschnitt;
      print();
      // System.out.println((double)(_millimeterZaehler)/1000+
      // " Meter gefahren nach "+i+" Sekunden "
      // +(double)(gefahreneAbschnitt)/1000);
    }
  }

  //Benutzung der Gompertz-Funktion um ein stetigeres fahren zu simulieren
  //@web https://de.wikipedia.org/wiki/Gompertz-Funktion
  //@param faktor1 gibt die Asymptote an
  //@param faktor2 gibt den stauchungsfaktor an
  //@param laufvariable gibt den Zeitabschnitt an in dem wir uns befinden


  public int gompertzFunktion(int faktor1, int faktor2, int laufvariable)
  {
    double b = 4;
    double c = (Math.random()+1) * faktor2;
    return (int) (faktor1*Math.exp(-b*Math.exp(-laufvariable/c)));
  }

  public double gibStrecke(){
    return _millimeterZaehler;
  }

  public String gibName(){
    return _name;
  }

  public void print(){
    System.out.printf("|%10.3f|",(double)(_millimeterZaehler)/1000);
  }
}
