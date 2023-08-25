package testInterface.personalFilter;

public class Persona {
	
	private String nombre;
	private int edad;
	private String sexp;
	
	/**
	 * @param nombre
	 * @param edad
	 * @param sexp
	 */
	public Persona(String nombre, int edad, String sexp) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.sexp = sexp;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the edad
	 */
	public int getEdad() {
		return edad;
	}

	/**
	 * @param edad the edad to set
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}

	/**
	 * @return the sexp
	 */
	public String getSexp() {
		return sexp;
	}

	/**
	 * @param sexp the sexp to set
	 */
	public void setSexp(String sexp) {
		this.sexp = sexp;
	}
	
	

}
