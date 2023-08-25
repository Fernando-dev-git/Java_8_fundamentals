package ejercicio4;

public class Main {

	private static CalculadoraLong create(){
		return (num1, num2) -> num1/num2;
		
	}
	
	public static void main(String[] args) {
		System.out.println(create().calcular(5, 5));
		
	}

}
