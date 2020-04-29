package tasks.cloning.deepWhithStaticMothod;

public class Car {
    private int weihht;
    private int model;

    public Car(){}

    public Car(int weihht, int model) {
        this.weihht = weihht;
        this.model = model;
    }

    public static Car deepCopyCar(Car car){
        return new Car(car.weihht,car.model);
    }


    @Override
    public String toString() {
        return "Car{" +
                "weihht=" + weihht +
                ", model=" + model +
                '}';
    }

    public int getWeihht() {
        return weihht;
    }

    public void setWeihht(int weihht) {
        this.weihht = weihht;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }
}
