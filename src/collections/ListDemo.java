package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListDemo {

    public static void main(String[] args) {

        List<String> lista = new ArrayList<>();
        //ArrayList<String> lista = new ArrayList<>();

        // adaugare
        lista.add("Roxana");
        lista.add("Anca");
        lista.add(1, "Ana");

        // stergere
        lista.remove(1);

        // modificare
        lista.set(0, "Roxana Modificat");

        // accesare
        System.out.println(lista.get(0));

        // afisare size
        System.out.println("Size curent = " + lista.size());

        // curatare
        lista.clear();

        // afisare size
        System.out.println("Size dupa clear = " + lista.size());

        lista.add("Roxana");
        lista.add("Ana");
        lista.add(2, "Anca");

        // parcurgere cu foreach
        for (String element : lista) {
            System.out.println(element);
        }

        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }

        System.out.println(lista.get(1));

        System.out.println(Collections.min(lista));
    }
}
