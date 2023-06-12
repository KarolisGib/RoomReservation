import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Reservation.filledRooms();
        Scanner sc = new Scanner(System.in);

        System.out.println("Sveiki atvyke į kambariu rezervaciją");
        while (true) {
            info();

            int option = 0;
            try {
                option = sc.nextInt();
            } catch (Exception e) {
                System.out.println("Įveskite teisingą skaičiaus formatą");
            }

            sc.nextLine();
            switch (option) {
                case 1:
                    System.out.println("Įveskite kambario id kuriam norėsite apsistoti");
                    Room room = Room.findRoomById(sc.nextInt());
                    sc.nextLine();
                    Guest guest = new Guest();
                    System.out.println("Įveskite vardą");
                    guest.setName(sc.nextLine());
                    System.out.println("Įveskite pavardę");
                    guest.setSurname(sc.nextLine());
                    room.addGuest(guest);
                    System.out.println("Rezervacija sekminga, jusu ID yra "+ Room.id);
                    break;
                case 2:
                    System.out.println("Įveskite kambario kurį norite trinti id");
                    Room.deleteRoom(sc.nextInt());
                    sc.nextLine();
                    break;
                case 3:
                    Guest.checkAvailability();
                    break;
                case 4:
                    System.exit(1);
                    break;
            }
        }
    }

    public static void info() {
        System.out.println("Spauskite 1 užsiregistruoti");
        System.out.println("Spauskite 2 išsiregistruoti");
        System.out.println("Spauskite 3 peržiurėti užimtumą");
        System.out.println("Spauskite 4 išeiti");
    }
}