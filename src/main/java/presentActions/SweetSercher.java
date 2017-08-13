package presentActions;

import exceptions.ExceptionIndexOutOfBounds;
import exceptions.ExceptionNullPointer;

import java.util.List;

/**
 * Используется для поиска элемента в подарке
 */
public class SweetSercher {

    /**
     * Метод поиска элемента в подарке
     * @param ourPresent
     */
    public void searchSweet(List<String> ourPresent) {
        try {

            System.out.println("Найти элемент с индексом 56:" + ourPresent.get(56));

        } catch (IndexOutOfBoundsException e) {
            new ExceptionIndexOutOfBounds().getExceptionIndexOutOfBoundsforSweetSearcher(ourPresent);

        } catch (NullPointerException e) {
            new ExceptionNullPointer().getExceptionNullPointer();
        }

    }
}
