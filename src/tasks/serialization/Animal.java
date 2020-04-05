package tasks.serialization;

import java.io.Serializable;

public class Animal implements Serializable {

    private String name;
    private int age;
    private int weith;

    public Animal() {
    }

    public Animal(String name, int age, int weith) {
        this.name = name;
        this.age = age;
        this.weith = weith;
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

    public int getWeith() {
        return weith;
    }

    public void setWeith(int weith) {
        this.weith = weith;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weith=" + weith +
                '}';
    }
}
