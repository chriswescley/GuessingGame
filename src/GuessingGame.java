import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numberToGuess = random.nextInt(100) + 1;
        int numberOfGuesses = 0;
        boolean hasWon = false;

        System.out.println("Estou pensando num número de 0 a 100. Adivinha?");

        while (!hasWon) {
            int guess = scanner.nextInt();
            numberOfGuesses++;

            if (guess == numberToGuess) {
                System.out.println("BOA! Você acertou o número em " + numberOfGuesses + " chutes.");
                hasWon = true;
            } else if (guess < numberToGuess) {
                System.out.println("Muito baixo. Tenta de novo.");
            } else {
                System.out.println("Muito alto. Tenta de novo.");
            }
        }

        scanner.close();
    }
}
