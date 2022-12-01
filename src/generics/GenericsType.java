package generics;

public class GenericsType<T> {

    private T t;

    public T getT() {
        return this.t;
    }

    public void setT(T t) {
        this.t=t;
    }

    public static void main(String args[]){
        GenericsType<String> type1 = new GenericsType<>();
        type1.setT("Test"); //valid

        String str = type1.getT();
        System.out.println(str);

        GenericsType<Integer> type2 = new GenericsType<>();
        type2.setT(10); //valid

        int number = type2.getT();
        System.out.println(number);
    }
}
