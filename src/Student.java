import java.util.Arrays;

public class Student {
    Person person = new Person();
    int [] grades;


    public Student(Person person, int[] grades) {
        this.person = person;
        this.grades = grades;
    }


    public  Student (String surname, String name, String patronymic, int[] grades) {
        this(new Person(surname,name, patronymic), grades);

    }

    // конструктор на случай - Только имя (строковое)
    public  Student (String name) {
        this(new Person(name),new int [0]);

    }

    // конструктор на случай - Имя (строковое) и набор оценок
    public  Student (String name, int[] grades) {
        this(new Person(name),grades);
    }


    @Override
    public String toString() {
        String result = person.toString() + ": ";
        for (int i = 0; i < grades.length; i++) {
            result += String.valueOf(grades[i]);
            if (i != grades.length - 1) {
                result += ", ";
            }
        }
        return result;
    }

}
