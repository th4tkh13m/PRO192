package EncapsulationDemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Account {

    private int accNumber;
    private double balance;
    private Date dateCreated;

    public Account() {
    }

    public Account(int accNumber, double balance, String dateCreated) {
        this.accNumber = accNumber;
        this.balance = balance;
        this.dateCreated = convertDate(dateCreated);
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Date convertDate(String dateCreated2) {
        Date tempDate = null;
        SimpleDateFormat formatter1 = new SimpleDateFormat("dd/MM/yyyy");
        try {
            tempDate = formatter1.parse(dateCreated2);
        } catch (ParseException ex) {
            Logger.getLogger(Account.class.getName()).log(Level.SEVERE, null, ex);
        }

        return tempDate;
    }


    @Override
    public String toString() {
        return "Account [accNumber=" + accNumber + ", balance=" + balance + ", dateCreated=" + dateCreated + "]";
    }
}
