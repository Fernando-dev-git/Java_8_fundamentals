package predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import uitls.Empleado;

public class Evaluador {
	
	public List<Empleado> evaluar(List<Empleado> request, Predicate<Empleado> predicate){
		List<Empleado> response = new ArrayList<>();
		
		for(Empleado empleado: request) {
			if(predicate.test(empleado))
				response.add(empleado);
			}
		
		
		return response;
	}

}
