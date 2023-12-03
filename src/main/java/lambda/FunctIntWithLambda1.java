package lambda;

public class FunctIntWithLambda1 {

    @FunctionalInterface
    interface CheckNumber {
        boolean check(int number);
    }
        public static void main(String[] args) {

            CheckNumber isDivisibleBy13 = (number) -> number % 13 == 0;

            int exampleNumber = 40;
            if (isDivisibleBy13.check(exampleNumber)) {
                System.out.println(exampleNumber + " is divided by 13");
            } else {
                System.out.println(exampleNumber + " is not divided by 13");
            }
        }
}
