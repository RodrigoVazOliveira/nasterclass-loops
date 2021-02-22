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

    }
}

