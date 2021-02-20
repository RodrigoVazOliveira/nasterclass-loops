package br.dev.rvz;

public class Application {
    public static void main(String[] args) {
        System.out.println("A soma dos números divisíveis por 3 e 5 é igual a " + SumForThreeAndFive.sumNumbers());
        System.out.println("Os números não divisíveis por 3 e 5 são: " + SumForThreeAndFive.getNumbers());
    }
}
