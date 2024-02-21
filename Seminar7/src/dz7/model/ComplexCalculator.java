package dz7.model;

public class ComplexCalculator {
    private ComplexOperationModel strategy;

    public ComplexCalculator(ComplexOperationModel strategy) {
        this.strategy = strategy;
    }

    public ComplexNumber calculate(ComplexNumber num1, ComplexNumber num2) {
        return strategy.execute(num1, num2);
    }
}