import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

class FizzBuzzTest {

    @ParameterizedTest(name = "Input: {0} -> Expected: {1}") // Optional: Custom test name
    @CsvSource({
            "1,  1",    // Input 1, Expected "1"
            "2,  2",    // Input 2, Expected "2"
            "3,  Fizz", // Input 3, Expected "Fizz"
            "4,  4",    // Input 4, Expected "4"
            "5,  Buzz", // Input 5, Expected "Buzz"
            "6,  Fizz", // Input 6, Expected "Fizz"
            "9,  Fizz",  // Input 9, Expected "Fizz"
            "10, Buzz"
    })

    public final void testFizzBuzz(int input, String expected) {
        String res = FizzBuzz.fizzBuzz(input);
        assertEquals(expected, res, "Problem with number " + input);
    }

//    @Test
//    void test() {
//        fail("Not yet implemented");
//    }

//    @Test
//     final void testAvecValeurUn() {
//
//        // Arrange (Setup input) - Input is 1
//        // Act (Call the method)
//        String res = FizzBuzz.fizzBuzz(1);
//
//        // Assert (Check the result)
//        assertEquals("1", res, "Problem with the number 1");
//    }
//
//    @Test
//    public final void testAvecValeurDeux() {
//        // Arrange
//        // Act
//        String res = FizzBuzz.fizzBuzz(2);
//        // Assert
//        assertEquals("2", res, "Problem with the number 2");
//    }
//
//    @Test
//    public final void testAvecValeurTrois() {
//        String res = FizzBuzz.fizzBuzz(3);
//        assertEquals("Fizz", res, "Problem with the number 3");
//    }
//
//    @Test
//    public final void testAvecMultipleDeTrois() {
//        String res = FizzBuzz.fizzBuzz(6);
//        assertEquals("Fizz", res, "Problem with the number 6");
//    }

}

