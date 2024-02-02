package veterinaryclinic.core;

import veterinaryclinic.core.pacients.Animal;
import veterinaryclinic.core.pacients.impl.Goable;
import veterinaryclinic.core.personal.Personal;

import java.util.ArrayList;
import java.util.List;

public class VeterinaryClinic {
    private List<Personal> personal;
    private List<Animal> pacients;

    public VeterinaryClinic(){
        this.personal = new ArrayList<>();
        this.pacients = new ArrayList<>();

    }

    public List<Animal> getPacients() {
        return pacients;
    }

    public List<Personal> getPersonal() {
        return personal;
    }

    public void addEmployee(Personal employee){
        personal.add(employee);
    }

    public void addPacient(Animal pacient){
        pacients.add(pacient);
    }
    public List<Animal> getGoables(){
        List<Animal> result = new ArrayList<>();
        for (Animal a: pacients){
            if (a instanceof Goable) result.add(a);
        }
        return result;
    }
}
