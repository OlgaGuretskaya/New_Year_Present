package exceptions;

/**
 * Exception, если введено некорректное значение в консоль для задания количества items в подарке
 */
public class MyExceptionTypeItemLessThan7000 extends Exception {

    String msg;

    public MyExceptionTypeItemLessThan7000() {

        msg = "ВНИМАНИЕ!!! Введенное значение меньше 7000!";

    }

    public String getMsg() {
        return msg;
    }
}


