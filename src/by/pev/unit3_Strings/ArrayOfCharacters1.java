package by.pev.unit3_Strings;

public class ArrayOfCharacters1 {
    /*
    1.	Дан массив названий переменных в camelCase. Преобразовать названия в snake_case.
     */

    public static void changer(String a) {
        String regex = "([A-Z][a-z]+)";
        String replacement = "$1_";
        System.out.println(a.replaceAll(regex, replacement));
    }

    public static void main(String[] args) {
        changer("GoToShop"); //Go_To_Shop_
    }
}
