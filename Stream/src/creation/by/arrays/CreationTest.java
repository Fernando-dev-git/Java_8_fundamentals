package creation.by.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import uitls.Estudiante;

public class CreationTest {
  
  

  public static void main(String[] args) {
    
    IntStream numStream = Arrays.stream(new int[] {1, 2, 3, 4, 5});
    numStream.forEach(System.out::println);
    
    Stream<String> nombres = Arrays.stream(new String[] {"fernando", "juan", "marco", "luis"});
    nombres.forEach(System.out::println);
    
    Set<String> nameSet = new HashSet<>();
    nameSet.add("Java");
    nameSet.add("C++");
    nameSet.add("C#");
    
    Stream<String> languajeStream = nameSet.stream();
    languajeStream.forEach(System.out::println);
    
    List<Estudiante> estudiantes = new ArrayList<>();
    estudiantes.add(new Estudiante("fernndo", "Sanchez", 8.5));
    estudiantes.add(new Estudiante("Octavio", "Chavez", 10.0));
    estudiantes.add(new Estudiante("Juan", "Torres", 7.5));
    
    System.out.println("\nStream Estudiantes");
    Stream<Estudiante> estudianteStream = estudiantes.parallelStream();
    estudianteStream.forEach(student -> System.out.println(student.getNombre()));
    
  }

}
