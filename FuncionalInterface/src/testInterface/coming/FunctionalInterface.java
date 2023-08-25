/**
 * 
 */
package testInterface.coming;

import java.util.function.Function;

/**
 * Induction of functional interface
 */
public class FunctionalInterface {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		
		Function<Integer, String> convertidor = x -> Integer.toString(x);
		
		System.out.println(convertidor.apply(3).length());
		System.out.println(convertidor.apply(30).length());
		
		
		
	}

}
