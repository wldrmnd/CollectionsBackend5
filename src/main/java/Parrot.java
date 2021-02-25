import java.util.Objects;

public class Parrot implements Comparable {

    private String name; //kesha = 5 * 31 = 155
    private Double voiceVolume; //100 = 100*31 = 3100

    public Parrot(String name, Double voiceVolume) {
        this.name = name;
        this.voiceVolume = voiceVolume;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getVoiceVolume() {
        return voiceVolume;
    }

    public void setVoiceVolume(Double voiceVolume) {
        this.voiceVolume = voiceVolume;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Parrot parrot = (Parrot) o;
        return Objects.equals(name, parrot.name) && Objects.equals(voiceVolume, parrot.voiceVolume);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, voiceVolume);
    }

    @Override
    public int compareTo(Object o) {
        Parrot parrot = (Parrot) o;
        return this.voiceVolume.compareTo(parrot.voiceVolume);
    }

    @Override
    public String toString() {
        return "Parrot{" +
                "name='" + name + '\'' +
                ", voiceVolume=" + voiceVolume +
                '}';
    }
}

