/**
 * This is JUnit tester for Calculator class
 */
package Calculator;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author Raasi
 *
 */
public class CalculatorTest {

	/**
	 * Test method for {@link Calculator.Calculator#addition(int, int)}.
	 */
	@Test
	public void testAddition() {
		assertEquals(10,Calculator.addition(5, 5));
		assertEquals(11,Calculator.addition(7, 4));
	}

	/**
	 * Test method for {@link Calculator.Calculator#multiplication(int, int)}.
	 */
	@Test
	public void testMultiplication() {
		assertEquals(10,Calculator.multiplication(2, 5));
		assertEquals(15,Calculator.multiplication(3, 5));
	}

	/**
	 * Test method for {@link Calculator.Calculator#division(int, int)}.
	 */
	@Test
	public void testDivision() {
		assertEquals(2,Calculator.division(10, 5));
		assertEquals(5,Calculator.division(25, 5));
	}

}
