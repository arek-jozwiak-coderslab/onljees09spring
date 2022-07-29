package pl.coderslab;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class TestLogback {
    public static void main(String[] args) {
        log.debug("This is a debug message.");
        log.info("This is an info message.");
        log.warn("This is a warn message.");
        log.error("This is an error message.");
    }
}
