package creation.by.file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class CreateStreamTest {

  public static void main(String[] args) {
    
    Path path = Paths.get("documento.txt");
    try(Stream<String> line = Files.lines(path)){
      line.forEach(System.out::println);
    }catch(IOException e) {
      e.printStackTrace();
    }

    
    System.out.println("\nArbol de direcciones");
    Path direccion = Paths.get(".");
    System.out.printf("\nEl arbol de archivos del proyecto: %s es %n",
        direccion.toAbsolutePath());

    try (Stream<Path> paths = Files.walk(direccion)) {
      paths.forEach(System.out::println);
    } catch (IOException e) {
      e.printStackTrace();
    }

  }

}
