package consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import uitls.Estudiante;

public class CustomerExamples {

  
  public static void main(String[] args) {
    
    List<Estudiante> estudiantes = Arrays.asList(
        new Estudiante("juan", 15),
        new Estudiante("manuel", 16),
        new Estudiante("carlos", 14),
        new Estudiante("ricardo", 15),
        new Estudiante("fernando", 15),
        new Estudiante("octavio", 16),
        new Estudiante("luis", 15),
        new Estudiante("alexis", 14),
        new Estudiante("sebastian", 14),
        new Estudiante("dario", 14)        
        );
    
    Operaciones operacion = new Operaciones();
    
    Consumer<Estudiante> consumer1 = 
        e -> System.out.println("{Nombre: "+e.getNombre()+" ,Edad: "+ e.getEdad()+"}");
        
    Consumer<Estudiante> consumer2 = 
        e -> e.setEdad(e.getEdad() * 2);
        
    Consumer<Estudiante> consumer = consumer2.andThen(consumer1);
     
    /*
    System.out.println("Estudiantes sin Modificar");
    operacion.recorreTodos(estudiantes, consumer1);
    
    System.out.println("\nEstudiante Edad Modificada");
    operacion.recorreTodos(estudiantes, consumer2);
    operacion.recorreTodos(estudiantes, consumer1);
    */
    System.out.println("\nUse of Consumer andThen function");
    operacion.recorreTodos(estudiantes, consumer);
        

  }

}
