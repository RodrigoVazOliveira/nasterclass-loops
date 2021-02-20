package br.dev.rvz;

public class Palindromo {
    public static boolean isPalindrome(int number) {
        int revertido = 0;
        int numero = number;
        if (number < 0) {
            numero = -numero;
        }

        while(numero > 0) {
            revertido = (revertido * 10) + (numero % 10);
            numero /= 10;
        }
        if (number < 0) {
            revertido = -revertido;
            if (number == revertido) {
                return true;
            }
        } else {
            if (number == revertido) {
                return true;
            }
        }
        return false;
    }
//
//    public static int numeroRevertido(int numero) {
//        int revertido = 0;
//        while(numero > 0) {
//            revertido = (revertido * 10) + (numero % 10);
//            numero /= 10;
//        }
//        return revertido;
//    }
}
