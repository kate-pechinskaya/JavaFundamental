package by.pev.unit3_Strings;

public class Object6 {
    /*
    6.	Из заданной строки получить новую, повторив каждый символ дважды.
     */
    public static void newString(String s, String prefix) {
        while (!s.equals("")) {
            char c = s.charAt(0);
            prefix += "" + c + c;
            s = s.substring(1);
        }
        System.out.println(prefix + " ");
    }

    public static void main(String[] args) {
        newString("tell me about it", "");
    }
}