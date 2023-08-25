package bipredicate;

import java.util.function.BiPredicate;

public class EjercicioBasico {

  public static void main(String[] args) {
    
    BiPredicate<Integer, Integer> bp = (num1 , num2) -> num1 > num2;
    System.out.println("Test: " + bp.test(3, 2));
  }

}
