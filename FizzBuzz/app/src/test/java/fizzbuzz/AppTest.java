package fizzbuzz;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void testGetMaxValue_Default() {
        String[] args = {};
        int result = App.getMaxValue(args);
        assertEquals(30, result, "Default value should be 30 when no arguments are provided");
    }

    @Test
    void testGetMaxValue_ValidNumber() {
        String[] args = {"15"};
        int result = App.getMaxValue(args);
        assertEquals(15, result, "Should return the provided valid number");
    }

    @Test
    void testGetMaxValue_InvalidNumber() {
        String[] args = {"-5"};
        int result = App.getMaxValue(args);
        assertEquals(30, result, "Should return default value 30 for invalid number");
    }

    @Test
    void testGetMaxValue_NonNumeric() {
        String[] args = {"abc"};
        int result = App.getMaxValue(args);
        assertEquals(30, result, "Should return default value 30 for non-numeric input");
    }

    @Test
    void testFizzBuzz_15() {
        String result = App.fizzBuzz(15);
        assertEquals(
            """
            1
            2
            Fizz
            4
            Buzz
            Fizz
            7
            8
            Fizz
            Buzz
            11
            Fizz
            13
            14
            FizzBuzz""", 
            result, 
            "Should return the expected output for 15"
        );
    }

    @Test
    void testFizzBuzz_30() {
        String result = App.fizzBuzz(30);
        assertEquals(
            """
            1
            2
            Fizz
            4
            Buzz
            Fizz
            7
            8
            Fizz
            Buzz
            11
            Fizz
            13
            14
            FizzBuzz
            16
            17
            Fizz
            19
            Buzz
            Fizz
            22
            23
            Fizz
            Buzz
            26
            Fizz
            28
            29
            FizzBuzz""", 
            result, 
            "Should return the expected output for 30"
        );
    }

    @Test
    void testFizzBuzz_100() {
        String result = App.fizzBuzz(100);
        assertEquals(
            """
            1
            2
            Fizz
            4
            Buzz
            Fizz
            7
            8
            Fizz
            Buzz
            11
            Fizz
            13
            14
            FizzBuzz
            16
            17
            Fizz
            19
            Buzz
            Fizz
            22
            23
            Fizz
            Buzz
            26
            Fizz
            28
            29
            FizzBuzz
            31
            32
            Fizz
            34
            Buzz
            Fizz
            37
            38
            Fizz
            Buzz
            41
            Fizz
            43
            44
            FizzBuzz
            46
            47
            Fizz
            49
            Buzz
            Fizz
            52
            53
            Fizz
            Buzz
            56
            Fizz
            58
            59
            FizzBuzz
            61
            62
            Fizz
            64
            Buzz
            Fizz
            67
            68
            Fizz
            Buzz
            71
            Fizz
            73
            74
            FizzBuzz
            76
            77
            Fizz
            79
            Buzz
            Fizz
            82
            83
            Fizz
            Buzz
            86
            Fizz
            88
            89
            FizzBuzz
            91
            92
            Fizz
            94
            Buzz
            Fizz
            97
            98
            Fizz
            Buzz""", 
            result, 
            "Should return the expected output for 100"
        );
    }
}
