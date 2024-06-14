package Quiz_Application;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Terms_and_Conditions extends JFrame implements ActionListener {
	
	JRadioButton opt1, opt2;
	ButtonGroup groupoptions;
	JButton confirm;
	String SelectedText;
	public static void main(String[] args) {
		
					Terms_and_Conditions frame = new Terms_and_Conditions();
					frame.setVisible(true);
				
	}

	public Terms_and_Conditions() {
		
		setResizable(false);
		
		//sets the title,size,location of Frame
		setTitle("Terms and Conditions");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(250, 150, 1200, 600);
		getContentPane().setLayout(null);
		getContentPane().setBackground(Color.WHITE);
		
		// create the label heading to display Rules Message 
	    JLabel heading = new JLabel("Terms and Conditions");
	    heading.setForeground(Color.RED);
        heading.setBounds(380, 30, 700, 30);
        heading.setFont(new Font("Tahoma", Font.BOLD, 26));
        getContentPane().add(heading);
        
        
     // create the label TC... to display Terms and Conditions 
	    JLabel TC1 = new JLabel("1.The Application is intended for educational purposes and to help you assess your programming knowledge.");
	    TC1.setForeground(Color.BLACK);
	    TC1.setBounds(0, 70, 1000, 30);
	    TC1.setFont(new Font("Tahoma", Font.BOLD, 15));
        getContentPane().add(TC1);
        
        JLabel TC2 = new JLabel("2.You may use the Application for personal, non-commercial use only.");
        TC2.setForeground(Color.BLACK);
        TC2.setBounds(0, 100, 1000, 30);
        TC2.setFont(new Font("Tahoma", Font.BOLD, 15));
        getContentPane().add(TC2);
        
        JLabel TC3 = new JLabel("3.You may use the Application for personal, non-commercial use only.");
        TC3.setForeground(Color.BLACK);
        TC3.setBounds(0, 130, 1000, 30);
        TC3.setFont(new Font("Tahoma", Font.BOLD, 15));
        getContentPane().add(TC3);
        
        JLabel TC4 = new JLabel("4.You agree not to modify, disassemble, reverse engineer, or attempt to gain unauthorized access to the Application or any underlying systems.");
        TC4.setForeground(Color.BLACK);
        TC4.setBounds(0, 160, 1200, 30);
        TC4.setFont(new Font("Tahoma", Font.BOLD, 15));
        getContentPane().add(TC4);
        
        JLabel TC5 = new JLabel("5.The developer(s) do not warrant that the Application will be uninterrupted, error-free, or virus-free.");
        TC5.setForeground(Color.BLACK);
        TC5.setBounds(0, 190, 1200, 30);
        TC5.setFont(new Font("Tahoma", Font.BOLD, 15));
        getContentPane().add(TC5);
        
        JLabel TC6 = new JLabel("6.If you have any questions about these Terms, please contact the developer(s) at https://github.com/VG-Jawadwar");
        TC6.setForeground(Color.BLACK);
        TC6.setBounds(0, 220, 1200, 30);
        TC6.setFont(new Font("Tahoma", Font.BOLD, 15));
        getContentPane().add(TC6);
        
        JLabel TC7 = new JLabel("Are you Sure to...");
        TC7.setForeground(Color.BLACK);
        TC7.setBounds(0, 270, 1200, 30);
        TC7.setFont(new Font("Tahoma", Font.PLAIN, 25));
        getContentPane().add(TC7);
        
        
        //creating the JRadioButton to choose one option among them using ButtonGroup
        opt1 = new JRadioButton("Accept");
        opt1.setBounds(170, 320, 100, 30);
        opt1.setBackground(Color.WHITE);
        opt1.setFont(new Font("Dialog", Font.PLAIN, 20));
        getContentPane().add(opt1);
        
        opt2 = new JRadioButton("Decline");
        opt2.setBounds(370, 320, 100, 30);
        opt2.setBackground(Color.WHITE);
        opt2.setFont(new Font("Dialog", Font.PLAIN, 20));
        getContentPane().add(opt2);
        
        groupoptions = new ButtonGroup();
        groupoptions.add(opt1);
        groupoptions.add(opt2);
        
        //create the button to go to login page
        confirm = new JButton("Confirm");
        confirm.setBounds(270, 390, 120, 40);
        confirm.setBackground(new Color(30, 144, 255));
        confirm.setForeground(Color.WHITE);
        confirm.addActionListener(this);
        getContentPane().add(confirm);
       
        
    	
		
		
	}
	
	public void actionPerformed(ActionEvent ae) {
		
		try
		{
		if(ae.getSource() == confirm)
		{	
			if(opt1.isSelected())
			{
			SelectedText = "Accept";
			}
			if(SelectedText.equals("Accept"))
			{
				setVisible(false);
				Quiz_Application Q = new Quiz_Application();
				Q.setVisible(true);
			}
	   }
		}catch(Exception e)
		{
			JOptionPane.showMessageDialog(this, "Please Accept the Conditions to Start", "Error", JOptionPane.ERROR_MESSAGE);
		}
	
	}
	

}


/*

MADE BY:
   Vaibhav Jawadwar 
   copyrighted © by Vaibhav Jawadwar. All rights Reserved.
*/
