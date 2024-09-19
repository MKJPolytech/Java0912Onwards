package chp08.ex8_8;

public class Account {

    private int balance;
    private String accNumber;
    private String name;
    private String pwd;

    public Account(String accNumber, String name, String pwd, int balance) {
        this.balance = balance;
        this.accNumber = accNumber;
        this.name = name;
        this.pwd = pwd;
    }

    public int getBalance(){
        return balance;
    }

    public void setBalance(int balance){
        this.balance = balance;
    }

    public String getName(){
        return name;
    }

    public String getPwd(){
        return pwd;
    }

    //입금:deposit, 출금:withdraw
    public void deposit(int money){
        balance += money; //balance = balance + money
    }

    public void withdraw(int money){
        balance -= money;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accNumber='" + accNumber + '/' +
                ", name=" + name + '/' +
                ", pwd= " + pwd + '}';
    }
}
