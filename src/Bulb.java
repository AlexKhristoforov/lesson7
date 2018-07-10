public class Bulb implements Illumination {
    private final String type = "Bulb";
    private int power;

    public Bulb(int power) {
        this.power = power;
    }

    public int getIlluminance() {
        return power;
    }

    public String getType() {
        return type;
    }

    @Override
    public String infoIllumination() {
        return "\t\t" + type + " : " + power + " lx";
    }
}
