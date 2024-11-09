import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Эки оорундуу бутун сан жаз: ");
        int scan = scanner.nextInt();
        int number1 = ((scan / 10) % 10);
        int number2 = scan % 10;
        int sum1 = number1 + number2;

        int number3 = ((sum1 / 10) % 10);
        int number4 = sum1 % 10;
        int sum2 = number3 + number4;

        while (sum1 >= 0) {
            System.out.println(number1 + " + " + number2 + " = " + sum1);
            break;
        }while (sum2 >= 0){
            System.out.println(number3 + " + " + number4 + " = " + sum2);
            break;
        }














//        for (int sum1 = number1 + number2; sum1 > 5; sum1++) {
//            System.out.println("sum1 : " + sum1);
//            int number4 = ((sum1 / 10) % 10);
//            int number5 = sum1 % 10;
//            int sum2 = number4 + number5;
//            System.out.println("sum2 : " + sum2);
//            break;





    }
}