package chp12.ex12_8;

public class BankAccount {
    private final String username;//final 썼으므로 바꾸는게 힘듬
    private final String accountNumber;
    private long balance;
    public BankAccount(String username, String accountNumber, long balance) {
        this.username = username;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return String.format("%s / %s / %d", username, accountNumber, balance);
    }


}
