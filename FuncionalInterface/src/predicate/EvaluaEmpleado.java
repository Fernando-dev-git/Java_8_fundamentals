package predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import uitls.Empleado;

public class EvaluaEmpleado {

  public static void imprime(List<Empleado> response) {
    for (Empleado empleado : response) {
      System.out.println(empleado.toString());
    }
  }

  public static void main(String[] args) {
    List<Empleado> empleados = Arrays.asList(new Empleado("fernando", 23, 234.50, "finanzas"),
        new Empleado("juan", 34, 342.34, "direccion"),
        new Empleado("octavio", 34, 400, "direccion"), new Empleado("manuel", 22, 100, "limpieza"),
        new Empleado("javier", 55, 750.45, "direccion general"),
        new Empleado("zandra", 19, 100, "rr.hh"), new Empleado("francisco", 33, 1000, "gerencias"));

    Evaluador evaluador = new Evaluador();
    Funciones funcion = new Funciones();
    List<Empleado> response = new ArrayList<>();

    System.out.println("Empleado con suelto mayor de 500");
    response = evaluador.evaluar(empleados, empleado -> empleado.getSalario() > 500);
    imprime(response);

    System.out.println("Empleado con nombre empieza con J");
    response = evaluador.evaluar(empleados, empleado -> empleado.getNombre().startsWith("j"));
    imprime(response);

    System.out.println("Empleados menores de 25 Años");
    response = evaluador.evaluar(empleados, empleado -> empleado.getEdad() < 25);
    imprime(response);

    System.out.println("\nincrease the salary of those under 25 years of age");
    for (Empleado empleado : response) {
      empleado.setSalario(
          funcion.incrementoSalario(empleado, 10, 
              (salario, incremento) -> salario + (salario * (incremento / 100)))
          );
    }
    imprime(response);

  }

}
