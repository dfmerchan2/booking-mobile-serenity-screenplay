package co.com.booking.utilities;

import java.io.File;

import java.nio.file.Path;
import java.util.Arrays;
import java.util.Optional;

public class Capabilities {

  private static final String FILE_APP = "src/test/resources/app";

  public static String getPathApp() {
    Path path = Path.of(FILE_APP);
    return Optional.of(path.toFile()).filter(File::isDirectory).map(File::listFiles).stream()
        .flatMap(Arrays::stream)
        .filter(file -> file.getName().endsWith(".apk"))
        .findFirst()
        .map(File::getAbsolutePath)
        .orElse("Application not found");
  }
}
