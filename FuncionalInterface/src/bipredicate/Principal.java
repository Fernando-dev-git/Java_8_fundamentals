package bipredicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;
import uitls.Empleado;

public class Principal {

  public static void main(String[] args) {
    List<Empleado> empleados = Arrays.asList(new Empleado("fernando", 23, 234.50, "finanzas"),
        new Empleado("juan", 34, 342.34, "direccion"),
        new Empleado("octavio", 34, 400, "direccion"), new Empleado("manuel", 22, 100, "limpieza"),
        new Empleado("javier", 55, 750.45, "direccion general"),
        new Empleado("zandra", 19, 100, "rr.hh"), new Empleado("francisco", 33, 1000, "gerencias"),
        new Empleado("karla", 28, 345, "marketing"), new Empleado("nayeli", 33, 250, "ventas"),
        new Empleado("rosio", 28, 250, "ventas"), new Empleado("lucero", 26, 150, "ventas"));

    Filtros filtro = new Filtros();

    BiPredicate<Integer, String> criterioUno =
        (edad, departamento) -> (edad <= 25) && (departamento.equals("ventas"));
    
    BiPredicate<Integer, String> criterioDos = 
        (edad, departamento) -> (edad<=25) && (departamento.equals("limpieza"));
        
    BiPredicate<Integer, String> criterios = criterioUno.or(criterioDos);
    
    List<Empleado> response = filtro.evaluar(empleados, criterios);
    for(Empleado empleado: response) {
      System.out.println(empleado.toString());
    }



  }

}
