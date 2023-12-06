public class BreakStatementExample {
    public static void main(String[] args) {
        // Using break in a for loop
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            if (i == 5) {
                break; // Exit the loop when i reaches 5
            }
        }

        // Using break in a while loop
        int j = 0;
        while (j < 10) {
            System.out.println(j);
            if (j == 5) {
                break; // Exit the loop when j reaches 5
            }
            j++;
        }

        // Using break in a do-while loop
        int k = 0;
        do {
            System.out.println(k);
            if (k == 5) {
                break; // Exit the loop when k reaches 5
            }
            k++;
        } while (k < 10);
    }
}
