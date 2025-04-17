# Actividad 2 - Programación de Vanguardia

## 🎯 Objetivo
Crear una aplicación Java con Maven que utilice las librerías Apache Commons CLI y Log4j. La aplicación debe poder generar un archivo .jar, ejecutarse desde consola y mostrar cómo se utilizan ambas librerías.

---

## 🛠 Tecnologías utilizadas

- Java 17
- IntelliJ IDEA Community Edition
- Maven
- Git & GitHub
- Librerías:
  - [Apache Commons CLI 1.5.0](https://commons.apache.org/proper/commons-cli/)
  - [Apache Log4j 1.2.17](https://logging.apache.org/log4j/1.2/)

---

## ⚙ Configuración del Proyecto Maven

### pom.xml

```xml
<groupId>ar.edu.udeci.pv</groupId>
<artifactId>Actividad2</artifactId>
<version>1.0-SNAPSHOT</version>

<dependencies>
    <dependency>
        <groupId>commons-cli</groupId>
        <artifactId>commons-cli</artifactId>
        <version>1.5.0</version>
    </dependency>
    <dependency>
        <groupId>log4j</groupId>
        <artifactId>log4j</artifactId>
        <version>1.2.17</version>
    </dependency>
</dependencies>

Actividad2/
│
├── src/
│   ├── main/
│   │   ├── java/ar/edu/udeci/pv/Main.java
│   │   └── resources/log4j.properties
│
├── pom.xml
├── README.md

package ar.edu.udeci.pv;

import org.apache.commons.cli.*;
import org.apache.log4j.Logger;

public class Main {
    private static final Logger logger = Logger.getLogger(Main.class);

    public static void main(String[] args) {
        Options options = new Options();
        options.addOption("h", "help", false, "Mostrar ayuda");
        options.addOption("n", "nombre", true, "Tu nombre");

        CommandLineParser parser = new DefaultParser();
        try {
            CommandLine cmd = parser.parse(options, args);

            if (cmd.hasOption("h")) {
                HelpFormatter formatter = new HelpFormatter();
                formatter.printHelp("Actividad2", options);
            }

            if (cmd.hasOption("n")) {
                String nombre = cmd.getOptionValue("n");
                logger.info("Hola, " + nombre + "!");
                System.out.println("Hola, " + nombre + "!");
            } else {
                logger.warn("No se proporcionó el nombre.");
                System.out.println("Ejecutar con: -n tu_nombre");
            }

        } catch (ParseException e) {
            logger.error("Error al analizar los argumentos.", e);
        }
    }
}

log4j.rootLogger=INFO, console
log4j.appender.console=org.apache.log4j.ConsoleAppender
log4j.appender.console.layout=org.apache.log4j.PatternLayout
log4j.appender.console.layout.ConversionPattern=%d{yyyy-MM-dd HH:mm:ss} [%p] %m%n
