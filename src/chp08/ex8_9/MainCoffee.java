package chp08.ex8_9;

public class MainCoffee {
    public static void main(String[] args) {
        Coffee coffee = new Coffee("아메리카노", 3500);
        System.out.printf("%s(%d원) => ", coffee.getName(), coffee.getPrice());
        coffee.setPrice(coffee.getPrice()+500);
        System.out.printf("인상 후: %s(%d원)", coffee.getName(), coffee.getPrice());
    }
}
