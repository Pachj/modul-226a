public class MainApp {

    public static void main(String[] args) {
        TicketMachine ticketMachine = new TicketMachine(1000);

        ticketMachine.insertMoney(1000);
        ticketMachine.printTicket();

    }
}
