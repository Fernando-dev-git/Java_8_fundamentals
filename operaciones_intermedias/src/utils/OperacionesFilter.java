package utils;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class OperacionesFilter {

  public static void Imprime(List<Empleado> empleados) {
    empleados.forEach(empleado -> System.out.println(empleado.getNombre()+" "+empleado.getGenero()));
  }
  
  
  public static void main(String[] args) {
    List<Empleado> empleados = Empleado.empleados();
    List<Empleado> response = new ArrayList<>();
    
    System.out.println("Empleados Hombres");
    response = empleados.stream()
             .filter(Empleado::isMan)
             .collect(Collectors.toList());
    
    Imprime(response);
    
    
    System.out.println("Empleados Mujeres");
    response = empleados.stream().filter(new Predicate<Empleado>() {
      @Override
      public boolean test(Empleado emp) {
        return emp.isWoman();
      }
    }).collect(Collectors.toList());
    Imprime(response);
    

  }

}
