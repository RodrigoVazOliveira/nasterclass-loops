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
    }
}

