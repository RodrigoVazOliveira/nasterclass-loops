package br.dev.rvz;

import java.util.ArrayList;
import java.util.List;

/**
 * Responsável por calcular a soma dos números
 * divisíveis por 3 e 5 entre 1 a 1000
 * e armazenar os números não divisíveis entre 1 a 1000
 * por 3 e 5.
 * @author Rodrigo Vaz
 * @version 0.0.0
 * */
public class SumForThreeAndFive {
    private static int sum = 0;
    private static List<Integer> numbers = new ArrayList<>();

    public static List<Integer> getNumbers() {
        return numbers;
    }

    public static int sumNumbers() {
        int count = 0;
        for (int i = 0; i < 1000 && count < 6; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                sum += i;
                count += 1;
            } else {
                numbers.add(i);
            }
        }
        return sum;
    }
}
