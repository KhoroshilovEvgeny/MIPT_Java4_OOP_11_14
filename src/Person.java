import java.util.Objects;

public class Person {
    String surname = "";  // Фамилия
    String name = "";   // Имя
    String patronymic = "";  // Отчество

    // в задании 1.4.5 для конструкторов предлагается при указании параметров использовать
    // последовательность ИФО (имя-фамилия-отчество) вместо устоявшейся в умах ФИО (фамилия-имя-отчество)
    // Не согласен как ИФО, реализовал как ФИО.

    // конструктор  на случай когда есть три параметра: фамилия, имя личное и отчество
    public Person(String surname, String name, String patronymic) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
    }

    // конструктор на случай личности без ФИО
    public Person() {
        this("", "", "");
    }

    // конструктор на случай, когда есть только имя личное
    public Person(String name) {
        this("",name,"");
    }

    // конструктор на случай, когда есть фамилия и имя личное
    public Person(String surname, String name) {
        this(surname,name,"");
    }

    @Override
    public String toString() {
        String result = this.surname;
        if (this.surname.length() > 0 && this.name.length() > 0) {
            result += " ";
        }
        result += this.name;
        if (result.length() > 0 && this.patronymic.length() > 0) {
            result += " ";
        }
        result += this.patronymic;
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(surname, person.surname) && Objects.equals(name, person.name)
                && Objects.equals(patronymic, person.patronymic);
    }

    @Override
    public int hashCode() {
        return Objects.hash(surname, name, patronymic);
    }



}
