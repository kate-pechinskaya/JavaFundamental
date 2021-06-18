package by.pev.unit4_Classes.SimpleClass3;

public class Main {
    /* 3.	Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость (массив
     из пяти элементов). Создайте массив из десяти элементов такого типа. Добавьте возможность вывода фамилий
     и номеров групп студентов, имеющих оценки, равные только 9 или 10.
     */
    public static void main(String[] args) {
        Student Sergey = new Student("Шилов", "С.В.", 7023, new int[]{5, 6, 3, 10, 4});
        Student Max = new Student("Захаров", "М.И.", 7021, new int[]{6,6,4,7,5});
        Student Andrey = new Student("Попов", "А.К.", 7053, new int[]{7,5,7,9,4});
        Student Vitaya = new Student("Забыл", "В.У.", 7023, new int[]{5,8,6,3,7});
        Student Masha = new Student("Красковская", "М.С.", 7028, new int[]{8,5,7,3,6});
        Student Kate = new Student("Тарасевич", "К.В.", 7073, new int[]{7,4,8,3,7});
        Student Vlad = new Student("Шилов", "В.В.", 7021, new int[]{7,3,7,8,5});
        Student Anna = new Student("Филипович", "А.А.", 7027, new int[]{6,7,8,5,9});
        Student Kris = new Student("Жебелева", "К.А.", 7022, new int[]{5,8,4,8,4});
        Student Matveu = new Student("Августовский", "М.В.", 7020, new int[]{6,7,8,7,7});
    }
}
