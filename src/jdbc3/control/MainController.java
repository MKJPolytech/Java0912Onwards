package jdbc3.control;

import jdbc3.service.ProductService;
import jdbc3.service.ProductServiceImpl;
import jdbc3.view.MenuView;

import java.util.Scanner;

public class MainController {
    public static void main(String[] args) {

        Scanner s1 = new Scanner(System.in); //숫자전용
        Scanner s2 = new Scanner(System.in); //문자열 전용, 겹치면 않 좋아서
        int menu = MenuView.printMenu(s1);
        ProductService productService = new ProductServiceImpl();

        switch (menu) {
            case 1:
                productService.search(s1, s2);
                break;
            case 2:
                ;
                break;
            case 3:
                ;
                break;
        }

        s1.close();
        s2.close();
    }


}
