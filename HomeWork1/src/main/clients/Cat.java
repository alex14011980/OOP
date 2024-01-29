package main.clients;

import java.time.LocalDate;

public class Cat extends main.clients.Animal {

    //Todo напомнить в чём разница в double
    Double discount;

    public Cat(String nickName, Owner owner, LocalDate birthDate, main.clients.Illness illness, Double discount) {
        super(nickName, owner, birthDate, illness); //Todo сначала конструктор Супер-класса
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
    public void toGo(int meters) {
        System.out.print("Котёнок по имени " + nickName + " прошёл " + meters + " метров. ");

    };

    @Override
    public void fly(int meters) {
        System.out.print("Котёнок по имени " + nickName + " не умеет летать! ");


    }

    @Override
    public void swim(int meters){
        System.out.print("Котёнок по имени " + nickName + " не умеет плавать! ");

    }

}