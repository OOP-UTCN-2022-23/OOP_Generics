package generics;

public class GenericsTypeOld {

    private Object t;

    public Object getT() {
        return t;
    }

    public void setT(Object t) {
        this.t = t;
    }

    public static void main(String args[]){
        GenericsTypeOld type1 = new GenericsTypeOld();
        type1.setT("Test");

        String str = (String) type1.getT(); //poate cauza - ClassCastException
        System.out.println(str);

        GenericsTypeOld type2 = new GenericsTypeOld();
        type2.setT(10);

        int number = (int) type2.getT();
        System.out.println(number);
    }
}