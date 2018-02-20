package validation;

public class Calculator {

    public int multiplication(int fromInteger) {

        if (fromInteger < 0) {
            throw new IllegalArgumentException("param must be positive");
        }

        int multiplication = 1;
        for (int i = 1; i <= fromInteger; i++) {
            multiplication *= i;
        }

        return multiplication;
    }

    public int binomialCoefficient(int setSize, int subsetSize) {

        if (setSize < 0
                && subsetSize < 0
                && subsetSize >= setSize) {
            throw new IllegalArgumentException("params must be positive and subset smaller than set");
        }

        int numerator = multiplication(setSize);
        int denominator = multiplication(subsetSize) * multiplication(setSize - subsetSize);

        return numerator / denominator;
    }
}
