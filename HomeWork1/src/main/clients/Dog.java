package main.clients;

import java.time.LocalDate;

public class Dog extends main.clients.Animal {
    public Dog(String nickName, Owner owner, LocalDate birthDate, main.clients.Illness illness) {
        super(nickName, owner, birthDate, illness); //Сходи в род.класс и вызови 4 параметра
    }

    public Dog(){
        super();
    }

    @Override
    public void fly(int meters) {
        System.out.print("Собака по имени " + nickName + " летать не умеет! ");

    }

}