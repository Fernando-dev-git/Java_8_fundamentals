/**
 * 
 */
package ejercicio3;

/**
 * 
 */
public class LambdaTest3 {

	private static void engine(Calculadora calculadora) {
		int param1 = 10, param2 = 100;
		int resultado = calculadora.calcular(param1, param2);
		System.out.println("Resultado: " + resultado);

	}

	public static void main(String[] args) {
		engine((x, y) -> x + y);
	}

}
