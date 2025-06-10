import java.util.ArrayList;

public class WetterDaten implements Subjekt {
    private ArrayList beobachter;
    private float temp;
    private float feuchtigkeit;
    private float druck;

    public WetterDaten() {
        beobachter = new ArrayList<>(); // arrayliste wird im Konstruktur erstellt zur Speicherung der Beobachter
    }

    public void registriereBeobachter(Beobachter b) {
        beobachter.add(b);
    }

    public void entferneBeobachter(Beobachter b) {
        int i = beobachter.indexOf(b);
        if (i >= 0) {
            beobachter.remove(i);
        }
    }

    public void benachrichtigeBeobachter() {
        for (int i = 0; i < beobachter.size(); i++) {
            Beobachter b = (Beobachter) beobachter.get(i);
            b.aktualisieren(temp, feuchtigkeit, druck); // alle Beobachter haben die Methode aktualisieren
                                                        // implementiert, darüber Benachrichtigung
        }
    }

    public void messwerteGeandert() {
        benachrichtigeBeobachter();
    }

    public void setMesswerte(float temp, float feuchtigkeit, float druck) {
        this.temp = temp;
        this.feuchtigkeit = feuchtigkeit;
        this.druck = druck;
        messwerteGeandert();// setzen neuer Werte ruft über messwerte geändert die benachrichtigung auf
    }

}