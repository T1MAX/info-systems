package task5;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 * Created by 803019 on 07.10.2017.
 */
public class CharSearch {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("src/task5/text.txt"));
        int counter = 0;

        while (bufferedReader.ready()) {
            if ((char)bufferedReader.read() == args[0].charAt(0)) counter++;
        }
        System.out.println(counter + " repetitions of '" + args[0] + "' character in file");
    }
}
