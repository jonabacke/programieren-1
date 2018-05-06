 /**
 * Exemplare dieser Klasse veranlassen Turtles dazu,
 * Spuren auf einer Zeichenflaeche zu hinterlassen.
 *
 * @author Axel Schmolitzky
 * @version 2017
 */
class Dompteur
{
  private Turtle turtle = new Turtle(0, 500);

    /**
     * 'PR1' auf die Zeichenflaeche zeichnen.
     */
    public void start()
    {
        turtle = new Turtle(100, 100);

        turtle.drehe(-90);
        turtle.geheVor(60);
        turtle.drehe(90);
        turtle.geheVor(30);
        turtle.drehe(90);
        turtle.geheVor(30);
        turtle.drehe(90);
        turtle.geheVor(30);
        turtle.drehe(180);

        // Ohne Spur zum naechsten Buchstaben bewegen:
        turtle.hinterlasseKeineSpur();
        turtle.geheZu(100, 100);

        // 'R' zeichnen:
        turtle.hinterlasseSpur();
        turtle.drehe(-90);
        turtle.geheVor(60);
        turtle.drehe(90);
        turtle.geheVor(30);
        turtle.drehe(90);
        turtle.geheVor(30);
        turtle.drehe(90);
        turtle.geheVor(30);
        turtle.drehe(180);
        turtle.hinterlasseKeineSpur();
        turtle.geheVor(15);
        turtle.hinterlasseSpur();
        turtle.drehe(60);
        turtle.geheVor(35);

        // Ohne Spur zum naechsten Buchstaben bewegen:
        turtle.hinterlasseKeineSpur();
        turtle.geheZu(170, 100);

        // '1' zeichnen:
        turtle.drehe(-60);
        turtle.hinterlasseSpur();
        turtle.setzeFarbe("rot");
        turtle.drehe(-90);
        turtle.geheVor(60);
        turtle.drehe(-120);
        turtle.geheVor(20);
    }

    public void nEck(int ecken, int kantenlaenge, String neueFarbe, int xPos, int yPos){
      turtle = new Turtle(xPos, yPos);
      if (ecken <= 2) {
        System.out.println("Was soll das bitte für ein n-Eck sein?!");
      }
      int gesamtWinkel = 180 + 180 * (ecken-3);
      int winkel = 180 - gesamtWinkel / ecken;
      turtle.setzeFarbe(neueFarbe);
      for (int i = 0; i < ecken; i++) {
        turtle.geheVor(kantenlaenge);
        turtle.drehe(winkel);
      }
    }

    public void mehrereNEck(int ecken, int kantenlaenge, String neueFarbe, int xPos, int yPos){
      turtle = new Turtle(xPos, yPos);
      if (ecken <= 2) {
        System.out.println("Was soll das bitte für ein n-Eck sein?!");
      }
      int gesamtWinkel = 180 + 180 * (ecken-3);
      int winkel = 180 - gesamtWinkel / ecken;
      turtle.setzeFarbe(neueFarbe);
      for (int j = 0; j < kantenlaenge / 2; j++) {
        for (int i = 0; i < ecken; i++) {
          turtle.geheVor(kantenlaenge - j * 2);
          turtle.drehe(winkel);
        }
      }
    }


    public void mehrereNEckenVerschoben(int ecken, int kantenlaenge, String neueFarbe, int xPos, int yPos){
      turtle = new Turtle(xPos, yPos);
      if (ecken <= 2) {
        System.out.println("Was soll das bitte für ein n-Eck sein?!");
      }
      int verschiebung = 4;
      int gesamtWinkel = 180 + 180 * (ecken-3);
      int winkel = 180 - gesamtWinkel / ecken;
      turtle.setzeFarbe(neueFarbe);
      for (int j = 0; j < kantenlaenge / verschiebung; j++) {
        for (int i = 0; i < ecken; i++) {
          turtle.geheVor(kantenlaenge - j * verschiebung);
          turtle.drehe(winkel);
        }
        turtle.hinterlasseKeineSpur();
        turtle.drehe((winkel / 2));
        turtle.geheVor(Math.sqrt(Math.pow(verschiebung / 2, 2) + Math.pow(verschiebung / 2, 2)));
        turtle.drehe( - winkel / 2);
        turtle.hinterlasseSpur();
      }
    }

    public void zeichneKochKurve(int grad, int maxStrecke){
      if (grad == 1) {
        zeichneStrecke(maxStrecke);
        return;
      }
      else {
        zeichneKochKurve(grad -1, maxStrecke / 3);
        turtle.drehe(-60);
        zeichneKochKurve(grad -1, maxStrecke / 3);
        turtle.drehe(120);
        zeichneKochKurve(grad -1, maxStrecke / 3);
        turtle.drehe(-60);
        zeichneKochKurve(grad -1, maxStrecke / 3);
      }
      return;
    }

    public void zeichneStrecke(int strecke){
      turtle.geheVor(strecke / 3);
      turtle.drehe(-60);
      turtle.geheVor(strecke / 3);
      turtle.drehe(120);
      turtle.geheVor(strecke / 3);
      turtle.drehe(-60);
      turtle.geheVor(strecke / 3);
    }

















}
