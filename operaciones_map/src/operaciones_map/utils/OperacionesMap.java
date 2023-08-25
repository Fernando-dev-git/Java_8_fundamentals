package operaciones_map.utils;

import java.util.List;

public class OperacionesMap {

  public static void main(String[] args) {
    
    List<Empleado> empleados = Empleado.empleados();
    
    System.out.println("Promedio de Ingresos personal Femenino: ");
    double suma = empleados.stream()
        .filter(emp -> emp.isWoman())
        .filter(mujer -> mujer.getEdad() > 25)
        .mapToDouble(emp -> emp.getIngresos())
        .sum();
    
    double promedio = suma / empleados.stream()
        .filter(emp -> emp.isWoman())
        .filter(mujer -> mujer.getEdad() > 25)
        .mapToDouble(emp -> emp.getIngresos())
        .count();
    
    System.out.println("El promedio es: "+ promedio);
    
    
  }

}
