package burger;
import java.util.ArrayList;

public class list {
    private String name;
    private int qty;
    private double price;
    public list(){}
    public list(String name,int qty,double price){
        this.name = name;
        this.qty = qty;
        this.price=price;
    }
    public String getName(){
        return name;
    }
    
    public int getQty(){
        return qty;
    }
    public double getPrice(){
        return price;
    }
    static ArrayList<list_api01> list_api02 = new ArrayList<>();
}

