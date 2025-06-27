public class StandardRoom extends Room {
    public StandardRoom(String roomNumber) {
        super(roomNumber);
    }

    @Override
    public double getPrice() {
        return 10000.00; 
    }
}
