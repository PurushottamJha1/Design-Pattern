package Pizza;

public class CheesePizza extends BasePizza {
    public void prepare() {
        System.out.println("CheesePizza is being prepared");
    }
    public void bake() {  System.out.println("CheesePizza is being baked"); }
    public void cut() {  System.out.println("CheesePizza is being cut"); }
    public void box() {  System.out.println("CheesePizza is being boxed"); }
}
