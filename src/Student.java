public class Student {
    Person person;
    private int [] grades;



    public Student(Person person, int ... grades) {
        for (int elem: grades) {
            if (elem < 2   || elem > 5) {
                throw new IllegalArgumentException("Оценки могут быть в диапазоне от 2 до 5, а передано значение: "  +
                        elem);
            }
        }
        this.person = person;
        this.grades = grades;
    }

    public  Student (String surname, String name, String patronymic, int ... grades) {
        this(new Person(surname,name, patronymic), grades);

    }

    // конструктор на случай - Имя (строковое) и набор оценок
    public  Student (String name, int ... grades) {
        this(new Person(name),grades);
    }

    public Person getPerson() {
        return person;
    }

    public int[] getGrades() {
        return grades.clone();
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

    // метод рассчитывающий среднюю оценку студента
    public double calculateAverageGrade () {
        double averageGrade = 0.0;
        if (grades != null && grades.length > 0)  {
            for (int elem: grades) {
                averageGrade += elem;
            }
            averageGrade /= grades.length;
        }
        return averageGrade;
    }

    // метод возвращающий признак того, что студент отличник
    public boolean isExellentStudent () {
        boolean result = true;
        if (grades.length == 0) {
            result = false;
        } else {
            for (int elem: grades) {
                if (elem != 5) {
                    result = false;
                    break;
                };
            }
        }
        return result;
    }

    // метод позволялющий добавить оценки студенту
    public void addGrades (int ... grades) {
        if (grades.length == 0) {
            return;
        }
        for (int elem: grades) {
            if (elem < 2   || elem > 5) {
                throw new IllegalArgumentException("Оценки могут быть в диапазоне от 2 до 5, а передано значение: "  +
                        elem);
            }
        }
       int[] tempGrades = new int[this.grades.length + grades.length];
       for (int i = 0; i < this.grades.length; i++) {
           tempGrades[i] = this.grades[i];
       }
       for (int i = 0; i <  grades.length ; i++) {
           tempGrades[this.grades.length + i] = grades[i];
       }
       this.grades = tempGrades;
    }
}
