package predicate;

import java.util.function.BiFunction;

import uitls.Empleado;

public class Funciones {

	public double incrementoSalario(Empleado empleado, double incremento,
			BiFunction<Double, Double, Double> bifunction) {
		return bifunction.apply(empleado.getSalario(), incremento);
	}

}
