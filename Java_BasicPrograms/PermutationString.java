import java.util.Scanner;

public class PermutationString {

    static String swapString(String s, int i, int j) {
        char[] b = s.toCharArray();

        char ch;
        ch = b[i];
        b[i] = b[j];
        b[j] = ch;

        return String.valueOf(b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int len = s.length();
        System.out.println("The permutation of the string is ");
        generatePermutation(s, 0, len);

    }

    static void generatePermutation(String s, int start, int end) {
        if (start == end - 1) {
            System.out.println(s);
        } else {
            for (int i = start; i < end; i++) {
                // Swapping the string by fixing a character
                s = swapString(s, start, i);

                generatePermutation(s, start + 1, end);

                // Backtracking
                s = swapString(s, start, i);
            }
        }
    }
}
