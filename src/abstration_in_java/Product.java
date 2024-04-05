package abstration_in_java;

public class Product {
	private int id;
	private String name;
	private int prise;
	
	
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


	public int getPrise() {
		return prise;
	}


	public void setPrise(int prise) {
		this.prise = prise;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product product = new Product();
		product.setId(205);
		product.setName("Iphone");
		product.setPrise(45000);
		System.out.println(product);
		
	}


	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", prise=" + prise + "]";
	}
	

}
