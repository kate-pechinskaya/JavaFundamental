package by.pev.unit3_Strings;

public class ArrayOfCharacters3 {
    /*
    3.	В строке найти количество цифр.
     */
    public static void main(String[] args) {
        int counter = 0;
        String a = "ergser8sdfgs9dgs9";
        for (int i = 0; i < a.length(); i++) {
            if (Character.isDigit(a.charAt(i)))
                counter++;
        }
        System.out.println(counter);
    }


}
