package br.dev.rvz;

public class Application {
    public static void main(String[] args) {
        System.out.println("A soma dos números divisíveis por 3 e 5 é igual a " + SumForThreeAndFive.sumNumbers());
        System.out.println("Os números não divisíveis por 3 e 5 são: " + SumForThreeAndFive.getNumbers());

        System.out.println("Soma dos números impares entre 1 e 1000 " + SumOdd.sumOdd(1,1000));
        System.out.println("Soma dos números impares entre -1 e 1000 " + SumOdd.sumOdd(-1,1000));
        System.out.println("Soma dos números impares entre 100 e 100 " + SumOdd.sumOdd(100,100));
        System.out.println("Soma dos números impares entre 13 e 13 " + SumOdd.sumOdd(13,13));
        System.out.println("Soma dos números impares entre 100 e -100 " + SumOdd.sumOdd(100,-100));
        System.out.println("Soma dos números impares entre 100 e 1000 " + SumOdd.sumOdd(100,1000));

        System.out.println("Soma digitos do número 125 que é " + SumDigit.sum(125));

        System.out.println("O número 1221 " + Palindromo.isPalindrome(1221));
        System.out.println("O número 707 " + Palindromo.isPalindrome(707));
        System.out.println("O número 1212 " + Palindromo.isPalindrome(1212));
        System.out.println("O número -222 " + Palindromo.isPalindrome(-222));

        System.out.println("A soma do primeiro e segundo digito do número 252 e "
                + SumDigit.sumFirstAndLastDigit(252));
        System.out.println("A soma do primeiro e segundo digito do número 257 e "
                + SumDigit.sumFirstAndLastDigit(257));
        System.out.println("A soma do primeiro e segundo digito do número 0 e "
                + SumDigit.sumFirstAndLastDigit(0));
        System.out.println("A soma do primeiro e segundo digito do número 5 e "
                + SumDigit.sumFirstAndLastDigit(5));
        System.out.println("A soma do primeiro e segundo digito do número -1 e "
                + SumDigit.sumFirstAndLastDigit(-1));
        System.out.println("A soma do primeiro e segundo digito do número 2132121321 e "
                + SumDigit.sumFirstAndLastDigit(2132121321));

        System.out.println("Somar digitos pares do numero 123456789 e " +
                SumDigit.getEvenDigitSum(123456789));
        System.out.println("Somar digitos pares do numero 252 e " +
                SumDigit.getEvenDigitSum(252));
        System.out.println("Somar digitos pares do numero -22 e " +
                SumDigit.getEvenDigitSum(-22));

        System.out.println("SharedDigit numbers 12 and 23: "
                + SharedDigit.hasSharedDigit(12, 23));
        System.out.println("SharedDigit numbers 9 and 99: "
                + SharedDigit.hasSharedDigit(9, 99));
        System.out.println("SharedDigit numbers 15 and 55: "
                + SharedDigit.hasSharedDigit(15, 55));

        System.out.println("Teste para ver se último digito e igual: 41, 22, 71 "
                + SumDigit.hasSameLastDigit(41, 22, 71));
        System.out.println("Teste para ver se último digito e igual: 23, 32, 42 "
                + SumDigit.hasSameLastDigit(23, 32, 42));
        System.out.println("Teste para ver se último digito e igual: 9, 99, 999 "
                + SumDigit.hasSameLastDigit(9, 99, 999));

        System.out.println("O número 10 é valido: " + SumDigit.isValid(10));
        System.out.println("O número 468 é valido: " + SumDigit.isValid(468));
        System.out.println("O número 1001 é valido: " + SumDigit.isValid(1001));

        System.out.println("GDC DE 12 E 30 = " + Arithmetic.getGreatestCommonDivisor(12, 30));
        System.out.println("GDC DE 25 E 15 = " + Arithmetic.getGreatestCommonDivisor(25, 15));
        System.out.println("GDC DE 9 E 10 = " + Arithmetic.getGreatestCommonDivisor(9, 10));
        System.out.println("GDC DE 81 E 153 = " + Arithmetic.getGreatestCommonDivisor(81, 153));

        Arithmetic.printFactors(6);
        Arithmetic.printFactors(32);
        Arithmetic.printFactors(10);
        Arithmetic.printFactors(-1);

        System.out.println("Perfect number 6 = " + Arithmetic.isPerfectNumber(6));
        System.out.println("Perfect number 28 = " + Arithmetic.isPerfectNumber(28));
        System.out.println("Perfect number 5 = " + Arithmetic.isPerfectNumber(5));
        System.out.println("Perfect number -1 = " + Arithmetic.isPerfectNumber(-1));

        // teste de números por extens
        Arithmetic.numberToWords(100000);
        Arithmetic.numberToWords(25698);
        Arithmetic.numberToWords(0);
        System.out.println(Arithmetic.getDigitCount(0));
    }
}
