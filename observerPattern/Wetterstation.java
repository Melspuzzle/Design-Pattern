public class Wetterstation {
    public static void main(String[] args) {
        WetterDaten wetterDaten = new WetterDaten();
        AktuelleBedingungenAnzeige aktuelleAnzeige = new AktuelleBedingungenAnzeige(wetterDaten);

        wetterDaten.setMesswerte(30, 65, 30.4f);

        wetterDaten.setMesswerte(32, 70, 29.2f);

        wetterDaten.setMesswerte(28, 90, 29.2f);
    }
}
