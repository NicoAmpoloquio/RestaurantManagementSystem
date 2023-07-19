package RestaurantManagementSystem;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.LineBorder;
import java.util.ArrayList;
import java.util.List;

public class Dessert extends JFrame implements ActionListener{
    private ImageIcon bgImage, homeImage;
    private JLabel bgLbl, quantityLbl, priceLbl, summaryLbl, itemLbl;
    private JButton homeBtn, addBtn1, minusBtn1, addBtn2, minusBtn2, addBtn3, minusBtn3, addBtn4, minusBtn4, addBtn5, minusBtn5, orderBtn, voidBtn, viewBtn;
    private JComboBox menuCbox;
    private JTextField priceFldCt, priceFldClc, priceFldBc, priceFldLp, priceFldUh;
    private JTextArea summaryAr;
    private int intCt, intClc, intBc, intLp, intUh;
    private int ctPrice = 178, clcPrice = 230, bcPrice = 315, lpPrice = 100, uhPrice = 60;
    private LineBorder outline = new LineBorder(Color.BLACK);
    private List<String> orders = new ArrayList<>();
    private TotalOrder totalOrder;
            
    Dessert(){
        setTitle("Dessert");
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
        
        String[] choice = {"Dessert", "Appetizers", "Salad", "Main Course", "Drinks"};
        menuCbox = new JComboBox(choice);
        menuCbox.setBounds(50, 110, 100, 20);
        menuCbox.setOpaque(true);
        menuCbox.setForeground(Color.BLACK);
        menuCbox.setBackground(Color.WHITE);
        menuCbox.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        menuCbox.addActionListener(this);
        menuCbox.addActionListener(this);
        bgLbl.add(menuCbox);
        
        itemLbl = new JLabel("Coffee Tirimasu");
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
        
        priceFldCt = new JTextField("0");
        priceFldCt.setBounds(400, 150, 50, 20);
        bgLbl.add(priceFldCt);
        priceFldCt.setEditable(false);
        
        priceLbl = new JLabel("P178.00");
        priceLbl.setBounds(500, 150, 100, 20);
        bgLbl.add(priceLbl);
        
        itemLbl = new JLabel("Choco Lava Cake");
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
        
        priceFldClc = new JTextField("0");
        priceFldClc.setBounds(400, 180, 50, 20);
        bgLbl.add(priceFldClc);
        priceFldClc.setEditable(false);
        
        priceLbl = new JLabel("P230.00 per slice");
        priceLbl.setBounds(500, 180, 100, 20);
        bgLbl.add(priceLbl);
        
        itemLbl = new JLabel("Blueberry Cheesecake");
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
        
        priceFldBc = new JTextField("0");
        priceFldBc.setBounds(400, 210, 50, 20);
        bgLbl.add(priceFldBc);
        priceFldBc.setEditable(false);
        
        priceLbl = new JLabel("P315.00 per slice");
        priceLbl.setBounds(500, 210, 100, 20);
        bgLbl.add(priceLbl);
        
        itemLbl = new JLabel("Leche Plan");
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
        
        priceFldLp = new JTextField("0");
        priceFldLp.setBounds(400, 240, 50, 20);
        bgLbl.add(priceFldLp);
        priceFldLp.setEditable(false);
        
        priceLbl = new JLabel("P100.00");
        priceLbl.setBounds(500, 240, 100, 20);
        bgLbl.add(priceLbl);
        
        itemLbl = new JLabel("Ube Halaya");
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
        
        priceFldUh = new JTextField("0");
        priceFldUh.setBounds(400, 270, 50, 20);
        bgLbl.add(priceFldUh);
        priceFldUh.setEditable(false);
        
        priceLbl = new JLabel("P60.00");
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
            intCt++;
            String strCt = Integer.toString(intCt);
            priceFldCt.setText(strCt); 
        }
        else if(clicked.getSource() == minusBtn1){
            intCt--;
            String strCt = Integer.toString(intCt);
            priceFldCt.setText(strCt); 
        }
        else if(clicked.getSource() == addBtn2){
            intClc++;
            String strClc = Integer.toString(intClc);
            priceFldClc.setText(strClc); 
        }
        else if(clicked.getSource() == minusBtn2){
            intClc--;
            String strClc = Integer.toString(intClc);
            priceFldClc.setText(strClc); 
        }
        else if(clicked.getSource() == addBtn3){
            intBc++;
            String strBc = Integer.toString(intBc);
            priceFldBc.setText(strBc); 
        }
        else if(clicked.getSource() == minusBtn3){
            intBc--;
            String strBc = Integer.toString(intBc);
            priceFldBc.setText(strBc); 
        }
        else if(clicked.getSource() == addBtn4){
            intLp++;
            String strLp = Integer.toString(intLp);
            priceFldLp.setText(strLp); 
        }
        else if(clicked.getSource() == minusBtn4){
            intLp--;
            String strLp = Integer.toString(intLp);
            priceFldLp.setText(strLp); 
        }
        else if(clicked.getSource() == addBtn5){
            intUh++;
            String strUh = Integer.toString(intUh);
            priceFldUh.setText(strUh); 
        }
        else if(clicked.getSource() == minusBtn5){
            intUh--;
            String strUh = Integer.toString(intUh);
            priceFldUh.setText(strUh); 
        }
        else if (clicked.getSource() == voidBtn){
            priceFldCt.setText("0");
            priceFldClc.setText("0");
            priceFldBc.setText("0");
            priceFldLp.setText("0");
            priceFldUh.setText("0");
            summaryAr.setText("Order/s removed.");
        }
        else if(clicked.getSource() == orderBtn){
            int ct, clc, bc, lp, uh;
            ct = Integer.parseInt(priceFldCt.getText());
            clc = Integer.parseInt(priceFldClc.getText());
            bc = Integer.parseInt(priceFldBc.getText());
            lp = Integer.parseInt(priceFldLp.getText());
            uh = Integer.parseInt(priceFldUh.getText());
            
            if (ct <= 0 && clc <= 0 && bc <= 0 && lp <= 0 && uh <=0) {
                summaryAr.setText("ERROR!!! You entered a negative quantity.");
            }
            else {
//                summaryAr.setText(ct + " x " + " Coffee Tirimasu = P" + ctPrice + System.lineSeparator()
//                        + clc + " x " + " Choco Lava Cake = P" + clcPrice + System.lineSeparator()
//                        + bc + " x " + " Blueberry Cheesecake = P" + bcPrice + System.lineSeparator()
//                        + lp + " x " + " Leche Plan = P" + lpPrice + System.lineSeparator()
//                        + uh + " x " + " Ube Halaya = P" + uhPrice);
                String ctOrder = ct + " x Coffee Tirimasu = P" + (ctPrice * ct);
                String clcOrder = clc + " x Choco Lava Cake = P" + (clcPrice * clc);
                String bcOrder = bc + " x Blueberry Cheesecake = P" + (bcPrice * bc);
                String lpOrder = lp + " x Leche Plan = P" + (lpPrice * lp);
                String uhOrder = uh + " x Ube Halaya = P" + (uhPrice * uh);

                orders.add(ctOrder);
                orders.add(clcOrder);
                orders.add(bcOrder);
                orders.add(lpOrder);
                orders.add(uhOrder);

                summaryAr.setText("Order/s added successfully.");
            }
        }
        else if(clicked.getSource() == viewBtn){
            dispose();
            new TotalOrder(orders);
        }
    }
}
