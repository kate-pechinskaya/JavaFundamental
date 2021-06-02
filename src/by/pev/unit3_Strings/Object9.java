package by.pev.unit3_Strings;

import static java.lang.Character.isLowerCase;
import static java.lang.Character.isUpperCase;

public class Object9 {
    /*
    9.	Посчитать количество строчных (маленьких) и прописных (больших) букв в введенной строке. Учитывать только английские буквы.
     */
    public static void main(String[] args) {
        String test = "TeLl me ABouT ITЮ";
        int countLower = 0;
        int countUpper = 0;
        for (int i = 0; i < test.length(); i++) {
            char c = test.charAt(i);
            if (String.valueOf(c).matches("^[a-zA-Z]+$")) {
                if (isLowerCase(c)) {
                    countLower++;
                } else if (isUpperCase(c)) {
                    countUpper++;
                }
            }
        }
        System.out.println("количество строчных букв: " + countLower + ", количество прописных букв: " + countUpper);
    }
}
