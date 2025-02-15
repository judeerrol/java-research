public class ArrayExample {
    public static void main(String[] args) {
        // Creating Array (Fixed-size)
        int[] numbers = {10, 20, 30, 40, 50};

        // Accessing elements
        System.out.println("First element: " + numbers[0]);
        System.out.println("Second element: " + numbers[1]);
        System.out.println("Third element: " + numbers[2]);
        System.out.println("Fourth element: " + numbers[3]);
        System.out.println("Fifth element: " + numbers[4]);

        // Looping through array
        for (int num : numbers) {
            System.out.println(num);
        }
    }
}
