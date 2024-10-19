package burger;

public class product_food {
    private final int id;
    private final String name;
    private final int qty;
    private final double price;

    public product_food(int id, String name, int qty, double price) {
        this.id = id;
        this.name = name;
        this.qty = qty;
        this.price = price;
    }

    public int getId() {  // Use camel case for the method name
        return id;
    }

    public String getName() {
        return name;
    }

    public int getQty() {
        return qty;
    }

    public double getPrice() {
        return price;
    }
}
