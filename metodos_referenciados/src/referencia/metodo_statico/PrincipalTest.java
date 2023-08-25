package referencia.metodo_statico;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import util.Persona;

public class PrincipalTest {
  
  
  public static void main(String [] args) {
    
    List<Persona> personas = Arrays.asList(
        new Persona("juan peres", 22, "algo@gmail.com"),
        new Persona("fernando peres", 28, "domino@dominio.com"),
        new Persona("manuel peres", 30, "test@test.com"),
        new Persona("victor moreno", 23, "prueba1@curso.usemy.com"),
        new Persona("saira tomero", 45, "maquina@gmail.com"),
        new Persona("cynthia", 20, "modelos.vectoriales@sistem.com.mx"),
        new Persona("juana mtzz", 19, "correo@dominio.com.mx"),
        new Persona("manuel torrez", 33, "aguadito23@operagua.com.mx")
       );
    
    System.out.println("Lista sin Orden");
    personas.forEach(persona -> System.out.println(persona));
    
    Collections.sort(personas, Persona::comparaPorEdad);
    System.out.println("\nLista Ordenada");
    personas.forEach(p -> System.out.println(p));
    
  }

}
