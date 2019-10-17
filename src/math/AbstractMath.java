package math;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

abstract class AbstractMath {
    /**
     * @param x      double
     * @param result double
     * @param param  String Дополнительный параметр, где можно передать имя функции для вывода вдокумент
     */
    void printToCSV(double x, double result, String param) {
        String filePath = System.getProperty("user.dir") + "/result/" + this.getClass().getSimpleName() + ".csv";
        try {
            BufferedWriter writer = Files.newBufferedWriter(Paths.get(filePath), StandardOpenOption.APPEND, StandardOpenOption.CREATE);
            CSVPrinter csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT);

            csvPrinter.printRecord(x, "Результат работы" + (param == null ? ": " : " " + param + ": ") + result);
            csvPrinter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
