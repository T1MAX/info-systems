package task1;

import java.util.Scanner;


//if (first number less in absolute value then second number) {
//    if (first number is negative) {
//        if (second number is negative) all methods are wrong;
//        else different results, FloorMod method is correct always only;
//    } else if (second number is negative) different results, FloorMod method is wrong always only;
//} else if (first number is negative) {
//    if (second number is negative) all methods are correct;
//    else different results, FloorMod method is correct always only;
//} else if (second number is negative) different results, FloorMod method is wrong always only;

public class GCD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers for gcd:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println("%: gcd(" + a + ", " + b + ") = " + gcd_one(a, b));
        System.out.println("FloorMod: gcd(" + a + ", " + b + ") = " + gcd_two(a, b));
        System.out.println("rem: gcd(" + a + ", " + b + ") = " + gcd_rem(a, b));
    }

    public static int gcd_one(int a, int b) {
        while (b != 0) {
            int c = b;
            b = remainder(a, b);
            a = c;
        }
        return a;
    }
    public static int gcd_two(int a, int b) {
        while (b != 0) {
            int c = b;
            b = Math.floorMod(a, b);
            a = c;

        }
        return a;
    }
    public static int gcd_rem(int a, int b) {
        if (b == 0) return a;
        else return (Math.abs(a) >= Math.abs(b))? gcd_rem(b, remainder(a, b)) : gcd_rem(a, remainder(b, a));
    }

    public static int remainder(int a, int b) {
        if (b < 0) {
            return remainder(a, -b);
        }
        if (a < 0) {
            return remainder(-a, b);
        }
        while (a >= b) {
            a = a - b;
        }
        return a;
    }
}
