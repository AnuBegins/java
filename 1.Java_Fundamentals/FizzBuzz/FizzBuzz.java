
import java.lang.Math;

public class FizzBuzz {
    public String fizzBuzz(int number) {
        String output;
        if (number % 15 == 0) {
            output = "FizzBuzz";
        } else if (number % 5 == 0) {
            output = "Buzz";
        } else if (number % 3 == 0) {
            output = "Fizz";
        } else {
           Integer temp = (Integer) number;
           output = temp.toString();
        }

        return output;

    }

}