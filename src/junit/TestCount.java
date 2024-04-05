package junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCount {

	@Test
	void test() {
		Methods obj = new Methods();
		int count = obj.countA("Abhay");
		assertEquals(2, count);
	}
}
