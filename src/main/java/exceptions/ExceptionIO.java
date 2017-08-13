package exceptions;

/**
 * Exception, если невозможно записать файл
 */
public class ExceptionIO extends Exception {

    public void getIOExceptionWriteFile() {

        System.out.println("Ошибка во время записи файла!");

    }

}
