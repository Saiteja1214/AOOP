package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SignupTwo extends JFrame implements ActionListener {
    long random; // random form number
    JTextField panTextField, aadharTextField;
    JButton next;
    JRadioButton seniorCitizenYes, seniorCitizenNo, existingAccountYes, existingAccountNo;
    JComboBox<String> religion, category, income, education, occupation;
    String formno; // Form number as a string for consistency

    SignupTwo(String formno) {
        this.formno = formno; // Store passed form number
        random = Long.parseLong(formno); // Convert string to long for the application form number
        setLayout(null);
        setTitle("NEW ACCOUNT APPLICATION PAGE 2");

        // Display application form number
        JLabel formnoLabel = new JLabel("APPLICATION FORM NO: " + random);
        formnoLabel.setFont(new Font("Osward", Font.BOLD, 38));
        formnoLabel.setBounds(140, 20, 600, 40);
        add(formnoLabel);

        JLabel additionalDetails = new JLabel("Page 2: Additional Details");
        additionalDetails.setFont(new Font("Raleway", Font.BOLD, 22));
        additionalDetails.setBounds(290, 80, 400, 30);
        add(additionalDetails);

        // Religion
        JLabel religionLabel = new JLabel("Religion:");
        religionLabel.setFont(new Font("Raleway", Font.BOLD, 20));
        religionLabel.setBounds(100, 140, 100, 30);
        add(religionLabel);

        String[] valReligion = {"Hindu", "Muslim", "Christian", "Other"};
        religion = new JComboBox<>(valReligion);
        religion.setBounds(300, 140, 400, 30);
        add(religion);

        // Category
        JLabel categoryLabel = new JLabel("Category:");
        categoryLabel.setFont(new Font("Raleway", Font.BOLD, 20));
        categoryLabel.setBounds(100, 190, 200, 30);
        add(categoryLabel);

        String[] categories = {"General", "OBC", "SC", "ST"};
        category = new JComboBox<>(categories);
        category.setBounds(300, 190, 400, 30);
        add(category);

        // Income
        JLabel incomeLabel = new JLabel("Income:");
        incomeLabel.setFont(new Font("Raleway", Font.BOLD, 20));
        incomeLabel.setBounds(100, 240, 200, 30);
        add(incomeLabel);

        String[] incomes = {"<1 Lakh", "1-5 Lakhs", "5-10 Lakhs", "Above 10 Lakhs"};
        income = new JComboBox<>(incomes);
        income.setBounds(300, 240, 400, 30);
        add(income);

        // Education
        JLabel educationLabel = new JLabel("Education:");
        educationLabel.setFont(new Font("Raleway", Font.BOLD, 20));
        educationLabel.setBounds(100, 290, 200, 30);
        add(educationLabel);

        String[] educations = {"Non-Graduate", "Graduate", "Post-Graduate", "Doctorate"};
        education = new JComboBox<>(educations);
        education.setBounds(300, 290, 400, 30);
        add(education);

        // Occupation
        JLabel occupationLabel = new JLabel("Occupation:");
        occupationLabel.setFont(new Font("Raleway", Font.BOLD, 20));
        occupationLabel.setBounds(100, 340, 200, 30);
        add(occupationLabel);

        String[] occupations = {"Salaried", "Self-Employed", "Business", "Student", "Retired", "Others"};
        occupation = new JComboBox<>(occupations);
        occupation.setBounds(300, 340, 400, 30);
        add(occupation);

        // PAN number
        JLabel panLabel = new JLabel("PAN No:");
        panLabel.setFont(new Font("Raleway", Font.BOLD, 20));
        panLabel.setBounds(100, 390, 200, 30);
        add(panLabel);

        panTextField = new JTextField();
        panTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        panTextField.setBounds(300, 390, 400, 30);
        add(panTextField);

        // Aadhar number
        JLabel aadharLabel = new JLabel("Aadhar No:");
        aadharLabel.setFont(new Font("Raleway", Font.BOLD, 20));
        aadharLabel.setBounds(100, 440, 200, 30);
        add(aadharLabel);

        aadharTextField = new JTextField();
        aadharTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        aadharTextField.setBounds(300, 440, 400, 30);
        add(aadharTextField);

        // Senior Citizen
        JLabel seniorCitizenLabel = new JLabel("Senior Citizen:");
        seniorCitizenLabel.setFont(new Font("Raleway", Font.BOLD, 20));
        seniorCitizenLabel.setBounds(100, 490, 200, 30);
        add(seniorCitizenLabel);

        seniorCitizenYes = new JRadioButton("Yes");
        seniorCitizenYes.setBounds(300, 490, 100, 30);
        seniorCitizenYes.setBackground(Color.WHITE);
        add(seniorCitizenYes);

        seniorCitizenNo = new JRadioButton("No");
        seniorCitizenNo.setBounds(450, 490, 100, 30);
        seniorCitizenNo.setBackground(Color.WHITE);
        add(seniorCitizenNo);

        ButtonGroup seniorGroup = new ButtonGroup();
        seniorGroup.add(seniorCitizenYes);
        seniorGroup.add(seniorCitizenNo);

        // Existing Account
        JLabel existingAccountLabel = new JLabel("Existing Account:");
        existingAccountLabel.setFont(new Font("Raleway", Font.BOLD, 20));
        existingAccountLabel.setBounds(100, 540, 200, 30);
        add(existingAccountLabel);

        existingAccountYes = new JRadioButton("Yes");
        existingAccountYes.setBounds(300, 540, 100, 30);
        existingAccountYes.setBackground(Color.WHITE);
        add(existingAccountYes);

        existingAccountNo = new JRadioButton("No");
        existingAccountNo.setBounds(450, 540, 100, 30);
        existingAccountNo.setBackground(Color.WHITE);
        add(existingAccountNo);

        ButtonGroup existingAccountGroup = new ButtonGroup();
        existingAccountGroup.add(existingAccountYes);
        existingAccountGroup.add(existingAccountNo);

        // Next Button
        next = new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway", Font.BOLD, 20));
        next.setBounds(620, 640, 80, 30);
        next.addActionListener(this);
        add(next);

        getContentPane().setBackground(Color.WHITE);

        setSize(850, 800);
        setLocation(350, 10);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        String pan = panTextField.getText();
        String aadhar = aadharTextField.getText();
        
        // Collecting additional details
        String selectedReligion = (String) religion.getSelectedItem();
        String selectedCategory = (String) category.getSelectedItem();
        String selectedIncome = (String) income.getSelectedItem();
        String selectedEducation = (String) education.getSelectedItem();
        String selectedOccupation = (String) occupation.getSelectedItem();
        String seniorCitizen = seniorCitizenYes.isSelected() ? "Yes" : "No";
        String existingAccount = existingAccountYes.isSelected() ? "Yes" : "No";

        try {
            if (pan.equals("") || aadhar.equals("")) {
                JOptionPane.showMessageDialog(null, "All fields are required.");
            } else {
                Conn c = new Conn();
                String query = "INSERT INTO signuptwo (formno, pan, aadhar, religion, category, income, education, occupation, seniorCitizen, existingAccount) VALUES ('"
                        + formno + "', '" + pan + "', '" + aadhar + "', '" + selectedReligion + "', '" + selectedCategory + "', '"
                        + selectedIncome + "', '" + selectedEducation + "', '" + selectedOccupation + "', '" + seniorCitizen + "', '" + existingAccount + "');";
                c.s.executeUpdate(query);

                // Move to the next form or process
                SignupThree signupThree = new SignupThree(formno);  // Create new SignupThree object
                signupThree.setVisible(true);  // Set the new frame visible
                this.setVisible(false);  // Hide current frame
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new SignupTwo("0"); // Changed to pass an initial value for the form number
    }
}
