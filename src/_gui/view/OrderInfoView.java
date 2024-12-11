package _gui.view;

import _gui.entity.OrderEntity;
import _gui.repository.OrderRepository;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class OrderInfoView extends JPanel {

    JPanel panN = new JPanel(new GridLayout(2, 1)); //동서남북 기준 북쪽
    JPanel panC = new JPanel(new BorderLayout(5, 28));// 중앙(Center)

    JPanel pan1 = new JPanel();
    JPanel pan2 = new JPanel();
    JTextField tfSearch = new JTextField(20); //숫자 20개 정도 넓이
    DefaultTableModel tableModel;
    JTable table;
    String [] header = {"주문번호", "주문고객", "주문제품", "수량", "배송지", "주문일자"};

    public OrderInfoView() {
        setLayout(new BorderLayout()); //FlowLayout => BorderLayout으로 설정

        panN.add(pan1);
        panN.add(pan2);

        add(panN, "North"); //대소문자 중요
        add(panC, "Center");

        addPan1();
        addPan2();
        addTable();
        initList("");
    }
    
    public void addPan1(){
        JLabel lblTitle = new JLabel("검색 프로그램");
        pan1.add(lblTitle);
    }

    public void addPan2(){
        JLabel lblSearch = new JLabel("검색어");
        JButton btnSearch = new JButton("검색");
        btnSearch.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
            }
        });
        pan2.add(lblSearch);
        pan2.add(tfSearch);
        pan2.add(btnSearch);
    }

    public void addTable(){
        tableModel = new DefaultTableModel(header, 15){
            @Override
            public boolean isCellEditable(int row, int column) {//재정의 가능
                return false;
            }
        };

        table = new JTable(tableModel);
        TableColumnModel columnModel = table.getColumnModel();
        columnModel.getColumn(0).setPreferredWidth(70);
        columnModel.getColumn(1).setPreferredWidth(100);
        columnModel.getColumn(2).setPreferredWidth(180);
        columnModel.getColumn(3).setPreferredWidth(50);
        columnModel.getColumn(4).setPreferredWidth(200);
        columnModel.getColumn(5).setPreferredWidth(100);

        JScrollPane scrollPane = new JScrollPane(table);
        panC.add(scrollPane);
    }

    public void initList(String SearchWord){
        OrderRepository orderRepository = new OrderRepository();
        ArrayList<OrderEntity> orderList = orderRepository.getOrderList(SearchWord);
        tableModel.setRowCount(orderList.size());
        int i = 0;
        for (OrderEntity orderEntity : orderList) {
            tableModel.setValueAt(orderEntity.getOrderNum(), i, 0);
            tableModel.setValueAt(orderEntity.getCustomerName(), i, 1);
            tableModel.setValueAt(orderEntity.getProductName(), i, 2);
            tableModel.setValueAt(orderEntity.getAmount(), i, 3);
            tableModel.setValueAt(orderEntity.getDestination(), i, 4);
            tableModel.setValueAt(orderEntity.getOrderDate(), i, 5);
            i++;
        }
    }
}
