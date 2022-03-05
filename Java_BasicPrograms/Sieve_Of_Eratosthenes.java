import java.util.*;

public class Sieve_Of_Eratosthenes {

    private int[] calcPrimes(int N) {
        int[] arr = new int[N + 1];
        for (int i = 2; i <= Math.sqrt(N); i++) {
            if (arr[i] == 0) {
                for (int j = i * i; j <= N; j += i) {
                    arr[j] = 1;
                }
            }
        }
        return arr;
    }

    public void getPrimes(int N) {
        int[] primes = calcPrimes(N);
        display(primes);
    }

    public void display(int[] primes) {
        System.out.print("\nPrimes = ");
        for (int i = 2; i < primes.length; i++)
            if (primes[i] == 0)
                System.out.print(i + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Sieve Of Eratosthenes Prime Algorithm Test\n");
        Sieve_Of_Eratosthenes soe = new Sieve_Of_Eratosthenes();

        System.out.println("Enter number to find all primes less than the number\n");
        int n = scan.nextInt();
        soe.getPrimes(n);
    }
}
