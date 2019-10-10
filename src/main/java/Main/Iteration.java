package Main;

import java.util.Scanner;

public class Iteration {
    Scanner sc = new Scanner(System.in);

    public Iteration() {
        userInput();
    }

    public void userInput() {
        System.out.print("Would you like to print appendix A, B, or C?");

        String input = sc.next();
        if (input.equals("A") || input.equals("a")) {
            printA();
        } else if (input.equals("B") || input.equals("b")) {
            printB();
        } else if (input.equals("C") || input.equals("c")) {
            printC();
        } else {
            System.out.println("Please input a valid answer! (A, B, or C");
        }
    }

    public void printA() {
        System.out.print("Please enter a number: ");
        int A = sc.nextInt();

        if (A > 2000) {
            System.out.println("A");
            if (A > 6000) {
                System.out.println("C");

            } else {
                System.out.println("B");
                if (A > 4000) {
                    System.out.println("D");
                } else {
                    System.out.println("E");
                }
            }
        } else {
            System.out.println("1");
            if (A > 100) {
                System.out.println("3");
                if (A>600) {
                    System.out.println("5");
                } else {
                    System.out.println("4");
                    if (A > 500) {
                        System.out.println("6");
                    } else {
                        System.out.println("7");
                    }
                }
            } else {
                System.out.println("2");
            }
        }
    }

    public void printB() {
        for (int A = 100; A <= 200; A++) {
            System.out.println(A);
        }
    }

    public void printC() {
        for (int A = 100; A <= 200; A++) {
            if (A % 2 == 0) {
                System.out.print("-");
            } else {
                System.out.print("*");
            }
        }
    }
}
