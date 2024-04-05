package shoping_website;

public class Item {
	int id;
	String name;
	String companyName;
	double prise;
	boolean isInStock;
	
	Item(int id,String name,String companyName,double prise,boolean isInStock){
		this.id=id;
		this.name=name;
		this.companyName=companyName;
		this.prise=prise;
		this.isInStock=isInStock;
	}

}
