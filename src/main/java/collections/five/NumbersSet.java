package collections.five;

import java.util.*;

public class NumbersSet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any numbers, separted by coma, e.g. 1,2,3,4,4,5:");
        String input = scanner.nextLine();
        String[] numbers=input.split(",\\s*");

        Set<String> stringSet= new LinkedHashSet<>(Arrays.asList(numbers));

        Iterator<String> iterator = stringSet.iterator();
        while (iterator.hasNext()) {
            String s = iterator.next();
            System.out.println(s);
        }
    }
}
