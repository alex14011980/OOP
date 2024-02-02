package veterinaryclinic.core.pacients.impl;

public interface Goable {
    void go();
    default double getRunSpeed(){
        return 10;
    }
}
