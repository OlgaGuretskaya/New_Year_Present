package data;

import java.util.ArrayList;
import java.util.List;

/**
 * Содержит данные для сбора подарка
 */
public class ChocolateData {

    List<String> chocolate1;
    List<String> chocolate2;
    List<String> chocolate3;

    /**
     * Конструктор с параметрами
     */
    public ChocolateData() {
        chocolate1 = new ArrayList<>();
        chocolate2 = new ArrayList<>();
        chocolate3 = new ArrayList<>();
        addData();
    }

    /**
     * Метод get для листа chocolate1
     * @return
     */
    public List<String> getChocolate1() {
        return chocolate1;
    }

    /**
     * Метод set для листа chocolate1
     * @param chocolate1
     */
    public void setChocolate1(List<String> chocolate1) {
        this.chocolate1 = chocolate1;
    }

    /**
     * Метод get для листа chocolate2
     * @return
     */
    public List<String> getChocolate2() {
        return chocolate2;
    }

    /**
     * Метод set для листа chocolate2
     * @param chocolate2
     */
    public void setChocolate2(List<String> chocolate2) {
        this.chocolate2 = chocolate2;
    }

    /**
     * Метод get для листа chocolate3
     * @return
     */
    public List<String> getChocolate3() {
        return chocolate3;
    }

    /**
     * Метод set для листа chocolate3
     * @param chocolate3
     */
    public void setChocolate3(List<String> chocolate3) {
        this.chocolate3 = chocolate3;
    }

    /**
     * Метод вывода листов
     * @return
     */
    @Override
    public String toString() {
        return "ChocolateData{" +
                "chocolate1=" + chocolate1 +
                ", chocolate2=" + chocolate2 +
                ", chocolate3=" + chocolate3 +
                '}';
    }

    /**
     * Метод с элементами и их атрибутами для сбора подарка
     */
    public void addData() {

        chocolate1.add("Милка");
        chocolate1.add("шоколадка");
        chocolate1.add("100");


        chocolate2.add("Сникерс");
        chocolate2.add("шоколадный батончик");
        chocolate2.add("80");


        chocolate3.add("Альпен Голд");
        chocolate3.add("шоколадка");
        chocolate3.add("100");

    }
}
