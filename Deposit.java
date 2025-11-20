package ASimulatorSystem;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.*;

public class Deposit extends JFrame implements ActionListener {

    JTextField t1;
    JButton b1, b2;
    JLabel l1;
    String pin;

    Deposit(String pin) {
        this.pin = pin;

        // ATM background image
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("ASimulatorSystem/icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 600, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel background = new JLabel(i3);
        background.setBounds(0, 0, 900, 600);
        add(background);

        // Text Label
        l1 = new JLabel("ENTER AMOUNT YOU WANT TO DEPOSIT");
        l1.setForeground(Color.WHITE);
        l1.setFont(new Font("System", Font.BOLD, 16));
        l1.setBounds(220, 180, 400, 30);
        background.add(l1);

        // Input Field
        t1 = new JTextField();
        t1.setFont(new Font("Raleway", Font.BOLD, 22));
        t1.setBounds(220, 220, 300, 30);
        background.add(t1);

        // DEPOSIT Button
        b1 = new JButton("DEPOSIT");
        b1.setFont(new Font("System", Font.BOLD, 14));
        b1.setBounds(220, 280, 150, 35);
        background.add(b1);

        // BACK Button
        b2 = new JButton("BACK");
        b2.setFont(new Font("System", Font.BOLD, 14));
        b2.setBounds(370, 280, 150, 35);
        background.add(b2);

        // Action listeners
        b1.addActionListener(this);
        b2.addActionListener(this);

        setLayout(null);
        setSize(900, 600);
        setLocationRelativeTo(null); // center screen
        setUndecorated(true); // remove window bar
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        try {
            String amount = t1.getText();
            Date date = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String formattedDate = sdf.format(date);

            if (ae.getSource() == b1) {
                if (amount.equals("")) {
                    JOptionPane.showMessageDialog(null, "Please enter the Amount you want to Deposit");
                } else {
                    Conn c1 = new Conn();
                    String query = "insert into bank values('" + pin + "', '" + formattedDate + "', 'Deposit', '" + amount + "')";
                    c1.s.executeUpdate(query);
                    JOptionPane.showMessageDialog(null, "Rs. " + amount + " Deposited Successfully");
                    setVisible(false);
                    new Transactions(pin).setVisible(true);
                }
            }
            else if (ae.getSource() == b2) {
                setVisible(false);
                new Transactions(pin).setVisible(true);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Deposit("").setVisible(true);
    }
}
