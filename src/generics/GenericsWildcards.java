package generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsWildcards {

    public static double sum(List<? extends Number> list){
        double sum = 0;
        for(Number n : list) {
            sum += n.doubleValue();
        }
        return sum;
    }

    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();

        integerList.add(3);
        integerList.add(5);

        double sum = sum(integerList);
        System.out.println("Suma = "+sum);
    }
}