package lambda;

public class FunctIntWithLambda2 {

    @FunctionalInterface
    interface СheckString {

        String compareStrings(String str1, String str2);
    }
        public static void main(String[] args) {

            СheckString findLongerString = (str1, str2) -> (str1.length() > str2.length()) ? str1 : str2;

            String exampleString1 = "Hey you";
            String exampleString2 = "Hi";

            String longerString = findLongerString.compareStrings(exampleString1, exampleString2);
            System.out.println("Longer string is:" + longerString);
        }
}
