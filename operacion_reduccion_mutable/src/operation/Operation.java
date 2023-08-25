package operation;

import java.util.ArrayList;
import java.util.List;
import operacion_reduccion_mutable.utils.Empleado;

public class Operation {

  public static void main(String[] args) {
    
    List<String> nombres = Empleado.empleados()
                                .stream()
                                .map(Empleado::getNombre)
                                .collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
    
    nombres.forEach(System.out::println);    
    

  }

}
