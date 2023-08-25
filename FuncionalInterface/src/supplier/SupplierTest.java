package supplier;

import java.util.function.Supplier;

public class SupplierTest {

  public static void main(String[] args) {
    
    Supplier<String> supplier = () -> "Maverick";
    System.out.println("El valor pasado es: "+ supplier.get());

  }

}
