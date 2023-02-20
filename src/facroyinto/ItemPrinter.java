package facroyinto;
import java.util.List;

public class ItemPrinter {
    public static void printAllitems(List<ItemFromMenu> Items) {
        for (ItemFromMenu Item : Items) {
            System.out.println("Name: " + Item.getName() + ", Price: " + Item.getPrice() + ", Photo: " + Item.getPhoto());
        }
    }
}