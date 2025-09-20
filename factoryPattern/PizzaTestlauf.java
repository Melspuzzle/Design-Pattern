package factoryPattern;

public class PizzaTestlauf {
    public static void main(String[] args) {
        Pizzeria berlinPizzeria = new BerlinPizzeria();
        Pizzeria münchenPizzeria = new MünchenPizzeria();

        Pizza pizza = berlinPizzeria.bestellePizza("Salami");
        System.out.println("Ben hat eine " + pizza.getName() + " bestell\n");

        pizza = münchenPizzeria.bestellePizza("Salami");
        System.out.println("Tassilo hat eine " + pizza.getName() + " bestellt\n");

    }
}
