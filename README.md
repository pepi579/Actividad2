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
