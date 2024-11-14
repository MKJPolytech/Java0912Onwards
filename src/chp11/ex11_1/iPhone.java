package chp11.ex11_1;

public class iPhone implements Phone, Alarm, Message {

    @Override
    public void playMusic(String musicTitle) {
        System.out.println(musicTitle + " 음악을" + PRODUCT_NAME + "Music으로 재생한다.");
    }

    @Override
    public void beep() {
        System.out.println("beep음이 삐삐삐삐 울린다");
    }

    @Override
    public void sendMessage(String content) {
        System.out.println(content + "메시지를 전송한다");
    }

    @Override
    public void receiveMessage(String content) {
        System.out.println(content + "메시지를 받는다");
    }

    @Override
    public void callPhone(String PhoneNumber) {
        System.out.println(PhoneNumber + "로 전화를 건다.");
    }

    @Override
    public void receivePhone(String PhoneNumber) {
        System.out.println(PhoneNumber + "의 전화를 받는다.");
    }

    public void sendAirDrop(String content){
        System.out.println("에어드롭으로" + content + "를(을) 보낸다.");
    }
}
