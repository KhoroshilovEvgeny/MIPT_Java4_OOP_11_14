import java.util.Objects;

public class Person {
    final String surname;  // Фамилия
    final String name;   // Имя
    final String patronymic;  // Отчество

    // в задании 1.4.5 для конструкторов предлагается при указании параметров использовать
    // последовательность ИФО (имя-фамилия-отчество) вместо устоявшейся в умах ФИО (фамилия-имя-отчество)
    // Не согласен как ИФО, реализовал как ФИО.

    // конструктор  на случай когда есть три параметра: фамилия, имя личное и отчество
    public Person(String surname, String name, String patronymic) {
        if(
                ( (surname != null) && !(surname.isBlank()) ) ||
                ( (name != null) && !(name.isBlank()) ) ||
                ((patronymic != null) && !(patronymic.isBlank()))
        ) {
            this.surname = surname;
            this.name = name;
            this.patronymic = patronymic;
        } else {
            throw new IllegalArgumentException("При создании личности необходимости указывать хотя бы один из трех " +
                    "аргуметов: Фамилия, Имя, Отчество. В данном случае все аргументы либо null, либо пустая строка.");
        }

    }

    // конструктор на случай, когда есть только имя личное
    public Person(String name) {
        this("",name,"");
    }

    // конструктор на случай, когда есть фамилия и имя личное
    public Person(String surname, String name) {
        this(surname,name,"");
    }

    public Person(Person another) {
        this(another.surname, another.name, another.patronymic);
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
