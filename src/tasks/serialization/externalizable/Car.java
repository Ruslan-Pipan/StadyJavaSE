package tasks.serialization.externalizable;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Car implements Externalizable {

    private String model;
    private double power;
    private int prise;


    public Car() {
    }

    public Car(String model, double power, int prise) {
        this.model = model;
        this.power = power;
        this.prise = prise;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", power=" + power +
                ", prise=" + prise +
                '}';
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    public int getPrise() {
        return prise;
    }

    public void setPrise(int prise) {
        this.prise = prise;
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(model);
        out.writeDouble(power);
        out.writeInt(prise);
        out.flush();
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        model = (String) in.readObject();
        power = in.readDouble();
        prise = in.readInt();
    }
}
