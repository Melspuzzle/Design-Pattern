public class AktuelleBedingungenAnzeige implements Beobachter, AnzeigeElemente { // diese Anzeige implementiert das
                                                                                 // Interface Beobachter, um Änderungen
                                                                                 // vom WetterDaten-Objekt zu erhalten
    private float temp;
    private float feuchtigkeit;
    private Subjekt wetterDaten;

    public AktuelleBedingungenAnzeige(Subjekt wetterDaten) {// dem Konstruktur wird das WetterDatenObjekt (Subjekt)
                                                            // übergeben, damit es verwendet werden kann, um die
                                                            // Anzeige als Beobachter zu registrieren
        this.wetterDaten = wetterDaten;
        wetterDaten.registriereBeobachter(this);
    }

    public void aktualisieren(float temp, float feuchtigkeit, float druck) { // wenn die Klasse wetterDaten die Methode
                                                                             // aktualisieren aufruft, dann werden auch
                                                                             // hier die Beobachterwerte aktualisiert
        this.temp = temp;
        this.feuchtigkeit = feuchtigkeit;
        anzeigen();
    }

    public void anzeigen() {
        System.out
                .println("Aktuelle Wetterbedingungen: " + temp + " Grad C und " + feuchtigkeit + "% Luftfeuchtigkeit");
    }
}