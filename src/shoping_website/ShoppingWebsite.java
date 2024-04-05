package shoping_website;

public class ShoppingWebsite {

	public String purchaseItem(Item i, Customer c) throws ItemOutOfStockException, InsufficientBalanceException {
		try {
		if (i.isInStock == true && c.walletBalance >= i.prise) {
			return "confirmed";
		}
//			else if(i.isInStock == false && c.walletBalance < i.prise) {
//				throw new ItemOutOfStockException(),InsufficientBalanceException();}
		else if (i.isInStock == false) {
			throw new ItemOutOfStockException();
		} else if (c.walletBalance < i.prise) {
			throw new InsufficientBalanceException();
		}
		} catch (ItemOutOfStockException e) {
			e.printStackTrace();
		} catch (InsufficientBalanceException e) {
			e.printStackTrace();
		}

		return "failed";

	}

	public static void main(String[] args) {
		Customer c = new Customer(101, "Raj", 350, "Chikhali");
		Item i = new Item(201, "Peanut Butter", "My Fitness", 549, true);
		ShoppingWebsite obj = new ShoppingWebsite();
		String out = null;
		try {
			out = obj.purchaseItem(i, c);
		} catch (ItemOutOfStockException | InsufficientBalanceException e) {

			e.printStackTrace();
		}
		if (out == "confirmed") {
			System.out.println("Order Successful");
		} else {
			System.out.println("Order Denie");
		}
		System.out.println(out);
	}
}
