package pizza.topping;

public class OlivesTopping extends VeggieTopping {
    @Override
    public String toString() {
        return "Olives Topping";
    }

    @Override
    public Double getPrice() {
        return 1.25; 
    }
}
