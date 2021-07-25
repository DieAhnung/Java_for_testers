package Lesson3_HT;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Box<T extends Fruit> {

    public List<T> getList() {
        return list;
    }

    public Box() {
        list = new ArrayList<T>();
    }


    private List<T> list;

    public Box(T... object) {
        list = Arrays.asList(object);
    }

    float getWeight() {
        return list.size() * list.get(0).getWeight();
    }

    boolean compare(Box<? extends Fruit> box) {
        return this.getWeight() == box.getWeight();
    }

    String getType() {
        return list.get(0).getType();
    }

    void change(Box<T> box) {
        box.getList().addAll(list);
        list.clear();
    }


    void toAdd(T object) {
        list.add(object);
    }


}