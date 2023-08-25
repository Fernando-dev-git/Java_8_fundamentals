package operation;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import operacion_reduccion_mutable.utils.Student;

public class PartitionByClass {
  
  public static List<Student> getStudents(){
    return Arrays.asList(new Student("fernando", "sanchez chavez", "Mexico", 79.55, 25),
        new Student("ramiro", "vazquez", "Mexico", 79.55, 25),
        new Student("fernanda", "castes", "Mexico", 80.55, 28),
        new Student("rosa", "urbina", "Mexico", 79.99, 32),
        new Student("manuel", "castil", "Mexico", 95.55, 25),
        new Student("juan", "vazques", "Mexico", 60.55, 24),
        new Student("juan manuel", "lains vaquera", "Mexico", 95.55, 26),
        new Student("hugo", "sanchez torees", "Mexico", 53.55, 25));
  }

  public static void main(String[] args) {
    /*
     Basic use of partitioningBy
    List<String> nombres = Arrays.asList("Fernando", "juan", "Carlos", "victoria", "Manuel", "Rogelio");
    Map<Boolean, List<String>> mapNombres = 
        nombres.stream().collect(Collectors.partitioningBy(cadena -> cadena.length()>4));
    System.out.println(mapNombres);
    System.out.println("Nombres que Si cumplen la condicion "
        +"\n"+ mapNombres.get(true));
    System.out.println("\nNombres que No cumplen la condicion "
        +"\n"+ mapNombres.get(false));
    */
    
    List<Student> students = getStudents();
    Map<Boolean, List<Student>> mapStudent = students.stream()
        .collect(Collectors.partitioningBy(e -> e.getName().length() > 4 ));
    System.out.println(mapStudent);
    System.out.println("\n\n");
    
    Map<Boolean, List<Student>> mapByAVG = students.stream()
          .collect(Collectors.partitioningBy(Student::esExelente));
    System.out.println("Estudiantes con promedio sobresaliente:\n"+
          mapByAVG.get(true));
    System.out.println("\n\nEstudiantes con promedio regular:\n"+
        mapByAVG.get(false));
    

  }

}
