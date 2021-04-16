package by.pev.unit1_Basic;

public class LinearProgram5 {
    /* 5. Дано натуральное число Т, которое представляет длительность
    прошедшего времени в секундах. Вывести данное значение длительности в часах,
     минутах и секундах в следующей форме:ННч ММмин SSc.*/
    public static void main(String[] args) {
        int t = 12345; //в сек
        int hour = t / 3600;
        int minute = (t % 3600) / 60;
        int second = (t % 3600) % 60;
        System.out.println(hour + "ч " + minute + "мин " + second + "с.");
    }
}
