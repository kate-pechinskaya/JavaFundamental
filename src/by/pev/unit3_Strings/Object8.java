package by.pev.unit3_Strings;

public class Object8 {
    /*
    8.	Вводится строка слов, разделенных пробелами.
    Найти самое длинное слово и вывести его на экран.
    Случай, когда самых длинных слов может быть несколько, не обрабатывать.
     */
    public static void main(String[] args) {
        System.out.println("Самое длинное слово: " + max("tell me abouttttt it"));
    }

    public static String max(String s) {
        String[] words = s.split(" ");
        String result = "";
        for (String word : words) {
            if (word.length() > result.length())
                result = word;
        }
        return result;
    }
}
