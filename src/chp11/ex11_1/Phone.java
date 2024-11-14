package chp11.ex11_1;

public interface Phone {
    //인터페이스는 상수, 추상메소드, default, static 메소드 등을 사용할 수 있습니다.
    // 상수는 final, static을 생략 가능
    String PRODUCT_NAME = "애플";
    public abstract void callPhone(String Phone); //public abstract는 생략 가능
    //추상메소드는 public abstract를 생략 가능
    void receivePhone(String Phone);
}
