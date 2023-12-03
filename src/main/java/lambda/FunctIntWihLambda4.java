package lambda;

public class FunctIntWihLambda4 {

    @FunctionalInterface
    interface FindDiscriminant {
        double calculateDiscriminant (double a, double b, double c);
    }

    public static void main(String[] args) {

        FindDiscriminant findOperation = (a, b, c) -> a * Math.pow(b, c);

        double a=2;
        double b=2;
        double c=2;

        double result =  findOperation.calculateDiscriminant(a, b, c);
        System.out.println("The result is:" + result);

    }


}
