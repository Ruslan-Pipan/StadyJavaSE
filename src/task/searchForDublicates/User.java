/*
Дан класс User, модифицировать его не можем. Нужно написать утилитный метод
public static List<User> findDuplicates(Collection<User> collA, Collection<User> collB);
который возвращает дубликаты: юзеров, которые есть в обеих коллекциях. Одинаковыми считаем юзеров, у которых совпадают все 3 поля: username, email, passwordHash.
По производительности: метод findDuplicates должен работать не больше нескольких секунд, если на вход получает 2 коллекции по 100 тысяч элементов в каждой. То есть, простой перебор в цикле не подойдёт.
Пользоваться можно только стандартными классами Java SE
* */
package task.searchForDublicates;

import java.util.Arrays;

public final class User {
    private String username;

    private String email;

    private byte[] passwordHash;

    public User(String username, String email, byte[] passwordHash) {
        this.username = username;
        this.email = email;
        this.passwordHash = passwordHash;
    }

    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public byte[] getPasswordHash() {
        return passwordHash;
    }

    public void setPasswordHash(byte[] passwordHash) {
        this.passwordHash = passwordHash;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", passwordHash=" + Arrays.toString(passwordHash) +
                '}';
    }
}


