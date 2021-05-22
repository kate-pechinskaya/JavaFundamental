package by.pev.unit3_Strings;

public class Object1 {
    /*
    1.	Дан текст (строка). Найдите наибольшее количество подряд идущих пробелов в нем.
     */
    public static void main(String[] args) {
        String a = "   fgd   fdg      sfsdf   fdfs  ";
        a = a.trim();
        int counter = 0;
        int countMax = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == ' ') {
                counter++;
                if (a.charAt(i + 1) != ' ') {
                    if (countMax < counter) {
                        countMax = counter;
                    }
                    counter = 0;
                }
            }
        }
        System.out.println(countMax);
    }
}
