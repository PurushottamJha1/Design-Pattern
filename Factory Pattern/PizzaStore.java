import Pizza.*;
public class PizzaStore {
    private final PizzaFactory pizzaFactory;

    public PizzaStore(PizzaFactory pizzaFactory) {
        this.pizzaFactory = pizzaFactory;
    }

    public BasePizza orderPizza(String type) {
            BasePizza pizza = pizzaFactory.createPizza(type);
        if (pizza != null) {
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        } else {
            System.out.println("Sorry, we don't serve that type of pizza.");
        }
        return pizza;
    }
}


