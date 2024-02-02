package veterinaryclinic.core.pacients.impl;

import veterinaryclinic.core.pacients.Animal;
import veterinaryclinic.core.pacients.Illness;
import veterinaryclinic.core.pacients.Owner;

import java.time.LocalDate;

public class Dog extends Animal implements Goable, Swimable{
    public Dog(String nickName, Owner owner, LocalDate birthDate, Illness illness) {
        super(nickName, owner, birthDate, illness);
    }

    public Dog(){
        super();
    }

    @Override
    public void go() {

    }

    @Override
    public void swim() {

    }

}