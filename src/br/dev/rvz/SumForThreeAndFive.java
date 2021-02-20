package br.dev.rvz;

import java.util.ArrayList;
import java.util.List;

public class SumForThreeAndFive {
    private static int sum = 0;
    private static List<Integer> numbers = new ArrayList<>();

    public static List<Integer> getNumbers() {
        return numbers;
    }

    public static int sumNumbers() {
        for (int i = 0; i < 1000; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                sum += i;
            } else {
                numbers.add(i);
            }
        }
        return sum;
    }
}
