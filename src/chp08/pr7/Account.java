package chp08.pr7;

public class Account {
    private String num;
    private int balance;

    public Account(String num, int balance) {
        this.num = num;
        this.balance = balance;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public boolean transfer(Account target, int amount) {
        if (this.getBalance() >= amount) {
            this.setBalance(this.getBalance() - amount);
            target.setBalance(target.getBalance() + amount);
            return true;
        }
        return false;
    }

    public String toString() {
        return "Account {num: " + getNum() + ", balance: " + getBalance() + "}";
    }
}
