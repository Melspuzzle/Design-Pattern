package decoratorPattern;

public class Hausmischung extends Getraenk {
    public Hausmischung() {
        beschreibung = "Hausmischung";
    }

    public double preis() {
        return 0.89;
    }
}
