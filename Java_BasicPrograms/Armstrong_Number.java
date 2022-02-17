import java.util.Scanner;

public class Armstrong_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int temp, last, sum = 0, digit = 0;

        temp = n;
        while (temp > 0) {
            temp = temp / 10;
            digit++;
        }

        temp = n;
        while (temp > 0) {
            last = temp % 10;
            sum = (int) (sum + (Math.pow(last, digit)));
            temp = temp / 10;
        }
        if (sum == n) {
            System.out.println("Given number is armstrong number");
        } else {
            System.out.println("Given number is not armstrong number");
        }
    }
}
