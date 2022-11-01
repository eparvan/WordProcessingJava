import java.util.Scanner;

public class CountLetters {
    public static void main(String[] args) {
        System.out.print("Introidu textul: ");
        Scanner input = new Scanner(System.in);
        String initialText = input.nextLine();
        int lengthText = initialText.length();
        int countLetters=0;
        for (int i = 0; i < lengthText; i++) {
            if (initialText.charAt(i) >='A' && initialText.charAt(i)<='Z' || initialText.charAt(i)>='a' && initialText.charAt(i)<='z')
                countLetters++;
        }
        System.out.println("Numarul de litere: " + countLetters);
    }
}
