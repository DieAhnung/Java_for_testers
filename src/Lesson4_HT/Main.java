package Lesson4_HT;

import java.sql.SQLOutput;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> vegetables = new ArrayList<>(20);
        vegetables.add("Mellon");
        vegetables.add("Broccoli");
        vegetables.add("Cucumber");
        vegetables.add("Potato");
        vegetables.add("Pineapple");
        vegetables.add("Coconut");
        vegetables.add("Tomato");
        vegetables.add("Carrot");
        vegetables.add("Orange");
        vegetables.add("Lime");
        vegetables.add("Lemon");
        vegetables.add("Mellon");
        vegetables.add("Cucumber");
        vegetables.add("Peach");
        vegetables.add("Apple");
        vegetables.add("Banana");
        vegetables.add("Peach");
        vegetables.add("Tomato");
        vegetables.add("Lemon");

        System.out.println("1st Task");

        System.out.println("List of vegetables:\n" + vegetables);

        Set<String> set = new HashSet<>(vegetables);

        System.out.println("Unique values:\n" + set);


        Map<String, Integer> mapList = new HashMap<>();

        for (String s : vegetables) {
            Integer count = mapList.getOrDefault(s, 0);
            mapList.put(s, count + 1);
        }

        System.out.println("Quality:\n" + mapList);

        System.out.println("2nd Task");


        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Ivanov", "+7(985)729-01-45");
        phoneBook.add("Petrov", "+7(915)465-72-85");
        phoneBook.add("Petrov", "+7(999)555-66-66");
        phoneBook.add("Sidorov", "+7(888)777-22-55");
        phoneBook.add("Kotov", "+7(876)456-78-90");
        phoneBook.add("Ivanov", "+7(333)444-88-99");

        System.out.println("Petrov:" + phoneBook.get("Petrov"));
        System.out.println("Kotov:" + phoneBook.get("Kotov"));
        System.out.println("Ivanov:" + phoneBook.get("Ivanov"));
    }

}
