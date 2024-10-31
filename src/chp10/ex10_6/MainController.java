package chp10.ex10_6;

import java.util.ArrayList;

public class MainController {
    public static void main(String[] args) {
        Square square = new Square();
        square.name = "정사각형";
        square.setWidth(7);

        Triangle triangle = new Triangle();
        triangle.setWidth(15);
        triangle.setHeight(9);
        triangle.name = "삼각형";

        Circle circle = new Circle();
        circle.setR(15);
        circle.name = "원";

        ArrayList<Shape> arrList = new ArrayList<>();
        arrList.add(square);
        arrList.add(triangle);
        arrList.add(circle);
//        Shape[] arr = {square, triangle, circle};

        viewShapes(arrList);
    }

    public static void viewShapes(ArrayList<Shape> arrList) {
//        public static void viewShapes(Shape[] arr) {
        for (Shape shape : arrList) {
            System.out.printf("%s의 면적은 %.2f㎠\n", shape.name, shape.area());
        }
    }
}
