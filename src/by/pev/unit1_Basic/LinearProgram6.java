package by.pev.unit1_Basic;

public class LinearProgram6 {
    /* 6. Для данной области составить линейную программу, которая печатает true,
     если точка с координатами (х, у) принадлежит закрашенной области, и false —
     в противном случае:
               y
              ^
        0	0 |	0	0
		0	0 |	0	0
		0	0 |	0	0
		0	0 |	0	0
______________________________>x
0	0	0	0 |	0	0	0	0
0	0	0	0 |	0	0	0	0
0	0	0	0 |	0	0	0	0     */

    public static void main(String[] args) {
        int x = 0;
        int y = -1;
        if (((x >= -2 && x <= 2) && (y >= 0 && y <= 4)) || ((x >= -4 && x <= 4) && (y >= -3 && y <= 0)))
            System.out.println("true");
        else System.out.println("false");

    }

}
