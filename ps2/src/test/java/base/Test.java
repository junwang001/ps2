package base;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

public class Test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@org.junit.Test
	public void test() {
		MyInteger myInteger = new MyInteger(4);
		System.out.println("isEven:" + myInteger.isEven());
		System.out.println("isOdd:" + myInteger.isOdd());
		System.out.println("isPrime:" + myInteger.isPrime());
		System.out.println("isEven:" + MyInteger.isEven(4));
		System.out.println("isOdd:" + MyInteger.isOdd(5));
		System.out.println("isPrime:" + MyInteger.isPrime(5));
		System.out.println("isEven:" + MyInteger.isEven(new MyInteger(4)));
		System.out.println("isOdd:" + MyInteger.isOdd(new MyInteger(4)));
		System.out.println("isPrime:" + MyInteger.isPrime(new MyInteger(4)));
		System.out.println("int isEquals:" + myInteger.equals(5));
		System.out.println("MyInteger isEquals:" + myInteger.equals(new MyInteger(4)));
	}

}
