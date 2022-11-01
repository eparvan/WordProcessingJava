import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LongestShortestWord {
    public static void main(String[] args) {
        System.out.print("Introidu textul: ");
        Scanner input = new Scanner(System.in);
        String intialText = input.nextLine();
        String[] words = intialText.split("\\s+");//expresie regulata a spatiului gol
        int countWords = words.length;
        int longest = words[0].length();
        int shortest = words[0].length();
        int lengthWord = 0;
        String longestWord = "";
        String shortestWord = "";
        for (int i = 0; i < countWords; i++) {
            lengthWord = words[i].length();
            if (longest < lengthWord) {
                longest = lengthWord;
                longestWord = words[i];
            }
            if (shortest > lengthWord) {
                shortest = lengthWord;
                shortestWord = words[i];
            }
        }
        System.out.println("Cel mai lung cuvint: " + longestWord);
        System.out.println("Cel mai scurt cuvint: " + shortestWord);
    }
}
