import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the desired number of cards");
        int qtyCards = scanner.nextInt();
        scanner.nextLine();
        System.out.println(qtyCards);
        String[] terms = new String[qtyCards];
        String[] definitions = new String[qtyCards];
        boolean wrongAnswer = false;
        String term = null;
        String definition = null;

        for (int i = 0; i < qtyCards; i++) {
            int cardNumber = i + 1;
            System.out.println("The card #" + cardNumber + ":");
            term = scanner.nextLine();


            System.out.println("The definition of the card #" + cardNumber + ":");
            definition = scanner.nextLine();

            terms[i] = term;
            definitions[i] = definition;
        }

        int i = 0;
        while (i < qtyCards){
            System.out.println("Print de definition of \"" + terms[i] + "\":");
            String definitionByUser = scanner.nextLine();
            if(definitionByUser.equals(definitions[i])){
                System.out.println("Correct answer.");
            } else {
                System.out.println("Wrong answer. The correct one is \"" + definitions[i] + "\".");
            }
            i++;
        }

    }
}

