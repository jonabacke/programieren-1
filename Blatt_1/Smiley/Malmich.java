
/**
 * Beschreiben Sie hier die Klasse HausZeichnen.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Malmich
{
    /**
     * Zeichnet ein Smiley
     */    
    public void zeichnen(){
        /**
         * Instanzieren
         */       
        Kreis kopf = new Kreis();
        Kreis mund = new Kreis();
        Kreis eyeL = new Kreis();
        Kreis eyeR = new Kreis();
        Kreis mundHilfe = new Kreis();
        
        /**
         * parameter modifizieren
         */
        kopf.farbeAendern("gelb");
        kopf.horizontalBewegen(100);
        kopf.vertikalBewegen(80);
        kopf.groesseAendern(230);
        
        mund.farbeAendern("schwarz");
        mund.horizontalBewegen(100);
        mund.vertikalBewegen(80);
        mund.groesseAendern(180);
        
        mundHilfe.farbeAendern("gelb");
        mundHilfe.horizontalBewegen(100);
        mundHilfe.vertikalBewegen(60);
        mundHilfe.groesseAendern(180);
        
        eyeL.farbeAendern("schwarz");
        eyeL.horizontalBewegen(60);
        eyeL.vertikalBewegen(40);
        
        eyeR.farbeAendern("schwarz");
        eyeR.horizontalBewegen(140);
        eyeR.vertikalBewegen(40);
        
        
        /**
         * Objekte Zeichnen lassen
         */        
        kopf.sichtbarMachen();
        mund.sichtbarMachen();
        mundHilfe.sichtbarMachen();
        eyeL.sichtbarMachen();
        eyeR.sichtbarMachen();
        
        
        
    }
}
