package pl;

import pl.person.Person;

public class SadClassBuilder {
    private SadClass sadClass;
    private int age = 1;
    private String name = "name";
    private Person person;

    private SadClassBuilder() {
    }

    public static SadClassBuilder aSadClass() {
        return new SadClassBuilder();
    }

    public SadClassBuilder withAge(int age) {
        this.age = age;
        return this;
    }

    public SadClassBuilder withName(String name) {
        this.name = name;
        return this;
    }

    public SadClassBuilder withPerson(Person person) {
        this.person = person;
        return this;
    }

    public SadClass build() {
        sadClass = new SadClass();
        sadClass.setAge(age);
        sadClass.setName(name);
        sadClass.setPerson(person);
        return sadClass;
    }
}
