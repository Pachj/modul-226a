public class TicketMachineAdvanced {
    private int balance;
    private int total;

    public void reset() {
        balance = 0;
    }

    public void insertCoin(int value) {
        balance += value;
    }
}
