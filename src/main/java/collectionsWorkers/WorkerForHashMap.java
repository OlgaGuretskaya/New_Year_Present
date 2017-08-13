package collectionsWorkers;

import exceptions.ExceptionIndexOutOfBounds;
import exceptions.ExceptionNullPointer;
import timeCalculation.TimeCalculation;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Используется для измерения скорости работы HashMap
 */
public class WorkerForHashMap {

    TimeCalculation timeCalculation = new TimeCalculation();

    /**
     * Метод измерения скорости работы HashMap
     * @param list
     * @return
     */
    public Map createPresentUsingHashMap(List<String> list) {

        /**
         * HashMap созданного подарка
         */
        Map<Integer, String> hashMap = new HashMap<Integer, String>();
        try {
            Integer mapKey;

            int i;
            for (i = 0; i < list.size(); i++) {
                mapKey = i;
                String mapItem;
                mapItem = list.get(i);
                hashMap.put(mapKey, mapItem);

            }

            long startTime = timeCalculation.currentTimeMillis();

            hashMap.containsValue("Милка");
            hashMap.put(88, "Мамба");

            if (hashMap.get(3) == null || hashMap.remove(8) == null) {
                throw new IndexOutOfBoundsException();
            }
            hashMap.get(3);
            hashMap.remove(8);

            String collectionName = "HashMap";
            long endTime = timeCalculation.currentTimeMillis();
            timeCalculation.timeCalculation(startTime, endTime, collectionName);
        } catch (NullPointerException e) {
            new ExceptionNullPointer().getExceptionNullPointer();

        } catch (IndexOutOfBoundsException e) {

            new ExceptionIndexOutOfBounds().getExceptionIndexOutOfBoundsforMap(hashMap);

        }
        return hashMap;

    }
}

