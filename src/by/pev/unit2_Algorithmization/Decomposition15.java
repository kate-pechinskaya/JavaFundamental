package by.pev.unit2_Algorithmization;

public class Decomposition15 {
    /*15.	Найти все натуральные n-значные числа, цифры в которых образуют строго возрастающую
     последовательность (например, 1234, 5789). Для решения задачи использовать
      декомпозицию. */
    public static int enterN(int n) {
        int[] array = new int[10000];
        for (int i = 0; i < 10000; i++) {
            array[i] = i;
            String lenght = Integer.toString(i);
            if (lenght.length() == n)
                for (int j = 0; i < n; j++) {//длинна
//                    if()//скорей всего ещё фор для нахождения max(n) и сравнивания с мин
                }
        }
        return array.length;
    }

    public static void main(String[] args) {
        enterN(4);
    }
}
