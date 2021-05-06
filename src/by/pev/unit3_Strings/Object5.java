package by.pev.unit3_Strings;

public class Object5 {
    /*
    5.	Подсчитать, сколько раз среди символов заданной строки встречается буква “а”.
     */
    public static void collect(String text) {
        int collect = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == 'a' || text.charAt(i) == 'а' || text.charAt(i) == 'A'
                    || text.charAt(i) == 'А') collect++;
        }
        System.out.println("Буква 'a' встречается " + collect + " раз");
    }

    public static void main(String[] args) {
        collect("tell me about it");
        collect("расскажи мне о себе");
    }
}
