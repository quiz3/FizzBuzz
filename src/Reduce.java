public class Reduce {

    public static void main(String[] args) {

        int n = 100;  // Initialize n as 100, as instructed
        int steps = 0;  // Create accumulator for number of steps taken

        while (n > 0) {
            // if n is even, divide n by 2
            if (n % 2 == 0) {
                n = n / 2;  // alternatively, '/=' operator would be kind of schnazzy
            } else {  // if n is odd, subtract 1
                n--;
            }
            steps++;  // Increment accumulator
        }

        System.out.println(steps);
    }

}
