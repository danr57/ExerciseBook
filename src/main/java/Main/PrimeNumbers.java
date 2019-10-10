package Main;

import java.util.Scanner;

public class PrimeNumbers {

    int start, limit;
    int count = 0;

    public PrimeNumbers(int start, int limit) {
//        System.out.print("Number to check prime numbers til? ");
//        Scanner sc = new Scanner(System.in);
//        limit = sc.nextInt();
        this.start = start;
        this.limit = limit;
        findPrimesUpTo();
    }

    public void findPrimesUpTo() {
        System.out.println("Finding prime numbers from " + start + " to " + limit);
        for (int i = start; i < limit; i++) {
            checkPrime(i);
        }
        System.out.println("There are " + count + " prime numbers from " + start + " to " + limit);
    }

    public boolean checkPrime(int num) {
        int remainder;
        for (int i = 2; i <= num / 2; i++) {
//            if (count >= (10 * countBuffer)) {
//                System.out.println(count + " primes found so far");
//                countBuffer = count;
//            }
            remainder = num % i;
            if (remainder == 0) {
                return false;
            }
        }
        count++;
        return true;
    }

}
