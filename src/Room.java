import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

import Exception.*;

public class Room {
    private static Logger LOGGER = Logger.getLogger(Room.class.getName());
    static{
        FileHandler handler = null;
        try {
            handler = new FileHandler("logfile.txt");
            //LOGGER.setUseParentHandlers(false);
        } catch (IOException e) {
            e.printStackTrace();
        }
        LOGGER.addHandler(handler);
    }

    private String name;
    private double area;
    private int windowsQuantity = 0;
    private ArrayList<Illumination> illumination = new ArrayList<>();
    private ArrayList<Furniture> furniture = new ArrayList<>();

    public Room(String name, double area, int windowsQuantity)  {
        this.name = name;
        this.area = area;
        addIllumination(new Window(), windowsQuantity);
    }

    public void addIllumination(Illumination subject, int quantity) {
        try {
            CheckingFramework.checkIllumination(this, subject, quantity);
            if (subject.getType().equals("Window")) {
                windowsQuantity += quantity;
            }
            for (int i = 0; i < quantity; i++) {
                this.illumination.add(subject);
            }
        } catch (IlluminanceLimitException | LowLevelOfIlluminationException e) {
            System.out.printf("Warrning! %s :\n", name);
            LOGGER.log(Level.INFO, e.getMessage());
        }
    }

    public void addFurniture(Furniture furniture) {
        try {
            CheckingFramework.checkArea(this, furniture, 1);
            this.furniture.add(furniture);
        } catch (AreaLimitException e) {
           System.out.printf("Warrning! %s :\n", name);
            LOGGER.log(Level.INFO, e.getMessage());
        }
    }

    public void infoRoom() {
        System.out.println("\t" + name);
        System.out.printf("\tIllumination is: %d\n", getFullIllumination());
        InfoFramework.infoIllumination(illumination, windowsQuantity);
        InfoFramework.infoArea(furniture, area);
    }

    public int getFullIllumination() {
        int sum = 0;
        for (Illumination anIllumination : illumination) {
            sum += anIllumination.getIlluminance();
        }
        return sum;
    }

    public double getArea() {
        return area;
    }

}
