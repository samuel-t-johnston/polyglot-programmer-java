package fizzbuzz;

/**
 * Entry point to the application.
 */
public class App {
    
    public static void main(String[] args) {
        //Accept a number from the command line for the max value.
        //Validate that the input is a number and greater than 0.
        //If no input is provided, default to 30.
        int maxValue = getMaxValue(args);

        //Do the fizzing and the buzzing
        String output = fizzBuzz(maxValue);

        //Print the output
        System.out.println(output);
    }

    /*
     * Get the max value from the command line arguments.
     * Validate that the input is a number and greater than 0.
     * If no argument is provided, default to 30.
     */
    public static int getMaxValue(String[] args) {
        int maxValue = 30;
        if (args.length > 0) {
            try {
                int argValue = Integer.parseInt(args[0]);
                if (argValue < 1) {
                    System.out.println("Invalid input. Please provide a number greater than 0.");
                } else {
                    maxValue = argValue;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please provide a valid number.");
            }
        }
        return maxValue;
    }

    /*
     * Count from 1 to the max value.
     * For each number, print "Fizz" if the number is divisible by 3.
     * Print "Buzz" if the number is divisible by 5.
     * Print "FizzBuzz" if the number is divisible by both 3 and 5.
     */
    public static String fizzBuzz(int maxValue) {
        StringBuffer output = new StringBuffer();
        for (int index = 1; index <= maxValue; index++) {
            if (index % 3 == 0) {
                output.append("Fizz");
            }
            if (index % 5 == 0) {
                output.append("Buzz");
            }
            if (index % 3 != 0 && index % 5 != 0) {
                output.append(index);
            }
            if (index < maxValue) {
                output.append("\n");
            }
        }
        return output.toString();
    }
}
