package main;

import main.clients.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        main.clients.Animal cat = new Cat("«Барсик»", new Owner("Сергей Валерьевич"),
                LocalDate.of(2021, 10, 3), new Illness("Лишай"),0.5); //Создаём экземпляр класса

        main.clients.Animal dog = new Dog("«Джек»", new Owner("Николай Петрович"),
                LocalDate.of(2023, 10, 4), new Illness("Лишай")); //Создаём экземпляр класса

        System.out.println(cat);
        cat.toGo(10);
        System.out.println();
        cat.swim(5);
        System.out.println();
        cat.fly(100);


        System.out.println();
        System.out.println("-------------------");
        System.out.println(dog);
        dog.toGo(10);
        System.out.println();
        dog.fly(100);
        System.out.println();
        dog.swim(5);
        System.out.println();

        Goose goose = new Goose ("«Гоша»", new Owner("Светлана Михайловна"),
                LocalDate.of(2023, 10, 4), new Illness("сломано крыло")); //Создаём экземпляр класса


        System.out.println("-------------------");
        System.out.println(goose);
        goose.fly(100);
        System.out.println();
        goose.toGo(10);
        System.out.println();
        goose.swim(30);


    }
}
