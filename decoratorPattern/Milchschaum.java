package decoratorPattern;

public class Milchschaum extends ZutatDekorierer {
    Getraenk getraenk;

    public Milchschaum(Getraenk getraenk) {
        this.getraenk = getraenk;
    }

    public String getBeschreibung() {
        return getraenk.getBeschreibung() + ", Milchschaum";
    }

    public double preis() {
        return 0.10 + getraenk.preis();
    }
}
