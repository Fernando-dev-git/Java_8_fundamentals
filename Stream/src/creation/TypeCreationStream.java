package creation;

import java.util.stream.Stream;

public class TypeCreationStream {

  public static void imprime(Stream<String> stream) {
    stream.forEach(System.out::println);
  }
  
  public static void main(String[] args) {  
    Stream<String> stream1  = Stream.of("Metodo creacion de Stream 1 ");
    imprime(stream1);
    
    Stream<String> stream2 = Stream.of("curso", "curso2", "curso3", "Curso4", "curso5");
    imprime(stream2);
    
    String[] arreglo = {"java", "c++", "python", "cobol", "vb .net"};
    Stream<String> stream3 = Stream.of(arreglo);
    imprime(stream3);
    
    

  }

}
