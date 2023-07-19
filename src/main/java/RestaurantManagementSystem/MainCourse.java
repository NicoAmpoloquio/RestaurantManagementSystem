package RestaurantManagementSystem;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.LineBorder;
import java.util.ArrayList;
import java.util.List;

public class MainCourse extends JFrame implements ActionListener{
    private ImageIcon bgImage, homeImage;
    private JLabel bgLbl, quantityLbl, priceLbl, summaryLbl, itemLbl;
    private JButton homeBtn, addBtn1, minusBtn1, addBtn2, minusBtn2, addBtn3, minusBtn3, addBtn4, minusBtn4, addBtn5, minusBtn5, orderBtn, voidBtn, viewBtn;
    private JComboBox menuCbox;
    private JTextField priceFldGrb, priceFldSp, priceFldSpr, priceFldBfwcs, priceFldBsb;
    private JTextArea summaryAr;
    private int intGrb, intSp, intSpr, intBfwcs, intBsb;
    private int grbPrice = 2000, spPrice = 1580, sprPrice = 1330, bfwcsPrice = 700, bsbPrice = 1650;
    private LineBorder outline = new LineBorder(Color.BLACK);
    private List<String> orders = new ArrayList<>();
    private TotalOrder totalOrder;
    
    MainCourse(){
        setTitle("Main Course");
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
        
        String[] choice = {"Main Course", "Appetizers", "Salad", "Dessert", "Drinks"};
        menuCbox = new JComboBox(choice);
        menuCbox.setBounds(50, 110, 100, 20);
        menuCbox.setOpaque(true);
        menuCbox.setForeground(Color.BLACK);
        menuCbox.setBackground(Color.WHITE);
        menuCbox.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        menuCbox.addActionListener(this);
        bgLbl.add(menuCbox);
        
        itemLbl = new JLabel("Grilled Roast Beef");
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
        
        priceFldGrb = new JTextField("0");
        priceFldGrb.setBounds(400, 150, 50, 20);
        bgLbl.add(priceFldGrb);
        priceFldGrb.setEditable(false);
        
        priceLbl = new JLabel("P2000.00");
        priceLbl.setBounds(500, 150, 100, 20);
        bgLbl.add(priceLbl);
        
        itemLbl = new JLabel("Seafood Pack");
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
        
        priceFldSp = new JTextField("0");
        priceFldSp.setBounds(400, 180, 50, 20);
        bgLbl.add(priceFldSp);
        priceFldSp.setEditable(false);
        
        priceLbl = new JLabel("P1580.00");
        priceLbl.setBounds(500, 180, 100, 20);
        bgLbl.add(priceLbl);
        
        itemLbl = new JLabel("Spicy Pork Rim");
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
        
        priceFldSpr = new JTextField("0");
        priceFldSpr.setBounds(400, 210, 50, 20);
        bgLbl.add(priceFldSpr);
        priceFldSpr.setEditable(false);
        
        priceLbl = new JLabel("P1330.00");
        priceLbl.setBounds(500, 210, 100, 20);
        bgLbl.add(priceLbl);
        
        itemLbl = new JLabel("Baked Fish with Chili Sauce");
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
        
        priceFldBfwcs = new JTextField("0");
        priceFldBfwcs.setBounds(400, 240, 50, 20);
        bgLbl.add(priceFldBfwcs);
        priceFldBfwcs.setEditable(false);
        
        priceLbl = new JLabel("P700.00");
        priceLbl.setBounds(500, 240, 100, 20);
        bgLbl.add(priceLbl);
        
        itemLbl = new JLabel("Buttered Shrimp Bucket");
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
        
        priceFldBsb = new JTextField("0");
        priceFldBsb.setBounds(400, 270, 50, 20);
        bgLbl.add(priceFldBsb);
        priceFldBsb.setEditable(false);
        
        priceLbl = new JLabel("P1650.00");
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
            intGrb++;
            String strGrb = Integer.toString(intGrb);
            priceFldGrb.setText(strGrb); 
        }
        else if(clicked.getSource() == minusBtn1){
            intGrb--;
            String strGrb = Integer.toString(intGrb);
            priceFldGrb.setText(strGrb); 
        }
        else if(clicked.getSource() == addBtn2){
            intSp++;
            String strSp = Integer.toString(intSp);
            priceFldSp.setText(strSp); 
        }
        else if(clicked.getSource() == minusBtn2){
            intSp--;
            String strSp = Integer.toString(intSp);
            priceFldSp.setText(strSp); 
        }
        else if(clicked.getSource() == addBtn3){
            intSpr++;
            String strSpr = Integer.toString(intSpr);
            priceFldSpr.setText(strSpr); 
        }
        else if(clicked.getSource() == minusBtn3){
            intSpr--;
            String strSpr = Integer.toString(intSpr);
            priceFldSpr.setText(strSpr); 
        }
        else if(clicked.getSource() == addBtn4){
            intBfwcs++;
            String strBfwcs = Integer.toString(intBfwcs);
            priceFldBfwcs.setText(strBfwcs); 
        }
        else if(clicked.getSource() == minusBtn4){
            intBfwcs--;
            String strBfwcs = Integer.toString(intBfwcs);
            priceFldBfwcs.setText(strBfwcs); 
        }
        else if(clicked.getSource() == addBtn5){
            intBsb++;
            String strBsb = Integer.toString(intBsb);
            priceFldBsb.setText(strBsb); 
        }
        else if(clicked.getSource() == minusBtn5){
            intBsb--;
            String strBsb = Integer.toString(intBsb);
            priceFldBsb.setText(strBsb); 
        }
        else if (clicked.getSource() == voidBtn){
            priceFldGrb.setText("0");
            priceFldSp.setText("0");
            priceFldSpr.setText("0");
            priceFldBfwcs.setText("0");
            priceFldBsb.setText("0");
            summaryAr.setText("Order/s removed.");
        }
        else if (clicked.getSource() == orderBtn) {
            int grb, sp, spr, bfwcs, bsb;
            grb = Integer.parseInt(priceFldGrb.getText());
            sp = Integer.parseInt(priceFldSp.getText());
            spr = Integer.parseInt(priceFldSpr.getText());
            bfwcs = Integer.parseInt(priceFldBfwcs.getText());
            bsb = Integer.parseInt(priceFldBsb.getText());

            if (grb <= 0 && sp <= 0 && spr <= 0 && bfwcs <= 0 && bsb <= 0) {
                summaryAr.setText("ERROR!!! You entered a negative quantity.");
            } else {
                String grbOrder = grb + " x Grilled Roast Beef = P" + (grbPrice * grb);
                String spOrder = sp + " x Seafood Pack = P" + (spPrice * sp);
                String sprOrder = spr + " x Spicy Pork Rim = P" + (sprPrice * spr);
                String bfwcsOrder = bfwcs + " x Baked Fish with Chili Sauce = P" + (bfwcsPrice * bfwcs);
                String bsbOrder = bsb + " x Buttered Shrimp Bucket = P" + (bsbPrice * bsb);

                orders.add(grbOrder);
                orders.add(spOrder);
                orders.add(sprOrder);
                orders.add(bfwcsOrder);
                orders.add(bsbOrder);

                summaryAr.setText("Order/s added successfully.");
            }
        } else if (clicked.getSource() == viewBtn) {
            dispose();
            new TotalOrder(orders);
        }
    }
}
