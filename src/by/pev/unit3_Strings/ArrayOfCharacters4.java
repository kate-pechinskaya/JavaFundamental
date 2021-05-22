package by.pev.unit3_Strings;

import java.sql.Array;

public class ArrayOfCharacters4 {
    /*
4.	В строке найти количество чисел.
     */
    public static int check(String a) {
        int counter = 0;
        for (int i = 0; i < a.length(); i++) {
            if (Character.isDigit(a.charAt(i))) {
                counter++;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        System.out.println(check("7jhvj1bjh,6jhvj864jh0v,8"));
    } //=4
}
