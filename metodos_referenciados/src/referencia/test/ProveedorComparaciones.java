package referencia.test;

import util.Persona;

public class ProveedorComparaciones {
  
  
  public Integer comparaPorEdad(Persona persona1, Persona persona2) {
    return persona1.getEdad().compareTo(persona2.getEdad());
  }
  
  public Integer compareToName(Persona persona, Persona persona2) {
    return persona.getNombre().compareTo(persona2.getNombre());
  }

}
