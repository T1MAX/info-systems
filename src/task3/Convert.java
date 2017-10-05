package task3;

import java.util.Scanner;

public class Convert {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a hexademical number: ");
        String str = scanner.nextLine();

        System.out.println("Converting decimal number: " + convert(str));

    }

    public static int convert(String str) {
        char[] arr = str.toCharArray();
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            result += Integer.valueOf(String.valueOf(arr[i]), 16) * (int)Math.pow(16, arr.length - i - 1);
        }
        return result;
    }
}
