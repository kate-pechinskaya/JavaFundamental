package by.pev.unit2_Algorithmization;

public class Arrays2 {
    /*2.	Дана последовательность действительных чисел а1 ,а2 ,..., ап.
     Заменить все ее члены, большие данного Z, этим числом.
     Подсчитать количество замен.*/
    public static void main(String[] args) {
        int n = 30;
        int z = 21;
        int count = 0;
        int[] array = new int[30];
        //заполнение массива
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int) (Math.random() * 30));
            System.out.print(array[i] + " ");
        }
        System.out.println();
        //замена
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 21) {
                array[i] = 21;
                count++;
            }
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("Количество замен:" + count);
    }
}

