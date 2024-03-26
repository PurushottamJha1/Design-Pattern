import Pizza.*;

public class Main {
    public static void main(String[] args) {
        PizzaFactory factory = new PizzaFactory();
        PizzaStore store = new PizzaStore(factory);
        System.out.println("Let's Order CheesePizza");
        BasePizza cheesePizza = store.orderPizza("Cheese");
        System.out.println("\n");
        System.out.println("Let's Order Pepperoni");
        BasePizza pepperoniPizza = store.orderPizza("Pepperoni");
        System.out.println("\n");
        System.out.println("Let's Order vegetarianPizza");
        BasePizza vegetarianPizza = store.orderPizza("Vegetarian");

    }
}