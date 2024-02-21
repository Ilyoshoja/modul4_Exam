import java.io.IOException;
import java.util.logging.*;

public class LoggerCus {
    public static void main(String[] args) throws IOException {
        Formatter formatter = new Formatter() {
            @Override
            public String format(LogRecord record) {
                return record.getLevel() + record.getMessage();
            }
        };
        ConsoleHandler consoleHandler = new ConsoleHandler();
        consoleHandler.setFormatter(formatter);
        Logger logger = Logger.getLogger(LoggerCus.class.getName());
        logger.addHandler(consoleHandler);
        logger.setUseParentHandlers(false);
        logger.info(": info message");

        logger.setLevel(Level.FINE);
        FileHandler fileHandler = new FileHandler("Ilyos.txt");
        fileHandler.setFormatter(formatter);
        fileHandler.setLevel(Level.FINE);
        logger.addHandler(fileHandler);
        logger.fine(": fineee");



    }
}
