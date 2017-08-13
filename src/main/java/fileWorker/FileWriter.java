package fileWorker;

import exceptions.ExceptionFileNotFound;
import exceptions.ExceptionIO;

import java.util.List;
import java.io.*;

/**
 * Используется для записи собранного подарка в файл
 */
public class FileWriter {

    /**
     * Метод записи собранного подарка в файл
     * @param list
     */
    public void writeToFile(List<String> list) {


        try {
            if(list ==null){
                throw new IOException();
            }
            File newfile = new File("Present.txt");
            if (newfile.exists()) {
                newfile.delete();
            }
            OutputStream file = new FileOutputStream("Present.txt", true);
            OutputStreamWriter writer = new OutputStreamWriter(file);
            BufferedWriter out = new BufferedWriter(writer);
            out.write("Собранный подарок:");
            for (int i = 0; i < list.size(); i++) {
                out.write("Item -" + list.get(i) + ";");
                out.flush();
            }

        } catch (FileNotFoundException e) {
            new ExceptionFileNotFound().getExceptionFileNotFound();
        } catch (IOException e) {
            new ExceptionIO().getIOExceptionWriteFile();
        }


    }
}
