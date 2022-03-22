import java.util.ArrayList;
import java.util.List;

public class Deal {
    private List<Item> items=new ArrayList<>();

    public void addItem(Item item){
        items.add(item);
    }

    public double calculatePrice(){
        double price=0;
        for (Item i:
             items) {
            price=price+i.getPrice();
        }
        return price;
    }

    public void showItems(){
        for (Item i:
             items) {
            System.out.println("Item: "+i.getName()+" Price: "+i.getPrice()+" Box: "+i.getBox().getBoxName());
        }
    }

}
