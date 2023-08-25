package creation.by.string;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.stream.IntStream;

public class CreationStreamTest {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String entrada = sc.nextLine();
    
    IntStream streamChars = entrada.chars();
    
    streamChars.filter( c -> !Character.isDigit((char)c) 
        && !Character.isWhitespace((char)c))
    .forEach(element -> System.out.print( (char)element));
    
    String cadena = "HTML, CSS, JAVASCRIPT, JAVA, C++, RUBY, PERL";
    Pattern.compile(", ")
           .splitAsStream(cadena)
           .forEach(System.out::println);
    
  }

}
