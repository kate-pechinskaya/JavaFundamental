package by.pev.unit1_Basic;

public class BranchProgram2 {
    /* 2. Найти max{min(a, b), min(c, d)}*/
    public static void main(String[] args) {
        int a = 6;
        int b = 4;
        int c = 5;
        int d = 3;
        System.out.println(Math.max(Math.min(a, b), Math.min(c, d)));
    }
}
