package startjava.Lesson_2_3_4.game;

public class Player {

    private String name;
    private int number;


    public Player (String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        if(name == ""){
            System.out.println("Пустая строка!");
        }else{
        this.name = name;
        }
    }

    public int getNum() {
        return number;
    }
    
    public void setNum(int number) {
        this.number = number;
    }
}