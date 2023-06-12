public class Guest {

    private int id;

    private String name;

    private String surname;

    private int roomId;

    public Guest() {

    }

    public Guest(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

    @Override
    public String toString() {
        return "Rezervacija{" +
                "Kambarys: " + roomId +
                ", Svečio vardas: '" + name + '\'' +
                ", Svečio pavardė: '" + surname + '\'' +
                '}';
    }

    public static void checkAvailability() {
        for (int i = 0; i < Room.guests().size(); i++) {
            Guest guest = Room.guests().get(i);
            System.out.println(guest);
        }
    }
}