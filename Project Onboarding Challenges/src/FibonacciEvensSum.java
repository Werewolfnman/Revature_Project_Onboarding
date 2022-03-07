public class FibonacciEvensSum {
    // 03/07/2022 challenge
    public static void main(String[] args) {
        int fib1 = 1;
        int fib2 = 1;
        int fib3 = 0;
        int sum = 0;
        while (true) {
            fib3 = fib1 + fib2;
            fib1 = fib2;
            fib2 = fib3;

            if ((fib3 % 2) == 0) {
                sum += fib3;
            }

            if (fib3 >= 4000000) {
                break;
            }
        }

        System.out.println(sum);
    }
}
