package collections;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();
        //HashMap<Integer, String> map = new HashMap<>();

        // adaugare
        map.put(1,"POO");
        map.put(2,"DB");
        map.put(3,"FA");

        System.out.println(map);

        // stergere
        map.remove(2);
        System.out.println(map);

        // modificare
        map.put(1,"OOP");
        System.out.println(map);

        // afisare valoare
        System.out.println(map.get(3));

        // verifica cheie
        System.out.println("Contains 1? " + map.containsKey(1));

        for(Map.Entry<Integer,String> entry: map.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue();

            System.out.println(key + " - " + value);
        }

        for(int key: map.keySet()) {
            System.out.println(key);
        }

    }

}
