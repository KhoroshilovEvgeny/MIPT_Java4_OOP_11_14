public class Human {
    private Person person;
    private final Human father;
    int height;

    public Human(Person person, Human father, int height) {
        this.person = person;
        this.father = father;
        this.height = height;
    }


    public Human(String surname, String name, String patronymic, int height) {
        this(new Person(surname, name, patronymic), null, height);
    }

    public Human(String surname, String name, String patronymic) {
        this(new Person(surname, name, patronymic), null, 0);
    }


    // конструктор на случай - Только имя в виде строки (оно будет считаться за Личное имя).
    /*  теперь он не нужен, потому что отца обязательно указывать
    public Human(String name) {
        this(new Person(name),null, 0);
    }
    */

    // конструктор на случай - Только имя в виде объекта типа Имя (из задачи 1.4.5)
    /*  теперь он не нужен, потому что отца обязательно указывать
    public Human(Person person) {
        this(person, null, 0);
    }
    */

    // конструктор на случай - Только имя в виде объекта типа Имя (из задачи 1.4.5)
    /*  теперь он не нужен, потому что отца обязательно указывать
    public Human(Person person, int height) {
        this(person, null, height);
    }
     */

    // конструктор на случай - Отца и имя в виде строки
    public Human(String name, Human father) {
        this(new Person(name), father, 0);
    }

    // конструктор на случай - Отца и имя в виде объекта типа Имя
    public Human(Person person, Human father) {
        this(person, father,0);
    }

    /*
    такая реализация метода toString была до задачи 1.2.3 "Человек с родителем"

    @Override
    public String toString() {
        return person + ", рост: " + height;
    }
    */


    public Person getPerson() {
        return new Person(this.person);
    }

    public Human getFather() {
        return new Human(this.getPerson(), this.father);
    }

    //  реализация метода toString для задачи 1.2.3 "Человек с родителем"
    @Override
    public String toString() {
        String result = "";
        // если для человека указано его Фамилия то выводим на печать его Фамилию
        if (person != null && person.surname.length() > 0) {
            result += person.surname;
        }   // иначе если у кого-то из предков указана указан Фамилия,то указываем её
        else  {
            result += this.getPersonSurnameFromAncestors();
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
        else if (father != null && father.person.name.length() > 0) {
            // если фамилия или имя уже включены в результирующую строку, то надо добавить пробел
            result = Utils.addSpaceIfLengthNotZero(result);
            // а затем добавить само отчество
            result = result + father.person.name + "ович" ;
        }
        return result;
    }

    public String getPersonName() {
        return person.name;
    }

    public String getPersonPatronymic() {
        return person.patronymic;
    }
    public String getPersonSurname() {
        return person.surname;
    }

    public String getPersonSurnameFromAncestors() {
        String surname = "";
        if ( (this.person.surname == null  || this.person.surname.isBlank()) && this.father != null ) {
            Human ancestor = this.father;
            if (ancestor.getPersonSurname() != null && !ancestor.getPersonSurname().isBlank() )  {
                surname = ancestor.getPersonSurname();
            } else {
                while (ancestor.father !=null) {
                    ancestor = ancestor.father;
                    if (ancestor.getPersonSurname() != null && !ancestor.getPersonSurname().isBlank() ) {
                        surname = ancestor.getPersonSurname();
                        break;
                    }
                }
            }
        } else {
            surname = this.getPersonSurname();
        }
        return surname;
    }
}
