package veterinaryclinic.core.pacients.impl;

public interface Flyable {
    void fly();
    default double getFlySpeed(){
        return 10;
    }
}
