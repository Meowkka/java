package startjava.Lesson_2.game;

import java.util.Random;
import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {
        System.out.print("1 игрок, введите своё имя: ");
        Scanner scan = new Scanner(System.in);  
        Player player1 = new Player(scan.nextLine());
        System.out.print("2 игрок, введите своё имя: ");
        Player player2 = new Player(scan.nextLine());
        
        Random random = new Random();

        int compNumber = random.nextInt(100);
        System.out.println("Компьютер сгенерировал число");

        GuessNumber guessNumber = new GuessNumber();

        boolean isGuess = false;

        int step = 1;

        while (!isGuess) {
            if(step%2 == 0){
                System.out.print("2 игрок, вводите число: ");
                player2.setNum(scan.nextInt());
                isGuess = guessNumber.isGuessedNumber(compNumber,player2.getNum());
            }else{
                System.out.print("1 игрок, вводите число: ");
                player1.setNum(scan.nextInt());
                isGuess = guessNumber.isGuessedNumber(compNumber,player1.getNum());
            }

            step++;
        }
    }

}