package dz7;

import dz7.controller.Controller;
import dz7.model.Model;
import dz7.view.View;



public class Main {
    public static void main(String[] args) {
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(model, view);

        controller.processUserInput();
    }
}
