package task3;

import java.util.Scanner;

/**
 * Created by 803019 on 03.10.2017.
 */
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
            result += charToInt(arr[i]) * (int)Math.pow(16, arr.length - i - 1);
        }
        return result;
    }

    public static int charToInt(char ch) {
        if ((int)ch > 47 && (int)ch < 58) return (int)ch - 48;
        else if ((int)ch > 64 && (int)ch < 71) return (int)ch - 55;
        else return -1;
    }
}
