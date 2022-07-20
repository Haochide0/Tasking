import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FizzBuzzTest {
    @Test
    public void should_return_number_itself_when_number_off_given_normal_number() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.fizzBuzz(4);
        Assertions.assertEquals("4", result);
    }

    @Test
    public void should_return_Fizz_when_number_off_given_number_is_multiple_of_3_and_not_contains_3_5_7() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.fizzBuzz(12);
        Assertions.assertEquals("Fizz", result);
    }

    @Test
    public void should_return_Buzz_when_number_off_given_number_is_multiple_of_5_and_not_contains_3_5_7() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.fizzBuzz(10);
        Assertions.assertEquals("Buzz", result);
    }
    @Test
    public void should_return_Whizz_when_number_off_given_number_is_multiple_of_7_and_not_contains_3_5_7() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.fizzBuzz(14);
        Assertions.assertEquals("Whizz", result);
    }
    @Test
    public void should_return_FizzBuzz_when_number_off_given_number_is_multiple_of_3_and_5_and_not_contains_3_5_7() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.fizzBuzz(60);
        Assertions.assertEquals("FizzBuzz", result);
    }

    @Test
    public void should_return_FizzWhizz_when_number_off_given_number_is_multiple_of_3_and_7_and_not_contains_3_5_7() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.fizzBuzz(21);
        Assertions.assertEquals("FizzWhizz", result);
    }
    @Test
    public void should_return_BuzzWhizz_when_number_off_given_number_is_multiple_of_5_and_7_and_not_contains_3_5_7() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.fizzBuzz(280);
        Assertions.assertEquals("BuzzWhizz", result);
    }
    @Test
    public void should_return_FizzBuzzWhizz_when_number_off_given_number_is_multiple_of_3_5_and_7_and_not_contains_3_5_7() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.fizzBuzz(210);
        Assertions.assertEquals("FizzBuzzWhizz", result);
    }
    @Test
    public void should_return_Fizz_when_number_off_given_number_contains_3_and_is_not_multiple_of_3_5_and_7() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.fizzBuzz(13);
        Assertions.assertEquals("Fizz", result);
    }
    @Test
    public void should_return_Fizz_when_number_off_given_number_contains_3_and_is_multiple_of_3_5_and_7() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.fizzBuzz(630);
        Assertions.assertEquals("Fizz", result);
    }
    @Test
    public void should_return_BuzzWhizz_when_number_off_given_number_contains_5_and_3_and_is_multiple_of_5_and_7() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.fizzBuzz(35);
        Assertions.assertEquals("BuzzWhizz", result);
    }
    @Test
    public void should_return_Buzz_when_number_off_given_number_contains_5_and_is_multiple_of_3_and_5() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.fizzBuzz(45);
        Assertions.assertEquals("Buzz", result);
    }
    @Test
    public void should_return_Whizz_when_number_off_given_number_contains_5_and_is_multiple_of_7() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.fizzBuzz(56);
        Assertions.assertEquals("Whizz", result);
    }
    @Test
    public void should_return_Fizz_when_number_off_given_number_contains_7_and_5_and_is_multiple_of_5_and_3() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.fizzBuzz(75);
        Assertions.assertEquals("Fizz", result);
    }
    @Test
    public void should_return_Whizz_when_number_off_given_number_contains_7_and_is_multiple_of_5_and_7() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.fizzBuzz(70);
        Assertions.assertEquals("Whizz", result);
    }
    @Test
    public void should_return_Fizz_when_number_off_given_number_contains_7_and_is_multiple_of_3() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.fizzBuzz(72);
        Assertions.assertEquals("Fizz", result);
    }
    @Test
    public void should_return_FizzWhizz_when_number_off_given_number_contains_7_and_is_multiple_of_3_and_7() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.fizzBuzz(147);
        Assertions.assertEquals("FizzWhizz", result);
    }
    @Test
    public void should_return_FizzWhizz_when_number_off_given_number_contains_7_5_and_3_and_is_multiple_of_3_5_and_7() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.fizzBuzz(735);
        Assertions.assertEquals("FizzWhizz", result);
    }
}
