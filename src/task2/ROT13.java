package task2;

// It works for lower case only. If it is necessary, I can do it for lower case too.
public class ROT13 {
    public static void main(String[] args) {
        System.out.println(args[0]);

        System.out.println("Encode: " + rot13(args[0]));
        System.out.println("Decode: " + rot13(rot13(args[0])));


    }

    public static String rot13(String str) {
        char result[] = str.toCharArray();
        for (int i = 0; i < result.length; i++) {
            System.out.println(Character.codePointAt(result, i));
            if (Character.codePointAt(result, i) > 109) result[i] -= 13;
            else result[i] += 13;
        }
        return String.valueOf(result);
    }
}
