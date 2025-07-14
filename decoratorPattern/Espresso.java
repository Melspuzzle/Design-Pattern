package decoratorPattern;

public class Espresso extends Getraenk {
    public Espresso() {
        beschreibung = "Espresso";// beschreibung wird im Konstruktor gesetzt
    }

    public double preis() {
        return 1.99;
    }
}