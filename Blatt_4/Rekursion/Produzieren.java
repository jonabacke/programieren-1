/**
 * In dieser Klasse sind rekursive Algorithmen umzusetzen.
 *
 * @author Fredrik Winkler, Axel Schmolitzky
 * @version 2017
 */
class Produzieren
{
    /**
    * Liefert die Fakultaet von n, also das Produkt aller natuerlichen Zahlen bis n.
    * Die Fakultaet von 0 ist per mathematischer Definition 1.
    *
    * Beispielauswertung:
    *
    *   fak(4)
    * -> 4 * fak(3)
    * -> 4 * (3 * fak(2))
    * -> 4 * (3 * (2 * fak(1)))
    * -> 4 * (3 * (2 * (1 * fak(0))))
    * -> 4 * (3 * (2 * (1 * 1)))
    * -> 4 * (3 * (2 * 1))
    * -> 4 * (3 * 2)
    * -> 4 * 6
    * -> 24
    */
    public int fak(int n)
    {
      if (n == 0) {
        return 1;
      }
      else {
        return n * fak(n-1);
      }
    }

    /**
     * Berechnet n modulo m, also den Rest der ganzzahligen Division n/m.
     *
     * modulo(14,3) -> modulo(11,3) -> modulo(8,3) -> modulo(5,3) -> modulo(2,3) -> 2
     *
     * @param n ein beliebiger Wert >= 0
     * @param m ein beliebiger Wert > 0
     */
    public int modulo(int n, int m)
    {
        if (n < m) {
          return n;
        }
        else {
          return modulo(n - m, m);
        }
    }

    /**
    * Gibt an, ob die Zeichenkette einen Vokal enthaelt. Auswertungen:
    *
    * enthaeltVokal("brei") -> enthaeltVokal("rei") -> enthaeltVokal("ei") -> true
    * enthaeltVokal("xyz") -> enthaeltVokal("yz") -> enthaeltVokal("z") -> enthaeltVokal("") -> false
    * @param s ein beliebiger String
    */
    public boolean enthaeltVokal(String s)
    {
      s = s.toLowerCase();
      if (s.length() < 1) {
        return false;
      }
      else {
        if (s.charAt(0) == 'a') {
          return true;
        }
        else if (s.charAt(0) == 'e') {
          return true;
        }
        else if (s.charAt(0) == 'o') {
          return true;
        }
        else if (s.charAt(0) == 'u') {
          return true;
        }
        else if (s.charAt(0) == 'i') {
          return true;
        }
        else{
          return enthaeltVokal(s.substring(1));
        }
      }
    }

    /**
    * Gibt an, ob die Zeichenkette ein Palindrom ist. Auswertungen:
    *
    * istPalindrom("anna") -> istPalindrom("nn") -> istPalindrom("") -> true
    * istPalindrom("asta") -> istPalindrom("st") -> false
    * istPalindrom("axa") -> istPalindrom("x") -> true
    * istPalindrom("xyz") -> false
    * @param s ein beliebiger String ungleich null
    */
    public boolean istPalindrom(String s)
    {
      if (s.length() <= 1) {
        return true;
      }
      else {
        if (s.charAt(0) == s.charAt(s.length()-1)) {
          return istPalindrom(s.substring(1,1));
        }
        else{
          return false;
        }
      }
    }

    /**
    * Berechnet die Anzahl Leerzeichen in der Zeichenketten. Auswertung:
    *
    * anzahlLeerzeichen("a bc d")
    * -> 0 + anzahlLeerzeichen(" bc d")
    * -> 0 + (1 + anzahlLeerzeichen("bc d"))
    * -> 0 + (1 + (0 + anzahlLeerzeichen("c d")))
    * -> 0 + (1 + (0 + (0 + anzahlLeerzeichen(" d"))))
    * -> 0 + (1 + (0 + (0 + (1 + anzahlLeerzeichen("d")))))
    * -> 0 + (1 + (0 + (0 + (1 + (0 + anzahlLeerzeichen(""))))))
    * -> 0 + (1 + (0 + (0 + (1 + (0 + 0)))))
    * -> 0 + (1 + (0 + (0 + (1 + 0))))
    * -> 0 + (1 + (0 + (0 + 1)))
    * -> 0 + (1 + (0 + 1))
    * -> 0 + (1 + 1)
    * -> 0 + 2
    * -> 2
    * @param s ein beliebiger String ungleich null
    */
    public int anzahlLeerzeichen(String s)
    {
      if (s.charAt(0) == ' ' && s.length() == 1) {
        return 1;
      }
      if (s.charAt(0) != ' ' && s.length() == 1) {
        return 0;
      }
      if (s.charAt(0) == ' ') {
        return 1 + anzahlLeerzeichen(s.substring(1));
      }
      else {
        return anzahlLeerzeichen(s.substring(1));
      }
    }

    /**
    * Liefert die umgedrehte Zeichenkette. Auswertung:
    *
    *   umgedreht("regal")
    * -> umgedreht("egal") + 'r'
    * -> (umgedreht("gal") + 'e') + 'r'
    * -> ((umgedreht("al") + 'g') + 'e') + 'r'
    * -> (((umgedreht("l") + 'a') + 'g') + 'e') + 'r'
    * -> (((          "l"  + 'a') + 'g') + 'e') + 'r'
    * -> ((           "la"        + 'g') + 'e') + 'r'
    * -> (            "lag"              + 'e') + 'r'
    * ->              "lage"                    + 'r'
    * ->              "lager"
    * @param s ein beliebiger String ungleich null
    */
    public String umgedreht(String s)
    {
      if (s.length() >= 1) {
        return umgedreht(s.substring(1)) + s.charAt(0);
      }
      else {
        return s;
      }
    }
}
