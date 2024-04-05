package exception_handling;

public class Student {
	public static void findByRollNumber(int rollNO)throws StudentNotFoundException{
		if(rollNO>=1 && rollNO<=20) {
			System.out.println("Student found");
		}
		else {
			throw new StudentNotFoundException("Student Not Found");
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			findByRollNumber(16);
		} catch (StudentNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println("Rest of code...");
	}

}
