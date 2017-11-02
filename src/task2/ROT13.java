package task2;

// It works for lower case only. If it is necessary, I can do it for lower case too.
public class ROT13 {
    public static void main(String[] args) {

        String msg = "ASfewqarARRF";
        System.out.println(msg);

        System.out.println("Encode: " + rot13(msg));
        System.out.println("Decode: " + rot13(rot13(msg)));

    }

    public static String rot13(String str) {
        char result[] = str.toCharArray();
        try {
            for (int i = 0; i < result.length; i++) {
                int a = Character.codePointAt(result, i);
                if (a > 77 && a < 90 || a > 109 && a < 123) result[i] -= 13;
                else if (a > 64 && a < 78 || a > 96 && a < 110) result[i] += 13;
                else throw new Exception("wrong letters");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return String.valueOf(result);
    }
}
