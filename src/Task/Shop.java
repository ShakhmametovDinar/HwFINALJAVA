package Task;

import java.awt.*;
import java.util.*;

public class Shop {
    public static void shop() {
        Task1 product1 = new Task1("Dell", "black");
        Task1 product2 = new Task1("MSI", "red");
        Task1 product3 = new Task1("Acer", "green");
        Task1 product4 = new Task1("Asus", "white");
        Map<Integer, Task1> map1 = new HashMap<>();
        Map<Integer, Task1> map2 = new HashMap<>();
        map1.put(1, product1);
        map1.put(2, product2);
        map1.put(3, product3);
        map1.put(4, product4);

        System.out.println("Введите бренд: ");
        Scanner sc = new Scanner(System.in);
        String phrase1 = sc.nextLine();
        System.out.println("Введите цвет: ");
        Scanner sc1 = new Scanner(System.in);
        String phrase2 = sc1.nextLine();
        Task1 product5 = new Task1(phrase1, phrase2);

        map2.put(1, product5);
        Set<String> result = new HashSet<>();


        for(Map.Entry<Integer, Task1> entry: map1.entrySet()) {
            String value = String.valueOf(entry.getValue());
            for (Map.Entry<Integer, Task1> entry1: map2.entrySet()){
                String value1 = String.valueOf(entry1.getValue());
                if(Objects.equals(value, value1)){
                    result.add(value);
                    System.out.println("Имеется совпадение!");
                }
            }
        }
        System.out.println(result);

    }
}
// программа по какой-то причине не работает, исправить пытался