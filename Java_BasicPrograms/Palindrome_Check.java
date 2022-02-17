import java.util.Scanner;

public class Palindrome_Check {

    public static void main(String[] args) {
        /** Only for number **/
        // int n;
        // Scanner sc=new Scanner(System.in);
        // n=sc.nextInt();
        //
        // int sum=0,temp,r;
        // temp=n;
        //
        // while(n>0){
        // r=n%10;
        // sum=(sum*10)+r;
        // n=n/10;
        // }
        //
        // if(sum==temp){
        // System.out.println("Given number is palindrome");
        // }
        // else{
        // System.out.println("Given number is not palindrome");
        // }

        /** for both number and string **/
        String original, reverse = "";
        Scanner sc = new Scanner(System.in);
        original = sc.nextLine();
        int len = original.length();

        for (int i = len - 1; i >= 0; i--) {
            reverse = reverse + original.charAt(i);
        }
        if (reverse.equals(original)) {
            System.out.println("String/number is palindrome");
        } else {
            System.out.println("String/number is not palindrome");
        }
    }
}
