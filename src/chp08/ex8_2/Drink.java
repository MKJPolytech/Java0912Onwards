package chp08.ex8_2;

public class Drink {
    private String name;
    private int price;

    public Drink() {
        System.out.println("default constructor 호출");
    }

    public Drink(String name, int price) {
        this.name = name;
        this.price = price;
    }

}
