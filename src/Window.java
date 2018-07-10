public class Window implements Illumination {
    private final String type = "Window";
    private final int illumination = 700;

    public int getIlluminance() {
        return illumination;
    }

    public String getType() {
        return type;
    }

    @Override
    public String infoIllumination() {
        return "\t\t" + type + ":" + illumination;
    }
}
