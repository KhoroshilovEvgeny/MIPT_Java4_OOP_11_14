public class Utils {


    // метод, который добавляет к строке в конце пробел, если строка не нулевой длины
    public  static String addSpaceIfLengthNotZero (String str) {
        if (str.length() > 0) {
            str += " ";
        }
        return  str;
    }

    // метод для вычисления наибольшего общего делителя (НОД или Greatest Common Divisor
    public static int gcd(int a, int b) {
        int t;
        while (b != 0) {
            t = b;
            b = a % b;
            a = t;
        }
        return a;
    }

}
