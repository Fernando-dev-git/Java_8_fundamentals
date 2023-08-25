package main;

import java.util.stream.IntStream;

public class SumaryStatisticsTest {
  
  public static void main(String[] args) {
    System.out.println(IntStream.range(0,  20)
        .summaryStatistics());
    
    System.out.println("Obtener Stadisticas por separado");
    System.out.println("Suma: "+ IntStream.range(1, 20)
                                          .summaryStatistics()
                                          .getSum());
  }

}
