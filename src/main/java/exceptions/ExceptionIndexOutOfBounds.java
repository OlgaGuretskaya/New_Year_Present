package exceptions;

import java.util.List;
import java.util.Map;

/**
 * Exception, если невозможно выполнить действие с требуемым индексом
 */
public class ExceptionIndexOutOfBounds extends Exception {

    /**
     * Exception, если невозможно выполнить действие с требуемым индексом для List
     * @param list
     */
    public void getExceptionIndexOutOfBoundsforList(List list) {
        if (list.size() < 4) {
            System.out.println("Невозможно найти элемент с индексом 3!");
        }

        if (list.size() < 9) {
            System.out.println("Невозможно удалить элемент с индексом 8!");
        }

        if (list.size() <= 87) {
            System.out.println("Невозможно добавить элемент с индексом 88!");
        }
    }

    /**
     * Exception, если невозможно выполнить действие с требуемым индексом для Map
     * @param map
     */
    public void getExceptionIndexOutOfBoundsforMap(Map<Integer, String> map) {
        if (map.size() < 5) {
            System.out.println("Невозможно найти элемент с индексом 3!");
        }

        if (map.size() < 10) {
            System.out.println("Невозможно удалить элемент с индексом 9!");
        }

    }

    /**
     * Exception, если невозможно выполнить действие с требуемым индексом для List класса SweetSercher
     * @param list
     */
    public void getExceptionIndexOutOfBoundsforSweetSearcher(List list) {
        if (list.size() < 56) {
            System.out.println("Невозможно найти элемент с индексом 56!");
        }

    }


}