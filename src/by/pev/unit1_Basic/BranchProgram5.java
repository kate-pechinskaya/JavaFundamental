package by.pev.unit1_Basic;

public class BranchProgram5 {
    /*5. Вычислить значение функции:
     F(x)=  x^(2)-3x +9  если x<=3;
            1/(x^(3)+6)  если x>3; */
    public static void main(String[] args) {
        double x = 2.0;
        double result = 0;
        if (x <= 3) {
            result = (x * x) - 3 * x + 9;
        } else if (x > 3) {
            result = 1 / ((x * x * x) + 6);
        }
        System.out.println(result);
    }
}
