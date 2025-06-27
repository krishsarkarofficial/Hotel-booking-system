import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Hotel hotel = new Hotel();
        hotel.addRoom(new SuiteRoom("101 Suite"));
        hotel.addRoom(new StandardRoom("102"));
        hotel.addRoom(new SuiteRoom("103 Suite1"));
        hotel.addRoom(new StandardRoom("104"));

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n Welcome to Hotel ____ ");
            System.out.println("1. View Available Rooms");
            System.out.println("2. Book a Room");
            System.out.println("3. Cancel Reservation");
            System.out.println("4. Exit");
            System.out.print("PLease select an option and enter here: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  
            switch (choice) {
                case 1:  
                    System.out.println("Available Rooms:");
                    for (Room room : hotel.getAvailableRooms()) {
                        System.out.println("Room Number: " + room.getRoomNumber() + " | Price: Rupees " + room.getPrice());
                    }
                    break;

                case 2:  
                    System.out.print("Enter available room number to book: ");
                    String roomNumber = scanner.nextLine();
                    Room room = hotel.findRoomByNumber(roomNumber);

                    if (room != null && room.isAvailable()) {
                        System.out.print("Enter customer name: ");
                        String name = scanner.nextLine();
                        System.out.print("Enter customer email: ");
                        String email = scanner.nextLine();
                        System.out.print("Enter customer phone: ");
                        String phone = scanner.nextLine();

                        Customer customer = new Customer(name, email, phone);
                        Reservation reservation = new Reservation(customer, room);
                        System.out.println("Room " + roomNumber + " has been booked successfully.");
                        System.out.println("Total Price: Rupees " + reservation.calculateTotalPrice());
                    } else {
                        System.out.println("Room is either not available .");
                    }
                    break;

                case 3:  
                    System.out.print("Enter room number to cancel reservation: ");
                    roomNumber = scanner.nextLine();
                    room = hotel.findRoomByNumber(roomNumber);

                    if (room != null && !room.isAvailable()) {
                        room.setAvailable(true);
                        System.out.println("Reservation for room " + roomNumber + " has been canceled.");
                    } else {
                        System.out.println("Room is either not reserved or does not exist.");
                    }
                    break;

                case 4:  
                    System.out.println("Thank you, visit us agian");
                    return;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
