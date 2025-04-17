package ar.edu.udeci.pv;

import org.apache.commons.cli.*;

public class CliExample {
    public static void main(String[] args) {
        Options options = new Options();
        options.addOption("n", "name", true, "Tu nombre");

        CommandLineParser parser = new DefaultParser();
        try {
            CommandLine cmd = parser.parse(options, args);
            if (cmd.hasOption("n")) {
                System.out.println("Hola, " + cmd.getOptionValue("n") + "!");
            } else {
                System.out.println("No se pasó el parámetro -n");
            }
        } catch (ParseException e) {
            System.out.println("Error al leer argumentos");
        }
    }
}