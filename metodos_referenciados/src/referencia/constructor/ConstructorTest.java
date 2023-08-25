package referencia.constructor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class ConstructorTest {

  public static List<Integer> getConversion(List<String> numeros,
      Function<String, Integer> function) {
    List<Integer> response = new ArrayList<>();
    numeros.forEach(numero -> response.add(function.apply(numero)));
    return response;
  }
  
  public static void elevarToTen(Integer numero) {
    System.out.println("El numero "+numero+", Elevado: "+ numero*10);
  }


  public static void main(String[] args) {

    List<String> numerosStr =
        Arrays.asList("10", "15", "20", "30", "40", "55", "65", "80", "95", "100");
    
    // implement the method whit function lambda 
    getConversion(numerosStr, (numeroStr) -> new Integer(numeroStr) );
    
    // Implement the method whit Constructor method
    getConversion(numerosStr, Integer::new).forEach(ConstructorTest::elevarToTen);


  }

}
