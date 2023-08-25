package binaryoperator;

import java.util.function.BinaryOperator;

public class BinaryOperatorTest {

  public static void main(String[] args) {
    
    BinaryOperator<Integer> bo = (param1, param2) -> param1 * param2;
    System.out.println("El resultado es: "+ bo.apply(23, 45));
    
    //use method minBy
    BinaryOperator<Integer> bominBy = BinaryOperator.minBy((num1, num2) -> num1.compareTo(num2));
    System.out.println("\nUsando el Metodo MinBy\nEl resultado es: "+bominBy.apply(12,45));
    
    //use the method maxBy
    BinaryOperator<Integer> maxByOperator = BinaryOperator.maxBy((num1, num2) -> num1.compareTo(num2));
    System.out.println("\nUsando Metodo maxBy\nEl resultado: "+ maxByOperator.apply(23, 55));
    
  }

}
