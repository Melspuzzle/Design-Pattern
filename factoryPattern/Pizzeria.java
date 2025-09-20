package factoryPattern;

public abstract class Pizzeria {

    Pizza bestellePizza(String typ) { // die Unterklassen von Pizzeria kümmern sich um die
                                      // Objekt-Instantiierung in der Methode erstellePizza()
        Pizza pizza = erstellePizza(typ);
        pizza.vorbereiten();
        pizza.backen(); // Aufruf der Methoden aus Pizza, die auch von individuellen Pizzaarten
                        // überschrieben werden können
        pizza.schneiden();
        pizza.verpacken();
        return pizza;
    }

    protected abstract Pizza erstellePizza(String typ); // jede Unterklasse von Pizzeria überschreibt die Methode
                                                        // erstellePizza(), die in Pizzeria definiert ist
    // diese Methode dient als Fabrik
}
