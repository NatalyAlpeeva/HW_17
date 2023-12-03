package lambda;

public class FunctIntWithLambda3 {

    @FunctionalInterface
    interface FindDiscriminant {
        double calculateDiscriminant (double a, double b, double c);
    }

    public static void main(String[] args) {
        FindDiscriminant findDiscriminant = (a, b, c) -> b*b - 4*a*c;

        double a = 1;
        double b = 1;
        double c = 1;

        double discriminant = findDiscriminant.calculateDiscriminant(a, b, c);

        if(b <a || b == 0 ||(a == b&& a ==c)) {
            System.out.println("Discriminant can't be negative, please try once more");
        }
        else {
            System.out.println("Discriminant equals:" + discriminant);
        }
    }

}
