package br.dev.rvz;

public class SharedDigit {
    public static boolean hasSharedDigit(int numberOne, int numberTwo) {
        if (numberOne < 10 || numberOne > 99 || numberTwo < 10 || numberTwo > 99) {
            return false;
        }

        while (numberOne > 0) {
            int digitOne = numberOne % 10;
            int secondNUmber = numberTwo;
            while (secondNUmber > 0) {
                int digitTwo = secondNUmber % 10;
                if (digitOne == digitTwo) {
                    return true;
                }
                secondNUmber /= 10;
            }
            numberOne /= 10;
        }
        return false;
    }
}
