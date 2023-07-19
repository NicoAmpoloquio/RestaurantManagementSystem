package RestaurantManagementSystem;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.LineBorder;
import java.util.ArrayList;
import java.util.List;

public class Appetizers extends JFrame implements ActionListener{
    private ImageIcon bgImage, homeImage;
    private JLabel bgLbl, quantityLbl, priceLbl, summaryLbl, itemLbl;
    private JButton homeBtn, addBtn1, minusBtn1, addBtn2, minusBtn2, addBtn3, minusBtn3, orderBtn, voidBtn, viewBtn;
    private JComboBox menuCbox;
    private JTextField priceFldPd, priceFldSp, priceFldMmws;
    private JTextArea summaryAr;
    private int intPd, intSp, intMmws;
    private int pdPrice = 150, spPrice = 175, mmwsPrice = 340;
    private LineBorder outline = new LineBorder(Color.BLACK);
    private List<String> orders = new ArrayList<>();
    private TotalOrder totalOrder;
            
    Appetizers(){
        setTitle("Appetizers");
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
        
        String[] choice = {"Appetizers", "Main Course", "Salad", "Dessert", "Drinks"};
        menuCbox = new JComboBox(choice);
        menuCbox.setBounds(50, 110, 100, 20);
        menuCbox.setOpaque(true);
        menuCbox.setForeground(Color.BLACK);
        menuCbox.setBackground(Color.WHITE);
        menuCbox.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        menuCbox.addActionListener(this);
        menuCbox.addActionListener(this);
        bgLbl.add(menuCbox);
        
        itemLbl = new JLabel("Pork Dumplings");
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
        
        priceFldPd = new JTextField("0");
        priceFldPd.setBounds(400, 150, 50, 20);
        bgLbl.add(priceFldPd);
        priceFldPd.setEditable(false);
        
        priceLbl = new JLabel("P150.00");
        priceLbl.setBounds(500, 150, 100, 20);
        bgLbl.add(priceLbl);
        
        itemLbl = new JLabel("Spinach Pancakes");
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
        
        priceLbl = new JLabel("P175.00");
        priceLbl.setBounds(500, 180, 100, 20);
        bgLbl.add(priceLbl);
        
        itemLbl = new JLabel("Mild Mushroom with Shrimp");
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
        
        priceFldMmws = new JTextField("0");
        priceFldMmws.setBounds(400, 210, 50, 20);
        bgLbl.add(priceFldMmws);
        priceFldMmws.setEditable(false);
        
        priceLbl = new JLabel("P340.00");
        priceLbl.setBounds(500, 210, 100, 20);
        bgLbl.add(priceLbl);
        
        quantityLbl= new JLabel("Quantity");
        quantityLbl.setBounds(400, 110, 100, 20);
        bgLbl.add(quantityLbl);
        
        priceLbl = new JLabel("Price");
        priceLbl.setBounds(500, 110, 100, 20);
        bgLbl.add(priceLbl);
        
        summaryLbl = new JLabel("Summary: ");
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
    public void setTotalOrder(TotalOrder totalOrder){
        this.totalOrder = totalOrder;
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
            intPd++;
            String strPd = Integer.toString(intPd);
            priceFldPd.setText(strPd); 
        }
        else if(clicked.getSource() == minusBtn1){
            intPd--;
            String strPd = Integer.toString(intPd);
            priceFldPd.setText(strPd); 
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
            intMmws++;
            String strMmws = Integer.toString(intMmws);
            priceFldMmws.setText(strMmws); 
        }
        else if(clicked.getSource() == minusBtn3){
            intMmws--;
            String strMmws = Integer.toString(intMmws);
            priceFldMmws.setText(strMmws); 
        }
        else if (clicked.getSource() == voidBtn){
            priceFldPd.setText("0");
            priceFldSp.setText("0");
            priceFldMmws.setText("0");
            summaryAr.setText("Order/s removed.");
        }
        else if(clicked.getSource() == orderBtn){
            int pd, sp, mmws;
            pd = Integer.parseInt(priceFldPd.getText());
            sp = Integer.parseInt(priceFldSp.getText());
            mmws = Integer.parseInt(priceFldMmws.getText());
            
            if (pd <= 0 && sp <= 0 && mmws <= 0) {
                summaryAr.setText("ERROR!!! You entered a negative quantity.");
            }
            else {
                String pdOrder = pd + " x Pork Dumplings = P" + (pdPrice * pd);
                String spOrder = sp + " x Spinach Pancake = P" + (spPrice * sp);
                String mmwsOrder = mmws + " x Mild Mushroom with Shrimp = P" + (mmwsPrice * mmws);
                 
                orders.add(pdOrder);
                orders.add(spOrder);
                orders.add(mmwsOrder);
                
                summaryAr.setText("Order/s added successfully.");
                
            }
        }
        else if (clicked.getSource() == viewBtn) {
            dispose();
            new TotalOrder(orders);
        }
    }
}
