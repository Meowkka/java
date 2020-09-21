package startjava.Lesson_2_3_4.array;

import java.util.Scanner;

public class ArrayMaxElementMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите длину массива : ");
        int maxLength = scanner.nextInt();
        int[] numbers = new int[maxLength];

        System.out.print("Введите числа через пробел : ");

        for (int i = 0; i < maxLength; i++) {
            numbers[i] = scanner.nextInt();
        }

        int max = numbers[0];
        for (int number: numbers) {
            if (number>max){
                max=number;
            }
        }
        System.out.print("Максимальное число в массиве : "+max);
    }
}
