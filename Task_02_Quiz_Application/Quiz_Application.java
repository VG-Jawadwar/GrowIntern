package Quiz_Application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Quiz_Application extends JFrame implements ActionListener {
	
	
	private JLabel usernameLabel, passwordLabel;
	private JTextField usernameField, passwordField;
	private JPasswordField passwordField_1;

	
	public Quiz_Application() {
		
		setResizable(false);
		
		//setup the size, location, Layout of JFrame 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200,150,1200,500);
		getContentPane().setLayout(null);
		getContentPane().setBackground(Color.WHITE);
		
		
		 //insert image from System
		 ImageIcon i1 = new ImageIcon(Toolkit.getDefaultToolkit().getImage("/Elipse Applet program files/JAVA_APPLET_1/src/Icons/Log2.jpeg"));
		 Image i2 = i1.getImage().getScaledInstance(700, 500, Image.SCALE_DEFAULT);
	     ImageIcon i3 = new ImageIcon(i2);
	    // Add the label to the frame to set image on that label
	     JLabel imageLabel = new JLabel(i3);
		 imageLabel.setBounds(0,0,700,500);
		 getContentPane().add(imageLabel);
		 
		 
		   // create the label username 
			usernameLabel = new JLabel("Enter Username:");
			usernameLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
			usernameLabel.setBounds(750,50,150,50);
		    getContentPane().add(usernameLabel);
		    
		  // create the textfield to accept username 
	        usernameField = new JTextField(20);
	        usernameField.setBounds(800,90,190,30);
	        getContentPane().add(usernameField);
	        
	       // create the label password 
	        passwordLabel = new JLabel("Enter Password:");
	        passwordLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
	        passwordLabel.setBounds(750,110,150,50);
	        getContentPane().add(passwordLabel);
	           
	        // create the textfield to accept password
	        passwordField_1 = new JPasswordField(20);
	        passwordField_1.setBounds(800,150,190,30);
	        getContentPane().add(passwordField_1);
	        
	        
			// Create a button start
	        JButton button = new JButton("Start");
	        button.setSize(150,50);
	        button.setLocation(830,300);
	        button.setVisible(true);
	        button.addActionListener(this);
	        getContentPane().add(button);
	        
	        //create the label Welcome To Quiz Application
	        JLabel label = new JLabel("Welcome To Quiz Application");
	        label.setFont(new Font("Viner Hand ITC", Font.BOLD, 20));
	        label.setForeground(new Color(30,144,254));
	        label.setSize(300,50);
	        label.setLocation(800,0);
	        label.setVisible(true);
	        getContentPane().add(label);
	       
	       
	        setTitle("Login");
	}
	
	 public void actionPerformed(ActionEvent e) {
		 
		 String username = usernameField.getText();
	      String password = passwordField_1.getText();
	      
	        if (username.equals("admin") && password.equals("pass@123")) {
	        	JOptionPane.showMessageDialog(this, "Login Successfull!!!", "Information", JOptionPane.INFORMATION_MESSAGE);
	        	Quiz quiz = new Quiz();
	        	//open Quiz Frame
	            quiz.setVisible(true);
	            setVisible(false);
	        } else {
	            // Show error message
	            JOptionPane.showMessageDialog(this, "Invalid username or password", "Error", JOptionPane.ERROR_MESSAGE);
	        }
	    }
		
	 
	 public static void main(String args[])
	{
			Quiz_Application frame = new Quiz_Application();
			frame.setVisible(true);
	}
 }



/*

MADE BY:
   Vaibhav Jawadwar 
   copyrighted © by Vaibhav Jawadwar. All rights Reserved.
*/
