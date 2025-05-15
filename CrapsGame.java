import java.util.Random;

public class CrapsGame {
    public static void main(String[] args) {
        Random rand = new Random();

        int die1 = rollDie(rand);
        int die2 = rollDie(rand);
        int sum = die1 + die2;

        System.out.println("You rolled " + die1 + " + " + die2 + " = " + sum);

        if (sum == 2 || sum == 3 || sum == 12) {
            System.out.println("You lose");
        } else if (sum == 7 || sum == 11) {
            System.out.println("You win");
        } else {
            int point = sum;
            System.out.println("point is " + point);

            while (true) {
                die1 = rollDie(rand);
                die2 = rollDie(rand);
                sum = die1 + die2;

                System.out.println("You rolled " + die1 + " + " + die2 + " = " + sum);

                if (sum == point) {
                    System.out.println("You win");
                    break;
                } else if (sum == 7) {
                    System.out.println("You lose");
                    break;
                }
            }
        }
    }

    // Simulates rolling a six-sided die
    public static int rollDie(Random rand) {
        return rand.nextInt(6) + 1;
    }
}
