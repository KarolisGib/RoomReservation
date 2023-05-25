import java.util.ArrayList;

public class Room {

    public int id;

    public static ArrayList<Room> rooms = new ArrayList<>();

    private ArrayList<Guest> guests;

    public Room(int roomId) {
        this.id = roomId;
        this.guests = new ArrayList<>();
        rooms.add(this);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static ArrayList<Room> getRooms() {
        return rooms;
    }

    public static void setRooms(ArrayList<Room> rooms) {
        Room.rooms = rooms;
    }

    public ArrayList<Guest> getGuests() {
        return guests;
    }

    public void setGuests(ArrayList<Guest> guests) {
        this.guests = guests;
    }

    public void addGuest(Guest guest) {
        guest.setRoomId(this.id);
        this.guests.add(guest);
    }

    public static ArrayList<Guest> guests(){
        ArrayList<Guest> guests = new ArrayList<>();
        for (int i = 0; i < rooms.size(); i++) {
            for (int a = 0; a < rooms.get(i).guests.size(); a++) {
                guests.add(rooms.get(i).guests.get(a));
            }
        }
        return guests;
    }

    public static Room findRoomById(int id){
        for (int i = 0; i < rooms.size(); i++) {
            if (rooms.get(i).id == id){
                return rooms.get(i);
            }
        }
        return new Room(id);
    }

    public static void deleteRoom(int id){
            rooms.remove(id);
            System.out.println("Rezervacija panaikinta");
    }
}
