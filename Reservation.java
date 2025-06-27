public class Reservation {
    private Customer customer;
    private Room room;

    public Reservation(Customer customer, Room room) {
        this.customer = customer;
        this.room = room;
        room.setAvailable(false);  
    }

    public Customer getCustomer() {
        return customer;
    }

    public Room getRoom() {
        return room;
    }

    public void cancelReservation() {
        room.setAvailable(true);  
    }
    
    public double calculateTotalPrice() {
        return room.getPrice();
    }
}
