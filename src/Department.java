import java.util.ArrayList;

public class Department {
    private String nameDepartment;
    private Employee head;
    private
    ArrayList<Employee> employees = new ArrayList<>();

    // конструкторы
    public Department(String name) {
        this(name, null);
    }

    public Department(Employee head) {
        this(null, head);
    }

    public Department(String name, Employee head) {
        this.nameDepartment = name;
        if (head == null) {
            this.head = head;
        } else {
            this.head = new Employee(head);
        }

        if (head != null  && head.getDepartment() != null) {
            // удаляем из перечня сотрудников в старом отделе
            head.getDepartment().employees.remove(head);
            //  у назначенного сотрудника изменяем название отдела в котором он работает
            head.setDepartment(this);

        }
        if (head != null) {
            // добавляем в перечень сотрудников нового отдела
            this.addEmployee(head);
        }
    }

    // метод геттер на получение название департамента
    public String getNameDepartment() {
        String nameCopy = null;
        if (this.nameDepartment != null) {
            nameCopy = new String(this.nameDepartment);
        }
        return nameCopy;
    }

    // метод сеттер на назначение нового названия сущестующему департаменту
    public void setNameDepartment(String nameDepartment) {
        String nameCopy = null;
        if (nameDepartment != null) {
            nameCopy = new String(nameDepartment);
        }
        this.nameDepartment = nameCopy;
    }

    // метод на на получения сотрудника, являющегося начальником отдела
    public Employee getHead() {
        if (this.head == null) {
            return null;
        } else {
            return new Employee(this.head.getName(), this.head.getDepartment());
        }
    }

    // метод для назначения нового начальник отдела
    public void setHead(Employee head) {
        if (head == null) {
            this.head = null;
        } else {
            if ((head.getDepartment() != null) && (head.getDepartment().getHead() != null) ){
                if (head.getDepartment().getHead().getName().equals(head.getName())) {
                    head.getDepartment().setHead(null);
                }
                // назначаемого руководителя удаляю из списка старого отдела только в том случае,
                // если он перешел в другой отдел
                //if (this.getNameDepartment() != null &&
                if (this.getNameDepartment() != null &&
                        !this.getNameDepartment().equals(head.getDepartment().getNameDepartment())) {
                    head.getDepartment().employees.remove(head);
                }

            }
        }
        if (head== null || head.getName() == null) {
            this.head = null;
        } else {
            this.head = new Employee(head.getName(), null);
        }

    }

    // метод на получение списка сотрудников числящихся в отделе
    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    // обычное добавление сотрудника в состав сотрудников отдела, без проведения проверок был ли он начальником
    // или сотрудников в другом отделе
    public void addEmployee (Employee extraEmployee) {
        if (extraEmployee != null && extraEmployee.getDepartment() != null &&
                !extraEmployee.getDepartment().employees.contains(extraEmployee)) {
            employees.add(extraEmployee);
        }

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
