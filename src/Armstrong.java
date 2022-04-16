import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Give a number=");
        int number = input.nextInt();
        int result = 0;
        int numberstep;

        if (number>0){
        while (number != 0) {
            numberstep= number%10;
            result += numberstep;
            number /= 10;

        }System.out.println("sum of steps=" + result);
        }else {
            System.out.println("This number is below zero , please give correct number");
        }
    }

}



