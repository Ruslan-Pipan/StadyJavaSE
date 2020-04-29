package tasks.cloning.deepWhithStaticMothod;

public class Human {
    private String name;
    private int age;



    public Human(){}

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public static Human getHumanInstanceWithAgeAndName(int age, String name){
        return new Human(name,age);
    }



    public String getName() {
        return name;
    }


    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
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
}
