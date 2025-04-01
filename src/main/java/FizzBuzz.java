public class FizzBuzz {

    /**
     * Performs the FizzBuzz operation on a given integer.
     * @param number The input integer.
     * @return "Fizz", "Buzz", "Fizz Buzz", or the number as a String.
     */

//    public static String fizzBuzz(int number) {
//        // Simplest code to make the test for 1 pass:
//        if (number == 1) {
//            return "1";
//        }
//        return null; // Still return null for other cases not yet tested
//    }

        public static String fizzBuzz(int number) {
            // This simple code handles both 1 and 2 (and other non-Fizz/Buzz cases)
            return String.valueOf(number);
        }
}
