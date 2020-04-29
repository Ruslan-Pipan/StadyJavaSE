package tasks.cloning.shallowMethodeClone;

public class Grup {

    private int id;

    public Grup(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Grup{" +
                "id=" + id +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
