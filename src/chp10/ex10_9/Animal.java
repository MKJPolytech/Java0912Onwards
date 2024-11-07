package chp10.ex10_9;

//추상 클래스
//자식 클래스들을 표준화(특정 기능을 반드시 갖도록) 시키기 위해서 만듬
abstract public class Animal {

    private String name;

    abstract void eat(String food);
    abstract void cry(String sound);
    public void sleep(int hours){
        System.out.println(hours + "시간 동안 자다.");
    };

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
