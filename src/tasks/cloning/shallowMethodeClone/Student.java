package tasks.cloning.shallowMethodeClone;

public class Student implements Cloneable {
    private String name;
    private int age;
    private Grup grup;

    Student(){}

    public Student(String name, int age, Grup grup) {
        this.name = name;
        this.age = age;
        this.grup = grup;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", grup=" + grup +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Grup getGrup() {
        return grup;
    }

    public void setGrup(Grup grup) {
        this.grup = grup;
    }
}
