package StreamDummy;

import java.util.Arrays;
import java.util.List;

public class StreamsTeam {

  public static void main(String[] args) {
    
    List<Integer> numeros =  Arrays.asList(1,2,3,4,5);
    
    int response = numeros.stream()
        .filter(num -> num % 2 == 1)
        .map(num -> num * num)
        .reduce(0, Integer::sum);
    System.out.println("Resultado: "+response);
  }

}
