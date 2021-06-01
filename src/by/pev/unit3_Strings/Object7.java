package by.pev.unit3_Strings;

public class Object7 {
    /*
    7.	Вводится строка. Требуется удалить из нее повторяющиеся символы и все пробелы.
     Например, если было введено "abc cde def", то должно быть выведено "abcdef".
     */
    public static void main(String[] args) {
        String old = "abc cde def";
        String result = new StringBuilder(old).reverse().toString();

        System.out.println(result);

    }
}
