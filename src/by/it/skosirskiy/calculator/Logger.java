package by.it.skosirskiy.calculator;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

class Logger {

    private static volatile Logger instance;

    private String FILENAME;

    private Logger() {
        FILENAME = System.getProperty("user.dir")
                + "/src/by/it/skosirskiy/calculator/log_jd02_06.txt";
    }

    public static Logger getLogger() {
        if (instance == null) {
            synchronized (Logger.class) {
                if (instance == null)
                    instance = new Logger();
            }
        }
        return instance;
    }


    void log(String text) {
        Date date = new Date();
        String message = String
                .format("%s %s\n", date.toString(), text);
        synchronized (Logger.class) {
            try (
                    BufferedWriter out =
                            new BufferedWriter(
                                    new FileWriter(FILENAME, true)
                            )
            ) {
                out.write(message);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


}
