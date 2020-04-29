package tasks.cloning.shallowMethodeClone;

public class ShallowCloning {
    public static void main(String[] args) {
        Grup grup = new Grup(1);
        Student student = new Student("Ruslan",20,grup);

        try {
            Student clobeStudent = (Student)student.clone();
            System.out.println(student);
            System.out.println(clobeStudent);

            clobeStudent.setName("Oleg");
            grup.setId(5);

            System.out.println();

            System.out.println(student);
            System.out.println(clobeStudent);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

    }
}
