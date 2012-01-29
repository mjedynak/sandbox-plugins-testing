package pl.person;

/**
 * Created by IntelliJ IDEA.
 * User: Kasia
 * Date: 20.11.11
 * Time: 13:34
 * To change this template use File | Settings | File Templates.
 */
public class Person {

    @Deprecated
    private String name;

    private int age;

    private long height;

    public Person(long height) {
        this.height = height;
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

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
