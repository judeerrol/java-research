public class LoopsExample {
    public static void main(String[] args) {
        // For Loop
        for (int i = 1; i <= 5; i++) {
            System.out.println("Count: " + i);
        }

        // While Loop
        int a = 2;
        while (a <= 10) {
            System.out.println(a);
            a += 2;
        }

        // Do-While Loop
        int b = 10;

        do {
            System.out.println(b);
            b += 10;
        } while (b <= 100);
    }
}
