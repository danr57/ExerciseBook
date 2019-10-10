package Main;

public class Problems {

    public Problems() {
        conditionals(1, 2, true);
        conditionals(3, 3, false);
        conditionals(1, 1, true);
        System.out.println();

        blackjack(10, 21);
        blackjack(20, 18);
        blackjack(1, 22);
        blackjack(22, 23);
        System.out.println();

        uniqueSum(1, 2, 3);
        uniqueSum(3, 3, 3);
        uniqueSum(1, 1, 2);

        numbers(74);
        numbers(9999);


    }

    public void conditionals(int a, int b, boolean c) {
        if (c) {
            System.out.println("Input(" + a + "," + b + ",true)->" + (a + b));
        } else {
            System.out.println("Input(" + a + "," + b + ",false)->" + (a * b));
        }
    }

    public void blackjack(int a, int b) {
        int winner;
        if (a > 21 && b > 21) {
            winner = 0;
        } else if (a > 21) {
            winner = b;
        } else if (b > 21) {
            winner = a;
        } else if (21 - a < 21 - b) {
            winner = a;
        } else {
            winner = b;
        }
        System.out.println("Play (" + a + "," + b + ") Winner: " + winner);
    }

    public void uniqueSum(int a, int b, int c) {
        int sum = 0;
        if (a != b && a != c) {
            sum += a;
        }
        if (b != a && b != c) {
            sum += b;
        }
        if (c != a && c != b) {
            sum += c;
        }
        System.out.println("Input(" + a + "," + b + "," + c + ")-> " + sum);
    }

    public void numbers(int x) {
        int sum = 0;
        while (x > 0) {
            sum += x % 10;
            x = x / 10;
        }
        System.out.println(sum);
    }

    public void numbersToString(int limit) {
        for (int i = 1; i < limit; i++) {
            System.out.println(Integer.toString(i));
        }
    }
}
