package data;

import java.util.ArrayList;
import java.util.List;

/**
 * Содержит данные для сбора подарка
 */
public class CandyData {
    private List<String> candy1;
    private List<String> candy2;
    private List<String> candy3;

    /**
     * Конструктор
     */
    public CandyData() {
        candy1 = new ArrayList<>();
        candy2 = new ArrayList<>();
        candy3 = new ArrayList<>();
        addData();
    }
    /**
     * Конструктор с параметрами
     */
    public CandyData(List<String> candy1, List<String> candy2, List<String> candy3) {
        this.candy1 = candy1;
        this.candy2 = candy2;
        this.candy3 = candy3;
    }

    /**
     * Мутод get для листа candy1
     * @return
     */
    public List<String> getCandy1() {
        return candy1;
    }

    /**
     * Мутод set для листа candy1
     * @param candy1
     */
    public void setCandy1(List<String> candy1) {
        this.candy1 = candy1;
    }

    /**
     * Мутод get для листа candy2
     * @return
     */
    public List<String> getCandy2() {
        return candy2;
    }

    /**
     * Мутод set для листа candy2
     * @param candy2
     */
    public void setCandy2(List<String> candy2) {
        this.candy2 = candy2;
    }

    /**
     * Мутод get для листа candy3
     * @return
     */
    public List<String> getCandy3() {
        return candy3;
    }

    /**
     * Мутод set для листа candy3
     * @param candy3
     */
    public void setCandy3(List<String> candy3) {
        this.candy3 = candy3;

            }

    /**
     * Метод вывода листов
     * @return
     */
    @Override
    public String toString() {
        return "CandyData{" +
                "candy1=" + candy1 +
                ", candy2=" + candy2 +
                ", candy3=" + candy3 +
                '}';
    }

    /**
     * Метод с элементами и их атрибутами для сбора подарка
     */
    public void addData() {
        candy1.add("Милкивей");
        candy1.add("шоколадные конфеты");
        candy1.add("120");


        candy2.add("Аленка");
        candy2.add("шоколадные конфеты");
        candy2.add("80");


        candy3.add("Суфле");
        candy3.add("конфеты");
        candy3.add("50");

    }
}
