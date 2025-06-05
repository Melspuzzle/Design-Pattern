public class WetterDaten {
    public WetterDaten() {
    }

    public void messwerteGeandert() {
        float temp = getTemperatur();
        float feuchtigkeit = getLuftfeuchtigkeit();
        float druck = getLuftdruck();

        aktuelleBedingungenAnzeige.aktualisieren(temp, feuchtigkeit, druck);
        statistikenAnzeige.aktualisieren(temp, feuchtigkeit, druck);
        vorhersageAnzeige.aktualisieren(temp, feuchtigkeit, druck);
    }

}