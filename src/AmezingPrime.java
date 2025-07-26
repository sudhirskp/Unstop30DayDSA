import java.util.Arrays;
import java.util.Scanner;

public class AmezingPrime {
    public static int countBraveSoldiers(int n) {
        // Write your logic here.
        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;

        for (int i = 2; i * i <= n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        int count = 0;
        for (boolean prime : isPrime) {
            if (prime) count++;
        }
        return count;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
        int result = countBraveSoldiers(n);
        System.out.println(result);
    }
}
//https://www.geeksforgeeks.org/brave-soldiers/