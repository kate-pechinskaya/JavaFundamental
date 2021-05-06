package by.pev.unit3_Strings;

public class Object2 {
    /*
    2.	В строке вставить после каждого символа 'a' символ 'b'.
     */
    public static void changer(String a) {
        String regex = "([a]+)";
        String replacement = "$1b";
        System.out.println(a.replaceAll(regex, replacement));
    }

    public static void main(String[] args) {
        changer("tell me about it"); //tell me abbout it
    }
}
