/*
*Напишите метод, который на вход получает коллекцию объектов, а возвращает коллекцию уже без дубликатов.
* */

package task.removeDublicat;
import java.util.Collection;
import java.util.HashSet;

public class WithoutDublicates {
    public static <T> Collection<T> removeDuplicates(Collection<T> collection) {
        return new HashSet<>(collection);
    }
}
