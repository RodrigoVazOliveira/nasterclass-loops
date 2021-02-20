package br.dev.rvz;

public class Palindromo {
    public static int numeroRevertido(int numero) {
        int revertido = 0;
        while(numero < 0) {
            revertido += (revertido * 10) + (numero % 10);
            numero /= 10;
        }
        return revertido;
    }
}
