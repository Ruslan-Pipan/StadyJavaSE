package tasks.serialization;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Elephant extends Animal implements Serializable {
    private String name;
    private String adres;
    private static int eays = 2;

    public Elephant(int age, int weith, String name, String adres) {
        super(age, weith);
        this.name = name;
        this.adres = adres;
    }

    @Override
    public String toString() {
        return "Elephant{" +
                "name='" + name + '\'' +
                ", adres='" + adres + '\'' +
                ", age='" + getAge() + '\'' +
                ", weight='" + getWeith() + '\'' +
                ", aeys='" + eays + '\'' +
                '}';
    }

    private void writeObject(ObjectOutputStream oos) throws IOException {
        oos.defaultWriteObject();
        oos.writeInt(eays);
        oos.writeInt(getWeith());
        oos.writeInt(getAge());
    }
    private void readObject(ObjectInputStream ois) throws IOException, ClassNotFoundException{
        ois.defaultReadObject();
        eays = ois.readInt();
        setWeith(ois.readInt());
        setAge(ois.readInt());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public static int getEays() {
        return eays;
    }

    public static void setEays(int eays) {
        Elephant.eays = eays;
    }
}
