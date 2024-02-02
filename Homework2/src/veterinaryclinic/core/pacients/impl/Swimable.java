package veterinaryclinic.core.pacients.impl;

public interface Swimable {
    void swim();
    default double getSwimSpeed(){
        return 10;
    }
}
