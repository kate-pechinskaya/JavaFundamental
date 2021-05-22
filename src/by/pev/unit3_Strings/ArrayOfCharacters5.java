package by.pev.unit3_Strings;

public class ArrayOfCharacters5 {
    /*
    5.	Удалить в строке все лишние пробелы,
    то есть серии подряд идущих пробелов заменить на одиночные пробелы.
    Крайние пробелы в строке удалить.
     */
        public static void main(String[] args) {
            String a = "   fgd   fdg    sfsdf   fdfs  ";
            a = a.trim();
            StringBuilder builder = new StringBuilder(a);
            int counter = 0;
            for (int i = 0; i < a.length(); i++) {
                if (a.charAt(i) == ' ' && a.charAt(i + 1) == ' ') {
                    builder.deleteCharAt(i - counter);
                    counter++;
                }
            }
            System.out.println(builder.toString());
        }
}



