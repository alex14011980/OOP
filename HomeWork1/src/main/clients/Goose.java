package main.clients;

import java.time.LocalDate;

public class Goose extends Animal{
    public Goose(String nickName, Owner owner, LocalDate birthDate, Illness illness) {
        super(nickName, owner, birthDate, illness);
    }

    public Goose(){
        super();
    }


    @Override
    public void toGo(int meters) {
        System.out.print("Гусь " + nickName + " прошёл " + meters + " метров. ");

    }

    @Override
    public void swim(int meters){
        System.out.print("Гусь  по имени " + nickName + " проплыл " + meters + " метров. ");

    }
}