package tasks.cloning.deepConctructor;

public class Student {
    private String name;
    private int age;

    Student(){}

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student(Student other){
        this(other.name,other.age);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }



}

