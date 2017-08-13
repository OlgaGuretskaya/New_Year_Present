package presentActions;

import java.util.Collections;
import java.util.List;


/**
 * Используется для сортировки подарка по наименованию сладостей
 */
public class PresentSorting {

    /**
     * Метод сортировки подарка по наименованию сладостей
     * @param ourPresent
     */
    public void sortPresent(List<String> ourPresent) {

        try {
            Collections.sort(ourPresent);

            for (String item : ourPresent) {
            }
            System.out.println("Сортированный подарок по наименованию сладостей:" + ourPresent);
        } catch (NullPointerException e) {
            System.out.println("Нет подарка -> нет сортировки!");
        }
    }
}
