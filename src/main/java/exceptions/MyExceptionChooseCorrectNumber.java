package exceptions;

/**
 * Exception, если введено некорректное значение в консоль для выора способа создания подарка
 */
public class MyExceptionChooseCorrectNumber extends Exception {

    String msg;

    public MyExceptionChooseCorrectNumber() {

        msg = "ВНИМАНИЕ!!! Введено некорректное значение с клавиатуры. Требуемое значение: 1 или 2!!!";

    }

    public String getMsg() {

        return msg;
    }
}
