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


}
