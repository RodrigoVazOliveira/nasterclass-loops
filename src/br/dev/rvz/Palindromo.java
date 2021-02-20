package br.dev.rvz;

public class Palindromo {
    public static boolean isPalindrome(int number) {
        int revertido = numeroRevertido(number);
        if (number == revertido) {
            true;
        }
        return false;
    }

    public static int numeroRevertido(int numero) {
        int revertido = 0;
        while(numero < 0) {
            revertido += (revertido * 10) + (numero % 10);
            numero /= 10;
        }
        return revertido;
    }
}
