package pizza.topping;

public class PepperTopping extends VeggieTopping {
    @Override
    public String toString() {
        return "Pepper Topping";
    }

    @Override
    public Double getPrice() {
        return 1.25; 
    }
}
