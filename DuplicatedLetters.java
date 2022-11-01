import java.util.Calendar;
import java.util.HashMap;
import java.util.Scanner;

public class DuplicatedLetters {
    public static void main(String[] args) {
        System.out.print("Introidu textul: ");
        Scanner input = new Scanner(System.in);
        String initialText = input.nextLine();
        int lengthText = initialText.length();
        HashMap<Character, Integer> duplicatedLetters = new HashMap<>();
        for (int i = 0; i < lengthText; i++) {
            char c=initialText.charAt(i);
            if(duplicatedLetters.containsKey(c) && (c>='a' && c<='z' || c>='A' && c<='Z')){
                int count = duplicatedLetters.get(c);
                duplicatedLetters.put(c, ++count);
            } else {
                duplicatedLetters.put(c, 1);
            }
        }
        System.out.println("Colectia de litere ce se intilnesc de mai multe ori: ");
        for(Character i : duplicatedLetters.keySet()){
            if(duplicatedLetters.get(i)>1) System.out.println(i+ " de "+ duplicatedLetters.get(i) + " ori.");
        }
    }
}
