import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.IntStream;

public class Led {
    public static void main(String[] args) {

        Map<Integer, Integer> values = new HashMap<>();
        values.put(0, 6);
        values.put(1, 2);
        values.put(2, 5);
        values.put(3, 5);
        values.put(4, 4);
        values.put(5, 5);
        values.put(6, 6);
        values.put(7, 3);
        values.put(8, 7);
        values.put(9, 6);

        Scanner scanner = new Scanner(System.in);
        int entry = scanner.nextInt();
        AtomicLong sum = new AtomicLong();

        scanner.nextLine();

        IntStream.range(0, entry)
                .forEach(i -> {
                    String value = scanner.next();
                    value.chars()
                            .map(Character::getNumericValue)
                            .forEach(k -> sum.set(sum.get() + values.get(k)));
                    System.out.println(sum + " leds");
                    sum.set(0);
                });

    }
}