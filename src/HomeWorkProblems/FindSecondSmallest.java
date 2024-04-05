package HomeWorkProblems;

public class FindSecondSmallest {
	public int findSeondSmallest(int a[]) {
		int temp=0;
		int res=0;
		for(int i=0;i<a.length-1;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					temp=a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		res = a[1];
		return res; 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {23,45,32,22,20,96};
		FindSecondSmallest hw = new FindSecondSmallest();
		int ans = hw.findSeondSmallest(a);
		System.out.println(ans);
	}

}
