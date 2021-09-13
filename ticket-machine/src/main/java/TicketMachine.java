/**
 * TicketMachine models a naive ticket machine that issues
 * flat-fare tickets.
 * The price of a ticket is specified via the constructor.
 * It is a naive machine in the sense that it trusts its users
 * to insert enough money before trying to print a ticket.
 * It also assumes that users enter sensible amounts.
 *
 * @author David J. Barnes and Michael Kolling
 * @version 2021.02.06
 */
public class TicketMachine {
    // The price of a ticket from this machine.
    private int price;
    // The amount of money entered by a customer so far.
    private int balance;
    // The total amount of money collected by this machine.
    private int total;

    /**
     * Create a machine that issues tickets of the given price.
     * Note that the price must be greater than zero, and there
     * are no checks to ensure this.
     */
    public TicketMachine(int ticketCost)
    {
        if (ticketCost > 0) {
            price = ticketCost;
        } else {
            this.price = 1;
        }

        balance = 0;
        total = 0;
    }

    public TicketMachine()
    {
        price = 1000;
        balance = 0;
        total = 0;
    }

    /**
     * Return the price of a ticket.
     */
    public int getPrice()
    {
        return price;
    }

    public String showPrice() {
        return "The price of a ticket is " + getPrice() + " cents";
    }

    /**
     * Return the amount of money already inserted for the
     * next ticket.
     */
    public int getBalance()
    {
        return balance;
    }
    public int getTotal()
    {
        return total;
    }

    /**
     * Receive an amount of money in cents from a customer.
     */
    public void insertMoney(int amount)
    {
        if (amount > 0) {
            balance += amount;
        }
    }

    /**
     * Print a ticket.
     * Update the total collected and
     * reduce the balance to zero.
     */
    public void printTicket()
    {
        if (this.balance >= this.price) {
            // Simulate the printing of a ticket.
            System.out.println("##################");
            System.out.println("# The BlueJ Line");
            System.out.println("# Ticket");
            System.out.println("# " + price + " cents.");
            System.out.println("##################");
            System.out.println();

            this.balance = this.balance - price;

            // Update the total collected with the balance.
            total += balance;

            if (this.balance > 0) {
                returnMoney();
            }

        } else {
            System.out.println("Not enough money inserted.");
        }
    }

    private void returnMoney() {
        System.out.println("Return money: " + this.balance + " cents");
    }

    public void empty() {
        this.balance = 0;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
