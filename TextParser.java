import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Count words
 * Given a text as input the program should output:
 * <p>
 * Words analyses:
 * 1. Total number of words - (numarul total de cuvinte separate prin spatiu)
 * 2. The amount of duplicated words - (cite cuvinte apar in text de 2 sau mai multe ori)
 * 3. The amount of occurrences for every word - (pentru fiecare cuvint de cite ori se intilneste in text)
 * 5. All palindrome words - (toate cuvintele palindrom)
 * 5. The longest word - (cel mai lung cuvint)
 * 6. The shortest word - (cel mai scurt cuvint)
 * <p>
 * Chars analyses:
 * 1. Total count of letters - (numarul de litere)
 * 2. The amount of duplicated letters - (numarul de litere care se intilnesc de 2 sau mai multe ori)
 * 3. The amount of occurrences for every letter  - (pentru fiecare litera de cite ori se intilneste in text)
 */

public class TextParser {
    private String text;

    public TextParser(String text) {
        this.text = text;
    }

    int getTotalNumberOfWords() {
        // TODO Total number of words - (numarul total de cuvinte separate prin spatiu)
        String[] words = text.split("\\s+");//expresie regulata a spatiului gol
        int countWords = words.length;
        return countWords;
    }

    List<String> getAmountOfDuplicatedWords() {
        // TODO The amount of duplicated words - (cite cuvinte apar in text de 2 sau mai multe ori)
        String[] words = text.split("\\s+");//expresie regulata a spatiului gol
        int countWords = words.length;
        int count = 0;
        List<String> duplicatedWord = new ArrayList<>();
        for (int i = 0; i < countWords; i++) {
            count = 1;
            for (int j = i + 1; j < countWords; j++) {
                if (words[i].equals(words[j])) {
                    count++;
                    words[j] = "0";
                }
            }
            if (words[i] != "0" && count > 1) duplicatedWord.add(words[i]);
        }
        if (duplicatedWord.size() > 1) return duplicatedWord;
        return null;
    }

    Map<String, Integer> getWordsOccurrences() {
        // TODO The amount of occurrences for every word -
        String[] words = text.split("\\s+");//expresie regulata a spatiului gol
        int countWords = words.length;
        int count = 0;
        HashMap<String, Integer> ocurrencesWord = new HashMap<String, Integer>();
        for (int i = 0; i < countWords; i++) {
            count = 1;
            for (int j = i + 1; j < countWords; j++) {
                if (words[i].equals(words[j])) {
                    count++;
                    words[j] = "0";
                }
            }
            if (words[i] != "0") ocurrencesWord.put(words[i], count);
        }

        return ocurrencesWord;
    }

    public static String reverseWord(String word) {
        String reverse = "";
        int length = word.length();
        for (int i = length - 1; i >= 0; i--) {
            reverse += word.charAt(i);
        }
        return reverse;
    }

    List<String> getPalindromes() {
        // TODO All palindrome words - (toate cuvintele palindrom)
        String[] words = text.split("\\s+");//expresie regulata a spatiului gol
        int countWords = words.length;
        List<String> palindromeWord = new ArrayList<>();
        for (int i = 0; i < countWords; i++) {
            if (words[i].equals(reverseWord(words[i]))) {
                palindromeWord.add(words[i]);
            }
        }
        return palindromeWord;
    }

    String getLongestWord() {
        // TODO The longest word - (cel mai lung cuvint)
        String[] words = text.split("\\s+");//expresie regulata a spatiului gol
        int countWords = words.length;
        int longest = words[0].length();
        int shortest = words[0].length();
        int lengthWord = 0;
        String longestWord = "";
        for (int i = 0; i < countWords; i++) {
            lengthWord = words[i].length();
            if (longest < lengthWord) {
                longest = lengthWord;
                longestWord = words[i];
            }
        }
        return longestWord;
    }

    String getShortestWord() {
        // TODO The shortest word - (cel mai scurt cuvint)
        String[] words = text.split("\\s+");//expresie regulata a spatiului gol
        int countWords = words.length;
        int longest = words[0].length();
        int shortest = words[0].length();
        int lengthWord = 0;
        String shortestWord = "";
        for (int i = 0; i < countWords; i++) {
            lengthWord = words[i].length();
            if (shortest > lengthWord) {
                shortest = lengthWord;
                shortestWord = words[i];
            }
        }
        return shortestWord;
    }

    int getCountOfNonEmptyChars() {
        // TODO Total count of letters - (numarul de litere)
        int lengthText = text.length();
        int countLetters = 0;
        for (int i = 0; i < lengthText; i++) {
            if (text.charAt(i) >= 'A' && text.charAt(i) <= 'Z' || text.charAt(i) >= 'a' && text.charAt(i) <= 'z')
                countLetters++;
        }
        return 0;
    }

    int getCountOfDuplicatedLetters() {
        // TODO The amount of duplicated letters - (numarul de litere care se intilnesc de 2 sau mai multe ori)
        int count = 0;
        for (Character i : getLettersOccurrences().keySet()) {
            if (getLettersOccurrences().get(i) > 1) count++;
        }

        return count;
    }

    HashMap<Character, Integer> getLettersOccurrences() {
        int lengthText = text.length();
        HashMap<Character, Integer> duplicatedLetters = new HashMap<>();
        for (int i = 0; i < lengthText; i++) {
            char c = text.charAt(i);
            if (duplicatedLetters.containsKey(c) && (c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z')) {
                int count = duplicatedLetters.get(c);
                duplicatedLetters.put(c, ++count);
            } else {
                duplicatedLetters.put(c, 1);
            }
        }
        return duplicatedLetters;
    }
}