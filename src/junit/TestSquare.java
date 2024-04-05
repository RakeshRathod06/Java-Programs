package junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class TestSquare {
	public TestSquare() {
		
	}
	@Test
	void test() {
		Methods obj = new Methods();
		int sq = obj.square(4);
		assertEquals(16, sq);
	}
	
	void test1(){
		Methods obj = new Methods();
		int count=obj.countA("Abhay");
		assertEquals(2,count);
	}


}
