package by.pev.unit3_Strings;

public class Object6 {
    /*
    6.	Из заданной строки получить новую, повторив каждый символ дважды.
     */
    public static void newString(String s, String prefix) {
        StringBuilder prefixBuilder = new StringBuilder(prefix);
        while (!s.equals("")) {
            char c = s.charAt(0);
            prefixBuilder.append(c).append(c);
            s = s.substring(1);
        }
        prefix = prefixBuilder.toString();
        System.out.println(prefix + " ");
    }

    public static void main(String[] args) {
        newString("tell me about it", "");
    }
}