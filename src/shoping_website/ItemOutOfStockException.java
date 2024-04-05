package shoping_website;

public class ItemOutOfStockException extends Exception {
	public ItemOutOfStockException(){
		super("item is out of stock");
	}
}
