package tasks.cloning.deepWhithStaticMothod;

public class Main {
    public static void main(String[] args) {
        Human cloneHuman = Human.getHumanInstanceWithAgeAndName(20,"Pasha");
        System.out.println(cloneHuman);

        Car car = new Car(2554,5);

        Car copyCar = Car.deepCopyCar(car);

        System.out.println(car);
        System.out.println(copyCar);
    }
}
