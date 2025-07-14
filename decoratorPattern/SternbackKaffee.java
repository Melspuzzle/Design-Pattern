package decoratorPattern;

public class SternbackKaffee {
    public static void main(String args[]) {
        Getraenk getraenk = new Espresso();
        System.out.println(getraenk.getBeschreibung() + " " + getraenk.preis() + "€");
        Getraenk getraenk2 = new Hausmischung();
        getraenk2 = new Schoko(getraenk2);
        getraenk2 = new Milchschaum(getraenk2);

        System.out.println(getraenk2.getBeschreibung() + " " + getraenk2.preis() + "€");

        Getraenk getraenk3 = new Hausmischung();
        getraenk3 = new Soja(getraenk3);
        getraenk3 = new Schoko(getraenk3);

        System.out.println(getraenk3.getBeschreibung() + " " + getraenk3.preis() + "€");

    }
}
