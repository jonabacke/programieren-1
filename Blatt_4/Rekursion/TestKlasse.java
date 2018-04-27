class TestKlasse{
  public static void main(String[] args) {
    Produzieren test = new Produzieren();
    int fakCounter = 0;
    int modCounter = 0;
    int vokCounter = 0;
    int palCounter = 0;
    int spcCounter = 0;
    int umgCounter = 0;
    for (int i = 0;i<100 ;i++ ) {
      int testZahl_1 = ((int)(Math.random()*10));
      int testZahl_2 = ((int)(Math.random()*10)+1);
      String randomString = randomString();
      String randomString_2 = randomString.replace('f', ' ');
      randomString_2 = randomString.replace('j', ' ');
      randomString_2 = randomString.replace('t', ' ');
      randomString_2 = randomString.replace('l', ' ');
      if (test.fak(testZahl_1) == fak(testZahl_1)) {
        fakCounter ++;
      }
      if (test.modulo(testZahl_1, testZahl_2) == modulo(testZahl_1, testZahl_2)){
        modCounter ++;
      }
      if (test.enthaeltVokal(randomString) == enthaeltVokal(randomString)) {
        vokCounter ++;
      }
      if (test.istPalindrom(randomString) == istPalindrom(randomString)) {
        palCounter ++;
      }
      if (test.anzahlLeerzeichen(randomString_2) == anzahlLeerzeichen(randomString_2)) {
        spcCounter ++;
      }
      for (int j = 0; j < randomString.length(); j++) {
        if (randomString.charAt(j) == test.umgedreht(randomString).charAt(randomString.length()-j-1)) {
          umgCounter ++;
        }
      }
    }
    print(fakCounter, "Fakultaet :");
    print(modCounter, "Modulo :");
    print(vokCounter, "Vokal :");
    print(palCounter, "Palindrom :");
    print(spcCounter, "Leerzeichen :");
    print(umgCounter, "Umgedreht :");
  }

  public static String randomString(){
    String buchstaben = "qwertzuioplkjhgfdsayxcvbnm" ;
    String ausgabe = "";
    for (int i = 0; i < 10; i++) {
      int random = (int) (Math.random()*26);
      ausgabe += buchstaben.charAt(random);
    }
    return ausgabe;
  }


  public static void print(double i, String str){
    System.out.println(str + i + "% richtig");
  }

  public static int fak(int i){
      int k =i;
    if (i==0) {
      return 1;
    }
    else{
      for (int j=1 ;j < i ;j++ ) {
      k = k * j;
      }
    }
    return k;
  }

  public static int modulo(int n, int m){
    return n%m;
  }

  public static boolean enthaeltVokal(String s){
    s = s.toLowerCase();
    if (s.length() < 1) {
      return false;
    }
    else {
      for (int i = 0;i<s.length() ;i++ ) {
        if (s.charAt(i) == 'a') {
          return true;
        }
        else if (s.charAt(i) == 'e') {
          return true;
        }
        else if (s.charAt(i) == 'o') {
          return true;
        }
        else if (s.charAt(i) == 'u') {
          return true;
        }
        else if (s.charAt(i) == 'i') {
          return true;
        }
      }
      return false;
    }
  }

  public static boolean istPalindrom(String s){
    for (int i = 0; i < s.length() / 2 ; i++) {
      if(s.charAt(i) != s.charAt(s.length() - i - 1)){
        return false;
      }
    }
    return true;
  }

  public static int anzahlLeerzeichen(String s){
    int counter = 0;
    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == ' ') {
        counter ++;
      }
    }
    return counter;
  }
  //
  // public static String umgedreht(String s){
  //   String ausgabe = s;
  //   for (int i =0; i<s.length(); i++) {
  //     ausgabe = s.replace(s.charAt(i), s.charAt(s.length()-i-1));
  //
  //   }
  //   return ausgabe;
  // }

}
