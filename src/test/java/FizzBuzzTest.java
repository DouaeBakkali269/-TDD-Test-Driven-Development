import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

class FizzBuzzTest {

//    @Test
//    void test() {
//        fail("Not yet implemented");
//    }

    @Test
     final void testAvecValeurUn() {

        // Arrange (Setup input) - Input is 1
        // Act (Call the method)
        String res = FizzBuzz.fizzBuzz(1);

        // Assert (Check the result)
        assertEquals("1", res, "Problem with the number 1");
    }

    @Test
    public final void testAvecValeurDeux() {
        // Arrange
        // Act
        String res = FizzBuzz.fizzBuzz(2);
        // Assert
        assertEquals("2", res, "Problem with the number 2");
    }

    @Test
    public final void testAvecValeurTrois() {
        String res = FizzBuzz.fizzBuzz(3);
        assertEquals("Fizz", res, "Problem with the number 3");
    }

    @Test
    public final void testAvecMultipleDeTrois() {
        String res = FizzBuzz.fizzBuzz(6);
        assertEquals("Fizz", res, "Problem with the number 6");
    }

}

