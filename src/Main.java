public class Main {
    public static void main(String[] args) {
        Building building = new Building("First building");
        building.addRoom("First room", 100, 0);
        building.addRoom("Second room", 5, 2);
        building.add(1, new Bulb(150));
        building.add(1, new Bulb(2500));
        building.add(0, new Furniture("Table", 3.5));
        building.add(0, new Furniture("Soft chair", 5));
        building.info();
        Building building2 = new Building("Second building");
        building2.addRoom("First room", 95.15, 3);
        building2.add(0, new Furniture("Chair",25));
        building2.info();
    }
}
