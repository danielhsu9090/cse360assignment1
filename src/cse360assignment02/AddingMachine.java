package cse360assignment02;

public class AddingMachine {
    private int total;
    private String transactions;

    public AddingMachine () {
        total = 0;  // not needed - included for clarity
        transactions = "0";
    }

    public int getTotal () {
        return total;
    }

    public void add (int value) {
        total = total + value; // add value to total
        transactions = transactions + " + " + value; // add the operation to the history
    }

    public void subtract (int value) {
        total = total - value; // subtract value from total
        transactions = transactions + " - " + value; // add the operation to the history
    }

    public String toString () {
        return transactions; // return the entire string of the history of transactions
    }

    public void clear() {
        transactions = "0"; // clear the history string and reset it to "0"
    }
}
