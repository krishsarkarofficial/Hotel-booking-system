public class SuiteRoom extends Room {
    public SuiteRoom(String roomNumber) {
        super(roomNumber);
    }

    @Override
    public double getPrice() {
        return 20000.00; 
    }
}
