package br.dev.rvz;

public class Arithmetic {
    public static int getGreatestCommonDivisor(int firstNumber, int secondkNumber) {
        if (firstNumber < 10 || secondkNumber < 10) {
            return -1;
        }
        while(firstNumber != secondkNumber) {
            if (firstNumber > secondkNumber) {
                firstNumber = firstNumber - secondkNumber;
            } else {
                secondkNumber = secondkNumber - firstNumber;
            }
        }
        return firstNumber;
    }

    public static void printFactors(int number) {
        if (number >= 1) {
            for( int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    System.out.print(i + " ");
                }
            }
            System.out.println("");
        } else{
            System.out.println("Invalid Value");
        }
    }

}
