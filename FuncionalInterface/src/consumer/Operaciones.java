package consumer;

import java.util.List;
import java.util.function.Consumer;
import uitls.Estudiante;

public class Operaciones {
  
  public void recorreTodos(List<Estudiante> estudiantes, Consumer<Estudiante> consumer) {
    for(Estudiante estudiante: estudiantes) {
       consumer.accept(estudiante);
    }
  }

}
