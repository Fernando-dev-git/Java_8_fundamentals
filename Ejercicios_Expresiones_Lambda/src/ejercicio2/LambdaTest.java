/**
 * 
 */
package ejercicio2;

/**
 * 
 */
public class LambdaTest {
	
	public void miMetodo(Operaciones operacion, int num1, int num2) {
		operacion.imprimeResultado(num1, num2);
	}
	
	public static void main(String []args) {
		Operaciones operacion1 = (num1, num2) -> System.out.println(num1 * num2);
		Operaciones operacion2 = (num1, num2) -> System.out.println("numero1: "+num1+" numero2: "+num2);
		
		
		LambdaTest lambdaTest = new LambdaTest();
		lambdaTest.miMetodo(operacion1, 10,50);
		lambdaTest.miMetodo(operacion2, 10,50);
		
		lambdaTest.miMetodo( (num1, num2) -> System.out.println(num1 + num2), 100, 500);
		
		
	}

}
