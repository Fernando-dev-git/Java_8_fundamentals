package biconsumer;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapBiConsumerTest {

  public static void main(String[] args) {

    Map<String, String> map = new HashMap<String, String>();
    String[][] arreglo = {{"manuel", "MEX"}, {"kenjiro", "JAP"}, {"mesi", "ARG"}, {"brian", "USA"}};

    // create map use array
    for (int x = 0; x < arreglo.length; x++) {
      map.put(arreglo[x][0], arreglo[x][1]);
    }

    System.out.println("Usando metodo tradicional para imprimir clave valor");

    Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
    if(iterator!=null) {
      while(iterator.hasNext()) {
        Map.Entry<String, String> entry = iterator.next();
        System.out.println("Clave: "+entry.getKey() +"\tValor: "+ entry.getValue());
      }
    }
    
    System.out.println("\nUsando BiConsumer y expresiones Lambda");
    map.forEach( (key, value) -> System.out.println("Clave: "+ key +"\tValue: "+ value));
    
    
  }

}
