import java.util.ArrayList;

public class Department {
    String name = "";
    Person head = new Person();
    ArrayList<Person> employees = new ArrayList<Person>();

    public Department(String name) {
        this.name = name;
    }

    public Department() {
        this(null);
    }

}
