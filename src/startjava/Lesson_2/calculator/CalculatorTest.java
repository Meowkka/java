import java.util.Scanner; // импорт сканера

public class CalculatorTest{
    public static void main(String[] args) {

        System.out.print("Введите первое число: ");
		Scanner scan = new Scanner(System.in);
        int FirstNum = scan.nextInt();
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите знак математической операции: ");
        String Operation = sc.nextLine();
        System.out.print("Введите второе число: ");
        int SecondNum = scan.nextInt();
        
        Calculator calc = new Calculator();

        calc.calculate(FirstNum,Operation,SecondNum);
    }
}