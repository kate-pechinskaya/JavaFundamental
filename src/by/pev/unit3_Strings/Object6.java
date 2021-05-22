package by.pev.unit3_Strings;

public class Object6 {
    /*
    6.	Из заданной строки получить новую, повторив каждый символ дважды.
     */
    public static void newString(String old) {
        char[] newString = {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '} ;
        for (int i = 0; i < old.length()*2; i++) {
            newString[i] += old.charAt(i);
            newString[i+1] += old.charAt(i);
            i++;
        }
        System.out.println(newString);
    }

    public static void main(String[] args) {
        newString("abs s");
    }
}
