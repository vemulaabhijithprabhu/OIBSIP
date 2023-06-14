import java.util.*;


public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int secretNumber = random.nextInt(100) + 1; // Generate a random number between 1 and 100
        int attempts = 0;
        int guess = 0;
        double score = 100;
        
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("You have to chosen a number between 1 and 100. Try to guess it!");
        
        while (guess != secretNumber && attempts < 8) {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            attempts++;
            
            if (guess < secretNumber) {
                System.out.println("Too low! Try again.");
            } else if (guess > secretNumber) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
            }
            
        }
        if(attempts == 1 && guess == secretNumber){
                System.out.println("Great!.. you guessed in the first attempt");
            }
            else if(attempts > 8)
            {
                System.out.println("You lost the Game!... Try again  from Start");
            }
                score = 100 - attempts * 5;
            
                System.out.println("Your score is " + score);
        

        
        scanner.close();
    }
}

