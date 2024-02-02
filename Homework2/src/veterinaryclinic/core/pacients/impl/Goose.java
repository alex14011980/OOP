package veterinaryclinic.core.pacients.impl;

import veterinaryclinic.core.pacients.Animal;
import veterinaryclinic.core.pacients.Illness;
import veterinaryclinic.core.pacients.Owner;

import java.time.LocalDate;

public class Goose extends Animal implements Swimable, Goable, Flyable{
    public Goose(String nickName, Owner owner, LocalDate birthDate, Illness illness) {
        super(nickName, owner, birthDate, illness);
    }

    public Goose(){
        super();
    }

    @Override
    public void go() {

    }

    @Override
    public void swim() {

    }
    @Override
    public void fly() {

    }
}