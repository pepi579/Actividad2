package ar.edu.udeci.pv;

import org.apache.log4j.Logger;

public class LogExample {
    static Logger logger = Logger.getLogger(LogExample.class);

    public static void main(String[] args) {
        logger.info("Esto es un mensaje de INFO");
        logger.warn("Esto es un mensaje de WARNING");
        logger.error("Esto es un mensaje de ERROR");
    }
}