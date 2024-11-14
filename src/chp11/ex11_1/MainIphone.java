package chp11.ex11_1;

public class MainIphone {
    public static void main(String[] args) {
        //업캐스팅된 경우의 창조 변수는 부모의 것을 사용할 수 있고 자식의 것은 오버라이딩된 것만 사용 가능
        Phone p = new iPhone();
        p.callPhone("010-3333-7777");
        p.receivePhone("02-111-5555");
        System.out.println("제조사명: " + Phone.PRODUCT_NAME);

        iPhone iPhone = new iPhone();
        iPhone.beep();
        iPhone.callPhone("02-777-1111");
        iPhone.playMusic("APT");
        iPhone.sendAirDrop("사진");
        iPhone.sendMessage("오늘 수능 대박나라~");
// 이미 생성된 객체의 참조 값을 이용해서 업캐스팅이 가능하다.
        Alarm alarm = iPhone;
        alarm.beep();
        alarm.playMusic("Sticky");

        //Alarm alarm1 = p; 불가능
    }
}
