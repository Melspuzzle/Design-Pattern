package factoryPattern;

public class MünchenPizzeria extends Pizzeria { // erweitert Pizzeria und erbt unter anderem die Methode bestellePizza()
    protected Pizza erstellePizza(String element) {
        if (element.equals("Salami")) {
            return new MünchenerSalamiPizza();
        } /*
           * else if (element.equals("Schinken")) {
           * return new MünchenerSchinkenPizza();
           * } else if (element.equals("Thunfisch")) {
           * return new MünchenerThunfischPizza();
           * } else if (element.equals("Krabben")) {
           * return new MünchenerKrabbenPizza();
           * }
           */ else
            return null;
    }
}
