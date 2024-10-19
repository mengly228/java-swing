package burger;
import java.util.ArrayList;
public class list_food {
    private String Name;
    private int Qty,ID;
    private double Price;
    public list_food(){}
    public list_food(int id , String name,int qty,double price){
        this.ID=id;
        this.Name = name;
        this.Qty = qty;
        this.Price = price;
    }
    public int getID(){
        return ID;
    }
    public String getName(){
        return Name;
    }
    public int getQty(){
        return Qty;
    }
    public double getPrice(){
        return Price;
    }
    static ArrayList<list_food> list_food01 = new ArrayList<>();
}
