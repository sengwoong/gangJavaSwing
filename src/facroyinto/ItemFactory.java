package facroyinto;

public class ItemFactory {
	

	public static ItemFromMenu createItem(String name, int price, String photo) {
		// TODO Auto-generated method stub
		   return new ConcreteItem(name, price, photo);
	}
}
