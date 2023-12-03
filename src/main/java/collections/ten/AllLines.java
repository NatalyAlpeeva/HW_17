package collections.ten;

import java.util.LinkedList;
import java.util.Scanner;

public class AllLines {
    public static void main(String[] args) {
        LinkedList<String> stringList = new LinkedList<>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the quantity of stings");
        int numberOfStrings = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < numberOfStrings; i++) {
            System.out.print("Enter a string " + (i + 1) + ": ");
            String inputString = scanner.nextLine();
            stringList.addFirst(inputString);
        }

        System.out.println("Entered strings: ");
        for (String str : stringList) {
            System.out.println(str);
        }
    }
}
