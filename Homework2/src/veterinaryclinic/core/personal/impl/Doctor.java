package veterinaryclinic.core.personal.impl;

import veterinaryclinic.core.pacients.Animal;
import veterinaryclinic.core.personal.Personal;

import java.util.Map;

public class Doctor extends Personal {
    private final Map<Integer, String> diagnoses = Map.of(0, "Лишай", 1, "Чумка", 2, "Интерит");
    private Nurse nurse;

    public Doctor() {
    }

    public Doctor(Nurse nurse) {
        this.nurse = nurse;
    }
    public void fireNurse() {
        this.nurse = null;
    }

    public void setNurse(Nurse nurse) {
        this.nurse = nurse;
    }

    public String doDiagnose(Animal pacient) {
        int key = (int)(0 + Math.random() * 3);
        return pacient.name + " подхватил болезнь " + diagnoses.get(key);
    }
}
