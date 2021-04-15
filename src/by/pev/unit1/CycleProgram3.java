package by.pev.unit1;

public class CycleProgram3 {
    /* 3. Найти сумму квадратов первых ста чисел.*/
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i < 100; i++) {
            count = count + (i * i);
        }
        System.out.println(count);
    }
}