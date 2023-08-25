package bifunction;

import java.util.function.BiFunction;

public class Calculadora {
	
	
	public String calcular(BiFunction<Integer, Integer, String> bifunction, Integer num1, 
			Integer num2) {
		return bifunction.apply(num1, num2);
	}
}
