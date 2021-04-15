package by.pev.unit1;

public class CycleProgram2 {
    /*2. Вычислить значения функции на отрезке [а,b] c шагом h:
    y =  x, x>2;
        -x, x<=2; */
    public static void main(String[] args) {
        int a = 0;
        int b = 5;
        double x;
        double y;
        double dx = 0.5;
        for (x = a; x <= b; x += dx) {
            System.out.print("x= " + x + ",");
            if (x > 2) {
                y = x;
                System.out.println("y =" + y);
            } else if (x <= 2) {
                y = -x;
                System.out.println("y =" + y);
            }
        }
    }
}