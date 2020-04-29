package tasks.cloning.deepReflections;

import java.io.File;
import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) {
        Cow cow = new Cow("Milka", 5,1);

        System.out.println(cow);

        Cow copyCow = reflectionCloning(cow);

        System.out.println(copyCow);
    }

    private static Cow reflectionCloning(Cow cow) {
        try {
            Field name = Cow.class.getDeclaredField("name");
            Field head = Cow.class.getDeclaredField("head");

            name.setAccessible(true);
            head.setAccessible(true);

            name.set(cow,"Pedro");
            head.set(cow,2);

        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
        return cow;
    }
}
