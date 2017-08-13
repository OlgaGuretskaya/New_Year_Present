package exceptions;

/**
 * Exception, если файл не найден
 */
public class ExceptionFileNotFound extends Exception {

    /**
     * Метод вывода сообщения в случае отсутсвия файла
     */
    public void getExceptionFileNotFound() {

        System.out.println("Файл не найден!");
    }
}
