class Rennbahn{
  double _streckenlänge = 100;
  Rennauto _auto1;
  Rennauto _auto2;
  Rennauto _auto3;
  Rennauto _auto4;
  Rennauto _sieger;
  int _rennZeit;


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
      _auto1.fahre(anfangZeit, endZeit);
    }
    if (_auto2 != null) {
      _auto2.fahre(anfangZeit, endZeit);
    }
    if (_auto3 != null) {
      _auto3.fahre(anfangZeit, endZeit);
    }
    if (_auto4 != null) {
      _auto4.fahre(anfangZeit, endZeit);
    }
  }

  public Rennauto liefereSieger(){
    if (_auto1 != null) {
      if(_streckenlänge-_auto1.gibStrecke() >= 0){
        _sieger = _auto1;
        return _auto1;
      }
    }
    if (_auto2 != null) {
      if(_streckenlänge-_auto2.gibStrecke() >= 0){
        _sieger = _auto2;
        return _auto2;
      }
    }
    if (_auto3 != null) {
      if(_streckenlänge-_auto3.gibStrecke() >= 0){
        _sieger = _auto3;
        return _auto3;
      }
    }
    if (_auto4 != null) {
      if(_streckenlänge-_auto4.gibStrecke() >= 0){
        _sieger = _auto4;
        return _auto4;
      }
    }
    return null;
  }

  public void rennenDurchführen(){

    if(_auto1 == null && _auto2 == null && _auto3 == null && _auto4 == null){
        System.out.println("Kein Auto vorhanden");
    }

    int zeit = 1;

    do{

      simuliereZeitabschnitt(zeit, zeit + 1);
      zeit++;
    }
    while(liefereSieger() != null);

    System.out.println(_sieger.gibName()+" ist Gewinner");



  }

}
