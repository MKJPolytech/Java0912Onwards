package chp10.ex10_9;

public class MainAnimal {
    public static void main(String[] args) {
        //추상클래스는 new 연산자로 객체 생성이 불가능하다.
        //Animal animal = new Animal();

        Dog dog = new Dog();
        Cat cat = new Cat();
        
        dog.setName("말티즈");
        dog.eat("사료");
        dog.cry("멍멍");
        dog.sleep(5);
        dog.wag();

        cat.setName("페르시안");
        cat.eat("생선");
        cat.cry("냐옹");
        cat.sleep(8);
        cat.grooming();
    }
    
    //업캐스팅을 하면 부모 클래스의 모든 멤버 사용 가능
    //but 자식클래스의 멤버는 부모클래스의 메소드를 오버라이딩된 메소드만 사용 가능
    Animal animal = new Dog();
}
