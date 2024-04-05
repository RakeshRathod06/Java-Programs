package junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AssertionMethodTest {

	@Test
	void test() {
		int a= 10;
		int b=20;
		String s1="Welcome";
		String s2="welcome";
		String s3= null;
		
		assertSame(a,b);
		
		assertNotSame(a,b);
		
		assertTrue(a==b);
		
		assertFalse(a==b);
		
		assertTrue(a<b);
		
		assertSame(s1,s2);
		
		assertNull(s1);
		assertNotNull(s2);
		assertNull(s3);
		
	}

}
