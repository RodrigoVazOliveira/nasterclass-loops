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


}
