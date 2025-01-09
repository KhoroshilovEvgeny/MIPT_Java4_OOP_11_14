public class Main {
    public static void main(String[] args) {
        /*  1.1.1 Точка координат
        Необходимо создать три точки с разными координатами и вывести на экран их текстовое представление.
         */
        System.out.println("Тестирование 1.1.1 Точка координат");
        Point point1 = new Point(11, 12);
        Point point2 = new Point(21, 22);
        Point point3 = new Point(31, 32);

        System.out.println(point1);
        System.out.println(point2);
        System.out.println(point3);
        System.out.println();


        /* 1.1.2 Человек
         Необходимо создать и вывести на экран текстовое представление трех людей
         */
        System.out.println("Тестирование  1.1.2 Человек");
        Human human1 = new Human("", "Клеопатра", "", 152);
        Human human2 = new Human("Пушкин", "", "", 167);
        Human human3 = new Human("", "Александр", "", 189);

        System.out.println(human1);
        System.out.println(human2);
        System.out.println(human3);
        System.out.println();

        /*1.1.3 Имена. Создайте сущность Имя, которая описывается тремя параметрами
        •	Фамилия: строка
        •	Личное имя: строка
        •	Отчество: строка
         */
        System.out.println("Тестирование  1.1.3 Имена. Создайте сущность Имя");
        Person person1 = new Person("", "Клеопатра", "");
        Person person2 = new Person("Пушкин", "Александр", "Сергеевич");
        Person person3 = new Person("Маяковский", "Владимир", "");

        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);
        System.out.println();

        /* 1.1.4 Время.
        Создайте сущность Время, которое будет описывать текущее время суток в 24-х часовом формате.
        Время описывается числом секунд, прошедшим с начала суток.
        Время может быть приведено к текстовой форме следующего формата: “ЧЧ:ММ:СС”.
         */
        System.out.println("Тестирование  1.1.4 Время");
        TimeInSeconds t1 = new TimeInSeconds(12000);
        TimeInSeconds t2 = new TimeInSeconds(91800);
        TimeInSeconds t3 = new TimeInSeconds(10);
        TimeInSeconds t4 = new TimeInSeconds(10000);
        TimeInSeconds t5 = new TimeInSeconds(100000);

        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
        System.out.println(t4);
        System.out.println(t5);
        System.out.println();

        /*1.1.5 Дом. Создайте сущность Дом, которая описывается одним параметром:
            - Количество этажей: целое число
          У Дома можно запросить текстовую форму, которое имеет представление вида “дом с N этажами”, где N это число.
          Гарантировать правильное окончание фразы, в зависимости от количества этажей. С
          оздать и вывести на экран дома с 1, 5, 23 этажами
         */
        System.out.println("Тестирование  1.1.5 Дом. Создайте сущность Дом");
        House house1 = new House(1);
        House house2 = new House(2);
        House house3 = new House(3);


        System.out.println(house1);
        System.out.println(house2);
        System.out.println(house3);
        System.out.println();

        /*
        1.2.1 Прямая Линия. Создайте сущность Линия, расположенную на двумерной плоскости, которая описывается:
        •	Координата начала: Точка
        •	Координата конца: Точка
        •	Может возвращать текстовое представление вида “Линия от {X1;Y1} до {X2;Y2}”
        Для указания координат нужно использовать сущность Точка, разработанную в примере 1.1.1.
         */
        System.out.println("Тестирование  1.2.1 Прямая Линия. Создайте сущность Линия");
        // 1.Линия 1 с началом в т. {1;3} и концом в т.{23;8}.
        Point point21 = new Point(1, 3);
        Point point22 = new Point(23, 8);

        Line line1 = new Line(point21, point22);
        System.out.println(line1);

        // 2.Линия 2, горизонтальная, на высоте 10, от точки 5 до точки 25.
        Point point23 = new Point(5, 10);
        Point point24 = new Point(25, 10);

        Line line2 = new Line(point23, point24);
        System.out.println(line2);

        /* 3.Линия 3, которая начинается всегда там же где начинается линия 1, и заканчивается всегда там же,
         где заканчивается линия 2. Таким образом, если положение первой или второй линии меняется,
         то меняется и третья линия.
        */
        Line line3 = new Line(line1.getPoint1(), line2.getPoint2());
        System.out.println(line3);

        /*
          4.	После создания всех трех объектов измените координаты первой и второй линий, причем сделайте это
          таким образом, чтобы положение третьей линии соответствовало требованиям пункта 3.
         */

        /* после доработок в рамках 1.6.6 это не будет воспроизводиться, поскольку
        // добавили getter , setter и защитное копирование
        line1.point1.x = 101;
        line1.point1.y = 103;

        line2.point2.x = 125;
        line2.point2.y = 110;
        System.out.println(line3);
        */

        /*
        5.	Измените координаты первой линии так, чтобы при этом не изменились, координаты третьей линии.
        */

        /* так было до доработок в рамках 1.6.6
        line1.point2.x = 401;
        line1.point2.y = 403;
        */

        // так стало  после доработок в рамках 1.6.6
        line1.setPoint2(new Point(401,403));
        System.out.println(line3);
        System.out.println();

        /*
        1.2.2 Человек с именем. Ранее нами был реализован сущностью Человек (1.1.2), в котором присутствовало поле
        для указания имени, задававшееся строкой. Измените тип этого поля таким образом, чтобы оно задавалось
        сущностью Имя из задачи 1.1.3.
         */
        System.out.println("Тестирование  1.2.2 Человек с именем");
        // здесь использую экземпляр сущности "Имя" из задачи 1.1.3
        Human human4 = new Human(person1, null,152);

        // здесь использую экземпляр сущности "Имя" из задачи 1.1.3
        Human human5 = new Human(person2, null,167);

        // здесь использую экземпляр сущности "Имя" из задачи 1.1.3
        Human human6 = new Human(person3,null, 189);

        System.out.println(human4);
        System.out.println(human5);
        System.out.println(human6);
        System.out.println();

        /*
        1.2.3 Человек с родителем. Измените сущность Человек из задачи 1.2.2 добавив ему возможность
         задавать третий параметр: Отец, где Отец — это тоже Человек.
         */
        System.out.println("Тестирование  1.2.3 Человек с родителем");
        // Создал человека Чудов Иван
        Person person7 = new Person("Чудов", "Иван", "");
        Human human7 = new Human(person7, null);

        // Создал человека Чудов Петр +  Сделал Ивана отцом Петра
        Person person8 = new Person("Чудов", "Петр", "");
        Human human8 = new Human(person8, human7);

        // Создал человека Борис
        Person person9 = new Person("", "Борис", "");
        Human human9 = new Human(person9, human8);

        // теперь отца можно указывать только при создании
        // human8.father = human7;

        // теперь отца можно указывать только при создании
        //human9.father = human8;

        System.out.println(human7);
        System.out.println(human8);
        System.out.println(human9);
        System.out.println();


        /*
        1.2.4 Сотрудники и отделы. Создайте сущность Сотрудник, которая описывается:
            •	Имя: строка
            •	Отдел: включает название (строка) и начальника (Сотрудник)

         */

        System.out.println("Тестирование  1.2.4 Сотрудники и отделы");
        Department dep1 = new Department("IT");

        // Создал сотрудника Петрова
        Employee employee1 = new Employee("Петров", dep1);

        // Создал сотрудника Козлова
        Employee employee2 = new Employee("Козлов", dep1);


        // Создал сотрудника Сидорова
        Employee employee3 = new Employee("Сидоров", dep1);


        // Сделал Козлова начальником отдела
        dep1.setHead(employee2);

        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);

        // Создал сотрудника Пушкина без указания отдела в котором он работает
        Employee employee4 = new Employee("Пушкин");
        System.out.println(employee4);

        // создал департамент без указания начальника и указал, что Пушкин работает в новом отделе
        Department dep2 = new Department("Обучения падаванов");
        employee4.setDepartment(dep2);
        System.out.println(employee4);

        // создал еще один департамент, у которого еще не придумали название, но начальника уже назначили.
        // Пушкина перевели в новый отдел
        Employee employee5 = new Employee("Булочкин");
        Department dep3 = new Department(employee5);
        employee4.setDepartment(dep3);
        System.out.println(employee4);

        // Пушкина назначили начальником отдела, в котором он работает
        dep3.setHead(employee4);
        System.out.println(employee4);

        // Пушкин придумал название для отдела, в котором он начальник
        dep3.setNameDepartment("Генерации багов");
        System.out.println(employee4);
        System.out.println();


        // -------------------- Задачи из блока 1.3 "Массивы" ----------------------------
        /*
        1.3.1 Студент. Создайте сущность Студент, которая описывается:
            •	Имя: строка
            •	Оценки: массив целых чисел.
            •	Может возвращать текстовое представление вида “Имя: [оценка1, оценка2,…,оценкаN]”
         */
        System.out.println("Тестирование   1.3.1 Студент");
        // создал студента Васю
        Student student1 = new Student("", "Вася", "", 3, 4, 5);

        // создал студента Петю, у которого в оценках ссылка не свой массив оценок, а на массив оценок Васи.
        // Соответственно изменение оценок одного из студеносто (Петя или Вася) автоматически меняет оценки
        // второго студента.
        Student student2 = new Student("","Петя", "", student1.getGrades());


        System.out.println("\nОценки обоих студентов до изменения оценок одно из них");
        System.out.println(student1);
        System.out.println(student2);

        student1.getGrades()[0] = 5;

        System.out.println("\nОценки обоих студентов после изменения оценок одного из них");
        System.out.println(student1);
        System.out.println(student2);

        Student student3 = new Student("", "Андрей", "", student1.getGrades());
        System.out.println("\nОценки Васи и Андрея до изменения оценок Васи");
        System.out.println(student1);
        System.out.println(student3);

        student3.getGrades()[0] = 4;
        System.out.println("\nОценки Васи и Андрея после изменения оценок Васи");
        System.out.println(student1);
        System.out.println(student3);

         /*
        1.3.2 Ломаная линия. Создайте сущность Ломаная, которая будет представлять собой ломаную линию
         */
        System.out.println("\nТестирование   1.3.2 Ломаная линия");
        Point point31 = new Point(1,5);
        Point point32 = new Point(2,8);
        Point point33 = new Point(5,3);

        Polyline polyline1 = new Polyline(point31, point32, point33);
        System.out.println(polyline1);

        Point point34 = new Point(2,-5);
        Point point35 = new Point(4,-8);

        Polyline polyline2 = new Polyline(point31, point34, point35, point33);
        System.out.println(polyline2);

        System.out.println("сдвинул координаты первой точки, и сразу в обоих ломанных линиях изменилась первая точка");
        point31.x = 101;
        point31.y = 105;
        System.out.println(polyline1);
        System.out.println(polyline2);


        /*
        1.3.3. Города. Создайте сущность Город, которая будет представлять собой точку на карте со следующими характеристиками:
            •	Название города
            •	Набор путей к следующим городам, где путь представляет собой сочетание Города и стоимости поездки в него.

         */
        System.out.println("\nТестирование   1.3.3. Города");
        Town townA = new Town("A",
                new Route(new Town("B"),5),
                new Route(new Town("F"),1),
                new Route(new Town("D"), 6));
        Town townB = new Town("B",
                new Route(new Town("A"), 5),
                new Route(new Town("C"), 3));
        Town townC = new Town("C",
                new Route(new Town("B"), 3),
                new Route(new Town("D"), 4));
        Town townD = new Town("D",
                new Route(new Town("A"), 6),
                new Route(new Town("C"), 4),
                new Route(new Town("E"), 2));
        Town townE = new Town("E",
                new Route(new Town("F"), 2));
        Town townF = new Town("F",
                new Route(new Town("B"), 1),
                new Route(new Town("E"), 2));

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

       // В класс Department добавлено поле-массив Employee [] employees для хранения списка сотрудников отдела;

        // -------------------- Задачи из блока 1.4 "Конструкторы" ----------------------------

        /*
        1.4.1. Ставим Точку. Измените сущность Точка из задачи 1.1.1 В соответствии с новыми
        требованиями создать объект Точки можно только путем указания обеих координат: X и Y.
         */
        System.out.println("\n задачи блока 1.4 Конструкторы \n");
        System.out.println("\nТестирование   1.4.1. Ставим Точку");

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
        System.out.println("\nТестирование   1.4.2 Рисуем Линию");
        Line line41 = new Line(1, 3, 23, 8);
        Line line42 = new Line(5, 10, 25, 10);
        Line line43 = new Line(line41.getPoint1(), line42.getPoint2());

        System.out.println(line41);
        System.out.println(line42);
        System.out.println(line43);


        /*
             1.4.3 Рисуем Ломаную линию. Измените сущность Ломаная из задачи 1.3.2. Необходимо уметь создавать
             Ломаные линии указывая следующие комбинации параметров:
                •	Без параметров
                •	С указанием набора Точек
         */
        System.out.println("\nТестирование   1.4.3 Рисуем Ломаную линию");
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
        System.out.println("\nТестирование   1.4.4 Строим Дом");
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
        System.out.println("\nТестирование   1.4.5 Даем Имена");
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
        System.out.println("\nТестирование   1.4.6 Создаем Человека");
        // 1.	Человека с именем Лев (в виде строки)
        Human human21 = new Human("Лев",null);
        // 2.	Человека с именем Пушкин Сергей (как Имя) и отцом Львом (предыдущий Человек)
        Human human22 = new Human(new Person("Пушкин", "Сергей"), human21);
        //3.	Человека с именем Александр (в виде строки) и отцом Сергеем (предыдущий Человек)
        Human human23 = new Human("Александр", human22);
        System.out.println(human21);
        System.out.println(human22);
        System.out.println(human23);


        /*
        1.4.7 Зачисляем Студента. Измените сущность Студент из задачи 1.3.1. Необходимо уметь создавать Студента указывая следующие комбинации параметров:
            •	Только имя (строковое)
            •	Имя (строковое) и набор оценок
        Оба способа должны быть реализованы единственным конструктором
         */
        System.out.println("\nТестирование    1.4.7 Зачисляем Студента");
        System.out.println("Теперь создаем студентов конструкторами с неполным набором параметров");
        Student student21 = new Student("Вася", new int[] {3, 4, 5});
        Student student22 = new Student("Максим");
        Student student23 = new Student("Игнат", 5,4,5);
        System.out.println(student21);
        System.out.println(student22);
        System.out.println(student23);

        /*
        1.4.8 Основываем Города. Измените сущность Город из задачи 1.3.3. Необходимо уметь создавать Город указывая следующие комбинации параметров:
            •	Только название
            •	Название и набор путей в другие города
         */
        System.out.println("\nТестирование    1.4.8 Основываем Города");
        System.out.println("Создаем города при помощи различных конструкторов");
        Town town11 = new Town("Простоквашино");
        Town town12 = new Town("Цветочный город", new Route(new Town("Лютиково"), 4),
                new Route(new Town("Ромашкино"), 5), new Route(new Town("Кактусово"), 3));
        System.out.println("\n" + town11);
        System.out.println("\n" + town12);

        /*
        1.5.1 Пистолет стреляет. Создайте сущность Пистолет
        */
        System.out.println("\nТестирование    1.5.1 Пистолет стреляет");
        Pistol pistol1 = new Pistol(10);  // показал, что есть конструктор, создающий пистолет без указания патронов
        System.out.println(pistol1);

        Pistol pistol2 = new Pistol(3,7);
        System.out.println(pistol2);
        pistol2.shoot();
        pistol2.shoot();
        pistol2.shoot();
        pistol2.shoot();
        pistol2.shoot();
        System.out.println(pistol2);



        /*
        1.5.2 Кот мяукает
         */
        System.out.println("\nТестирование    1.5.2 Кот мяукает");
        Cat barsik = new Cat("Барсик");
        barsik.meow();
        barsik.meow(1);
        barsik.meow(3);
        System.out.println(barsik);

        /*
        1.5.3 Длина Линии
         */
        System.out.println("\nТестирование     1.5.3 Длина Линии");
        Line line51 = new Line(1, 1, 10, 15);
        System.out.println(line51 + " имеет целочисленную длину " + line51.intDistance());


        /*
        1.5.4. Отец моего отца
         */
        System.out.println("\nТестирование      1.5.4. Отец моего отца");
        Human praded = new Human("Фефелов", "Геннадий", "Васильевич");
        Human ded = new Human("Виктор", praded);
        Human otec = new Human("Борис", ded);
        Human son = new Human("Андрей", otec);
        System.out.println(son);

        /*
        1.5.5. Дроби
         */
        System.out.println("\nТестирование      1.5.5. Дроби");
        // сумма двух дробей
        Fraction fr1 = new Fraction(3, 5);
        Fraction fr2 = new Fraction(4, 7);
        System.out.println(fr1 + " + " + fr2 + " = " + fr1.sum(fr2));
        Fraction fr3 = new Fraction(40, 7);
        Fraction fr4 = new Fraction(-5, 7);
        System.out.println(fr3 + " + " + fr4 + " = " + fr3.sum(fr4));
        // сумма дроби и числа
        Fraction fr41 = new Fraction(3);
        System.out.println(fr3 + " + " + fr41 + " = " + fr3.sum(fr41));
        int tempValue = 4;
        System.out.println(fr3 + " + " + tempValue + " = " + fr3.sum(tempValue));

        // вычитание дроби из дроби
        Fraction fr5 = new Fraction(-40, -7);
        Fraction fr6 = new Fraction(5, 7);
        System.out.println(fr5 + " - " + fr6 + " = " + fr5.minus(fr6));
        // вычитание целого числа из дроби
        int subtrahend = 1;
        System.out.println(fr5 + " - " + subtrahend + " = " + fr5.minus(subtrahend));

        Fraction fr7 = new Fraction(40, 7);
        Fraction fr8 = new Fraction(-2);
        System.out.println(fr7 + " + " + fr8 + " = " + fr7.sum(fr8));

        Fraction fr9 = new Fraction(1, 3);
        Fraction fr10 = new Fraction(2, 3);
        System.out.println(fr9 + " * " + fr10 + " = " + fr9.multiplication(fr10));
        System.out.println(fr9 + " / " + fr10 + " = " + fr9.div(fr10));
        int tempNum = 5;

        // вычисляем выражение f1.sum(f2).div(f3).minus(5)
        System.out.println("f1.sum(f2).div(f3).minus(" + tempNum + ") = (((" + fr1 + " + " + fr2 + ") / " + fr3 +
                ") - " +  tempNum + ") = " + fr1.sum(fr2).div(fr3).minus(new Fraction(tempNum)));

        /*
        1.5.6 Студент отличник
         */
        System.out.println("\nТестирование    1.5.6 Студент отличник");
        Student student151 = new Student("Вася", 3, 4, 5, 4);
        Student student152 = new Student("Петя", 5, 5, 5, 5);
        // проверка методов "средний бал" и "отличник ли" на студенте Вася
        System.out.println("Средний бал студента " + student151.getPerson() + " составил "
                + student151.calculateAverageGrade());
        System.out.println("Студент " + student151.getPerson() + " является отличником: "
                + student151.isExellentStudent());
        // проверка методов "средний бал" и "отличник ли" на студенте Петя
        System.out.println("Средний бал студента " + student152.getPerson() + " составил "
                + student152.calculateAverageGrade());
        System.out.println("Студент " + student152.getPerson() + " является отличником: "
                + student152.isExellentStudent());

        /*
        1.5.7 Длина Ломаной.
         */
        System.out.println("\nТестирование     1.5.7 Длина Ломаной");
        System.out.println(polyline53);
        System.out.println("После добавления к ломанной четырех координат: 33, 11, 44 ,22");
        polyline53.add(33, 11, 44 ,22);
        System.out.println(polyline53);
        Point point51 = new Point(66, 46);
        Point point52 = new Point(77, 57);
        Point point53 = new Point(88, 68);
        System.out.println("После добавления к ломанной трех точек: "
                + "  "  + point51 + "  " +  point52 + "  " + point53);
        polyline53.add(point51, point52, point53);
        System.out.println(polyline53);


        Polyline polyline54 = new Polyline(new Point(1,5), new Point(2,8), new Point(5,3));
        System.out.println(polyline54 + " имеет длину " + polyline54.calculateLength());
        polyline54.add(new Point(5, 15), new Point(8, 10));
        System.out.println(polyline54 + " имеет длину " + polyline54.calculateLength());


        /*
        1.5.8 Квадрат
         */
        System.out.println("\nТестирование     1.5.8 Квадрат");
        Quadrate quadrate1 = new Quadrate(new Point(5, 23), 23);
        System.out.println(quadrate1);


        System.out.println(polyline54 + " имеет длину " + polyline54.calculateLength());
        polyline54.removeLastPoint();
        System.out.println(polyline54 + " имеет длину " + polyline54.calculateLength());
        polyline54.add(15,25);
        System.out.println(polyline54 + " имеет длину " + polyline54.calculateLength());

        // создам новую ломаную линию на основе квадрата, при этом ссылки (связь) с вершинами квадрата не сохраняется
        System.out.println("\nНа основе " + quadrate1 + " создали ломанную линию");
        Polyline polyline55  = quadrate1.polylineFromQuadrate();
        System.out.println(polyline55 + " имеет длину " + polyline55.calculateLength());
        System.out.println("\nПосле изменения у ломаной линии координат последней точки.");
        polyline55.removeLastPoint();
        polyline55.add(15,25);
        System.out.println(polyline55 + " имеет длину " + polyline55.calculateLength());
        System.out.println("При этом сам квадрат не изменился\n" + quadrate1);


        /*
        1.6.1 Дом над землей
         */
        System.out.println("\nТестирование     1.6.1 Квадрат");
        House house161 = new House(3);
        System.out.println(house161);
        House house162 = new House(1);
        System.out.println(house162);
        /* для этих домой выбрасывается исключение
        House house163 = new House(0);
        House house164 = new House(-1);
        */


        /*
        1.6.2 Непустые Имена
         */
        System.out.println("\nТестирование     1.6.2 Непустые Имена");
        Person person1621 = new Person("Виталий");
        System.out.println(person1621);
        Person person1622 = new Person("Сидоров","");
        System.out.println(person1622);
        /* этих личностей выбрасывается исключение
        Person person1623 = new Person("");
        System.out.println(person1623);
        Person person1624 = new Person("", null);
        System.out.println(person1624);
        Person person1625= new Person(null);
        System.out.println(person1625);
        */


        /*
        1.6.3 Сторона Квадрата
         */
        System.out.println("\nТестирование     1.6.3 Сторона Квадрата");
        Quadrate quadrate1631 = new Quadrate(1,1,7);
        System.out.println(quadrate1631);
        quadrate1631.setSideOfSquare(8);
        System.out.println("Теперь сторону квадрата изменил на значение 8");
        System.out.println(quadrate1631);
        /* для этих попыток изменить сторону на нулевое или отрицательное значение выбрасывается исключение
        quadrate1631.setSideOfSquare(0);
        quadrate1631.setSideOfSquare(-1);
        */

        /* для этих попыток создать квадрат с нулевым или отрицательным значением стороны выбрасывается исключение
        Quadrate quadrate1632 = new Quadrate(1,1,0);
        Quadrate quadrate1633 = new Quadrate(1,1,-1);
         */


        /*
        1.6.4 Дроби
         */
        System.out.println("\nТестирование      1.6.4 Дроби");
        // конструктор умеет корректно обрабатывать отрицательный аргумент передаваемый для знаменталя
        Fraction fraction1641 = new Fraction(2, -7);
        System.out.println(fraction1641);
        Fraction fraction1642 = new Fraction(-3, -8);
        System.out.println(fraction1642);
        /* при попытке в знаменателе указать 0 (ноль) выбрасывается исключение
        Fraction fraction1643 = new Fraction(4, 0);
         */

        /* изменить дробь нельзя:
        - установлено final для числителя и знаменателя
        - модификатор доступа для числителя и знаменателя установлен private и отсутствуют сеттеры
         */


        /*
        1.6.5 Перезарядка Пистолета
         */
        System.out.println("\nТестирование      1.6.5 Перезарядка Пистолета");
        Pistol pistol3 = new Pistol(7,9);
        System.out.println("У данного пистолета максимальная ёмкость магазина: " + pistol3.getMaxBullets());
        System.out.println("У данного пистолета фактически заряжено патронов: " + pistol3.getBullets());
        System.out.println(pistol3);
        pistol3.reloadBullets(0); // ноль патронов в соответствии с условиями задачи можно добавлять
        System.out.println("После добавки 0 патронов");
        System.out.println(pistol3);



        int unnecessaryBullets = pistol3.reloadBullets(7); // лишние патроны
        System.out.println("В результате попытки добавить 7 патронов получили");
        System.out.println(pistol3);
        System.out.println("и были возвращены лишние патроны: " + unnecessaryBullets);

        /*
        unnecessaryBullets = pistol3.reloadBullets(-1); // будет выброшено исключение
        */

        System.out.println("В результаты разрядки пистолета было возвращено патронов: " + pistol3.returnAllBullets());
        System.out.println(pistol3);

        System.out.println("Пистолет полностью разряжен: " + pistol3.isEmpty() );

        System.out.println("\n прохождение финального теста по задаче 1.6.5");
        // Создайте пистолет вместимостью 7
        Pistol pistol4 = new Pistol(0,7);
        System.out.println(pistol4);
        // зарядите три патрона
        pistol4.reloadBullets(3);
        System.out.println(pistol4);
        // выстрелите из него пять раз
        pistol4.shoot();
        pistol4.shoot();
        pistol4.shoot();
        pistol4.shoot();
        pistol4.shoot();
        //затем зарядите в него 8 патронов
        pistol4.reloadBullets(8);
        //выстрелите еще 2 раза
        pistol4.shoot();
        pistol4.shoot();
        //разрядите его
        pistol4.returnAllBullets();
        //сделайте контрольный выстрел.
        pistol4.shoot();
        // Если все выполнено верно, то должно быть выведено:
        // Бах! Бах! Бах! Клац! Клац! Бах! Бах! Клац!



        /*
        1.6.6 Отдельные линии
         */
        System.out.println("\nТестирование      1.6.6 Отдельные линии");
        Point point1661 = new Point(1,2);
        Point point1662 = new Point(3,4);
        Line line1661 = new Line(point1661, point1662);
        Line line1662 = new Line(point1661, point1662);
        System.out.println("Первая линия " + line1661);
        System.out.println("Вторая линия " + line1662);
        point1661 = new Point(5,6);
        System.out.println("Изменил координаты точки, которая служила началом обоих линий. Линии не изменил," +
                        "благодаря защитному копированию");
        System.out.println("Первая линия " + line1661);
        System.out.println("Вторая линия " + line1662);
        line1661.setPoint1(5,6);
        System.out.println("Изменил координаты ПЕРВОЙ точки ПЕРВОЙ линии, Координаты второй линии не изменились." +
                " Благодаря защитному копированию");
        System.out.println("Первая линия " + line1661);
        System.out.println("Вторая линия " + line1662);

        line1661.setPoint2(7,8);
        System.out.println("Изменил координаты ВТОРОЙ точки ПЕРВОЙ линии, Координаты второй линии не изменились." +
                " Благодаря защитному копированию");
        System.out.println("Первая линия " + line1661);
        System.out.println("Вторая линия " + line1662);
        System.out.println("Для второй линии координаты начала линии " + line1662.getPoint1() +
                " , координаты конца линии " + line1662.getPoint2());

        /*
        1.6.7 Родители остаются
         */
        System.out.println("\nТестирование      1.6.7 Родители остаются");
        System.out.println("У " + son + " отцом является " + son.getFather());
        // изменить отца нельзя потому что это поле final и нет сеттеров, задать отца возможно только в конструкторах
        // у каждого человека можно получить имя
        System.out.println("У " + son + " можно отдельно получить имя (как объект ФИО) " + son.getPerson() );


        /*
        1.6.8 Диапазон оценок
         */
        System.out.println("\nТестирование      1.6.8 Диапазон оценок");
        Student student1681 = new Student("Никита",3);
        /* на этом студенте будет выброшено исключение
          Student student1682 = new Student("Никита",3, 1, 7);
         */
        System.out.println(student1681);
        student1681.addGrades(2,3,3);
        System.out.println(student1681);
        /* а таких уже оцено не добавить, потому что будет выброшено исключение на оценку 6
            student1681.addGrades(2,3,6);
         */
        // еще добавил оценок
        student1681.addGrades(4,4,5,5);
        System.out.println(student1681);

        int [] gradesForHack = student1681.getGrades();
        gradesForHack[0] = 5;
        // в списке полученных оценок повысил до 5-ки первую оценку, но она у студента не поменялась, потому
        // что защитное копирование оценок
        System.out.println(student1681);



        /*
        1.6.9 Дороги.
         */
        System.out.println("\nТестирование      1.6.9 Дороги");
        System.out.println("\n" + townA);
        townA.addRoute(new Route(new Town("R"),15) );
        townA.addRoute(new Route(new Town("F"),15) );
        townA.addRoute(new Route(new Town("F"),25) );
        System.out.println("\n" + townA);

        townA.addAllRoutes(new Route(new Town("K"), 1),
                new Route(new Town("L"), 2),
                new Route(new Town("L"), 9),
                new Route(new Town("F"), 17)
        );
        System.out.println("\n" + townA);

        townA.removeRoute(new Route(new Town("L"), 4));
        System.out.println("\n" + townA);

        townA.removeAllRoutes(new Route(new Town("P"), 11),
                new Route(new Town("D"), 2),
                new Route(new Town("D"), 9),
                new Route(new Town("F"), 17)
        );
        System.out.println("\n" + townA);


        /*
        1.6.10 Начальник отдела
         */
        System.out.println("\nТестирование      1.6.10 Начальник отдела");
        Employee employee32 = new Employee("Сидоров", dep1);
        Employee employee33 = new Employee(employee32);
        employee33.setDepartment(employee32.getDepartment());
        employee32.setDepartment(dep2);
        employee33.setName("Березиков");
        System.out.println(employee32);
        System.out.println(employee33);
        Employee employee34 = employee33.getDepartment().getHead();
        System.out.println(employee34);
        employee34.setName("Бобарыкин");
        System.out.println(employee34);

        Employee employee35 = employee32.getDepartment().getHead();
        System.out.println(employee35);

        System.out.println("\n\n-----------------------------------------");
        Employee employee101 = new Employee("Васильев");
        Department dep10 = new Department("Кадров");
        Department dep11 = new Department("Диспетчерский", employee101);


        System.out.println(dep10);
        System.out.println(dep11);

        System.out.println("---------- этап №1 --------");
        dep10.setHead(employee101);
        System.out.println(dep10);
        System.out.println(dep11);

    }




}