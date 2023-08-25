package uitls;


public class Estudiante {
  
  private String nombre;
  private String apaterno;
  private Double calificacion;
  
  public Estudiante(String nombre, String apaterno, Double calificacion) {
    super();
    this.nombre = nombre;
    this.apaterno = apaterno;
    this.calificacion = calificacion;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getApaterno() {
    return apaterno;
  }

  public void setApaterno(String apaterno) {
    this.apaterno = apaterno;
  }

  public Double getCalificacion() {
    return calificacion;
  }

  public void setCalificacion(Double calificacion) {
    this.calificacion = calificacion;
  }
  
}
