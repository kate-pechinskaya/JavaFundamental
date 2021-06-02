package by.pev.unit3_Strings;


import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class RegularExpressions1 {
    /*
    1.	Cоздать приложение, разбирающее текст (текст хранится в строке) и позволяющее выполнять
    с текстом три различных операции: отсортировать абзацы по количеству предложений;
    в каждом предложении отсортировать слова по длине; отсортировать лексемы в предложении
    по убыванию количества вхождений заданного символа, а в случае равенства – по алфавиту.
     */
    public static void main(String[] args) {
        String test = "Лемуры существенно различаются по размерам, массе и внешнему виду. Так, некоторые карликовые лемуры весят всего 30 г, тогда как среди индри встречаются особи, достигающие 10 кг, а вымершие виды бывали значительно крупнее. Общим признаком являются выдающиеся вперёд резцы и клыки нижней челюсти, а также удлинённый коготь на втором пальце задних лап.\n" +
                "Лемурообразные встречаются только на Мадагаскаре и на Коморских островах. Название «лемуры» происходит от мифических древнеримских «лемуров», синонима лярв. Вероятно, это обусловлено ночным образом жизни большинства лемуров и их крупными глазами.\n" +
                "Оценка времени разделения лориобразных и лемурообразных колеблется от консервативных 50—53 млн лет назад до 80 млн л. н.\n" +
                "Лемуры дожили до настоящих дней благодаря изоляции Мадагаскара, поскольку высшие приматы не смогли попасть на остров. Разнообразие лемуров здесь объясняется тем, что они заняли все экологические ниши, потенциально пригодные для обезьян, тогда как лориобразные в Африке и Азии занимают только свои экологические ниши";

        sortLexemsInSentences(test, 'a');
        sortLexByChar(test, 'a');
        sortBySentencesCount(test);

    }

    private static String sortLexemsInSentences(String text, char c) {
        String[] sentences = text.split("[!.?\n]");
        StringBuilder result = new StringBuilder();
        for (String sentence : sentences) {
            result.append(sortLexByChar(sentence, c)).append(".");
        }
        return result.toString();
    }

    private static String sortLexByChar(String sentence, char c) {
        String[] lexems = sentence.split("[,:;]");
        StringBuilder result = new StringBuilder();
        Arrays.sort(lexems, Collections.reverseOrder((o1, o2) -> {
            if (getCharCount(o1, c).equals(getCharCount(o2, c))) {
                return o1.compareTo(o2);
            }
            return getCharCount(o1, c).compareTo(getCharCount(o2, c));
        }));
        for (String lex : lexems) {
            result.append(lex).append(" ");
        }
        return result.toString();
    }

    private static String sortBySentencesCount(String test) {
        String[] paragraphs = test.split("\n");
        StringBuilder result = new StringBuilder();
        Arrays.sort(paragraphs, Comparator.comparing(RegularExpressions1::getSentencesCount));
        for (String paragraph : paragraphs) {
            result.append(paragraph).append("\n");
        }
        return result.toString();
    }

    private static Integer getCharCount(String s, char c) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                count++;
            }
        }
        return count;
    }

    private static Integer getSentencesCount(String s) {
        return s.split("[.!?]").length;
    }

}
