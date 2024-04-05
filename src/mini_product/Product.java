package mini_product;

import java.util.*;

class NewProduct {
	int id;
	String name;
	int price;
	String des;

	public NewProduct(int id, String name, int price, String des) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.des = des;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getDes() {
		return des;
	}

	public void setDes(String des) {
		this.des = des;
	}

	@Override
	public String toString() {
		return "NewProduct [id=" + id + ", name=" + name + ", price=" + price + ", des=" + des + "]";
	}

//	public int compareTo(NewProduct p) {
//		if (price > p.price) {
//			return 1;
//		} else if (price < p.price) {
//			return -1;
//		} else {
//			return 0;
//		}
//	}

}

class SortByName implements Comparator<NewProduct> {
	public int compare(NewProduct p1, NewProduct p2) {
		return p1.getName().compareTo(p2.getName());
	}
}

class SortByPrise implements Comparator<NewProduct> {

	@Override
	public int compare(NewProduct p1, NewProduct p2) {
		return Integer.compare(p1.getPrice(), p2.getPrice());
	}

}

public class Product {
	List<NewProduct> al = new ArrayList<>();

	public void addProduct() {
		al.add(new NewProduct(101, "Soap", 57, "This is Soap"));
		al.add(new NewProduct(103, "Maggi", 86, "This is Maggi"));
		al.add(new NewProduct(102, "Washing Powder", 95, "This is Washing Powder"));
		al.add(new NewProduct(104, "Biskit", 85, "This is Biskit"));
		al.add(new NewProduct(107, "Ladu", 99, "This is Delious Ladu"));
		al.add(new NewProduct(106, "Chikki", 105, "This is Peanut Chikki"));
		System.out.println("Product added Successfully !");

	}

	public void updateProduct(int id, String name, int prise, String des) {
		int count = 0;
		for (NewProduct np : al) {
			if (np.getId() == id) {
				System.out.print(np.getName() + " Updated to");
				np.setName("Grosary");
				np.setPrice(250);
				np.setDes("These are the grocerray items");
				System.out.println(np.getName());
				count++;
			}
		}
		if (count == 0) {
			System.out.println("Product Not Found");
		}
	}

	public void getById(int id) {
		int count = 0;
		for (NewProduct np : al) {
			if (np.getId() == id) {
				System.out.println("Product Name: " + np.getName());
				System.out.println("Product Prise: " + np.getPrice());
				System.out.println("Descripsion: " + np.getDes());
				count++;
			}
		}
		if (count == 0) {
			System.out.println("Product Not Found");
		}

	}

	public void deleteById(int id) {
		int count = 0;
		for (NewProduct np : al) {
			if (np.getId() == id) {
				al.remove(np);
				System.out.println("You Removed " + np.getName() + " From the Product List");
				count++;
			}
		}
		if (count == 0) {
			System.out.println("Product Not Found To Remove");
		}
	}

	public void sortByPrice() {
		SortByPrise obj = new SortByPrise();
		Collections.sort(al, new SortByPrise());
	}

	public void sortByProductName() {
		Collections.sort(al, new SortByName());
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char ch;
		do {
			System.out.println(
					"Enter Your choice: \n1 for add product\n2 for update product\n3 for get product by id\n4 for delete product by id \n5 for list by prise\n6 for sort list by product name");

			Product p1 = new Product();
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				p1.addProduct();
				break;
			case 2:
				p1.updateProduct(105, "Wafers", 53, "Yummy Banana Wafers");
				break;
			case 3:
				p1.getById(101);
				break;
			case 4:
				p1.deleteById(102);
				break;
			case 5:
				p1.sortByPrice();
				break;
			case 6:
				p1.sortByProductName();
				break;
			default:
				System.out.println("Invalid Choice");
				break;
			}
			System.out.println("Do You Want to Continue !\nPress Y to Continue.");
			ch = sc.next().charAt(0);
		} while (ch == 'y' || ch == 'Y');

	}

}
