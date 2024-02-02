package veterinaryclinic.core.pacients;

public class Illness {
    String title;

    public Illness(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Болеет {" +
                "title='" + title + '\'' +
                '}';
    }
}