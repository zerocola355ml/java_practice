import java.util.*;

public class Source_11_28 {
    public static void main(String args[]) {
        int[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        long count = Arrays.stream(intArray)
                            .filter(n -> n % 2 == 0)
                            .count();
        System.out.println("2의 배수의 개수 : " + count);

        long sum = Arrays.stream(intArray)
                            .filter(n -> n % 2 == 0)
                            .sum();
        System.out.println("2의 배수의 합 : " + sum);

        long max = Arrays.stream(intArray)
                            .max()
                            .getAsInt();
        System.out.println("최댓값 : " + max);

        long min = Arrays.stream(intArray)
                            .min()
                            .getAsInt();
        System.out.println("최솟값 : " + min);

        double avg = Arrays.stream(intArray)
                            .average()
                            .getAsDouble();
        System.out.println("평균 : " + avg);

    }
}
