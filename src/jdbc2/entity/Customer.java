package jdbc2.entity;

public class Customer {
    private String customerID;
    private String customerName;
    private int age;
    private String level;
    private String job;
    private int reward;

    public String getCustomerID() {
        return customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public int getAge() {
        return age;
    }

    public String getLevel() {
        return level;
    }

    public String getJob() {
        return job;
    }

    public int getReward() {
        return reward;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public void setReward(int reward) {
        this.reward = reward;
    }
}
