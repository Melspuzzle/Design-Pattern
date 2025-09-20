package factoryPattern;

public class BerlinerSalamiPizza extends Pizza {
    public BerlinerSalamiPizza() {
        name = "Salamipizza Berliner Art";
        teig = "Teig mit knuspriger Kruste";
        soße = "Marinara-Soße";

        belaege.add("Geriebener Parmesan");
        belaege.add("Salami in Scheiben");
    }
}
