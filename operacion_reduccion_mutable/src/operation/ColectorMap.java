package operation;

import java.util.Map;
import java.util.stream.Collectors;
import operacion_reduccion_mutable.utils.Empleado;

public class ColectorMap {

  public static void main(String[] args) {
    
    Map<Long, String> mapIdName = Empleado.empleados()
                      .stream()
                      .collect(Collectors.toMap(Empleado::getId, Empleado::getNombre));
    
    System.out.println(mapIdName+ "\n");
    
    Map<Empleado.Genero, String> mapGeneroName = Empleado.empleados()
                                  .stream()
                                  .collect(Collectors.toMap(
                                           Empleado::getGenero, 
                                           Empleado::getNombre, 
                                           (emp1, emp2) -> String.join(", ", emp1, emp2)));
    
    System.out.println(mapGeneroName);
    

  }

}
