public class Exercise10_06 {
    public static void main(String[] args) {
        final int LIMIT = 131;
        StackOfIntegers stack = new StackOfIntegers();

        // Repeatedly find prime numbers
        for (int number = LIMIT; number >= 2; number--)
            if (isPrime(number)) {
                stack.push(number);
            }
        

        // Print the first 30 prime numbers in decreasing order
        System.out.println("The prime numbers less than 131 are \n");
        final int NUMBER_PER_LINE = 10;

        while (!stack.empty()) {
            System.out.print(stack.pop() + " ");

            if (stack.getSize() % NUMBER_PER_LINE == 0) {
                System.out.println(); // advance to the new line
            }
        }
    }

    public static boolean isPrime(int number) {
        // Assume the number is prime
        boolean isPrime = true;

        // Exercise03_21 if number is prime
        for (int divisor = 2; divisor <= number / 2; divisor++) {
            //If true, the number is not prime
            if (number % divisor == 0) {
                // Set isPrime to false, if the number is not prime
                isPrime = false;
                break; // Exit the for loop
            }
        }

        return isPrime;
    }
}
