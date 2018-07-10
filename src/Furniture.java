public class Furniture {
    private String name;
    private double area;

    public Furniture(String name, double area) {
        this.name = name;
        this.area = area;
    }

    public double getArea() {
        return area;
    }

    public String infoFurniture() {
        return "\t\t" + name + " (area is: " +
                +area +
                "m^2)";
    }
}


