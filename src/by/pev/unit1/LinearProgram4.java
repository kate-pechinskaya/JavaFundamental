package by.pev.unit1;

public class LinearProgram4 {
    /* 4. Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях).
     Поменять местами дробную и целую части числа и вывести полученное значение числа.*/
    public static void main(String[] args) {
        double R = 123.456;
        double a = Math.round(R);
        double b = Math.round((R - a) * 1000);
        System.out.println((int) b + "." + (int) a);
    }
}
