package has_a_relationship;

public class MyDate {
	int dd,mm,yy;
	MyDate(){
		dd=11;
		mm=03;
		yy=2002;
	}
	MyDate(int dd,int mm,int yy){
		this.dd=dd;
		this.mm=mm;
		this.yy=yy;
	}
	public void display() {
		System.out.println(dd+"/"+mm+"/"+yy);
	}
}
