package timeCalculation;

/**
 * Используется для подсчета времени работы
 */
public class TimeCalculation {

    /**
     * Метод определения времени
     * @return
     */
    public long currentTimeMillis() {

        long time = System.currentTimeMillis();
        return time;

    }

    /**
     * Метод подсчета времени работы
     * @param startTime
     * @param endTime
     * @param collectionName
     */
    public void timeCalculation(long startTime, long endTime, String collectionName) {
        long timeSpent = endTime - startTime;

        System.out.println("Программа выполнялась для " + collectionName + ":" + timeSpent + " миллисекунд");
    }

}
