package operacion_reduccion_mutable.utils;


public class Student {

  private String name;
  private String lastName;
  private String city;
  private double avgGrade;
  private int age;
  
  @Override
  public String toString() {
    return "Student:{ name='" + name +"'}";    
  }
  
  public Boolean esExelente() {
    if(this.avgGrade >= 80) {
      return true;
    }
    return false;
  }
  
  
  
  public Student(String name, String lastName, String city, double avgGrade, int age) {
    super();
    this.name = name;
    this.lastName = lastName;
    this.city = city;
    this.avgGrade = avgGrade;
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public double getAvgGrade() {
    return avgGrade;
  }

  public void setAvgGrade(double avgGrade) {
    this.avgGrade = avgGrade;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }
  
  
  
  
}
