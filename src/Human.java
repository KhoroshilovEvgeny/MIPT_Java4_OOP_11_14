public class Human {
    Person person = new Person();
    Person father = new Person();
    int height;

    public Human(Person person, Person father, int height) {
        this.person = person;
        this.father = father;
        this.height = height;
    }


    public Human() {
        this(new Person(), new Person(), 0);
    }

    public Human(String surname, String name, String patronymic, int height) {
        this(new Person(surname, name, patronymic), new Person(), height);
    }


    // конструктор на случай - Только имя в виде строки (оно будет считаться за Личное имя).
    public Human(String name) {
        this(new Person(name), new Person(), 0);
    }


    // конструктор на случай - Только имя в виде объекта типа Имя (из задачи 1.4.5)
    public Human(Person person) {
        this(person, new Person(), 0);
    }

    // конструктор на случай - Отца и имя в виде строки
    public Human(String name, Person father) {
        this(new Person(name), father, 0);
    }

    // конструктор на случай - Отца и имя в виде объекта типа Имя
    public Human(Person person, Person father) {
        this(person, father,0);
    }

    /*
    такая реализация метода toString была до задачи 1.2.3 "Человек с родителем"

    @Override
    public String toString() {
        return person + ", рост: " + height;
    }
    */

    //  реализация метода toString для задачи 1.2.3 "Человек с родителем"
    @Override
    public String toString() {
        String result = "";
        // если для человека указано его Фамилия то выводим на печать его Фамилию
        if (person != null && person.surname.length() > 0) {
            result += person.surname;
        }   // иначе если есть отец с Фамилией выводим фамилию отца
        else if (father != null && father.surname.length() > 0) {
            result += father.surname;
        }
        // если у человека есть имя то выводим на печать его имя
        if (person != null && person.name.length() > 0) {
            // если фамилия уже включена в результирующую строку, то надо добавить пробел
            result = Utils.addSpaceIfLengthNotZero(result);
            result += person.name;
        }
        // если у человека есть отчество то выводим на печать его отчество
        if (person != null && person.patronymic.length() > 0) {
            // если фамилия или имя уже включены в результирующую строку, то надо добавить пробел
            result = Utils.addSpaceIfLengthNotZero(result);
            // а затем добавить само отчество
            result += person.patronymic;
        }
        // иначе при наличии отца с именем в качество отчетства используем имя отца с окончанием "-ович"
        else if (father != null && father.name.length() > 0) {
            // если фамилия или имя уже включены в результирующую строку, то надо добавить пробел
            result = Utils.addSpaceIfLengthNotZero(result);
            // а затем добавить само отчество
            result = result + father.name + "ович" ;
        }
        return result;
    }



}
