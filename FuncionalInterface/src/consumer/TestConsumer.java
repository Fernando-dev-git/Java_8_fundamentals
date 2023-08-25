package consumer;

import java.util.function.Consumer;

public class TestConsumer {

  public static void main(String[] args) {
    
    Consumer<String> consumer = param -> System.out.println("valor: "+ param);
    consumer.accept("valor");

  }

}
