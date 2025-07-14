package decoratorPattern;

public class Schoko extends ZutatDekorierer {
    // Schoko ist eine Variante von ZutatDekoriere, um Getränke zu dekorieren
    // beinhaltet eine Referenz auf Getraenk, im Konstruktor kann dieses dann
    // übergeben werden
    Getraenk getraenk;// Instanzvariable, um das Objekt Getränk aufzunehmen

    public Schoko(Getraenk getraenk) {// Parameter ist Klassenname des Objekts und Datentyp hier das Objekt
        this.getraenk = getraenk;// Objekt wird an die Instanzvariable übergeben
    }

    public String getBeschreibung() {
        return getraenk.getBeschreibung() + ", Schoko";// erst allgemeine Getränkbeschreibung holen und die von der
                                                       // Dekorierzutat hinzufügen
    }

    public double preis() {
        return 0.20 + getraenk.preis();// erst wird der Aufruf an das Objekt getraenk übergeben, um den Preis zu
                                       // berechnen und dann wird der eigene Preis hinzugefügt
    }
}
