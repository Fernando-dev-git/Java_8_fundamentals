package main;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class OperacionReduce {

  public static void main(String[] args) throws IOException {
    int[] numeros = {1,2,3,4,5,6,5,4,3,2,4,5,6,78,9,8,77,10,23,44,55};
    
    int suma = IntStream.of(numeros).reduce(0, Integer::sum);
    System.out.println("La suma es: "+ suma);
    
    
    Path path = Paths.get("parrafo.txt");
    String cadena = "";
    
    try(Stream<String>lineas = Files.lines(path)){
      cadena = lineas.map(linea -> linea.replace(", ", " "))
          .reduce("", (line1, line2) -> line1.concat("\n").concat(line2));
    }
    
    try(BufferedWriter bw = new BufferedWriter(new FileWriter("parrafo2.txt"))){
      bw.write(cadena);
    }
    

  }

}
