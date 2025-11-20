
package ASimulatorSystem;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import java.util.*;

public class Signup3 extends JFrame implements ActionListener{
    
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12;
    JRadioButton r1,r2,r3,r4;
    JButton b1,b2;
    JCheckBox c1,c2,c3,c4,c5,c6,c7;
    String formno;
    Signup3(String formno){
        this.formno = formno;
        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 3");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("ASimulatorSystem/icons/logo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(80, 80, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l14 = new JLabel(i3);
        l14.setBounds(30, 0, 80, 80);
        add(l14);

        // Labels
        l1 = new JLabel("Page 3: Account Details");
        l1.setFont(new Font("Raleway", Font.BOLD, 20));
        l2 = new JLabel("Account Type:");
        l2.setFont(new Font("Raleway", Font.BOLD, 16));
        l3 = new JLabel("Card Number:");
        l3.setFont(new Font("Raleway", Font.BOLD, 16));
        l4 = new JLabel("XXXX-XXXX-XXXX-4184");
        l4.setFont(new Font("Raleway", Font.BOLD, 16));
        l5 = new JLabel("(Your 16-digit Card number)");
        l5.setFont(new Font("Raleway", Font.PLAIN, 12));
        l6 = new JLabel("It would appear on ATM Card/Cheque Book and Statements");
        l6.setFont(new Font("Raleway", Font.PLAIN, 12));
        l7 = new JLabel("PIN:");
        l7.setFont(new Font("Raleway", Font.BOLD, 16));
        l8 = new JLabel("XXXX");
        l8.setFont(new Font("Raleway", Font.BOLD, 16));
        l9 = new JLabel("(4-digit password)");
        l9.setFont(new Font("Raleway", Font.PLAIN, 12));
        l10 = new JLabel("Services Required:");
        l10.setFont(new Font("Raleway", Font.BOLD, 16));
        l11 = new JLabel("Form No:");
        l11.setFont(new Font("Raleway", Font.PLAIN, 12));
        l12 = new JLabel(formno);
        l12.setFont(new Font("Raleway", Font.PLAIN, 12));

        // Radio Buttons
        r1 = new JRadioButton("Saving Account");
        r2 = new JRadioButton("Fixed Deposit");
        r3 = new JRadioButton("Current Account");
        r4 = new JRadioButton("Recurring Deposit");

        JRadioButton[] radios = {r1, r2, r3, r4};
        for (JRadioButton r : radios) {
            r.setFont(new Font("Raleway", Font.PLAIN, 14));
            r.setBackground(Color.WHITE);
        }

        ButtonGroup group = new ButtonGroup();
        for (JRadioButton r : radios) group.add(r);

        // Checkboxes
        c1 = new JCheckBox("ATM Card");
        c2 = new JCheckBox("Internet Banking");
        c3 = new JCheckBox("Mobile Banking");
        c4 = new JCheckBox("EMAIL Alerts");
        c5 = new JCheckBox("Cheque Book");
        c6 = new JCheckBox("E-Statement");
        c7 = new JCheckBox("I hereby declare that the above entered details are correct to the best of my knowledge.", true);

        JCheckBox[] checks = {c1, c2, c3, c4, c5, c6, c7};
        for (JCheckBox c : checks) {
            c.setFont(new Font("Raleway", Font.PLAIN, 13));
            c.setBackground(Color.WHITE);
        }

        // Buttons
        b1 = new JButton("Submit");
        b2 = new JButton("Cancel");
        JButton[] buttons = {b1, b2};
        for (JButton b : buttons) {
            b.setFont(new Font("Raleway", Font.BOLD, 13));
            b.setBackground(Color.BLACK);
            b.setForeground(Color.WHITE);
        }

        setLayout(null);
        getContentPane().setBackground(Color.WHITE);

        // Positioning elements (resized and shifted down)
        l11.setBounds(560, 10, 70, 20);
        l12.setBounds(630, 10, 60, 20);
        l1.setBounds(200, 30, 300, 30);
        l2.setBounds(80, 80, 200, 20);
        r1.setBounds(80, 110, 150, 20);
        r2.setBounds(250, 110, 180, 20);
        r3.setBounds(80, 140, 150, 20);
        r4.setBounds(250, 140, 180, 20);
        l3.setBounds(80, 180, 150, 20);
        l4.setBounds(250, 180, 250, 20);
        l5.setBounds(80, 200, 200, 15);
        l6.setBounds(250, 200, 400, 15);
        l7.setBounds(80, 230, 150, 20);
        l8.setBounds(250, 230, 200, 20);
        l9.setBounds(80, 250, 150, 15);
        l10.setBounds(80, 280, 200, 20);
        c1.setBounds(80, 310, 180, 20);
        c2.setBounds(280, 310, 180, 20);
        c3.setBounds(80, 340, 180, 20);
        c4.setBounds(280, 340, 180, 20);
        c5.setBounds(80, 370, 180, 20);
        c6.setBounds(280, 370, 180, 20);
        c7.setBounds(80, 410, 550, 30);
        b1.setBounds(200, 460, 100, 30);
        b2.setBounds(330, 460, 100, 30);

        // Add components
        Component[] comps = {
                l11, l12, l1, l2, r1, r2, r3, r4, l3, l4, l5, l6, l7, l8, l9, l10,
                c1, c2, c3, c4, c5, c6, c7, b1, b2
        };
        for (Component comp : comps) add(comp);

        b1.addActionListener(this);
        b2.addActionListener(this);

        // Final window settings
        setSize(700, 700);
        setLocation(400, 100);
        setVisible(true);
        b1.addActionListener(this);
        b2.addActionListener(this);
        
    }
    
    public void actionPerformed(ActionEvent ae){
        String atype = null;
        if(r1.isSelected()){ 
            atype = "Saving Account";
        }
        else if(r2.isSelected()){ 
            atype = "Fixed Deposit Account";
        }
        else if(r3.isSelected()){ 
            atype = "Current Account";
        }else if(r4.isSelected()){ 
            atype = "Recurring Deposit Account";
        }
        
        Random ran = new Random();
        long first7 = (ran.nextLong() % 90000000L) + 5040936000000000L;
        String cardno = "" + Math.abs(first7);
        
        long first3 = (ran.nextLong() % 9000L) + 1000L;
        String pin = "" + Math.abs(first3);
        
        String facility = "";
        if(c1.isSelected()){ 
            facility = facility + " ATM Card";
        }
        if(c2.isSelected()){ 
            facility = facility + " Internet Banking";
        }
        if(c3.isSelected()){ 
            facility = facility + " Mobile Banking";
        }
        if(c4.isSelected()){ 
            facility = facility + " EMAIL Alerts";
        }
        if(c5.isSelected()){ 
            facility = facility + " Cheque Book";
        }
        if(c6.isSelected()){ 
            facility = facility + " E-Statement";
        }
        
        try{
            if(ae.getSource()==b1){
                
                if(atype.equals("")){
                    JOptionPane.showMessageDialog(null, "Fill all the required fields");
                }else{
                    Conn c1 = new Conn();
                    String q1 = "insert into signup3 values('"+formno+"','"+atype+"','"+cardno+"','"+pin+"','"+facility+"')";  
                    String q2 = "insert into login values('"+formno+"','"+cardno+"','"+pin+"')";
                    c1.s.executeUpdate(q1);
                    c1.s.executeUpdate(q2);
                    JOptionPane.showMessageDialog(null, "Card Number: " + cardno + "\n Pin:"+ pin);
                    
                    new Deposit(pin).setVisible(true);
                    setVisible(false);
                }
            
            }else if(ae.getSource()==b2){
                System.exit(0);
            }
            
        }catch(Exception ex){
            ex.printStackTrace();
        }
        
    }
    
    public static void main(String[] args){
        new Signup3("").setVisible(true);
    }
    
}


