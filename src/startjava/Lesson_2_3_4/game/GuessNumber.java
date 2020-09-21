package startjava.Lesson_2_3_4.game;

public class GuessNumber {

    public boolean isGuessedNumber (int compNumber, int persNum) {
        
        if(compNumber != persNum) {
            if(compNumber > persNum){
                System.out.println("Введенное вами число меньше того, что загадал компьютер");               
            }else{               
                System.out.println("Введенное вами число больше того, что загадал компьютер");
            }
            return false;
        }else{
            System.out.println("Вы угадали!");
            return true;
        }
        

    }

}