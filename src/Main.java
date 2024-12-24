import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static ArrayList<Department> departments = new ArrayList<Department>();
    public static void main(String[] args) {
        /*  1.1.1 Точка координат
        Необходимо создать три точки с разными координатами и вывести на экран их текстовое представление.
         */

        Point point1 = new Point(11, 12);
        Point point2 = new Point(21, 22);
        Point point3 = new Point(31, 32);

        System.out.println(point1.toString());
        System.out.println(point2.toString());
        System.out.println(point3.toString());

        /* 1.1.2 Человек
         Необходимо создать и вывести на экран текстовое представление трех людей
         */
        Human human1 = new Human("", "Клеопатра", "", 152);
        Human human2 = new Human("Пушкин", "", "", 167);
        Human human3 = new Human("", "Александр", "", 189);

        System.out.println(human1);
        System.out.println(human2);
        System.out.println(human3);

        /*1.1.3 Имена. Создайте сущность Имя, которая описывается тремя параметрами
        •	Фамилия: строка
        •	Личное имя: строка
        •	Отчество: строка
         */
        Person person1 = new Person("", "Клеопатра", "");
        Person person2 = new Person("Пушкин","Александр","Сергеевич" );
        Person person3 = new Person( "Маяковский", "Владимир", "");

        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);

        /* 1.1.4 Время.
        Создайте сущность Время, которое будет описывать текущее время суток в 24-х часовом формате.
        Время описывается числом секунд, прошедшим с начала суток.
        Время может быть приведено к текстовой форме следующего формата: “ЧЧ:ММ:СС”.
         */
        TimeInSeconds t1 = new TimeInSeconds();
        t1.seconds = 12000;

        TimeInSeconds t2 = new TimeInSeconds();
        t2.seconds = 91800;

        TimeInSeconds t3 = new TimeInSeconds();
        t3.seconds = 10;

        TimeInSeconds t4 = new TimeInSeconds();
        t4.seconds = 10000;

        TimeInSeconds t5 = new TimeInSeconds();
        t5.seconds = 100000;

        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
        System.out.println(t4);
        System.out.println(t5);

        /*1.1.5 Дом. Создайте сущность Дом, которая описывается одним параметром:
            - Количество этажей: целое число
          У Дома можно запросить текстовую форму, которое имеет представление вида “дом с N этажами”, где N это число.
          Гарантировать правильное окончание фразы, в зависимости от количества этажей. С
          оздать и вывести на экран дома с 1, 5, 23 этажами
         */
        House house1 = new House(1);
        House house2 = new House(2);
        House house3 = new House(3);


        System.out.println(house1.toString());
        System.out.println(house2.toString());
        System.out.println(house3.toString());

        /*
        1.2.1 Прямая Линия. Создайте сущность Линия, расположенную на двумерной плоскости, которая описывается:
        •	Координата начала: Точка
        •	Координата конца: Точка
        •	Может возвращать текстовое представление вида “Линия от {X1;Y1} до {X2;Y2}”
        Для указания координат нужно использовать сущность Точка, разработанную в примере 1.1.1.

         */

        // 1.Линия 1 с началом в т. {1;3} и концом в т.{23;8}.
        Point point21 = new Point(1, 3);
        Point point22 = new Point(23, 8);

        Line line1 = new Line(point21, point22);
        System.out.println("\n" + line1);

        // 2.Линия 2, горизонтальная, на высоте 10, от точки 5 до точки 25.
        Point point23 = new Point(5, 10);
        Point point24 = new Point(25, 10);

        Line line2 = new Line(point23, point24);
        System.out.println(line2);

        /* 3.Линия 3, которая начинается всегда там же где начинается линия 1, и заканчивается всегда там же,
         где заканчивается линия 2. Таким образом, если положение первой или второй линии меняется,
         то меняется и третья линия.
        */
        Line line3 = new Line(line1.point1, line2.point2);
        System.out.println(line3);

        /*
          4.	После создания всех трех объектов измените координаты первой и второй линий, причем сделайте это
          таким образом, чтобы положение третьей линии соответствовало требованиям пункта 3.
         */
        line1.point1.x = 101;
        line1.point1.y = 103;

        line2.point2.x = 125;
        line2.point2.y = 110;
        System.out.println(line3);

        /*
        5.	Измените координаты первой линии так, чтобы при этом не изменились, координаты третьей линии.
        */

        line1.point2.x = 401;
        line1.point2.y = 403;
        System.out.println(line3);

        /*
        1.2.2 Человек с именем. Ранее нами был реализован сущностью Человек (1.1.2), в котором присутствовало поле
        для указания имени, задававшееся строкой. Измените тип этого поля таким образом, чтобы оно задавалось
        сущностью Имя из задачи 1.1.3.
         */

        Human human4 = new Human();
        human4.person = person1; // здесь использую экземпляр сущности "Имя" из задачи 1.1.3 (строки 47)
        human4.height = 152;

        Human human5 = new Human();
        human5.person = person2; // здесь использую экземпляр сущности "Имя" из задачи 1.1.3 (строка 49)
        human5.height= 167;

        Human human6 = new Human();
        human6.person = person3; // здесь использую экземпляр сущности "Имя" из задачи 1.1.3 (строка 51)
        human6.height= 189;

        System.out.println(human4);
        System.out.println(human5);
        System.out.println(human6);

        /*
        1.2.3 Человек с родителем. Измените сущность Человек из задачи 1.2.2 добавив ему возможность
         задавать третий параметр: Отец, где Отец — это тоже Человек.
         */
        // Создал человека Чудов Иван
        Person person7 = new Person("Чудов", "Иван", "");
        Human human7 = new Human();
        human7.person= person7;

        // Создал человека Чудов Петр
        Person person8 = new Person("Чудов", "Петр", "");
        Human human8 = new Human();
        human8.person= person8;

        // Создал человека Борис
        Person person9 = new Person("", "Борис", "");
        Human human9 = new Human();
        human9.person= person9;

        // Сделал Ивана отцом Петра
        human8.father = person7;

        // Сделал Петра отцом Бориса
        human9.father = person8;

        System.out.println(human7);
        System.out.println(human8);
        System.out.println(human9);


        /*
        1.2.4 Сотрудники и отделы. Создайте сущность Сотрудник, которая описывается:
            •	Имя: строка
            •	Отдел: включает название (строка) и начальника (Сотрудник)

         */


        departments.add(new Department("IT"));

        // Создал сотрудника Петрова
        Person person4 = new Person("Петров", "", "");
        Employee employee1 = new Employee(person4, departments.get(0));


        // Создал сотрудника Козлова
        Person person5 = new Person("Козлов", "", "");
        Employee employee2 = new Employee(person5, departments.get(0));


        // Создал сотрудника Сидорова
        Person person6 = new Person("Сидоров", "", "");
        Employee employee3 = new Employee(person6, departments.get(0));


        // Сделал Козлова начальником отдела
        departments.get(0).head = employee2.person;

        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);

        // Создал сотрудника Пушкина без указания отдела в котором он работает
        Employee employee4 = new Employee(person2);
        employee4.person = person2;
        System.out.println(employee4);

        // создал департамент без указания начальника и указал, что Пушкин работает в новом отделе
        departments.add(new Department("Обучения падаванов"));
        employee4.department = departments.get(1);
        System.out.println(employee4);

        // создал еще один департамент, у которого еще не придумали название, но начальника уже назначили.
        // Пушкина перевели в новый отдел
        departments.add(new Department());
        departments.get(2).head = person3;
        employee4.department = departments.get(2);
        System.out.println(employee4);
        System.out.println("------------");

        // Пушкина назначили начальником отдела, в котором он работает
        departments.get(2).head = employee4.person;
        System.out.println(employee4);

        // Пушкин придумал название для отдела, в котором он начальник
        departments.get(2).name = "Генерации багов";
        System.out.println(employee4);


        // -------------------- Задачи из блока 1.3 "Массивы" ----------------------------
        /*
        1.3.1 Студент. Создайте сущность Студент, которая описывается:
            •	Имя: строка
            •	Оценки: массив целых чисел.
            •	Может возвращать текстовое представление вида “Имя: [оценка1, оценка2,…,оценкаN]”
         */

        // создал студента Васю
        Student student1 = new Student("", "Вася", "", new int[]{3, 4, 5});

        // создал студента Петю, у которого в оценках ссылка не свой массив оценок, а на массив оценок Васи.
        // Соответственно изменение оценок одного из студеносто (Петя или Вася) автоматически меняет оценки
        // второго студента.
        Student student2 = new Student("","Петя", "", student1.grades);


        System.out.println("\nОценки обоих студентов до изменения оценок одно из них");
        System.out.println(student1);
        System.out.println(student2);

        student1.grades[0] = 5;

        System.out.println("\nОценки обоих студентов после изменения оценок одного из них");
        System.out.println(student1);
        System.out.println(student2);

        Student student3 = new Student("", "Андрей", "", student1.grades.clone());
        System.out.println("\nОценки Петя и Васи в до изменения оценок одно из них");
        System.out.println(student1);
        System.out.println(student3);

        student3.grades[0] = 4;
        System.out.println("\nОценки Петя и Васи в до изменения оценок Васи");
        System.out.println(student1);
        System.out.println(student3);

         /*
        1.3.2 Ломаная линия. Создайте сущность Ломаная, которая будет представлять собой ломаную линию
         */
        Point point31 = new Point(1,5);
        Point point32 = new Point(2,8);
        Point point33 = new Point(5,3);

        Polyline polyline1 = new Polyline(point31, point32, point33);
        System.out.println("\n"+ polyline1);

        Point point34 = new Point(2,-5);
        Point point35 = new Point(4,-8);

        Polyline polyline2 = new Polyline(point31, point34, point35, point33);
        System.out.println(polyline2);

        System.out.println("сдвинул координаты одной точки, и сразу в обоих ломанных линиях изменилась первая точка");
        point31.x = 101;
        point31.y = 105;
        System.out.println(polyline1);
        System.out.println(polyline2);


        /*
        1.3.3. Города. Создайте сущность Город, которая будет представлять собой точку на карте со следующими характеристиками:
            •	Название города
            •	Набор путей к следующим городам, где путь представляет собой сочетание Города и стоимости поездки в него.

         */
        Town townA = new Town("A", new Route("F",1),  new Route("D", 6));
        //Town townB = new Town("B", new Route[0]);
        Town townB = new Town("B", new Route("C", 3));
        Town townC = new Town("C", new Route("B", 3),  new Route("D", 4));
        Town townD = new Town("D", new Route("A", 6),  new Route("C", 4),
                new Route("E", 2));
        Town townE = new Town("E", new Route("F", 2));
        Town townF = new Town("F", new Route("B", 1),  new Route("E", 4));

        System.out.println("\n" + townA);
        System.out.println("\n" + townB);
        System.out.println("\n" + townC);
        System.out.println("\n" + townD);
        System.out.println("\n" + townE);
        System.out.println("\n" + townF);

        /*
            1.3.4. Сотрудники и отделы. Измените решение, полученное в задаче 1.2.4 таким образом,
            чтобы имея ссылку на сотрудника, можно было бы узнать список всех сотрудников этого отдела.
         */

        System.out.println(employee2.printAllColleagues());

        // -------------------- Задачи из блока 1.4 "Конструкторы" ----------------------------

        /*
        1.4.1. Ставим Точку. Измените сущность Точка из задачи 1.1.1 В соответствии с новыми
        требованиями создать объект Точки можно только путем указания обеих координат: X и Y.
         */
        System.out.println("\n задачи болка 1.4 Конструкторы \n");

        Point point41 = new Point(3,5);
        System.out.println(point41);

        Point point42 = new Point(25,6);
        System.out.println(point42);

        Point point43 = new Point(7,8);
        System.out.println(point43);


        /*
         1.4.2 Рисуем Линию. Измените сущность Линия из задачи 1.2.1. Необходимо уметь создавать Линии указывая следующие комбинации параметров:
            •	Точку начала и Точку конца (Точки из задачи 1.4.1)
            •	Четыре числа, соответствующие координатам (x1, y1, x2, y2)
         */

        Line line41 = new Line(1, 3, 23, 8);
        Line line42 = new Line(5, 10, 25, 10);
        Line line43 = new Line(line41.point1, line42.point2);

        System.out.println(line41);
        System.out.println(line42);
        System.out.println(line43);


        /*
             1.4.3 Рисуем Ломаную линию. Измените сущность Ломаная из задачи 1.3.2. Необходимо уметь создавать
             Ломаные линии указывая следующие комбинации параметров:
                •	Без параметров
                •	С указанием набора Точек
         */

        Polyline polyline51 = new Polyline();
        Polyline polyline52 = new Polyline(point41, point42, point23);
        Polyline polyline53 = new Polyline(3, 5, 25, 6, 7 ,8);

        System.out.println(polyline51);
        System.out.println(polyline52);
        System.out.println(polyline53);

        /*
        1.4.4 Строим Дом. Измените сущность Дом из задачи 1.1.5. Новые требования включают:
            •	Создание дома может осуществляться только путем указания количества этажей.
            •	После создания дому нельзя изменить количество этажей.
         */

        House house4 = new House(2);
        House house5 = new House(35);
        House house6 = new House(91);

        System.out.println(house4);
        System.out.println(house5);
        System.out.println(house6);

        /* ну в итоге не получилось показать, что для переменных с модификатором final нельзя менять значение
        try {
            house6.floor = 45;
        } catch (IOException e) {
            System.out.println(e.getMessage());

        }
        */


        /*
        1.4.5 Даем Имена. Измените сущность Имя из задачи 1.1.3. Необходимо уметь создавать Имена указывая
         следующие комбинации параметров:
            •	Только Личное имя
            •	Личное имя и Фамилию.
            •	Личное имя, Фамилию и Отчество.
        */
        Person person11 = new Person("Клеопатра");
        Person person12 = new Person("Пушкин","Александр", "Сергеевич");
        Person person13 = new Person("Маяковский","Владимир");
        Person person14 = new Person("Бонифатьевич","Христофор");

        System.out.println(person11);
        System.out.println(person12);
        System.out.println(person13);
        System.out.println(person14);

        /*
        1.4.6 Создаем Человека. Измените сущность Человек из задачи 1.2.3. Необходимо уметь создавать человека указывая следующие комбинации параметров:
            •	Только имя в виде строки (оно будет считаться за Личное имя).
            •	Только имя в виде объекта типа Имя (из задачи 1.4.5)
            •	Отца и имя в виде строки
            •	Отца и имя в виде объекта типа Имя

         */

        // 1.	Человека с именем Лев (в виде строки)
        Human human21 = new Human("Лев");
        // 2.	Человека с именем Пушкин Сергей (как Имя) и отцом Львом (предыдущий Человек)
        Human human22 = new Human(new Person("Пушкин", "Сергей"), human21.person);
        //3.	Человека с именем Александр (в виде строки) и отцом Сергеем (предыдущий Человек)
        Human human23 = new Human("Александр", human22.person);
        System.out.println("\n" + human21);
        System.out.println(human22);
        System.out.println(human23);


        /*
        1.4.7 Зачисляем Студента. Измените сущность Студент из задачи 1.3.1. Необходимо уметь создавать Студента указывая следующие комбинации параметров:
            •	Только имя (строковое)
            •	Имя (строковое) и набор оценок
        Оба способа должны быть реализованы единственным конструктором
         */
        System.out.println("\nТеперь создаем студентов конструкторами с неполным набором параметров");
        Student student21 = new Student("Вася", new int[] {3, 4, 5});
        Student student22 = new Student("Максим");
        System.out.println(student21);
        System.out.println(student22);

        /*
        1.4.8 Основываем Города. Измените сущность Город из задачи 1.3.3. Необходимо уметь создавать Город указывая следующие комбинации параметров:
            •	Только название
            •	Название и набор путей в другие города
         */
        System.out.println("\nСоздаем города при помощи различных конструкторов");
        Town town11 = new Town("Простоквашино");
        Town town12 = new Town("Цветочный город", new Route("Лютиково", 4),
                new Route("Ромашкино", 5), new Route("Кактусово", 3));
        System.out.println("\n" + town11);
        System.out.println("\n" + town12);
    }

}