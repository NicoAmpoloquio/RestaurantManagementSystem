package RestaurantManagementSystem;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.LineBorder;
import java.util.ArrayList;
import java.util.List;

public class Drinks extends JFrame implements ActionListener{
    private ImageIcon bgImage, homeImage;
    private JLabel bgLbl, quantityLbl, priceLbl, summaryLbl, itemLbl;
    private JButton homeBtn, addBtn1, minusBtn1, addBtn2, minusBtn2, addBtn3, minusBtn3, addBtn4, minusBtn4, addBtn5, minusBtn5, orderBtn, voidBtn, viewBtn;
    private JComboBox menuCbox;
    private JTextField priceFldBw, priceFldMs, priceFldBs, priceFldSc, priceFldCc;
    private JTextArea summaryAr;
    private int intBw, intMs, intBs, intSc, intCc;
    private int bwPrice = 40, msPrice = 150, bsPrice = 150, scPrice = 99, ccPrice = 60;
    private LineBorder outline = new LineBorder(Color.BLACK);
    private List<String> orders = new ArrayList<>();
    private TotalOrder totalOrder;
            
    Drinks(){
        setTitle("Drinks");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(900, 650);
        setVisible(true);

        bgImage  = new ImageIcon("C:\\Users\\Nico\\Desktop\\img\\ResizedBG.jpg");
        bgLbl = new JLabel(bgImage);
        
        homeImage = new ImageIcon("C:\\Users\\Nico\\Desktop\\img\\Home.png");
        homeBtn = new JButton (homeImage);
        homeBtn.setBounds(50, 50, homeImage.getIconWidth(), homeImage.getIconHeight());
        homeBtn.setContentAreaFilled(false);
        homeBtn.setOpaque(false);
        homeBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        homeBtn.addActionListener(this);
        bgLbl.add(homeBtn);
        
        String[] choice = {"Drinks", "Appetizers", "Salad", "Dessert", "Main Course"};
        menuCbox = new JComboBox(choice);
        menuCbox.setBounds(50, 110, 100, 20);
        menuCbox.setOpaque(true);
        menuCbox.setForeground(Color.BLACK);
        menuCbox.setBackground(Color.WHITE);
        menuCbox.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        menuCbox.addActionListener(this);
        menuCbox.addActionListener(this);
        bgLbl.add(menuCbox);
        
        itemLbl = new JLabel("Bottled Water");
        itemLbl.setBounds(50, 150, 250, 20);
        bgLbl.add(itemLbl);
        
        addBtn1 = new JButton("+");
        addBtn1.setBounds(250, 150, 50, 20);
        addBtn1.setContentAreaFilled(false);
        addBtn1.setFocusPainted(false);
        addBtn1.setOpaque(true);
        addBtn1.setForeground(Color.BLACK);
        addBtn1.setBackground(Color.WHITE);
        addBtn1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        bgLbl.add(addBtn1);
        addBtn1.addActionListener(this);
        
        minusBtn1 = new JButton("-");
        minusBtn1.setBounds(320, 150, 50, 20);
        minusBtn1.setContentAreaFilled(false);
        minusBtn1.setFocusPainted(false);
        minusBtn1.setOpaque(true);
        minusBtn1.setForeground(Color.BLACK);
        minusBtn1.setBackground(Color.WHITE);
        minusBtn1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        bgLbl.add(minusBtn1);
        minusBtn1.addActionListener(this);
        
        priceFldBw = new JTextField("0");
        priceFldBw.setBounds(400, 150, 50, 20);
        bgLbl.add(priceFldBw);
        priceFldBw.setEditable(false);
        
        priceLbl = new JLabel("P40.00");
        priceLbl.setBounds(500, 150, 100, 20);
        bgLbl.add(priceLbl);
        
        itemLbl = new JLabel("Mango Shake");
        itemLbl.setBounds(50, 180, 250, 20);
        bgLbl.add(itemLbl);
        
        addBtn2 = new JButton("+");
        addBtn2.setBounds(250, 180, 50, 20);
        addBtn2.setContentAreaFilled(false);
        addBtn2.setFocusPainted(false);
        addBtn2.setOpaque(true);
        addBtn2.setForeground(Color.BLACK);
        addBtn2.setBackground(Color.WHITE);
        addBtn2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        bgLbl.add(addBtn2);
        addBtn2.addActionListener(this);
        
        minusBtn2 = new JButton("-");
        minusBtn2.setBounds(320, 180, 50, 20);
        minusBtn2.setContentAreaFilled(false);
        minusBtn2.setFocusPainted(false);
        minusBtn2.setOpaque(true);
        minusBtn2.setForeground(Color.BLACK);
        minusBtn2.setBackground(Color.WHITE);
        minusBtn2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        bgLbl.add(minusBtn2);
        minusBtn2.addActionListener(this);
        
        priceFldMs = new JTextField("0");
        priceFldMs.setBounds(400, 180, 50, 20);
        bgLbl.add(priceFldMs);
        priceFldMs.setEditable(false);
        
        priceLbl = new JLabel("P150.00");
        priceLbl.setBounds(500, 180, 100, 20);
        bgLbl.add(priceLbl);
        
        itemLbl = new JLabel("Buko Shake");
        itemLbl.setBounds(50, 210, 250, 20);
        bgLbl.add(itemLbl);
        
        addBtn3 = new JButton("+");
        addBtn3.setBounds(250, 210, 50, 20);
        addBtn3.setContentAreaFilled(false);
        addBtn3.setFocusPainted(false);
        addBtn3.setOpaque(true);
        addBtn3.setForeground(Color.BLACK);
        addBtn3.setBackground(Color.WHITE);
        addBtn3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        bgLbl.add(addBtn3);
        addBtn3.addActionListener(this);
        
        minusBtn3 = new JButton("-");
        minusBtn3.setBounds(320, 210, 50, 20);
        minusBtn3.setContentAreaFilled(false);
        minusBtn3.setFocusPainted(false);
        minusBtn3.setOpaque(true);
        minusBtn3.setForeground(Color.BLACK);
        minusBtn3.setBackground(Color.WHITE);
        minusBtn3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        bgLbl.add(minusBtn3);
        minusBtn3.addActionListener(this);
        
        priceFldBs = new JTextField("0");
        priceFldBs.setBounds(400, 210, 50, 20);
        bgLbl.add(priceFldBs);
        priceFldBs.setEditable(false);
        
        priceLbl = new JLabel("P150.00");
        priceLbl.setBounds(500, 210, 100, 20);
        bgLbl.add(priceLbl);
        
        itemLbl = new JLabel("Sprite in Can");
        itemLbl.setBounds(50, 240, 250, 20);
        bgLbl.add(itemLbl);
        
        addBtn4 = new JButton("+");
        addBtn4.setBounds(250, 240, 50, 20);
        addBtn4.setContentAreaFilled(false);
        addBtn4.setFocusPainted(false);
        addBtn4.setOpaque(true);
        addBtn4.setForeground(Color.BLACK);
        addBtn4.setBackground(Color.WHITE);
        addBtn4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        bgLbl.add(addBtn4);
        addBtn4.addActionListener(this);
        
        minusBtn4 = new JButton("-");
        minusBtn4.setBounds(320, 240, 50, 20);
        minusBtn4.setContentAreaFilled(false);
        minusBtn4.setFocusPainted(false);
        minusBtn4.setOpaque(true);
        minusBtn4.setForeground(Color.BLACK);
        minusBtn4.setBackground(Color.WHITE);
        minusBtn4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        bgLbl.add(minusBtn4);
        minusBtn4.addActionListener(this);
        
        priceFldSc = new JTextField("0");
        priceFldSc.setBounds(400, 240, 50, 20);
        bgLbl.add(priceFldSc);
        priceFldSc.setEditable(false);
        
        priceLbl = new JLabel("P99.00");
        priceLbl.setBounds(500, 240, 100, 20);
        bgLbl.add(priceLbl);
        
        itemLbl = new JLabel("Coke in Can");
        itemLbl.setBounds(50, 270, 250, 20);
        bgLbl.add(itemLbl);
        
        addBtn5 = new JButton("+");
        addBtn5.setBounds(250, 270, 50, 20);
        addBtn5.setContentAreaFilled(false);
        addBtn5.setFocusPainted(false);
        addBtn5.setOpaque(true);
        addBtn5.setForeground(Color.BLACK);
        addBtn5.setBackground(Color.WHITE);
        addBtn5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        bgLbl.add(addBtn5);
        addBtn5.addActionListener(this);
        
        minusBtn5 = new JButton("-");
        minusBtn5.setBounds(320, 270, 50, 20);
        minusBtn5.setContentAreaFilled(false);
        minusBtn5.setFocusPainted(false);
        minusBtn5.setOpaque(true);
        minusBtn5.setForeground(Color.BLACK);
        minusBtn5.setBackground(Color.WHITE);
        minusBtn5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        bgLbl.add(minusBtn5);
        minusBtn5.addActionListener(this);
        
        priceFldCc = new JTextField("0");
        priceFldCc.setBounds(400, 270, 50, 20);
        bgLbl.add(priceFldCc);
        priceFldCc.setEditable(false);
        
        priceLbl = new JLabel("P99.00");
        priceLbl.setBounds(500, 270, 100, 20);
        bgLbl.add(priceLbl);
        
        quantityLbl= new JLabel("Quantity");
        quantityLbl.setBounds(400, 110, 100, 20);
        bgLbl.add(quantityLbl);
        
        priceLbl = new JLabel("Price");
        priceLbl.setBounds(500, 110, 100, 20);
        bgLbl.add(priceLbl);
        
        summaryLbl = new JLabel("Status: ");
        summaryLbl.setBounds(600, 110, 100, 20);
        bgLbl.add(summaryLbl);
        
        summaryAr = new JTextArea();
        summaryAr.setBounds(600, 130, 270, 300);
        summaryAr.setEditable(false);
        summaryAr.setOpaque(false);
        summaryAr.setBorder(outline);
        bgLbl.add(summaryAr);
        
        orderBtn = new JButton("Add Order");
        orderBtn.setBounds(100, 350, 120, 20);
        orderBtn.setContentAreaFilled(false);
        orderBtn.setFocusPainted(false);
        orderBtn.setOpaque(true);
        orderBtn.setForeground(Color.BLACK);
        orderBtn.setBackground(Color.WHITE);
        orderBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        bgLbl.add(orderBtn);
        orderBtn.addActionListener(this);
        
//        voidBtn = new JButton("Void Order");
//        voidBtn.setBounds(250, 350, 120, 20);
//        voidBtn.setContentAreaFilled(false);
//        voidBtn.setFocusPainted(false);
//        voidBtn.setOpaque(true);
//        voidBtn.setForeground(Color.BLACK);
//        voidBtn.setBackground(Color.WHITE);
//        voidBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
//        bgLbl.add(voidBtn);
//        voidBtn.addActionListener(this);
        
        viewBtn = new JButton("View Orders");
        viewBtn.setBounds(400, 350, 120, 20);
        viewBtn.setContentAreaFilled(false);
        viewBtn.setFocusPainted(false);
        viewBtn.setOpaque(true);
        viewBtn.setForeground(Color.BLACK);
        viewBtn.setBackground(Color.WHITE);
        viewBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        bgLbl.add(viewBtn);
        viewBtn.addActionListener(this);
        
        add(bgLbl);
    }
    @Override
    public void actionPerformed(ActionEvent clicked) {
        if(clicked.getSource() == homeBtn){
            dispose();
            new HomePage();
        }
        else if (clicked.getSource() == menuCbox) {
            dispose();
            String selectedReport = (String) menuCbox.getSelectedItem();
            switch (selectedReport) {
                case "Main Course":
                    new MainCourse();
                    break;
                case "Appetizers":
                    new Appetizers();
                    break;
                case "Salad":
                    new Salad();
                    break;
                case "Dessert":
                    new Dessert();
                    break;
                case "Drinks":
                    new Drinks();
                    break;
                default:
                    break;
            }
        }
        else if(clicked.getSource() == addBtn1){
            intBw++;
            String strBw = Integer.toString(intBw);
            priceFldBw.setText(strBw); 
        }
        else if(clicked.getSource() == minusBtn1){
            intBw--;
            String strBw = Integer.toString(intBw);
            priceFldBw.setText(strBw); 
        }
        else if(clicked.getSource() == addBtn2){
            intMs++;
            String strMs = Integer.toString(intMs);
            priceFldMs.setText(strMs); 
        }
        else if(clicked.getSource() == minusBtn2){
            intMs--;
            String strMs = Integer.toString(intMs);
            priceFldMs.setText(strMs); 
        }
        else if(clicked.getSource() == addBtn3){
            intBs++;
            String strBs = Integer.toString(intBs);
            priceFldBs.setText(strBs); 
        }
        else if(clicked.getSource() == minusBtn3){
            intBs--;
            String strBs = Integer.toString(intBs);
            priceFldBs.setText(strBs); 
        }
        else if(clicked.getSource() == addBtn4){
            intSc++;
            String strLp = Integer.toString(intSc);
            priceFldSc.setText(strLp); 
        }
        else if(clicked.getSource() == minusBtn4){
            intSc--;
            String strLp = Integer.toString(intSc);
            priceFldSc.setText(strLp); 
        }
        else if(clicked.getSource() == addBtn5){
            intCc++;
            String strCc = Integer.toString(intCc);
            priceFldCc.setText(strCc); 
        }
        else if(clicked.getSource() == minusBtn5){
            intCc--;
            String strCc = Integer.toString(intCc);
            priceFldCc.setText(strCc); 
        }
        else if (clicked.getSource() == voidBtn){
            priceFldBw.setText("0");
            priceFldMs.setText("0");
            priceFldBs.setText("0");
            priceFldSc.setText("0");
            priceFldCc.setText("0");
            summaryAr.setText("Order/s removed.");
        }
        else if(clicked.getSource() == orderBtn){
            int bw, ms, bs, sc, cc;
            bw = Integer.parseInt(priceFldBw.getText());
            ms = Integer.parseInt(priceFldMs.getText());
            bs = Integer.parseInt(priceFldBs.getText());
            sc = Integer.parseInt(priceFldSc.getText());
            cc = Integer.parseInt(priceFldCc.getText());
            
            if (bw <= 0 && ms <= 0 && bs <= 0 && sc <= 0 && cc <=0) {
                summaryAr.setText("ERROR!!! You entered a negative quantity.");
            }
            else {
//                summaryAr.setText(bw + " x " + " Bottled Water = P" + bwPrice + System.lineSeparator()
//                        + ms + " x " + " Mango Shake = P" + msPrice + System.lineSeparator()
//                        + bs + " x " + " Buko Shake = P" + bsPrice + System.lineSeparator()
//                        + sc + " x " + " Sprite in Can = P" + scPrice + System.lineSeparator()
//                        + cc + " x " + " Coke in Can = P" + ccPrice);
                String bwOrder = bw + " x Bottled Water = P" + (bwPrice * bw);
                String msOrder = ms + " x Mango Shake = P" + (msPrice * ms);
                String bsOrder = bs + " x Buko Shake = P" + (bsPrice * bs);
                String scOrder = sc + " x Sprite in Can = P" + (scPrice * sc);
                String ccOrder = cc + " x Coke in Can = P" + (ccPrice * cc);

                orders.add(bwOrder);
                orders.add(msOrder);
                orders.add(bsOrder);
                orders.add(scOrder);
                orders.add(ccOrder);
                
                summaryAr.setText("Order/s added successfully.");
            }
        }
        else if(clicked.getSource() == viewBtn){
            dispose();
            new TotalOrder(orders);
        }
    }
}
