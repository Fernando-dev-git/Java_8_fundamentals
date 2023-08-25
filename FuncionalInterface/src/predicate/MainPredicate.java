package predicate;

import java.util.function.Predicate;

public class MainPredicate {

	public static void main(String[] args) {
		
		//Predicate request value and return true 
		Predicate<Integer> predicate = num -> num>0;
		System.out.println("Valor: "+ predicate.test(3));
		
		

	}

}
