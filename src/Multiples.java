public class Multiples {

    public static void main(String[] args) {

        // Create accumulator to count multiples of 3 or 5
        int accumulator = 0;

        for (int i = 1; i < 1000; i++) {

            if (i % 3 == 0 || i % 5 == 0) {
                accumulator++;
            }

        }

        System.out.printf("There are %s multiples of 3 or 5 below 1000", accumulator);

    }

}
