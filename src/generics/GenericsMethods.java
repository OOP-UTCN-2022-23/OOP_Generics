package generics;

public class GenericsMethods {

    public static <T> boolean isEqual(GenericsType<T> g1, GenericsType<T> g2){

        return g1.getT().equals(g2.getT());
    }

    public static void main(String args[]){
        GenericsType<String> g11 = new GenericsType<>();
        g11.setT("Test");

        GenericsType<String> g12 = new GenericsType<>();
        g12.setT("Test1");

        boolean isEqual1 = GenericsMethods.isEqual(g11, g12);

        System.out.println(isEqual1);

        GenericsType<Integer> g21 = new GenericsType<>();
        g21.setT(12);

        GenericsType<Integer> g22 = new GenericsType<>();
        g22.setT(12);

        boolean isEqual2 = GenericsMethods.isEqual(g21, g22);

        System.out.println(isEqual2);

    }
}
