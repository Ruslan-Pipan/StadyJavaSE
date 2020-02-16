package tasks.string.divedString;


import java.util.ArrayList;

/*
* Необходимо создать строку с текстом (текст взять любой из интернета).
* Разбить эту строку на 2 подстроки равной длине и вывести на экран каждое предложения с новой строки.
 * */
public class Main {
    public static void main(String[] args) {
        String s1 = "Що, «він кинув на підлогу книжку «Рідна мова». Королева Книг. Що трапилося, Книжечко? Хто тебе образив?";
        ArrayList<String> arrayList = new ArrayList<>(2);
        arrayList.add(s1.substring(0,s1.length()/2));
        arrayList.add(s1.substring(s1.length()/2, s1.length()));
        System.out.println(arrayList.get(0));
        System.out.println(arrayList.get(1));
    }
}
