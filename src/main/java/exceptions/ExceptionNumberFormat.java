package exceptions;

/**
 * Exception, если введено некорректное значение в консоль
 */
public class ExceptionNumberFormat extends Exception {

    public void getExceptionNumberFormat() {

        System.out.println("Введено НЕчисловое значение!");
    }

}
