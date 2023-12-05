public class BreakContinueExample {
    public static void main(String[] args) {
        // Example of using break and continue in a loop
        for (int i = 1; i <= 10; i++) {
            // Using break to exit the loop when i equals 7
            if (i == 7) {
                System.out.println("Encountered 7, breaking the loop");
                break;
            }

            // Using continue to skip printing even numbers
            if (i % 2 == 0) {
                System.out.println("Skipping even number: " + i);
                continue;
            }

            System.out.println("Current value: " + i);
        }
    }
}
