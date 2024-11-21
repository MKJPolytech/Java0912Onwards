package chp11.ex11_5_6;

public class Train implements Vehicle {
    @Override
    public void horn() {
        System.out.println("칙칙폭폭");
    }

    @Override
    public void move(String from, String to) {
        System.out.printf("기차가 %s에서 %s까지 이동합니다.\n", from, to);
    }
}
