import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PalindromeWords {
    public static String reverseWord(String word){
        String reverse="";
        int length = word.length();
        for(int i=length-1; i>=0; i--){
            reverse+=word.charAt(i);
        }
        return reverse;
    }
    public static void main(String[] args) {
        System.out.print("Introidu textul: ");
        Scanner input = new Scanner(System.in);
        String intialText = input.nextLine();
        String[] words = intialText.split("\\s+");//expresie regulata a spatiului gol
        int countWords = words.length;
        List<String> palindromeWord = new ArrayList<>();
        for( int i=0; i < countWords; i++) {
                if (words[i].equals(reverseWord(words[i]))) {
                    palindromeWord.add(words[i]);
                }
        }
        System.out.println("Cuvinte palindroame: " + palindromeWord);
    }
}
