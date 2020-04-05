package tasks.serialization;

import java.io.Serializable;

public class Animal {

    private int age;
    private int weith;

    public Animal() {
    }

    public Animal(int age, int weith) {
        this.age = age;
        this.weith = weith;
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
                ", age=" + age +
                ", weith=" + weith +
                '}';
    }
}
