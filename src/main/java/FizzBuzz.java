public class FizzBuzz {
    public String fizzBuzz(int num) {
        String result = "";
        String numString = String.valueOf(num);
        if (!numString.contains("5") && numString.contains("3")) {
            return "Fizz";
        }
        if ((!numString.contains("5") || numString.contains("7")) && num % 3 == 0) {
            result += "Fizz";
        }
        if (!numString.contains("7") && num % 5 == 0) {
            result += "Buzz";
        }
        if (num % 7 == 0) {
            result += "Whizz";
        }
        return result.equals("") ? numString : result;
    }
}
