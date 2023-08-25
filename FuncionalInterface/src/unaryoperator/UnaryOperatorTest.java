package unaryoperator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;

public class UnaryOperatorTest {
  
  public static List<Integer> operacion(List<Integer> numeros, UnaryOperator<Integer> unaryOpt){
    List<Integer> response = new ArrayList<>();
    numeros.forEach(numero -> response.add(unaryOpt.apply(numero)));
    return response;
  }

  public static void main(String[] args) {
    
    List<Integer> listaNumeros = Arrays.asList(10,20,30,40,50,60,70,80,90,100);
    
    List<Integer> response = operacion(listaNumeros, numero -> numero * numero);
    response.forEach(numero -> System.out.print(numero+" "));

  }

}
