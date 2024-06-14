package Quiz_Application;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Splash extends JFrame{
	
	private static JProgressBar progressBar_1;
	private static JLabel message = new JLabel();

	public Splash() {
		
				setResizable(false);
		
	        	//sets the title,size,location of Frame
				setTitle("Welcome!!!!");
				setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				setBounds(500, 150, 634, 600);
				getContentPane().setLayout(null);
				getContentPane().setBackground(new Color(241, 247, 151));
				
			
			     // Add the Image on the Frame
				 ImageIcon i1 = new ImageIcon(Toolkit.getDefaultToolkit().getImage("/Elipse Applet program files/JAVA_APPLET_1/src/Icons/splash.png"));
				 Image i2 = i1.getImage().getScaledInstance(500, 500, Image.SCALE_DEFAULT);
			     ImageIcon i3 = new ImageIcon(i2);
			     //add the label to display image on it
			     JLabel imageLabel = new JLabel(i3);
				 imageLabel.setBounds(10,25,587,500);
				 getContentPane().add(imageLabel);
				 
				 
			    message.setBounds(60, 510, 200, 50);
			    message.setForeground(Color.BLACK);
			    message.setFont(new Font("arial", Font.BOLD, 15));
			    getContentPane().add(message);
			    
			    progressBar_1 = new JProgressBar();
			    progressBar_1.setBackground(Color.WHITE);
			    progressBar_1.setForeground(Color.GREEN);
			    progressBar_1.setBounds(45, 546, 520, 17);
			    getContentPane().add(progressBar_1);
			    
			        
	}
	
	void progress()
	{
		  try
	       	{	
			    for(int i=0;i <=100;i++)
	       	{
			    Splash.progressBar_1.setValue(i);
	       		Thread.sleep(50);
	            message.setText("LOADING " + Integer.toString(i) + "%");
	            if(i==100)
	            {
	            	setVisible(false);
	            	Terms_and_Conditions frame = new Terms_and_Conditions();
	    			frame.setVisible(true);
	            }
		       }
	       	}catch(Exception e)
	       	{
	       		e.printStackTrace();
	       	}
	}
	
	public static void main(String[] args) {
		
		Splash frame = new Splash();
		frame.setVisible(true);
		frame.progress();
		
	}
}


/*

MADE BY:
   Vaibhav Jawadwar 
   copyrighted © by Vaibhav Jawadwar. All rights Reserved.
*/
