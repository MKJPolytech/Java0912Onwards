package chp09.ex9_3;

import java.util.Random;

public class MainRandom {
    public static void main(String[] args) {
        Random rand = new Random();

        System.out.printf("임의의 정수값: %d\n", rand.nextInt());
        System.out.printf("0~9사이의 임의의 정수값: %d\n", rand.nextInt(10));
        System.out.printf("1~10사이의 임의의 정수값: %d\n", rand.nextInt(10)+1);
        System.out.printf("임의의 실수값: %f\n", rand.nextDouble());
        System.out.printf("임의의 논리값: %b\n", rand.nextBoolean());
    }
}
