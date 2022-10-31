import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NumberDuplicatedWord {
    public static void main(String[] args) {
        System.out.print("Introidu textul: ");
        Scanner input = new Scanner(System.in);
        String intialText = input.nextLine();
        String[] words = intialText.split("\\s+");//expresie regulata a spatiului gol
        int countWords = words.length;
        int count=0;
        List<String> duplicatedWord = new ArrayList<>();
        for( int i=0; i < countWords; i++) {
            count = 1;
            for (int j = i + 1; j < countWords; j++) {
                if (words[i].equals(words[j])) {
                    count++;
                    words[j] = "0";
                }
            }
            if (words[i] != "0" && count > 1) duplicatedWord.add(words[i]);
        }
        if ( duplicatedWord.size()>1) System.out.println("Cuvinte ce se repeta sunt :" +duplicatedWord.size() +" \n" +duplicatedWord.toString());
    }
}
