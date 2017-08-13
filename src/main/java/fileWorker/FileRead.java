package fileWorker;

import converter.Converter;
import exceptions.ExceptionFileNotFound;

import java.io.*;


/**
 * Используется для чтения данных из файла
 */
public class FileRead {

    Converter converter = new Converter();

    /**
     * Метод чтения данных из файла
     * @return
     */
    public int readFile() {

        /**
         * Количество сладостей в подарке, которое мы получим из файла
         */
        int itemCount = 0;

        try {
            File q = new File("input.txt");
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(q)));
            itemCount = converter.convertStringToInt(br.readLine());

            br.close();
        } catch (IOException e) {
            new ExceptionFileNotFound().getExceptionFileNotFound();
        }

        return itemCount;

    }
}


