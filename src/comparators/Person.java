package comparators;

public class Person implements Comparable<Person>{

    private String name;
    private int age;
    private int cnp;

    public Person(String name, int age, int cnp) {
        this.name = name;
        this.age = age;
        this.cnp = cnp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getCnp() {
        return cnp;
    }

    public void setCnp(int cnp) {
        this.cnp = cnp;
    }

    @Override
    public int compareTo(Person person) {
        if (this.age < person.age) {
            return -1;
        } else if (this.age > person.age) {
            return 1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", cnp=" + cnp +
                '}';
    }
}
