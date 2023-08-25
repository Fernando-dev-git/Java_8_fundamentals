package bifunction;

public class Exercise1 {

	public static void main(String[] args) {
		
		Calculadora calc = new Calculadora();
		String resultado = calc.calcular( (num1, num2) -> ": "+num1*num2, 
				40, 30);
		System.out.println("Resultado: "+ resultado);
		
		

	}

}
