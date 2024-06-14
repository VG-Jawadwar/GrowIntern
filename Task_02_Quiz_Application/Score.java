package Quiz_Application;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Score extends JFrame implements ActionListener {
	JButton Again, Check ;
	 String ArrofCheck[] = new String[5];
	 int A_score;
	 
	public Score(int Score, String ans[]) {
		try
		{
			
		setResizable(false);
	   
		//sets the title,size,location of Frame
		setTitle("Score");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(250, 150, 1200, 600);
		getContentPane().setLayout(null);
		getContentPane().setBackground(Color.white);
		
		
		// Add the Image on the Frame
		ImageIcon i1 = new ImageIcon(Toolkit.getDefaultToolkit().getImage("/Elipse Applet program files/JAVA_APPLET_1/src/Icons/Score2.jpg"));
		 Image i2 = i1.getImage().getScaledInstance(450, 450, Image.SCALE_DEFAULT);
	     ImageIcon i3 = new ImageIcon(i2);
	     //add the label to display image on it
	     JLabel imageLabel = new JLabel(i3);
		 imageLabel.setBounds(0,30,600,650);
		 getContentPane().add(imageLabel);
		 
		 
		// create the label heading to display thank you message 
		    JLabel heading = new JLabel("Thank you for playing the Quiz Application!!!!");
		    heading.setForeground(Color.RED);
	        heading.setBounds(300, 30, 700, 30);
	        heading.setFont(new Font("Tahoma", Font.BOLD, 26));
	        getContentPane().add(heading);
	        
	        //display Score
	        JLabel lblscore = new JLabel("Your score is: " + Score);
	        lblscore.setBounds(700, 200, 300, 30);
	        lblscore.setFont(new Font("Tahoma", Font.PLAIN, 26));
	        getContentPane().add(lblscore);
	        
	        //create the button to go to login page again
	        Again = new JButton("Play Again");
	        Again.setBounds(725, 272, 120, 40);
	        Again.setBackground(new Color(30, 144, 255));
	        Again.setForeground(Color.WHITE);
	        Again.addActionListener(this);
	        getContentPane().add(Again);
	        
	        //create the button to check the Selected and Correct Answers
	         Check = new JButton("Check Final Answers!!");
	         Check.setBounds(725, 350, 200, 40);
	         Check.setBackground(new Color(30, 144, 255));
	         Check.setForeground(Color.WHITE);
	         Check.addActionListener(this);
	        getContentPane().add(Check);
	        
	       //storing the Answers and Score in the Respected Variables to Pass it to the Answers frame
	        A_score = Score;
	      
	        for(int i = 0 ; i<5; i++)
	        {
	        	ArrofCheck[i]= ans[i];
	        }
		}catch(Exception e)
		{
			JOptionPane.showMessageDialog(this, "Please Start from Splash to Avoid Inconvienece", "Error", JOptionPane.ERROR_MESSAGE);	
		}
	        
	}
	
	 public void actionPerformed(ActionEvent ae) {
		 try
		 {
			   if(ae.getSource()== Again)
			   {
				   setVisible(false);
			        Quiz_Application login = new Quiz_Application(); 
			        login.setVisible(true);
		        
			   }else if(ae.getSource()== Check)
			   {
				   setVisible(false);
				   Answers A = new Answers(A_score ,ArrofCheck);
				   A.setVisible(true);
			   }
		 }catch(Exception e)
		 {
			 JOptionPane.showMessageDialog(this, "Please Start from Splash to Avoid Inconvienece", "Error", JOptionPane.ERROR_MESSAGE);
		 }
		
	    }
	 
	 public static void main(String args[])
		{
				Score frame = new Score(0,null);
				frame.setVisible(true);
		}

}



/*

MADE BY:
   Vaibhav Jawadwar 
   copyrighted © by Vaibhav Jawadwar. All rights Reserved.
*/
