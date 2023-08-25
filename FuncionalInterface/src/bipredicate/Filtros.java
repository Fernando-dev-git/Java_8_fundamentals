package bipredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;
import uitls.Empleado;

public class Filtros {

  public List<Empleado> evaluar(List<Empleado> empleados, BiPredicate<Integer, String> predicado){
    List<Empleado> response = new ArrayList<>();
    
    for(Empleado empleado: empleados) {
      if(predicado.test(empleado.getEdad(), empleado.getDepartamento()))
        response.add(empleado);
    }
    return response;
  }
}
