/**
 * This program performs an arithmetic operation
 * like addition, multiplication or division
 * given two integers
 */
package Calculator;

/**
 * @author Raasi
 *
 */

public class Calculator {

	/**
	 * This method returns the sum of two numbers
	 * @param number1
	 * @param number2
	 * @return addition of number1 and number2
	 */
	static int addition(int number1,int number2) {
		return number1+number2;
	}
	
	
	/**
	 * This method returns the product of two numbers
	 * @param number1
	 * @param number2
	 * @return product of number1 and number2
	 */
	static int multiplication(int number1,int number2) {
		return number1*number2;
	}
	
	/**
	 * This method performs division of two numbers
	 * @param number1
	 * @param number2
	 * @return number1 divided by number2
	 */
	static int division(int number1,int number2) {
		return number1/number2;
	}
	
}
