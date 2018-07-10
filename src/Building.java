import java.util.ArrayList;

public class Building {
    private String name;
    private ArrayList<Room> rooms = new ArrayList<Room>();
    private int numberOfRooms = 0;

    public Building(String name) {
        this.name = name;
    }

    public void addRoom(String name, double area, int windows) {
        rooms.add(numberOfRooms, new Room(name, area, windows));
        numberOfRooms++;
    }

    public void add(int indexRoom, Bulb bulb) {
        int quantity = 1;
        rooms.get(indexRoom).addIllumination(bulb, quantity);
    }

    public void add(int indexRoom, Furniture furniture) {
        Room room = rooms.get(indexRoom);
        room.addFurniture(furniture);
    }

    public void info() {
        System.out.println(name);
        for (Room element : rooms) {
            element.infoRoom();
        }
    }
}