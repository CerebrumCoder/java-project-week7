public class Exercise10_05 {
    public static void main(String[] args) {
        StackOfIntegers stack = new StackOfIntegers();
        StackOfIntegers invers = new StackOfIntegers();
        java.util.Scanner input = new java.util.Scanner(System.in);

        System.out.print("Enter an integer: ");

        int number = input.nextInt();

        System.out.println("The factors for " + number + " is");

        int factor = 2;
        while (factor <= number) {
            if (factor % factor == 0) {
                number = number / factor;
                stack.push(factor);
            }
            else {
                factor++;
            }
        }

        while (!stack.empty()) {
            invers.push(stack.pop());
        }
        // Belajar tentang Traits. Tapi di java tidak bisa melakukan Traits. Ini tipe OOP yang lebih bagus daripada OOP sekarang. Golang, Rust (yang diangkat dari sisi security. Jaminan securitynya lebih tinggi), swift, scala.
        while (!invers.empty()) {
            System.out.print(invers.pop() + " ");
        }

        // Abstraksi itu apa2 yang hanya bisa diketahui oleh suatu framework
    }


}
