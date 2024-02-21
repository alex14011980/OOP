package dz7.controller;

import dz7.model.*;
import dz7.view.View;

import java.util.HashMap;
import java.util.Map;

public class Controller {
    private Model model;
    private View view;
    private Map<Integer, ComplexOperationModel> operationStrategies;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
        this.operationStrategies = initializeOperationStrategies();
    }

    public void processUserInput() {
        while (true) {
            ComplexNumber num1 = view.readComplexNumber("Введите первое комплексное число:");
            ComplexNumber num2 = view.readComplexNumber("Введите второе комплексное число:");

            int choice = view.readMenuChoice();

            ComplexOperationModel strategy = operationStrategies.get(choice);
            if (strategy != null) {
                model.setNum1(num1);
                model.setNum2(num2);
                ComplexNumber result = model.calculateResult(strategy);
                view.displayResult(result);
            } else {
                view.displayLog("Неверный выбор операции.");
            }

            if (!view.wantToContinue()) {
                view.displayLog("Программа завершена.");
                break;
            }
        }
    }

    private Map<Integer, ComplexOperationModel> initializeOperationStrategies() {
        Map<Integer, ComplexOperationModel> strategies = new HashMap<>();
        strategies.put(1, new AddModel());
        strategies.put(2, new SubtractModel());
        strategies.put(3, new MultiplyModel());
        strategies.put(4, new DivideModel());
        return strategies;
    }
}