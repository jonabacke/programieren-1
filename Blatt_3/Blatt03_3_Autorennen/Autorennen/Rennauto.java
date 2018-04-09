class Rennauto{

  String _name;
  String _fahrzeugTyp;
  double _maxV;
  double _meterZaehler;

  public Rennauto(String name, String fahrzeugTyp, double maxV)
  {
    _name = name;
    _fahrzeugTyp = fahrzeugTyp;
    _maxV = maxV;
    _meterZaehler = 0;
  }

  public Rennauto()
  {
    _name = "berta";
    _fahrzeugTyp = "fahrzeugTyp";
    _maxV = 100;
    _meterZaehler = 0;
  }

  public void fahre(int anfangZeit, int endZeit)
  {
    for (int i = anfangZeit; i < endZeit; i++)
    {
      double gefahreneAbschnitt = gompertzFunktion(_maxV, 10, i);
      _meterZaehler += gefahreneAbschnitt;
      System.out.println((int)_meterZaehler+" Meter gefahren nach "+i+" Sekunden "
      +gompertzFunktion(_maxV, 10, i));
    }
  }

  //Benutzung der Gompertz-Funktion um ein stetigeres fahren zu simulieren
  //@web https://de.wikipedia.org/wiki/Gompertz-Funktion
  //@param faktor1 gibt die Asymptote an
  //@param faktor2 gibt den stauchungsfaktor an
  //@param laufvariable gibt den Zeitabschnitt an in dem wir uns befinden


  public double gompertzFunktion(double faktor1, int faktor2, int laufvariable)
  {
    double b = 4;
    double c = (Math.random()+1) * faktor2;
    return faktor1*Math.exp(-b*Math.exp(-laufvariable/c));
  }

  public double gibStrecke(){
    return _meterZaehler;
  }

  public String gibName(){
    return _name;
  }
}
