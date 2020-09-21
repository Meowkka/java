package startjava.Lesson_2.robot;

public class JaegerTest {
    public static void main(String[] args) {
        Jaeger jagerOne = new Jaeger("Java", "Java-5", "Russia", 40, 2);

        System.out.println("modelName = "+jagerOne.getModelName());
        System.out.println("origin = "+jagerOne.getOrigin());
        System.out.println("weight = "+jagerOne.getWeight());
        System.out.println(jagerOne.drift());

        Jaeger jagerTwo = new Jaeger("C#", "C#-5", "USA", 50, 5);

        System.out.println("modelName = "+jagerTwo.getModelName());
        System.out.println("origin = "+jagerTwo.getOrigin());
        System.out.println("weight = "+jagerTwo.getWeight());
        System.out.println(jagerTwo.scanKaiju());
    }   
}