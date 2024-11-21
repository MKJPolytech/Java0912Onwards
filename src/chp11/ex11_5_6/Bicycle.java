package chp11.ex11_5_6;

public class Bicycle implements Vehicle {
    @Override
    public void horn() {
        System.out.println("따르릉 따르릉");
    }

    @Override
    public void move(String from, String to) {
        System.out.printf("자전거가 %s에서 %s까지 이동합니다.\n", from, to);
    }

    //인터페이스에 정의된 static 메소드 stop()은 오버라이딩 할 수 없다.
    //인터페이스의 static 오버라이딩 할 수는 없지만 현재 class에서 정의는 할 수 있다.
    // 사용할 때는 Bicycle.stop (각각 별도의 stop임)
    static public void stop(String place){
        System.out.println(place + "에 자전거가 멈춘다.");
    }
}
