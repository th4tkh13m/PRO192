package Account;

public class Account {

    private String id;
    private String name;
    private int balance = 0;

    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int credit(int amount) {
        this.balance = this.getBalance() + amount;
        return this.getBalance();
    }

    public int debit(int amount) {
        if (amount <= this.getBalance()) {
            this.balance = this.getBalance() - amount;
        } else
            System.out.println("Amount exceeded balance");
        return this.getBalance();
    }

    public int transferTo(Account another, int amount) {
        if (amount <= this.getBalance()) {
            this.balance = this.getBalance() - amount;
            another.balance = another.getBalance() + amount;
        } else
            System.out.println("Amount exceeded balance");
        return this.getBalance();
    }

    @Override
    public String toString() {
        return "Account [id=" + id + ", name=" + name + ", balance=" + balance + "]";
    }
}
