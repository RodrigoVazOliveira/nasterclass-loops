package br.dev.rvz;

public class SumDigit {
    public static int sum(int number) {

        int sum = 0;

        if (number < 10) {
            return -1;
        }

        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }

        return sum;
    }

    public static int sumFirstAndLastDigit(int number) {
        int firstDigit = 0, lastDigit = 0;
        if (number < 0) {
            return -1;
        }

        if (number >= 0 && number <= 9) {
            lastDigit = number;
        } else {
            lastDigit = number % 10;
        }

        while (number > 0) {
            if (number >= 0 && number <= 9) {
                firstDigit = number;
            }
            number /= 10;
        }
        return firstDigit + lastDigit;
    }

    public static int getEvenDigitSum(int number) {
        int sum = 0;
        if (number < 0) {
            return -1;
        }

        while (number > 0) {
            int digit = number % 10;

            if (digit % 2 == 0) {
                sum += digit;
            }

            number /= 10;
        }

        return sum;
    }

    public static boolean hasSameLastDigit(int numberOne, int numberTwo, int numberThree) {
        if (numberOne < 10 || numberOne > 1000
                || numberTwo < 10 || numberTwo > 1000
                || numberThree < 10 || numberThree > 1000) {
            return false;
        }

        int[] digits  = {numberOne % 10, numberTwo % 10, numberThree % 10};

        if (digits[0] == digits[1] || digits[0] == digits[2] || digits[1] == digits[2]) {
            return true;
        }
        return false;
    }

    public static boolean isValid(int number) {
        if (number < 10 || number > 1000) {
            return false;
        }
        return true;
    }
}
