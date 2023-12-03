package collections.nine;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindTheLongestString {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number of strings: ");
        int numberOfStrings = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < numberOfStrings; i++) {
            System.out.print("Enter the string " + (i + 1) + ": ");
            String inputString = scanner.nextLine();
            strings.add(inputString);
        }

        List<String> longestStrings= new ArrayList<>();
        int maxLength = 0;

        for (String str : strings) {
            if (str.length() > maxLength) {
                maxLength = str.length();
                longestStrings.clear();
                longestStrings.add(str);
            } else if (str.length() == maxLength) {
                longestStrings.add(str);
            }
        }

        System.out.println("The longest string:");
        for (String longestString : longestStrings) {
            System.out.println(longestString);
        }
    }
}
