package RestaurantManagementSystem;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.LineBorder;
import java.util.ArrayList;
import java.util.List;

public class Salad extends JFrame implements ActionListener{
    private ImageIcon bgImage, homeImage;
    private JLabel bgLbl, quantityLbl, priceLbl, summaryLbl, itemLbl;
    private JButton homeBtn, addBtn1, minusBtn1, addBtn2, minusBtn2, addBtn3, minusBtn3, wasteBtn, orderBtn, voidBtn, viewBtn;
    private JComboBox menuCbox;
    private JTextField priceFldPs, priceFldVs, priceFldFs;
    private JTextArea summaryAr;
    private int intPs, intVs, intFs;
    private int psPrice = 247, vsPrice = 299, fsPrice = 250;
    private LineBorder outline = new LineBorder(Color.BLACK);
    private List<String> orders = new ArrayList<>();
    private TotalOrder totalOrder;
            
    Salad(){
        setTitle("Salad");
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
        
        String[] choice = {"Salad", "Appetizers", "Main Course", "Dessert", "Drinks"};
        menuCbox = new JComboBox(choice);
        menuCbox.setBounds(50, 110, 100, 20);
        menuCbox.setOpaque(true);
        menuCbox.setForeground(Color.BLACK);
        menuCbox.setBackground(Color.WHITE);
        menuCbox.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        menuCbox.addActionListener(this);
        menuCbox.addActionListener(this);
        bgLbl.add(menuCbox);
        
        itemLbl = new JLabel("Prawn Salad");
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
        
        priceFldPs = new JTextField("0");
        priceFldPs.setBounds(400, 150, 50, 20);
        bgLbl.add(priceFldPs);
        priceFldPs.setEditable(false);
        
        priceLbl = new JLabel("P247.00");
        priceLbl.setBounds(500, 150, 100, 20);
        bgLbl.add(priceLbl);
        
        itemLbl = new JLabel("Vegetable Salad");
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
        
        priceFldVs = new JTextField("0");
        priceFldVs.setBounds(400, 180, 50, 20);
        bgLbl.add(priceFldVs);
        priceFldVs.setEditable(false);
        
        priceLbl = new JLabel("P299.00");
        priceLbl.setBounds(500, 180, 100, 20);
        bgLbl.add(priceLbl);
        
        itemLbl = new JLabel("Fruit Salad");
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
        
        priceFldFs = new JTextField("0");
        priceFldFs.setBounds(400, 210, 50, 20);
        bgLbl.add(priceFldFs);
        priceFldFs.setEditable(false);
        
        priceLbl = new JLabel("P250.00");
        priceLbl.setBounds(500, 210, 100, 20);
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
            intPs++;
            String strPs = Integer.toString(intPs);
            priceFldPs.setText(strPs); 
        }
        else if(clicked.getSource() == minusBtn1){
            intPs--;
            String strPs = Integer.toString(intPs);
            priceFldPs.setText(strPs); 
        }
        else if(clicked.getSource() == addBtn2){
            intVs++;
            String strVs = Integer.toString(intVs);
            priceFldVs.setText(strVs); 
        }
        else if(clicked.getSource() == minusBtn2){
            intVs--;
            String strVs = Integer.toString(intVs);
            priceFldVs.setText(strVs); 
        }
        else if(clicked.getSource() == addBtn3){
            intFs++;
            String strFs = Integer.toString(intFs);
            priceFldFs.setText(strFs); 
        }
        else if(clicked.getSource() == minusBtn3){
            intFs--;
            String strFs = Integer.toString(intFs);
            priceFldFs.setText(strFs); 
        }
        else if (clicked.getSource() == voidBtn){
            priceFldPs.setText("0");
            priceFldFs.setText("0");
            priceFldVs.setText("0");
            summaryAr.setText("Order/s removed.");
        }
        else if(clicked.getSource() == orderBtn){
            int ps, vs, fs;
            ps = Integer.parseInt(priceFldPs.getText());
            vs = Integer.parseInt(priceFldVs.getText());
            fs = Integer.parseInt(priceFldFs.getText());
            
            if (ps <= 0 && vs <= 0 && fs <= 0) {
                summaryAr.setText("ERROR!!! You entered a negative quantity.");
            }
            else {
//                summaryAr.setText(ps + " x " + " Prawn Salad = P" + psPrice + System.lineSeparator()
//                        + vs + " x " + " Vegetable Salad = P" + vsPrice + System.lineSeparator()
//                        + fs + " x " + " Fruit Salad = P" + fsPrice);
                String psOrder = ps + " x Prawn Salad = P" + (psPrice * ps);
                String vsOrder = vs + " x Vegetable Salad = P" + (vsPrice * vs);
                String fsOrder = fs + " x Fruit Salad = P" + (fsPrice * fs);
                 
                orders.add(psOrder);
                orders.add(vsOrder);
                orders.add(fsOrder);

                summaryAr.setText("Order/s added successfully.");
            }
        }
        else if(clicked.getSource() == viewBtn){
            dispose();
            new TotalOrder(orders);
        }
    }
}
