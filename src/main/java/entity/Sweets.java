package entity;

/**
 * Используется для хранения атрибутоув сладости
 */
public class Sweets {
    private String brand;
    private String type;
    private int weight;

    /**
     * Метод для атрибутов сладости
     */
    public Sweets() {
    }

    /**
     * Конструктор с параметрами
     * @param brand
     * @param type
     * @param weight
     */
    public Sweets(String brand, String type, int weight) {
        this.brand = brand;
        this.type = type;
        this.weight = weight;
    }

    /**
     * Метод get для переменной brand
     * @return
     */
    public String getBrand() {
        return brand;
    }

    /**
     * Метод set для переменной brand
     * @param brand
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * Метод get для переменной type
     * @return
     */
    public String getType() {
        return type;
    }

    /**
     * Метод set для переменной type
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Метод get для переменной weight
     * @return
     */
    public int getWeight() {
        return weight;
    }

    /**
     * Метод set для переменной weight
     * @param weight
     */
    public void setWeight(int weight) {
        this.weight = weight;
    }

    /**
     * Метод выводы атрибутов сладости
     * @return
     */
    @Override
    public String toString() {
        return "Sweets{" +
                "brand='" + brand + '\'' +
                ", type='" + type + '\'' +
                ", weight=" + weight +
                '}';
    }
}
