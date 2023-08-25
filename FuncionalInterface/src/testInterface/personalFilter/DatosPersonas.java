/**
 * 
 */
package testInterface.personalFilter;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;


/**
 * 
 */
public class DatosPersonas {

	public static List<Object> getDatosPersonales(List<Persona> personas, Function<Persona, Object> function) {

		List<Object> result = new ArrayList<>();

		for (Persona persona : personas) {
			result.add(function.apply(persona));
		}

		return result;
	}

	public static void main(String[] args) {
		List<Persona> personas = new ArrayList<>();
		personas.add(new Persona("fernando", 33, "M"));
		personas.add(new Persona("Juan", 30, "M"));
		personas.add(new Persona("Carlos", 13, "M"));
		personas.add(new Persona("Rosa", 33, "F"));
		personas.add(new Persona("Teresa", 35, "F"));

		Function<Persona, Object> soloMujeres = persona -> persona.getNombre();

		List<Object> onlyNames = getDatosPersonales(personas, soloMujeres);
		
		for(Object name: onlyNames) {
			System.out.println(name);
		}

	}

}
