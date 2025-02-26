package pizza.topping;

public class ChedderTopping extends CheeseTopping {
    @Override
    public String toString() {
        return "Chedder Topping";
    }

    @Override
    public Double getPrice() {
        return 1.00; 
    }
}
