package by.pev.unit3_Strings;

public class Object4 {
    /*
    4.	С помощью функции копирования и операции конкатенации составить из частей слова “информатика” слово “торт”.
     */
    public static void copy(String text) {
        char[] newText = new char[4];
        text.getChars(7, 8, newText, 0);
        text.getChars(3, 5, newText, 1);
        text.getChars(7, 8, newText, 3);
        System.out.println(newText);
    }

    public static void main(String[] args) {
        copy("информатика");
    }
}
