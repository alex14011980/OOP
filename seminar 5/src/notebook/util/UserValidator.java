package notebook.util;
import java.util.Scanner;

public class UserValidator {

    public String validateFirstName(String firstName) {
        if (firstName.isEmpty())
            throw new UnsupportedOperationException("Поле имени должно быть заполнено");
        return firstName.trim().replace(",", "");
    }
    public String validateLastName(String lastName){
        if (lastName.isEmpty())
            throw new UnsupportedOperationException("Поле фамилия должно быть заполнено");
        return lastName.trim().replace(",", "");
    }
    public String validatePhone(String phone) {
        if (!phone.matches("[//d]+"))
            throw new UnsupportedOperationException("Номер должен содержать только цифры");
        return phone.trim().replace(",", "");
    }


}