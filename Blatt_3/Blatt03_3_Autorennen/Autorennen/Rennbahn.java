class Rennbahn{

  //Streckenlänge in mm für höhere Genauigkeit
  int _streckenlänge;
  Rennauto _auto1;
  Rennauto _auto2;
  Rennauto _auto3;
  Rennauto _auto4;
  Rennauto _sieger;
  int _rennZeit;

  public Rennbahn(){
    _streckenlänge = 10000000;
  }


  public void setzeAufSpur(Rennauto auto){
    if (_auto1 == null) {
      _auto1 = auto;
    }
    else if (_auto2 == null) {
      _auto2 = auto;
    }
    else if (_auto3 == null) {
      _auto3 = auto;
    }
    else if (_auto4 == null) {
      _auto4 = auto;
    }
    else{
      System.out.println("Alle Bahnen sind belegt");
    }
  }

  public void simuliereZeitabschnitt(int anfangZeit, int endZeit){
    if (_auto1 != null) {
      fahre(_auto1, anfangZeit, endZeit);
    }
    if (_auto2 != null) {
      fahre(_auto2, anfangZeit, endZeit);
    }
    if (_auto3 != null) {
      fahre(_auto3, anfangZeit, endZeit);
    }
    if (_auto4 != null) {
      fahre(_auto4, anfangZeit, endZeit);
    }
  }

  public void fahre(Rennauto auto, int anfangZeit, int endZeit){
    if (auto.gibGefahreneStrecke() % _streckenlänge < 1500000) {
      auto.fahreGerade(anfangZeit, endZeit);
    }
    else if (auto.gibGefahreneStrecke() % _streckenlänge < 3500000) {
      auto.fahreKurve(anfangZeit, endZeit);
    }
    else if (auto.gibGefahreneStrecke() % _streckenlänge < 6500000) {
      auto.fahreGerade(anfangZeit, endZeit);
    }
    else if (auto.gibGefahreneStrecke() % _streckenlänge < 8500000) {
      auto.fahreKurve(anfangZeit, endZeit);
    }
    else if (auto.gibGefahreneStrecke() % _streckenlänge < 10000000) {
      auto.fahreGerade(anfangZeit, endZeit);
    }
  }

  public boolean liefereSieger(){
    if (_auto1 != null) {
      if(_streckenlänge-_auto1.gibStrecke() >= 0){
        _sieger = _auto1;
        return true;
      }
    }
    else if (_auto2 != null) {
      if(_streckenlänge-_auto2.gibStrecke() >= 0){
        _sieger = _auto2;
        return true;
      }
    }
    else if (_auto3 != null) {
      if(_streckenlänge-_auto3.gibStrecke() >= 0){
        _sieger = _auto3;
        return true;
      }
    }
    else if (_auto4 != null) {
      if(_streckenlänge-_auto4.gibStrecke() >= 0){
        _sieger = _auto4;
        return true;
      }
    }
    return false;
  }

  public void rennenDurchführen(){

    if(_auto1 == null && _auto2 == null && _auto3 == null && _auto4 == null){
        System.out.println("Kein Auto vorhanden");
    }

    if (_auto4 != null) {
      System.out.printf("|%10s||%10s||%10s||%10s|" ,_auto1.gibName(), _auto2.gibName(), _auto3.gibName(), _auto4.gibName());
    }
    else if (_auto3 != null) {
      System.out.printf("|%10s||%10s||%10s|" ,_auto1.gibName(), _auto2.gibName(), _auto3.gibName());
    }

    else if (_auto2 != null) {
      System.out.printf("|%10s||%10s|" ,_auto1.gibName(), _auto2.gibName());
    }
    else{
      System.out.printf("|%10s|" ,_auto1.gibName());
    }
    System.out.println();
    System.out.println("------------------------------------------------------");

    int zeit = 1;


    do{

      simuliereZeitabschnitt(zeit, zeit + 1);
      System.out.println();
      zeit++;
    }
    while(liefereSieger());

    System.out.println(_sieger.gibName()+" ist Gewinner");
  }

  public void entfernen(Rennauto auto){
    if (_auto1 == auto) {
      _auto1 = _auto2;
      _auto2 = _auto3;
      _auto3 = _auto4;
      _auto4 = null;
    }
    else if (_auto2 == auto) {
      _auto2 = _auto3;
      _auto3 = _auto4;
      _auto4 = null;;
    }
    else if (_auto3 == auto) {
      _auto3 = _auto4;
      _auto4 = null;;
    }
    else if (_auto4 == auto) {
      _auto4 = null;
    }
    else{
      System.out.println("Dieses Auto ist nicht vorhanden");
    }
  }

}
