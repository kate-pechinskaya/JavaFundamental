package by.pev.unit1;

public class CycleProgram6 {
    /* 6. Вывести на экран соответствий между символами и
    их численными обозначениями в памяти компьютера.*/
    public static void main(String[] args) {
        for (int i = 0; i <= 127; i++) {
            System.out.println(i + " " + (char) i);
        }
    }
}
