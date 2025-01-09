import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class Department {
    private String nameDepartment;
    private Employee head;
    ArrayList<Employee> employees = new ArrayList<>();

    public Department(String name) {
        this(name, null);
    }

    public Department(Employee head) {
        this(null, head);
    }
    public Department(String name, Employee head) {
        this.nameDepartment = name;
        this.head = head;
        if (head != null  && head.getDepartment() != null) {
            // удаляем из перечня сотрудников в старом отделе
            head.getDepartment().employees.remove(head);

        }
        if (head != null) {
            // добавляем в перечень сотрудников нового отдела
            this.employees.add(head);
        }
    }

    public String getNameDepartment() {
        String nameCopy = null;
        if (this.nameDepartment != null) {
            nameCopy = new String(this.nameDepartment);
        }
        return nameCopy;
    }

    public void setNameDepartment(String nameDepartment) {
        String nameCopy = null;
        if (nameDepartment != null) {
            nameCopy = new String(nameDepartment);
        }
        this.nameDepartment = nameCopy;
    }

    public Employee getHead() {
        if (this.head == null) {
            return null;
        } else {
            return new Employee(this.head.getName(), this.head.getDepartment());
        }
    }

    public void setHead(Employee head) {
        if (head == null) {
            this.head = null;
        } else {
            if ((head.getDepartment() != null) && (head.getDepartment().getHead() != null) ){
                if (head.getDepartment().getHead().getName().equals(head.getName())) {
                    head.getDepartment().setHead(null);
                }
                head.getDepartment().employees.remove(head);
            }
        }
        this.head = new Employee(head.getName(), head.getDepartment());
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(Employee[] employees) {
        ArrayList<Employee> employeesArr= new ArrayList<>(Arrays.asList(employees));
        this.employees = employeesArr;
    }

    public void addEmployee (Employee extraEmployee) {
        employees.add(extraEmployee);
    }

    @Override
    public String toString() {
        String name = this.nameDepartment;
        if (name == null || name.isBlank()) {
            name = "\'наименование отдела не указано\'";
        }
        if (head == null) {
            return name + " без начальника";
        }
        String headName = this.getHead().getName();
        if (headName == null || headName.isBlank()) {
            headName = "\'ФИО не указано\'";
        }
        return name + ", начальник которого " + headName;
    }

}
