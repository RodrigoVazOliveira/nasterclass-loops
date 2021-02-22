package br.dev.rvz;

public class Arithmetic {
    public static int getGreatestCommonDivisor(int firstNumber, int secondkNumber) {
        if (firstNumber < 10 || secondkNumber < 10) {
            return -1;
        }
        while(secondkNumber != 0) {
            int temp = secondkNumber;
            secondkNumber = firstNumber % secondkNumber;
            firstNumber = temp;
        }
        return firstNumber;
    }
}
