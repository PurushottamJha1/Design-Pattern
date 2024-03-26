import Pizza.*;
public class PizzaFactory {
    public BasePizza createPizza(String type) {
        if (type.equals("Cheese")) {
            return new CheesePizza();
        } else if (type.equals("Pepperoni")) {
            return new PepperoniPizza();
        } else if (type.equals("Vegetarian")) {
            return new VegetarianPizza();
        } else {
            return null; // Handle unknown pizza types
        }
    }
}
