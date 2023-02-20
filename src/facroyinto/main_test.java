package facroyinto;
import java.awt.Window.Type;
import java.util.ArrayList;
import java.util.List;

public class main_test {

	 public static void main(String[] args) {
	        List<ItemFromMenu> items = new ArrayList<>();
	        items.add(ItemFactory.createItem("이름1", 9, "댓글"));
	        items.add(ItemFactory.createItem("", 0, "댓글2"));
	        items.add(ItemFactory.createItem("", 0, "photo3"));
	        ItemFromMenu firstItem = items.get(0);
	 
	        String name = firstItem.getName();
	        double price = firstItem.getPrice();
	        String photo = firstItem.getPhoto();
	        
	        
	        ItemPrinter.printAllitems(items);
	       
	        System.out.println(name +price+photo);
	    }

}
	