package creation.by.functions;

import java.util.Random;
import java.util.stream.Stream;

public class CreateByFunctions {

  public static void main(String[] args) {

    System.out.println("Primeros Diez numeros");
    Stream<Long> primerosDiez = Stream.iterate(1L, num -> num + 1).limit(10);
    primerosDiez.forEach(System.out::println);
    
    System.out.println("\n20 numeros que cumplen N%2==0");
    Stream.iterate(1L, n -> n +1)
          .filter(n -> n % 2 == 0)
          .limit(20)
          .forEach(System.out::println);
    
    System.out.println("\nNumeros despues de 100");
    Stream.iterate(1L, num -> num + 1)
          .filter(num -> num %2 ==0)
          .skip(100)
          .limit(5)
          .forEach(System.out::println);
    
    System.out.println("\nNumeros Ramdom");
    Stream.generate(Math::random)
          .limit(5)
          .forEach(System.out::println);
    
    System.out.println("\nNumeros Enteros Random");
    new Random().ints().limit(5).forEach(System.out::println);;
    
    

  }

}
