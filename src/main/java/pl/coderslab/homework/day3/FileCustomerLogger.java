package pl.coderslab.homework.day3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDateTime;

public class FileCustomerLogger implements CustomerLogger{

    private final String path;
    private Path file;

    public FileCustomerLogger(String path) {
        this.path = path;
        file = Paths.get(path);
    }

    @Override
    public void log() {
        try {
            Files.writeString(file, LocalDateTime.now().toString() + " : Customer operation"
                    +System.lineSeparator(), StandardOpenOption.APPEND);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
