
/**
 * Exemplare dieser Klasse zeichnen eine einfache Zeichnung.
 * Um die Zeichnung auf dem Bildschirm anzuzeigen, muss die
 * zeichne-Operation an einem Exemplar aufgerufen werden.
 *
 * Diese Klasse ist als fruehes Java-Lehrbeispiel mit BlueJ gedacht.
 * 
 * @author  Petra Becker-Pechau, Axel Schmolitzky
 */
class Zeichner
{
 
    /**
     * Zeichne die Zeichnung.
     */
    public void zeichne()
    {
        Kreis gesicht; 
        Kreis linkesAuge;
        Dreieck rechtesAuge;
        Quadrat nase;

        gesicht = new Kreis();
        gesicht.groesseAendern(150);
        gesicht.sichtbarMachen();
        gesicht.farbeAendern("rot");
        gesicht.vertikalBewegen(50);
        gesicht.groesseAendern(150);
        gesicht.horizontalBewegen(100);
        
        linkesAuge = new Kreis();
        linkesAuge.sichtbarMachen();
        linkesAuge.groesseAendern(30);
        linkesAuge.farbeAendern("gruen");
        linkesAuge.horizontalBewegen(130);
        linkesAuge.vertikalBewegen(10);

        rechtesAuge = new Dreieck();  
        rechtesAuge.sichtbarMachen();
        rechtesAuge.groesseAendern(25, 25);
        rechtesAuge.horizontalBewegen(45);
        rechtesAuge.vertikalBewegen(55);

        nase = new Quadrat();
        nase.sichtbarMachen();
        nase.farbeAendern("gruen");
        nase.horizontalBewegen(60);
        nase.vertikalBewegen(70);
        nase.groesseAendern(10);
    }
}
