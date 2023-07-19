package RestaurantManagementSystem;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.LineBorder;
import java.util.List;

public class TotalOrder extends JFrame implements ActionListener{
    private ImageIcon bgImage, homeImage;
    private JLabel bgLbl, summaryLbl;
    private JButton homeBtn, totalOrderBtn, voidBtn;
    private JTextArea totalAr, summaryAr;
    private LineBorder outline = new LineBorder(Color.BLACK);
    List<String> orders;
    
    TotalOrder(List<String> orders) {
        this.orders = orders;
        setTitle("Total");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(900, 650);
        setVisible(true);

        bgImage  = new ImageIcon("C:\\Users\\Nico\\Documents\\NetBeansProjects\\RestaurantManagementSystem\\src\\main\\java\\images\\ResizedBG.jpg");
        bgLbl = new JLabel(bgImage);
        
        homeImage = new ImageIcon("C:\\Users\\Nico\\Documents\\NetBeansProjects\\RestaurantManagementSystem\\src\\main\\java\\images\\Home.png");
        homeBtn = new JButton (homeImage);
        homeBtn.setBounds(50, 50, homeImage.getIconWidth(), homeImage.getIconHeight());
        homeBtn.setContentAreaFilled(false);
        homeBtn.setOpaque(false);
        homeBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        homeBtn.addActionListener(this);
        bgLbl.add(homeBtn);
        
        summaryLbl= new JLabel("Summary of Order/s: ");
        summaryLbl.setBounds(130, 80, 150, 20);
        bgLbl.add(summaryLbl);
        
        summaryAr = new JTextArea ();
        summaryAr.setBounds(130, 100, 600, 300);
        summaryAr.setEditable(false);
        summaryAr.setOpaque(false);
        summaryAr.setBorder(outline);
        bgLbl.add(summaryAr);
        
        totalOrderBtn = new JButton("Total Order");
        totalOrderBtn.setBounds(130, 450, 120, 20);
        totalOrderBtn.setContentAreaFilled(false);
        totalOrderBtn.setFocusPainted(false);
        totalOrderBtn.setOpaque(true);
        totalOrderBtn.setForeground(Color.BLACK);
        totalOrderBtn.setBackground(Color.WHITE);
        totalOrderBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        bgLbl.add(totalOrderBtn);
        totalOrderBtn.addActionListener(this);
        
        totalAr = new JTextArea();
        totalAr.setBounds(270, 450, 120, 20);
        totalAr.setEditable(false);
        totalAr.setOpaque(false);
        totalAr.setBorder(outline);
        bgLbl.add(totalAr);
        
        voidBtn = new JButton("Void Order");
        voidBtn.setBounds(130, 500, 120, 20);
        voidBtn.setContentAreaFilled(false);
        voidBtn.setFocusPainted(false);
        voidBtn.setOpaque(true);
        voidBtn.setForeground(Color.BLACK);
        voidBtn.setBackground(Color.WHITE);
        voidBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        bgLbl.add(voidBtn);
        voidBtn.addActionListener(this);
        
        add(bgLbl);
        
        displayOrders();
    }
    
    private void displayOrders() {
        if (orders.isEmpty()) {
            summaryAr.setText("No orders found.");
        } else {
            StringBuilder sb = new StringBuilder();
            for (String order : orders) {
                sb.append(order).append("\n");
            }
            summaryAr.setText(sb.toString());
        }
    }
    
    @Override
    public void actionPerformed(ActionEvent clicked) {
        if(clicked.getSource() == homeBtn){
            dispose();
            new HomePage();
        }
        else if (clicked.getSource() == voidBtn){
            orders.clear();
            totalAr.setText("");
            summaryAr.setText("Order/s removed.");
        }
        else if (clicked.getSource() == totalOrderBtn) {
            int total = 0;
            for (String order : orders) {
                String[] parts = order.split(" = P");
                int quantity = Integer.parseInt(parts[0].split(" x ")[0].trim());
                int price = Integer.parseInt(parts[1]);
                total += quantity * price;
            }
            totalAr.setText("Total: P " + total);
        }
    }
//    private int calculateTotalOrder() {
//        int total = 0;
//        for (String order : orders) {
//            String[] parts = order.split(" = P");
//            int quantity = Integer.parseInt(parts[0].split(" x ")[0].trim());
//            int price = Integer.parseInt(parts[1]);
//            total += quantity * price;
//        }
//        return total;
//    }
}
