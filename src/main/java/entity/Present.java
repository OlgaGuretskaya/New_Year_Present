package entity;

import java.util.*;

/**
 * Используется для хранения обранного подарка
 */
public class Present {
    private ArrayList<String> presentArray;
    private LinkedList<String> presentLinked;
    private HashSet<String> presentHashSet;
    private TreeSet<String> presentTreeSet;
    private HashMap<Integer, String> presentHashMap;
    private TreeMap<Integer, String> presentTreeMap;


    /**
     * Количество сладостей в подарке
     */
    private int items;

    /**
     * Конструктор по умолчанию
     */
    public Present() {
    }

    /**
     * Конструктор с параметрами
     * @param presentArray
     * @param presentLinked
     * @param presentHashSet
     * @param presentTreeSet
     * @param presentHashMap
     * @param presentTreeMap
     * @param totalWeight
     * @param items
     */
    public Present(ArrayList<String> presentArray, LinkedList<String> presentLinked, HashSet<String> presentHashSet, TreeSet<String> presentTreeSet, HashMap<Integer, String> presentHashMap, TreeMap<Integer, String> presentTreeMap, int totalWeight, int items) {
        this.presentArray = presentArray;
        this.presentLinked = presentLinked;
        this.presentHashSet = presentHashSet;
        this.presentTreeSet = presentTreeSet;
        this.presentHashMap = presentHashMap;
        this.presentTreeMap = presentTreeMap;
        this.items = items;
    }

    /**
     * Метод get для листа presentArray
     * @return
     */
    public ArrayList<String> getPresentArray() {
        return presentArray;
    }

    /**
     * Метод set для листа presentArray
     * @param presentArray
     */
    public void setPresentArray(ArrayList<String> presentArray) {
        this.presentArray = presentArray;
    }

    /**
     * Метод get для presentLinked
     * @return
     */
    public LinkedList<String> getPresentLinked() {
        return presentLinked;
    }

    /**
     * Метод set для presentLinked
     * @param presentLinked
     */
    public void setPresentLinked(LinkedList<String> presentLinked) {
        this.presentLinked = presentLinked;
    }

    /**
     * Метод get для presentHashSet
     * @return
     */
    public HashSet<String> getPresentHashSet() {
        return presentHashSet;
    }

    /**
     * Метод set для presentHashSet
     * @param presentHashSet
     */
    public void setPresentHashSet(HashSet<String> presentHashSet) {
        this.presentHashSet = presentHashSet;
    }

    /**
     * Метод get для presentTreeSet
     * @return
     */
    public TreeSet<String> getPresentTreeSet() {
        return presentTreeSet;
    }

    /**
     * Метод set для presentTreeSet
     * @param presentTreeSet
     */
    public void setPresentTreeSet(TreeSet<String> presentTreeSet) {
        this.presentTreeSet = presentTreeSet;
    }

    /**
     * Метод get для presentHashMap
     * @return
     */
    public HashMap<Integer, String> getPresentHashMap() {
        return presentHashMap;
    }

    /**
     * Метод set для presentHashMap
     * @param presentHashMap
     */
    public void setPresentHashMap(HashMap<Integer, String> presentHashMap) {
        this.presentHashMap = presentHashMap;
    }

    /**
     * Метод get для presentTreeMap
     * @return
     */
    public TreeMap<Integer, String> getPresentTreeMap() {
        return presentTreeMap;
    }

    /**
     * Метод set для presentTreeMap
     * @param presentTreeMap
     */
    public void setPresentTreeMap(TreeMap<Integer, String> presentTreeMap) {
        this.presentTreeMap = presentTreeMap;
    }

    /**
     * Метод get для переменной item
     * @return
     */
    public int getItems() {
        return items;
    }

    /**
     * Метод set для переменной item
     * @param items
     */
    public void setItems(int items) {
        this.items = items;
    }
}
