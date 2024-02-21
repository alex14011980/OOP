package dz7.model;

public class AddModel implements ComplexOperationModel {
    @Override
    public ComplexNumber execute(ComplexNumber num1, ComplexNumber num2) {
        double realSum = num1.getReal() + num2.getReal();
        double imaginarySum = num1.getImaginary() + num2.getImaginary();
        return new ComplexNumber(realSum, imaginarySum);
    }
}