import Exception.*;

public class CheckingFramework {
    public static void checkIllumination(Room room, Illumination subject, int quantity) throws IlluminanceLimitException, LowLevelOfIlluminationException {
        int illuminationAfterAddition = room.getFullIllumination() + subject.getIlluminance() * quantity;
        if (illuminationAfterAddition < 300) {
            throw new LowLevelOfIlluminationException();
        } else if (illuminationAfterAddition > 4000)
            throw new IlluminanceLimitException();
    }

    public static void checkArea(Room room, Furniture subject, int quantity) throws AreaLimitException {
        double areaAfterAddition = room.getArea() - subject.getArea() * quantity;
        double areaLimit = Math.round(room.getArea() * 70) / 100.0;
        if (areaAfterAddition < areaLimit) {
            throw new AreaLimitException();
        }
    }
}
