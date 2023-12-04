public class SwitchCaseWithForLoop {
    public static void main(String[] args) {
        // Define an array of integers
        int[] numbers = {1, 2, 3, 4, 5};

        // Loop through the array elements
        for (int i = 0; i < numbers.length; i++) {
            int num = numbers[i];

            // Switch-case statement based on the value of 'num'
            switch (num) {
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                default:
                    System.out.println("Number out of range");
                    break;
            }
        }
    }
}
