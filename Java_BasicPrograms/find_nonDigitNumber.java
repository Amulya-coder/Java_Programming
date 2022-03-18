//Take the the n and d digit as a input. 
//find the number that does not contain d digit which is less than n   
/*Example
Input:
123
2
Output: 119
*/

import java.util.Scanner;

public class find_nonDigitNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int digit = sc.nextInt();
        int val = 0;
        char c = Integer.toString(digit).charAt(0);

        for (int i = num; i > 0; i--) {

            if (Integer.toString(i).indexOf(c) == -1) {
                val = i;
                break;
            }
        }
        System.out.println(val);

    }

}
