package by.pev.unit3_Strings;

public class Object10 {
    /*
    10.	Строка X состоит из нескольких предложений, каждое из которых кончается точкой,
    восклицательным или вопросительным знаком. Определить количество предложений в строке X.
     */
    public static void main(String[] args) {
        String x = "adcaawc. aawefawe! cakjdk.";
        int count = 0;
        for (int i = 0; i < x.length(); i++) {
            char c = x.charAt(i);
            if (String.valueOf(c).matches("^[.!?]+$")) {
                count++;
            }
        }
        System.out.println("в строке x: " + count + " предложений");
    }
}
