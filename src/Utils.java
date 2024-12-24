public class Utils {


    // метод, который добавляет к строке в конце пробел, если строка не нулевой длины
    public  static String addSpaceIfLengthNotZero (String str) {
        if (str.length() > 0) {
            str += " ";
        }
        return  str;
    }
}
