package task6;

import java.io.BufferedReader;
import java.io.FileReader;


public class CharSearch {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("src/task6/text.txt"));
        int counter = 0;

        while (bufferedReader.ready()) {
            if ((char)bufferedReader.read() == args[0].charAt(0)) counter++;
        }
        System.out.println(counter + " repetitions of '" + args[0] + "' character in file");
    }
}
