package chp10.ex10_4;

public class MainSquare {
    public static void main(String[] args) {
        //Object, Shape, Square 객체의 필드와 메소드 접근가능
        Square square = new Square();
        //Shape 객체의 필드와 메소드 접근 가능(예외적으로 Square객체의 멤버를 접근할 수도 있다.)
        Shape shape = new Square();
    }
}
