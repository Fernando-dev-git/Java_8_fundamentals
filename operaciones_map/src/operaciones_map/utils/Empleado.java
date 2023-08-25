package operaciones_map.utils;

import java.util.Arrays;
import java.util.List;

public class Empleado {

  private Long id;
  private String nombre;
  private Double ingresos;
  private Genero genero;
  private Integer edad;
  
  public Empleado(Long id, String nombre, Double ingresos, Genero genero, Integer edad) {
    super();
    this.id = id;
    this.nombre = nombre;
    this.ingresos = ingresos;
    this.genero = genero;
    this.edad = edad;
  }
  
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }
  public String getNombre() {
    return nombre;
  }
  public void setNombre(String nombre) {
    this.nombre = nombre;
  }
  public Double getIngresos() {
    return ingresos;
  }
  public void setIngresos(Double ingresos) {
    this.ingresos = ingresos;
  }
  public Genero getGenero() {
    return genero;
  }
  public void setGenero(Genero genero) {
    this.genero = genero;
  }
  public Integer getEdad() {
    return edad;
  }
  public void setEdad(Integer edad) {
    this.edad = edad;
  }
  
  public static enum Genero{
    HOMBRE, MUJER
  }
  
  public Boolean isMan() {
    return this.genero.equals(Genero.HOMBRE);
  }
  
  public Boolean isWoman() {
    return this.genero.equals(Genero.MUJER);
  }
  
  public static List<Empleado> empleados(){
    Empleado emp1 = new Empleado(1L, "Fernando Octavio", 1000.45, Genero.HOMBRE, 33);
    Empleado emp2 = new Empleado(2L, "Juan Manuel", 300.0, Genero.HOMBRE, 22);
    Empleado emp3 = new Empleado(3L, "Maria teresa", 459.00, Genero.MUJER, 25);
    Empleado emp4 = new Empleado(4L, "Paola suares", 500.34, Genero.MUJER, 33);
    Empleado emp5 = new Empleado(5L, "Lucero fuentes", 100.23, Genero.MUJER, 28);
    Empleado emp6 = new Empleado(6L, "Zandra Guadalupe", 350.44, Genero.MUJER, 32);
    Empleado emp7 = new Empleado(7L, "Manuel Torres", 450.44, Genero.HOMBRE, 50);
    Empleado emp8 = new Empleado(8L, "Carlos virer", 345.90, Genero.HOMBRE, 50);
    Empleado emp9 = new Empleado(9L, "Manuel Valente", 899.99, Genero.HOMBRE,23);
    Empleado emp10 = new Empleado(10L, "Luis Enriquez", 250.56, Genero.HOMBRE, 45);
    Empleado emp11 = new Empleado(11L, "Teresa valdon", 300.35, Genero.MUJER, 20);
    Empleado emp12 = new Empleado(12L, "Tibursia valeria", 250.99, Genero.MUJER, 25);
    Empleado emp13 = new Empleado(13L, "juan manuel marques", 560.45, Genero.HOMBRE, 99);
    Empleado emp14 = new Empleado(14L, "Maria felix", 450.99, Genero.MUJER, 45);
    Empleado emp15 = new Empleado(15L, "Pamela juanjo", 500.00, Genero.MUJER, 34);
    Empleado emp16 = new Empleado(16L, "adrian marcelo", 66.54, Genero.HOMBRE, 18);
    Empleado emp17 = new Empleado(17L, "Fernando Jorge", 350.66, Genero.HOMBRE, 56);
    Empleado emp18 = new Empleado(18L, "Jesus Alexis", 400.0 , Genero.HOMBRE, 32);
    Empleado emp19 = new Empleado(19L, "Ian Alexis", 450.50, Genero.HOMBRE, 2);
    Empleado emp20 = new Empleado(20L, "Cristian Raul", 490.9, Genero.HOMBRE, 25);
    
    
    return Arrays.asList(emp1, emp2, emp3, emp4, emp5, emp6, emp7, emp8, emp9, 
        emp10, emp11, emp12, emp13, emp14, emp15, emp16, emp17, emp18, emp19, emp20);
  }
  
}