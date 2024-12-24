import java.util.ArrayList;

public class Employee {
    Person person = new Person();
    Department department;

    public Employee(Person person, Department department) {
        this.person = person;
        this.department = department;
        for (Department elem:  Main.departments)
              {if (department != null  && department.name != null && elem.name != null && department.name.equals(elem.name)) {
                  elem.employees.add(person);
              }
        }
    }

    public Employee(Person person) {
        this(person, null);
    }

    public String printAllColleagues(){
        String result = "В одном отделе, включая самого " + person + " работают следующие сотрудники:";
        for (Department elem:  Main.departments)
            {if (department != null  && department.name != null && elem.name != null
                    &&  department.name.equals(elem.name)) {
                for(Person pers: elem.employees) {
                    result = result + "\n - "  + pers;
                };
            }
        }
        return result;
    }


    @Override
    public String toString() {
        String result = person.toString();
        // если сотрудник является начальником отдела
        if (this.department != null && this.person.equals(this.department.head)) {
            result +=  " начальник отдела ";
            if (this.department.name != null && this.department.name.length() > 0) {
                result += this.department.name;
            } else {
                result += "\"Не указано\"";
            }
        }  // если не указан объект, для отдела в котором работает сотрудник
        else if (this.department == null) {
            result = result + " работает в отделе \"Не указано\", начальник, которого \"Не указано\"";
        }  // если объект - отдел, создан то проверяем заполнено ли в объекте наименование и руководитель
        else {
            result = result + " работает в отделе ";
            // если заполнено наименование отдела
            if (this.department.name != null  && this.department.name.length() > 0) {
                result += this.department.name;
            } // если наименование отдела не определено
            else  {
                result += "\"Не указано\"";
            }
            result += ", начальник которого ";
            // если руководитель отдела определен и заполнен
            if (this.department.head != null  && this.department.head.toString().length() > 0) {
                result += this.department.head.toString();
            } // если руководитель отдела не определен
            else  {
                result += "\"Не указано\"";
            }
        }
        return result;
    }
}
