class DateiNamenZerleger{
  int _backslash;
  int _punkt;
  String _str;

  private String getDateiname(){
    return _str.substring(_backslash+1,_punkt) ;
  }

  private String getDateiendung(){
    return _str.substring(_punkt+1);
  }

  private String getVerzeichnis(){
    return _str.substring(0,_backslash);
  }

  public DateiNamenZerleger(String str){
    _str = str;
    _str.trim();
    for (int i = 0;i < _str.length(); i++) {
      if (_str.charAt(i) == '.'){
        _punkt = i;
        break;
      }
    }
    for (int i = _str.length()-1;i > 0;i--) {
      if (_str.charAt(i) == 92) {
        _backslash = i;
        break;
      }
    }
  }

  public DateiNamenZerleger(){
    _str = "C:\\Eigene Daten\\Javatest\\Beispiel.java";
    _str.trim();
    for (int i = 0;i < _str.length(); i++) {
      if (_str.charAt(i) == '.'){
        _punkt = i;
        break;
      }
    }
    for (int i = _str.length()-1;i > 0;i--) {
      if (_str.charAt(i) == 92) {
        _backslash = i;
        break;
      }
    }
  }

  public void infoZeigen(){
    System.out.printf("Dateiname: \t %s %n", getDateiname());
    System.out.printf("Dateiendung \t %s %n", getDateiendung());
    System.out.printf("Verzeichnis \t %s %n", getVerzeichnis());
  }
}
