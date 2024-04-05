package junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;

@SuppressWarnings("unused")
class TestJUnitAnnotations {
	@BeforeClass
	public static void beforeClass() {
		System.out.println("In Before Class");
	}
	
	@Before
	public static void before() {
		System.out.println("In Before");
	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("In After Class");
	}
	
	@After
	public static void after() {
		System.out.println("In After");
	}

}
