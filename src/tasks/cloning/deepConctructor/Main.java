package tasks.cloning.deepConctructor;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Ruslan",20);
        Student cloneStudent = new Student(student);

        System.out.println(student);
        System.out.println(cloneStudent);
    }
}
