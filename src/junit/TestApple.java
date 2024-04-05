package junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestApple {

	@Test
	void testCorrect() {
		Apple apple = new Apple();
		apple.setColor("Red");
		assertTrue(apple.checkColor());

	}

	@Test
	void testWrong() {
		Apple apple = new Apple();
		apple.setColor("Blue");
		assertFalse(apple.checkColor());
	}

}
