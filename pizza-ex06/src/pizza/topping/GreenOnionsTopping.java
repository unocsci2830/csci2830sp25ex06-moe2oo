package pizza.topping;

public class GreenOnionsTopping extends VeggieTopping {
    @Override
    public String toString() {
        return "Green Onions Topping";
    }

    @Override
    public Double getPrice() {
        return 1.25; 
    }
}
