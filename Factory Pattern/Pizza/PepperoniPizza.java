package Pizza;

public class PepperoniPizza extends BasePizza {
    public void prepare() {  System.out.println("PepperoniPizza is being prepared"); }
    public void bake() { System.out.println("PepperoniPizza is being baked"); }
    public void cut() { System.out.println("PepperoniPizza is being cut");}
    public void box() { System.out.println("PepperoniPizza is being boxed"); }
}