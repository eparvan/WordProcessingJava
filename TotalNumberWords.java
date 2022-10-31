import java.util.Scanner;

public class TotalNumberWords {
   public static void main(String[] args) {
       System.out.print("Introidu textul: ");
       Scanner input = new Scanner(System.in);
       String intialText = input.nextLine();
       String[] words = intialText.split("\\s+");//expresie regulata a spatiului gol
       int countWords = words.length;
       System.out.println("Numarul de cuvinte: "+countWords);
    }
}
