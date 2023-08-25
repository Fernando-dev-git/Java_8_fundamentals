package biconsumer;

import java.util.function.BiConsumer;

public class BiConsumerTest {

  public static void main(String[] args) {

    BiConsumer<Double, Double> biconsumer = (param1, param2) -> {
      double resultado = param1 * param2;
      System.out.print(param1 + " * " + param2 + " = " + resultado);
    };

    biconsumer.accept(14.56, 12.65);

  }

}
