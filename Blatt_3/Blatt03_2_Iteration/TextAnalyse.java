/**
 * Diese Klasse bietet die Moeglichkeit, Texte zu analysieren.
 * Sie dient als Einstieg in Schleifenkonstrukte und zeigt in
 * der Methode istFrage beispielhaft einige Methodenaufrufe an
 * einem Objekt der Klasse String.
 *
 * @author Fredrik Winkler, Joerg Rathlev, Petra Becker-Pechau
 * @version 2017
 */
class TextAnalyse
{
    /**
     * Ermittelt, ob es sich bei dem uebergebenen Text um eine Frage
     * handelt. Eine Frage erkennt man am abschliessenden Fragezeichen.
     *
     * @param text der zu analysierende Text
     * @return true, wenn es sich um eine Frage handelt, false sonst
     */
    public boolean istFrage(String text)
    {
        int anzahlZeichen = text.length();

        int letztePosition = anzahlZeichen - 1;

        if (anzahlZeichen == 0)
        {
          return false;
        }

        char letztesZeichen = text.charAt(letztePosition);

        boolean endetAufFragezeichen = (letztesZeichen == '?');

        return endetAufFragezeichen;
    }

    /**
     * Ermittelt, ob es sich bei dem uebergebenen Text um eine Frage
     * handelt. Eine Frage erkennt man am abschliessenden Fragezeichen.
     *
     * @param text der zu analysierende Text
     * @return true, wenn es sich um eine Frage handelt, false sonst
     */
    public boolean istFrageKompakt(String text)
    {
        return text.charAt(text.length() - 1) == '?';
    }

    public int zaehleVokale(String text)
    {
      int anzahlZeichen = text.length();

      int zaehler = 0;

      for(int i = 0; i<anzahlZeichen; i++)
      {
        char zeichen = text.charAt(i);

        switch (zeichen) {
          case 'a': case 'e': case 'i': case 'o': case 'u':
          case 'A': case 'E': case 'I': case 'O': case 'U':
          zaehler++;
        }
      }
      return zaehler;
    }

    public boolean istPalindrom(String text)
    {
      text = text.toLowerCase();

      int anzahlZeichen = text.length();

      if (anzahlZeichen % 2 == 1) return false;

      for (int i = 0; i < anzahlZeichen / 2; i++)
      {
        if (text.charAt(i) != text.charAt(anzahlZeichen-i-1) ) return false;
      }
      
      return true;
    }
}
