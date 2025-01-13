public class Employee {
    private String name;
    private Department department;

    public Employee(String name, Department department) {
        this.name = name;
        this.department = department;
        if (department != null) {
            this.department.addEmployee(this);
        }
    }

    public Employee(String name) {
        this(name, null);
    }


    public Employee(Employee employee) {
        this (employee.getName());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //  метод, который возвращает департамент
    public Department getDepartment() {
        return department;
    }


    public void setDepartment(Department department) {
        // если этот сотрудник уже числится в другом департаменте, то в старом департамент убираем его из списка сотрудников
        if (this.department != null  && !this.department.getNameDepartment().isBlank()) {
            this.department.getEmployees().remove(this);
            // если этот сотрудник еще и руководитель в другом департаменте, то в старом департаменте убираем его из списка сотрудников
            // убираем его с должности руководителя
            if (this.department.getHead() != null &&
                this.department.getHead().getName()  != null &&
                this.department.getHead().getName().equals(this.getName())) {
                    this.department.setHead(null);
            }

        }
        this.department = department;
        if (department != null) {
            this.department.addEmployee(this);
        }

    }

    public void dismissal () {
        this.setDepartment(null);
    }

    @Override
    public String toString() {
        String name = this.name;
        if (name == null || name.isBlank()) {
            name = "\'ФИО сотрудника не указано\'";
        }
        if (department == null) {
            return name + " не работает";
        }
        if (department != null && department.getHead() != null && name.equals(department.getHead().name)) {
            String depName = department.getNameDepartment();
            if (department.getNameDepartment() == null || department.getNameDepartment().isBlank()) {
                depName = "\'не указано\'";
            }
            return name +  " начальник отдела " + depName;
        } else {
            return name + " работает в отделе " + department;
        }

    }
}
