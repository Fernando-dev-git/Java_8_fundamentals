package operacion_sorted.utils;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class OperacionSortedTest {

  public static void main(String[] args) {
    System.out.println("Nombres Ordenados");
    Arrays.asList("Zaul", "Xavier", "Yessica", "Fernando", "Jorge")
          .stream()
          .sorted()
          .forEach(System.out::println);
          
    
    System.out.println("\nNumeros Ordenados ");
    Arrays.asList(1,4,5,6,3,9,8,7,2,10).stream()
          .sorted()
          .forEach(System.out::print);
    
    List<Empleado> empleados = Empleado.empleados();
    
   System.out.println("\n\nEmpleados Ordenados");
   empleados.stream()
            .filter( param -> param.getGenero().equals(Empleado.Genero.MUJER))
            .sorted(Empleado::compareTo)
            .forEach(emp -> System.out.println(emp.toString()));
   
   
   System.out.println("\nEmpleados Ordenados por Edad");
   empleados.stream()
            .sorted(new Comparator<Empleado>() {
              @Override
              public int compare(Empleado emp1, Empleado emp2) {
                return emp1.getEdad() - emp2.getEdad();
              }
            }).forEach(empleado -> System.out.println(empleado.getNombre() + " "+ empleado.getEdad()));
   
   System.out.println("\nEmpleados Mayores de 25\ny por el Salario");
   empleados.stream()
            .filter( empleado -> empleado.getEdad() > 25)
            .sorted( (emp, emp2) -> (int)(emp.getIngresos() - emp2.getIngresos()))
            .forEach(emp -> System.out.println(emp.getNombre()+" Edad: "+emp.getEdad()+" $: "+emp.getIngresos()));
   
   
    
    
  }

}
