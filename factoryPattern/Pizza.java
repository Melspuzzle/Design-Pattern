package factoryPattern;

import java.util.ArrayList;

public class Pizza {
    String name;
    String teig;
    String soße;
    ArrayList belaege = new ArrayList();

    void vorbereiten() {
        System.out.println("Bereite " + name);
        System.out.println("Werfe Teig...");
        System.out.println("Füge Soße hinzu...");
        System.out.println("Füge Beläge hinzu: ");
        for (int i = 0; i < belaege.size(); i++) {
            System.out.println(" " + belaege.get(i));
        }
    }

    void backen() {
        System.out.println("Backe 25 Minuten bei 350 Grad");
    }

    void schneiden() {
        System.out.println("Schneide die Pizza diagonal in Stücke");
    }

    void verpacken() {
        System.out.println("Packe die Pizza in die offizielle Pizzeria-Schachtel");
    }

    public String getName() {
        return name;
    }
}
