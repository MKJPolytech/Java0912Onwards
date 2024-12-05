package _gui.controller;

import _gui.view.OrderInfoView;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {

    public static final int FRAME_WIDTH = 600;

    public static final int FRAME_HEIGHT = 500;

    public static int frameX =300;

    public static int frameY =200;

    public MainFrame() {
        super("정보검색프로그램");

        // Toolkit과 Dimension을 사용하여 화면 크기를 가져옴
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        double sw = dimension.getWidth(); // 화면 너비
        double sh = dimension.getHeight(); // 화면 높이

        // 프레임의 중앙 위치 계산
        frameX = (int)((0.5)*(sw - FRAME_WIDTH));
        frameY = (int)((0.5)*(sw - FRAME_HEIGHT));

        OrderInfoView orderInfoView = new OrderInfoView();
        add(orderInfoView, "Center");//""생략하면 Center로 무조건 들어감

        // 프레임 설정
        setLocation(frameX, frameY); // 프레임 위치 설정
        setSize(FRAME_WIDTH, FRAME_HEIGHT); // 프레임 크기 설정
        setVisible(true); // 프레임 보이기
    }

    public static void main(String[] args) {
        new MainFrame();
    }
}

//Toolkit toolkit = Toolkit.getDefaultToolkit();
//Dimension dimension = toolkit.getScreenSize();
//double sw = dimension.getWidth();
//double sh = dimension.getHeight();

//setLocation(frameX, frameY);
//setSize(FRAME_X, FRAME_Y);
//setVisible(true);

// x= (sw/2) - (w/2) = 1/2(sw-w)
// y= (sh/2) - (h/2) = 1/2(sh-w)