/**
 * In der Klasse Rennbahn wird eine Rennbahn erzeugt auf die bis zu vier
 * Autos gesetzt werden können.
 *
 * @author Jonathan Backes, Linus Kurz
 * @version 11.04.2018
 */

class Rennbahn {

  /**
   * Hier werden die Feldvariablen erzeugt.
   * Die Strecke wird in mm angegeben um eine höhere Genauigkeit zu bekommen
   *
   * @param _streckenlänge länge der Strecke die gefahren werden soll
   * @param _auto1 erzeugung eines Rennautoexemplars, dass vorerst leer ist
   * @param _auto2 erzeugung eines Rennautoexemplars, dass vorerst leer ist
   * @param _auto3 erzeugung eines Rennautoexemplars, dass vorerst leer ist
   * @param _auto4 erzeugung eines Rennautoexemplars, dass vorerst leer ist
   * @param _auto1 erzeugung eines Rennautoexemplars, dass den spaeteren Sieger angibt
   * @param _rennZeit gibt den Zeitverlauf des Rennens an
   */

  int _streckenlänge;
  Rennauto _auto1;
  Rennauto _auto2;
  Rennauto _auto3;
  Rennauto _auto4;
  Rennauto _sieger;
  int _rennZeit;

  /**
   * Im Konstruktor wird die Streckenlänge definiert
   *
   * @param streckenlänge Streckenlaenge in mm angeben.
   */

  public Rennbahn(int streckenlänge) {
    _streckenlänge = streckenlänge;
  }

  public Rennbahn() {
    _streckenlänge = 10000000;
  }

  /**
   * Mit der Methode setzeAufSpur wird ein Auto auf die niedrigste Spur gesetzt
   *
   * @param auto das Auto welches auf eine Spur gesetzt werden soll
   */

  public void setzeAufSpur(Rennauto auto) {
    if (_auto1 == null) {
      _auto1 = auto;
    } else if (_auto2 == null) {
      _auto2 = auto;
    } else if (_auto3 == null) {
      _auto3 = auto;
    } else if (_auto4 == null) {
      _auto4 = auto;
    } else {
      System.out.println("Alle Bahnen sind belegt");
    }
  }

  /**
   * In der Methode simuliere Zeitabschnitt wird ein Zeitabschnitt zwischen
   * @param anfangZeit und @param endZeit simuliert.
   */

  public void simuliereZeitabschnitt(int anfangZeit, int endZeit) {
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

  /**
     * In der Methode fahre wird fuer ein
     * @param auto für
     * @param anfangZeit
     * und
     * @param endZeit über die momentane zurueckgelegte Strecke
     * ausgewaehlt ob es momentan um die Kurve faehrt oder gerade.
     */

  public void fahre(Rennauto auto, int anfangZeit, int endZeit) {
    if (auto.gibStrecke() % _streckenlänge < 1500000) {
      auto.fahreGerade(anfangZeit, endZeit);
    } else if (auto.gibStrecke() % _streckenlänge <= 3500000) {
      auto.fahreKurve(anfangZeit, endZeit);
    } else if (auto.gibStrecke() % _streckenlänge <= 6500000) {
      auto.fahreGerade(anfangZeit, endZeit);
    } else if (auto.gibStrecke() % _streckenlänge <= 8500000) {
      auto.fahreKurve(anfangZeit, endZeit);
    } else if (auto.gibStrecke() % _streckenlänge <= 10000000) {
      auto.fahreGerade(anfangZeit, endZeit);
    }
  }

  /**
   * In der Methode liefereSieger wird ermittelt ob es einen Sieger gibt
   * und wenn ja wer dieser ist.
   *
   * @return ob es einen Sieger gibt
   */

  public boolean liefereSieger() {
    if (_auto1 != null) {
      if ((_streckenlänge - _auto1.gibStrecke()) <= 0) {
        _sieger = _auto1;
        return true;
      }
    }
    if (_auto2 != null) {
      if ((_streckenlänge - _auto2.gibStrecke()) <= 0) {
        _sieger = _auto2;
        return true;
      }
    }
    if (_auto3 != null) {
      if ((_streckenlänge - _auto3.gibStrecke()) <= 0) {
        _sieger = _auto3;
        return true;
      }
    }
    if (_auto4 != null) {
      if ((_streckenlänge - _auto4.gibStrecke()) <= 0) {
        _sieger = _auto4;
        return true;
      }
    }
    return false;
  }

  /**
   * In der Methode rennenDurchführen wird das rennen
   * durchgeführt bis es einen Sieger gibt.
   */

  public void rennenDurchfuehren() {
    if (_auto1 == null && _auto2 == null && _auto3 == null && _auto4 == null) {
      System.out.println("Kein Auto vorhanden");
    }
    ausgabenKopf();
    int zeit = 1;
    do {
      simuliereZeitabschnitt(zeit, zeit + 1);
      System.out.println();
      zeit++;
    } while (!liefereSieger());
    System.out.println(_sieger.gibName() + " ist Gewinner");
    aufNullSetzen();
  }

  /**
   * Mit der Methode aufNullSetzen werden die gefahrenen Strecken aller Autos
   * nach dem Rennen auf null gesetzt
   */

  public void aufNullSetzen() {
    if (_auto1 != null) {
      _auto1.aufNullSetzen();
    }
    if (_auto2 != null) {
      _auto2.aufNullSetzen();
    }
    if (_auto3 != null) {
      _auto3.aufNullSetzen();
    }
    if (_auto4 != null) {
      _auto4.aufNullSetzen();
    }
  }

  /**
   * Mit der Methode entferne kann ein Auto von der Rennstrecke entfernt werden
   *
   * @param auto Auto welches entfernt werden soll
   */

  public void entfernen(Rennauto auto) {
    if (_auto1 == auto) {
      _auto1 = _auto2;
      _auto2 = _auto3;
      _auto3 = _auto4;
      _auto4 = null;
    } else if (_auto2 == auto) {
      _auto2 = _auto3;
      _auto3 = _auto4;
      _auto4 = null;
      ;
    } else if (_auto3 == auto) {
      _auto3 = _auto4;
      _auto4 = null;
      ;
    } else if (_auto4 == auto) {
      _auto4 = null;
    } else {
      System.out.println("Dieses Auto ist nicht vorhanden");
    }
  }

  /**
   * Diese Methode wird aufgerufen um in der Ausgabe die Fahrer oben anzugeben
   */

  public void ausgabenKopf() {
    if (_auto4 != null) {
      System.out.printf("|%10s||%10s||%10s||%10s|", _auto1.gibName(), _auto2.gibName(), _auto3.gibName(),
          _auto4.gibName());
    } else if (_auto3 != null) {
      System.out.printf("|%10s||%10s||%10s|", _auto1.gibName(), _auto2.gibName(), _auto3.gibName());
    }

    else if (_auto2 != null) {
      System.out.printf("|%10s||%10s|", _auto1.gibName(), _auto2.gibName());
    } else {
      System.out.printf("|%10s|", _auto1.gibName());
    }
    System.out.println();
    System.out.println("------------------------------------------------------");
  }
}
