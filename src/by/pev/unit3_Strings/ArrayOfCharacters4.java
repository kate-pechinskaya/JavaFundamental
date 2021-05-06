package by.pev.unit3_Strings;

import java.sql.Array;

public class ArrayOfCharacters4 {
    /*
4.	В строке найти количество чисел.
     */
    public static int check(String a) {
        int numbers = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == '0' || a.charAt(i) == '1' || a.charAt(i) == '2' || a.charAt(i) == '3' || a.charAt(i) == '4'
                    || a.charAt(i) == '5' || a.charAt(i) == '6' || a.charAt(i) == '7' || a.charAt(i) == '8' || a.charAt(i) == '9') {
                numbers++;
            }
        }
        return numbers;
    }

    public static void main(String[] args) {
        System.out.println(check("7jhvj1bjh,6jhvj8jh0v,8"));
    } //=4
}
