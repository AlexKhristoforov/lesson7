import java.util.ArrayList;

public class InfoFramework {
    public static void infoIllumination(ArrayList<Illumination> list, int windowsQuantity) {
        if (list.size() != 0) {
            System.out.println("\tThe quantity of windows is: " + windowsQuantity + " (each gives 700 lx)");
            int counter = 0;
            for (Illumination element : list) {
                if (!element.getType().equals("Window")) {
                    counter++;
                    if (counter == 1) System.out.println("\tAnother light sources:");
                    System.out.println(element.infoIllumination());
                }
            }
        }
    }

    public static void infoArea(ArrayList<Furniture> list, double area) {
        System.out.printf("\tArea is: %.0f m^2\n", area);
        double freeArea = getFreeArea(area, list);
        System.out.printf("\tFree area is %.1f m^2; (the room is empty for %.2f percent)\n", freeArea, freeArea / area * 100);
        if (list.size() != 0) {
            System.out.println("\tFurniture is:");
            for (Furniture element : list) {
                System.out.println(element.infoFurniture());
            }
        }
    }

    private static double getFreeArea(double area, ArrayList<Furniture> furniture) {
        double areaFurniture = 0;
        for (Furniture element : furniture) {
            areaFurniture += element.getArea();
        }
        double freeArea = area - areaFurniture;
        return freeArea;
    }
}
