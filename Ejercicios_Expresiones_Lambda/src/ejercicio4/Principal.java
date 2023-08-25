/**
 * 
 */
package ejercicio4;

/**
 * Solucion de ambiguedad
 * de parametros
 * 
 */
public class Principal {

	/**
	 * @param args
	 */
	public static void engine(CalculadoraInt calInt) {}
	public static void engine(CalculadoraLong calLong) {}
	
	
	public static void main(String[] args) {
		
		
		//por casteo para que reconozca que metodo se esta invocando
		engine( (CalculadoraInt)(x,y) -> x+y );
		
		// Define type of variable 
		engine( (int num1, int num2) -> num1 + num2 );
		
		// Create reference to the interface
		CalculadoraInt calInt = (num1, num2) -> num1+num2;
		engine(calInt);
	}

}
