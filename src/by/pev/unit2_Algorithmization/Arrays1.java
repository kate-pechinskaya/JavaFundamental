package by.pev.unit2_Algorithmization;

public class Arrays1 {

    /* 1.	В массив A [N] занесены натуральные числа.
     Найти сумму тех элементов, которые кратны данному К.*/
    public static void main(String[] args) {
        int[] numbers = {4, 5, 6, 7, 2, 4, 6, 3, 32, 43, 45, 23, 34, 45};
        int k = 3;
        int sum = 0;
        for (int number : numbers) {
            if (number % k == 0)
                sum += number;
        }
        System.out.println("Сумма элементов, кратных k: " + sum);
    }

}