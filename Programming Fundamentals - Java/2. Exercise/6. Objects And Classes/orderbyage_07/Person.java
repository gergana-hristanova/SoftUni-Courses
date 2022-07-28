package orderbyage_07;

public class Person {
    private String name;
    private String id;
    private int age;

    public int getAge() {
        return this.age;
    }

    public Person(String name, String id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format("%s with ID: %s is %d years old.",
                this.name, this.id, this.age);
    }
}