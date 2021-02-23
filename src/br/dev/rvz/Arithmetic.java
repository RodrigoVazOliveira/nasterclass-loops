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
        if (number >=    1) {
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

    public static boolean isPerfectNumber(int number) {
        int sum = 0;
        if (number >=    1) {
            for( int i = 1; i < number; i++) {
                if (number % i == 0) {
                    sum += i;
                }
            }
            return sum == number;
        }
        return false;
    }

    public static int reverse(int number) {
        int revertido = 0;
        while(number > 0) {
            revertido = (revertido * 10) + (number % 10);
            number /= 10;
        }
        return revertido;
    }

    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        }

        int count = 0;
        while (number > 0) {
            number /= 10;
            count++;
        }
        return count;
    }

    public static void numberToWords(int number) {
        if (number > 0) {
            int numeroDigitos = getDigitCount(number);
            int numeroRevertido = reverse(number);
            int count = 0;
            while( numeroRevertido > 0) {
                count++;
                int digit = numeroRevertido % 10;

                if (digit == 0) {
                    System.out.print("Zero ");
                } else if (digit == 1) {
                    System.out.print("One ");
                } else if (digit == 2) {
                    System.out.print("Two ");
                } else if (digit == 3) {
                    System.out.print("Three ");
                } else if (digit == 4) {
                    System.out.print("Four ");
                } else if (digit == 5) {
                    System.out.print("Five ");
                } else if (digit == 6) {
                    System.out.print("Six ");
                } else if (digit == 7) {
                    System.out.print("Seven ");
                } else if (digit == 8) {
                    System.out.print("Eight ");
                } else if (digit == 9) {
                    System.out.print("Nine ");
                }

                numeroRevertido /= 10;
            }
            int numberZeros = numeroDigitos - count;
            if (numberZeros > 0) {
                while(numberZeros > 0) {
                    System.out.print("Zero ");
                    numberZeros--;
                }
            }
            System.out.println("");
        } else {
            System.out.print("Invalid Value");
        }

    }
}
