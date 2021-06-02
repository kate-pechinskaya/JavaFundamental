package by.pev.unit3_Strings;

import static java.lang.String.valueOf;

public class Object7 {
    /*
    7.	Вводится строка. Требуется удалить из нее повторяющиеся символы и все пробелы.
     Например, если было введено "abc cde def", то должно быть выведено "abcdef".
     */
    public static void main(String[] args) {
        String old = "abc cde def";
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < old.length(); i++) {
            char c = old.charAt(i);
            if (result.indexOf(valueOf(c)) <= -1 && c != ' ') {
                result.append(c);
            }
        }
        System.out.println(result);
    }
}
