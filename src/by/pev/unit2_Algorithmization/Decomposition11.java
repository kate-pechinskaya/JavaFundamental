package by.pev.unit2_Algorithmization;

public class Decomposition11 {
    /*11.	Написать метод(методы), определяющий,
     в каком из данных двух чисел больше цифр. */
    public static void numbers(int a, int b) {
        String aa = Integer.toString(a);
        String bb = Integer.toString(b);
        if (aa.length() > bb.length())
            System.out.println("в первом числе " + a + " больше цифр, чем во втором " + b);
        else if (bb.length() > aa.length())
            System.out.println("во втором числе " + b + " больше цифр чем в первом " + a);
    }

    public static void main(String[] args) {
        numbers(156, 1114);
    }
}
