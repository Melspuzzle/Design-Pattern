package factoryPattern;

public class BerlinPizzeria extends Pizzeria { // erweitert Pizzeria und erbt unter anderem die Methode bestellePizza()
    protected Pizza erstellePizza(String element) {
        if (element.equals("Salami")) {
            return new BerlinerSalamiPizza();
        } /*
           * else if (element.equals("Schinken")) {
           * return new BerlinerSchinkenPizza();
           * } else if (element.equals("Thunfisch")) {
           * return new BerlinerThunfischPizza();
           * } else if (element.equals("Krabben")) {
           * return new BerlinerKrabbenPizza();
           * }
           */
        else
            return null;
    }
}
