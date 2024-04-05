package has_a_relationship;

public class SalesPerson  extends Employee{
	float commission,sales,totalSalary;
	public SalesPerson(){
		super();
		sales=70;
	}
	public SalesPerson(int id, String name, MyDate dob, Address add, float perDay, float workingDays,float sales) {
		super(id,name,dob,add,perDay,workingDays);
		this.sales=sales;
	}
	@Override
	public void calculate() {
		// TODO Auto-generated method stub
		super.calculate();
		if(sales>95) {
			commission=salary*0.2f;
		}
		else if(sales>75) {
			commission=salary*0.1f;
		}
		else if(sales>60) {
			commission = salary*0.05f;
		}
		else {
			commission=0;
		}
		totalSalary=commission+salary;
		
	}
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		super.display();
		System.out.println("sales: "+sales);
		System.out.println("Commission: "+commission);
		System.out.println("Total Salary: "+totalSalary);
	}

}
