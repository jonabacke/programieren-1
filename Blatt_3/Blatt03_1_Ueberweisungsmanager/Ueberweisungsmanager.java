class Ueberweisungsmanager
{
  public void ueberweisen(Konto quellKonto, Konto zielKonto, int betrag)
  {
    quellKonto.hebeAb(betrag);
    zielKonto.zahleEin(betrag);
  }
}
