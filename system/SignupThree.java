package bank.management.system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import java.util.*;

public class SignupThree extends JFrame implements ActionListener {

    JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11, l12;
    JRadioButton r1, r2, r3, r4;
    JButton b1, b2;
    JCheckBox c1, c2, c3, c4, c5, c6, c7;
    String formno;

    SignupThree(String formno) {
        this.formno = formno;
        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 3");

        // Logo
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        if (i1.getImageLoadStatus() == MediaTracker.ERRORED) {
            System.err.println("Image not found");
        }
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l14 = new JLabel(i3);
        l14.setBounds(150, 0, 100, 100);

        // Create a JPanel and set its layout
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.add(l14);

        l1 = new JLabel("Page 3: Account Details");
        l1.setFont(new Font("Raleway", Font.BOLD, 16));  // Further decreased font size
        l1.setBounds(280, 40, 400, 40);
        panel.add(l1);

        l2 = new JLabel("Account Type:");
        l2.setFont(new Font("Raleway", Font.BOLD, 14));  // Further decreased font size
        l2.setBounds(100, 140, 200, 30);
        panel.add(l2);

        r1 = new JRadioButton("Saving Account");
        r1.setFont(new Font("Raleway", Font.BOLD, 12));  // Further decreased font size
        r1.setBackground(Color.WHITE);
        r1.setBounds(100, 180, 150, 30);
        panel.add(r1);

        r2 = new JRadioButton("Fixed Deposit Account");
        r2.setFont(new Font("Raleway", Font.BOLD, 12));  // Further decreased font size
        r2.setBackground(Color.WHITE);
        r2.setBounds(350, 180, 300, 30);
        panel.add(r2);

        r3 = new JRadioButton("Current Account");
        r3.setFont(new Font("Raleway", Font.BOLD, 12));  // Further decreased font size
        r3.setBackground(Color.WHITE);
        r3.setBounds(100, 220, 250, 30);
        panel.add(r3);

        r4 = new JRadioButton("Recurring Deposit Account");
        r4.setFont(new Font("Raleway", Font.BOLD, 12));  // Further decreased font size
        r4.setBackground(Color.WHITE);
        r4.setBounds(350, 220, 250, 30);
        panel.add(r4);

        l3 = new JLabel("Card Number:");
        l3.setFont(new Font("Raleway", Font.BOLD, 14));  // Further decreased font size
        l3.setBounds(100, 300, 200, 30);
        panel.add(l3);

        l4 = new JLabel("XXXX-XXXX-XXXX-4184");
        l4.setFont(new Font("Raleway", Font.BOLD, 14));  // Further decreased font size
        l4.setBounds(330, 300, 250, 30);
        panel.add(l4);

        l5 = new JLabel("(Your 16-digit Card number)");
        l5.setFont(new Font("Raleway", Font.BOLD, 10));  // Further decreased font size
        l5.setBounds(100, 330, 200, 20);
        panel.add(l5);

        l6 = new JLabel("It would appear on ATM Card/Cheque Book and Statements");
        l6.setFont(new Font("Raleway", Font.BOLD, 10));  // Further decreased font size
        l6.setBounds(330, 330, 500, 20);
        panel.add(l6);

        l7 = new JLabel("PIN:");
        l7.setFont(new Font("Raleway", Font.BOLD, 14));  // Further decreased font size
        l7.setBounds(100, 370, 200, 30);
        panel.add(l7);

        l8 = new JLabel("XXXX");
        l8.setFont(new Font("Raleway", Font.BOLD, 14));  // Further decreased font size
        l8.setBounds(330, 370, 200, 30);
        panel.add(l8);

        l9 = new JLabel("(4-digit password)");
        l9.setFont(new Font("Raleway", Font.BOLD, 10));  // Further decreased font size
        l9.setBounds(100, 400, 200, 20);
        panel.add(l9);

        l10 = new JLabel("Services Required:");
        l10.setFont(new Font("Raleway", Font.BOLD, 14));  // Further decreased font size
        l10.setBounds(100, 450, 200, 30);
        panel.add(l10);

        c1 = new JCheckBox("ATM CARD");
        c1.setBackground(Color.WHITE);
        c1.setFont(new Font("Raleway", Font.BOLD, 12));  // Further decreased font size
        c1.setBounds(100, 500, 200, 30);
        panel.add(c1);

        c2 = new JCheckBox("Internet Banking");
        c2.setBackground(Color.WHITE);
        c2.setFont(new Font("Raleway", Font.BOLD, 12));  // Further decreased font size
        c2.setBounds(350, 500, 200, 30);
        panel.add(c2);

        c3 = new JCheckBox("Mobile Banking");
        c3.setBackground(Color.WHITE);
        c3.setFont(new Font("Raleway", Font.BOLD, 12));  // Further decreased font size
        c3.setBounds(100, 550, 200, 30);
        panel.add(c3);

        c4 = new JCheckBox("EMAIL Alerts");
        c4.setBackground(Color.WHITE);
        c4.setFont(new Font("Raleway", Font.BOLD, 12));  // Further decreased font size
        c4.setBounds(350, 550, 200, 30);
        panel.add(c4);

        c5 = new JCheckBox("Cheque Book");
        c5.setBackground(Color.WHITE);
        c5.setFont(new Font("Raleway", Font.BOLD, 12));  // Further decreased font size
        c5.setBounds(100, 600, 200, 30);
        panel.add(c5);

        c6 = new JCheckBox("E-Statement");
        c6.setBackground(Color.WHITE);
        c6.setFont(new Font("Raleway", Font.BOLD, 12));  // Further decreased font size
        c6.setBounds(350, 600, 200, 30);
        panel.add(c6);

        c7 = new JCheckBox("I hereby declare that the above entered details are correct to the best of my knowledge.", true);
        c7.setBackground(Color.WHITE);
        c7.setFont(new Font("Raleway", Font.PLAIN, 10));  // Further decreased font size
        c7.setBounds(100, 680, 600, 20);
        panel.add(c7);

                b1 = new JButton("Submit");
        b1.setFont(new Font("Raleway", Font.BOLD, 10));  // Further decreased font size
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBounds(250, 100, 100, 30);  // Moved up by reducing y-position from 720 to 620
        panel.add(b1);

        b2 = new JButton("Cancel");
        b2.setFont(new Font("Raleway", Font.BOLD, 10));  // Further decreased font size
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.setBounds(420, 100, 100, 30);  // Moved up by reducing y-position from 720 to 620
        panel.add(b2);


        // Create a JScrollPane and add the panel to it
        JScrollPane scrollPane = new JScrollPane(panel);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        
        // Add the JScrollPane to the JFrame
        add(scrollPane);

        getContentPane().setBackground(Color.WHITE);

        setSize(850, 850);
        setLocation(500, 120);
        setVisible(true);

        b1.addActionListener(this);
        b2.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae) {
        String atype = null;
        if (r1.isSelected()) {
            atype = "Saving Account";
        } else if (r2.isSelected()) {
            atype = "Fixed Deposit Account";
        } else if (r3.isSelected()) {
            atype = "Current Account";
        } else if (r4.isSelected()) {
            atype = "Recurring Deposit Account";
        }

        Random ran = new Random();
        long first7 = (ran.nextLong() % 90000000L) + 5040936000000000L;
        String cardno = "" + Math.abs(first7); // Ensure card number is positive

        String pin = "" + (ran.nextInt(9000) + 1000); // Ensure pin is 4 digits

        String services = "";
        if (c1.isSelected()) {
            services += "ATM CARD ";
        }
        if (c2.isSelected()) {
            services += "Internet Banking ";
        }
        if (c3.isSelected()) {
            services += "Mobile Banking ";
        }
        if (c4.isSelected()) {
            services += "EMAIL Alerts ";
        }
        if (c5.isSelected()) {
            services += "Cheque Book ";
        }
        if (c6.isSelected()) {
            services += "E-Statement ";
        }

       
        JOptionPane.showMessageDialog(null, "Card Number: " + cardno + "\nPin: " + pin);
    }

    public static void main(String[] args) {
        new SignupThree("");
    }
}
