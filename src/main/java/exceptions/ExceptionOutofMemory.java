package exceptions;

/**
 * Exception, если произошла утечка памяти
 */
public class ExceptionOutofMemory extends Exception {

    public void getExceptionOutofMemory() {

        System.out.println("Закончилась память!");
    }
}
