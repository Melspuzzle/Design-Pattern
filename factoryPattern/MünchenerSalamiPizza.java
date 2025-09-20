package factoryPattern;

public class MünchenerSalamiPizza extends Pizza {
    public MünchenerSalamiPizza() {
        name = "Deftige Salamipizza im Münchener Stil";
        teig = "Teig mit extra dicker Kruste";
        soße = "Tomatensoße";

        belaege.add("Mozarella");
    }

    void schneiden() { // überschreiben der schneiden()Methode
        System.out.println("Schneide die Pizza in rechteckige Stücke");
    }
}
