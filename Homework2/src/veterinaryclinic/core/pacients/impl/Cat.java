package veterinaryclinic.core.pacients.impl;

import veterinaryclinic.core.pacients.Animal;
import veterinaryclinic.core.pacients.Illness;
import veterinaryclinic.core.pacients.Owner;

import java.time.LocalDate;

public class Cat extends Animal implements Goable{


    Double discount;

    public Cat(String nickName, Owner owner, LocalDate birthDate, Illness illness, Double discount) {
        super(nickName, owner, birthDate, illness);
        this.discount = discount;
    }

    public Cat() {
        super();
        this.discount = 10D;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }


    public void meow(){
        System.out.println("Мяяяу!");
    }

    @Override
    public String toString() {
        return super.toString()+"Discount("+discount+")";
    }


    @Override
    public void go() {

    }

    @Override
    public double getRunSpeed() {
        return Goable.super.getRunSpeed();
    }

}
