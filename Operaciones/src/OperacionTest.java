import java.util.List;
import java.util.stream.IntStream;

public class OperacionTest {

  public static void main(String[] args) {
    
    int[] numeros = {4,6,8,10,13,2,3,5,1,90,443,2,3,5,0,2,33,10,9,5,3,8,4,21,32,10,13};
    
    List<Empleado> empleados = Empleado.empleados();
    
    // Operations with Numbers Suma, Maximo,
    // Minimo, Cuenta y Promedio
    System.out.println("La suma es: "+ IntStream.of(numeros).sum());
    
    // Number Average
    System.out.println("El Promedio es: "+ IntStream.of(numeros).average().getAsDouble());
    
    // Maximum Number
    System.out.println("El valor Maximo es: " + IntStream.of(numeros).max().getAsInt());
    
    // Minimum Value
    System.out.println("El valor Minimo es: "+ IntStream.of(numeros).min().getAsInt());
    
    // Count of elements 
    System.out.println("Cantidad de Elementos: "+ IntStream.of(numeros).count());
    
    
    /* Operations whit employed
     * more the salary the all employed */
    System.out.println("Operaciones con Objetos y Stream ");
    
    System.out.println("Suma de Salarios: "+ 
          empleados.stream()
                   .mapToDouble(Empleado::getIngresos)
                   .sum());
    
    // Employed whit maximum salary
    Empleado empleado = empleados.stream()
            .max( (emp1, emp2) ->  (int)(emp1.getIngresos() - emp2.getIngresos()))
            .get();
    
    System.out.println("Empleado con Maximo Salario: "+ empleado.getNombre() + " "+ empleado.getIngresos());
    System.out.println("");
    
    
    
  }

}
