import java.util.Scanner;

public class GeneralTextParser {
    public static void main(String[] args) {
        System.out.print("Introdu textul: ");
        Scanner input = new Scanner(System.in);
        String intialText = input.nextLine();
        TextParser textParser = new TextParser(intialText);
        //1
        int countWords = textParser.getTotalNumberOfWords();
        System.out.println("Numarul de cuvinte: " + countWords);

        //2
        if (textParser.getAmountOfDuplicatedWords().size() > 1)
            System.out.println("Cuvinte ce se repeta sunt :" +
                    textParser.getAmountOfDuplicatedWords().size() + " \n" +
                    textParser.getAmountOfDuplicatedWords().toString());

        //3
        System.out.println("\n" + textParser.getWordsOccurrences());
        //4
        System.out.println("Cuvinte palindroame: " + textParser.getPalindromes());
        //5
        System.out.println("Cel mai lung cuvint: " + textParser.getLongestWord());
        //6
        System.out.println("Cel mai scurt cuvint: " + textParser.getShortestWord());
        //7
        System.out.println("Numarul de litere: " + textParser.getCountOfNonEmptyChars());
        //8 - numarul de litere care se intilnesc de 2 sau mai multe ori
        System.out.println("Numarul de litere ce se intilnesc de mai multe ori:" + textParser.getCountOfDuplicatedLetters());
        //9
        System.out.println("Colectia de litere ce se intilnesc de mai multe ori: ");
        for (Character i : textParser.getLettersOccurrences().keySet()) {
            if (textParser.getLettersOccurrences().get(i) > 1)
                System.out.println(i + " de " + textParser.getLettersOccurrences().get(i) + " ori.");
        }
    }
}
