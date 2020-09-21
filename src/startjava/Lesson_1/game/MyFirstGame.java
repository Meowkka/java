package startjava.Lesson_1.game;

public class MyFirstGame{
    public static void main(String[] args) {
        int GuessedNumber = 69;
        int MyNumber = 69;
        while(true){
            if(GuessedNumber > MyNumber){
                System.out.println("Введенное вами число меньше того, что загадал компьютер");
                MyNumber++;
            }else if (GuessedNumber < MyNumber){
                System.out.println("Введенное вами число больше того, что загадал компьютер");
                MyNumber--;
            }else{
                System.out.println("Вы угадали!");
                break;
            }
        }
    }
}