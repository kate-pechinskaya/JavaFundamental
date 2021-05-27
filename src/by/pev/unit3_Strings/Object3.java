package by.pev.unit3_Strings;

public class Object3 {
    /*
    3.	Проверить, является ли заданное слово палиндромом.
     */
    public static void main(String[] args) {
        String straight = "топот";
        String back = new StringBuilder(straight).reverse().toString();
        if (back.equals(straight)) {
            System.out.println("слово " + straight + " - палиндром");
        } else System.out.println("слово " + straight + " - не палиндром");

    }
}
