package Quiz_Application;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class Answers extends JFrame implements ActionListener{

	JButton Again, disp ;
	JLabel []answer = new JLabel[10];
	JLabel Selectans , Correctans;
	 String answers[][]= new String[5][2];
	 String ArrofCheck[] = new String[5];
	 int A_Score;
	 
	 
	 JMenuBar menu = new JMenuBar();

	 JMenu score = new JMenu("Score");
	 JMenu Quiz = new JMenu("Quiz");
	 JMenu exit = new JMenu("Exit");
	 JMenu Logout = new JMenu("Logout");
	 
	 JMenuItem EFA = new JMenuItem("Exit from Application"); 
	 JMenuItem LFA = new JMenuItem("Logout from Application");
	 JMenuItem CTS = new JMenuItem("Check the Score"); 
	 JMenuItem RTQ = new JMenuItem("Restart the Quiz"); 
	 
	 
	public Answers(int Score ,String ans[]) {
		
		try
		{
		setResizable(false);
				 
		//sets the title,size,location of Frame
		setTitle("Correct Answers");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(250, 150, 1200, 600);
		getContentPane().setLayout(null);
		getContentPane().setBackground(Color.white);
		
		//Add the Menu Bar to the JFrame
		menu.setBounds(0,0,1200,30);
		menu.setForeground(Color.WHITE);
		menu.setBackground(new Color(30, 144, 255));
		getContentPane().add(menu);
		
		
		//Add the Menus to the JFrame
        Quiz.setFont(new Font("Tahoma",Font.BOLD,15));
        menu.add(Quiz);
        
        score.setFont(new Font("Tahoma",Font.BOLD,15));
        menu.add(score);
       
        Logout.setBounds(2,100,300,30);
        Logout.setFont(new Font("Tahoma", Font.BOLD, 15));
        menu.add(Logout);
        
        exit.setFont(new Font("Tahoma", Font.BOLD, 15));
        menu.add(exit);
        
      //Add the Menu Bar items to the JFrame
        EFA.addActionListener(this);
        exit.add(EFA);

        LFA.addActionListener(this);
        Logout.add(LFA);
        
        CTS.addActionListener(this);
        score.add(CTS);
        
        RTQ.addActionListener(this);
        Quiz.add(RTQ);
        
         // Add the Image on the Frame
		 ImageIcon i1 = new ImageIcon(Toolkit.getDefaultToolkit().getImage("/Elipse Applet program files/JAVA_APPLET_1/src/Icons/Answers_2.png"));
		 Image i2 = i1.getImage().getScaledInstance(600, 500, Image.SCALE_DEFAULT);
	     ImageIcon i3 = new ImageIcon(i2);
	     //add the label to display image on it
	     JLabel imageLabel = new JLabel(i3);
		 imageLabel.setBounds(0,20,1200,600);
		 getContentPane().add(imageLabel);
	   
		 
	   // create the label heading to display thank you message 
	    JLabel heading = new JLabel("!!!Your Answers Are!!! ");
	    heading.setForeground(Color.RED);
        heading.setBounds(450, 30, 700, 30);
        heading.setFont(new Font("Tahoma", Font.BOLD, 26));
        getContentPane().add(heading);
        
        //create the Correctans Label to See the Correct Answer
         Correctans = new JLabel("Correct Answers: \n");
         Correctans.setForeground(Color.BLUE);
         Correctans.setBounds(950, 50, 700, 30);
         Correctans.setFont(new Font("Tahoma", Font.PLAIN, 23));
        getContentPane().add(Correctans);
       
        
      //create the Selectans Label to See the Selected Answer
        Selectans = new JLabel("You Selected: \n");
        Selectans.setForeground(Color.BLUE);
        Selectans.setBounds(10, 50, 700, 30);
        Selectans.setFont(new Font("Tahoma", Font.PLAIN, 23));
        getContentPane().add(Selectans);
        
	        
        //display the user selected answer
         int num = 50;
        for(int i =0 ; i<5; i++)
		{
	        answer[i] = new JLabel( ans[i]+ "\n" );
	        answer[i].setBounds(80, num+70, 600, 30);
	        answer[i].setFont(new Font("Tahoma", Font.PLAIN, 18));
	        getContentPane().add(answer[i]);
	        num+=50;
		}
        
        
      //display the user Correct answer
        
        answers[0][1] = "JDB";
        answers[1][1] = "int";
        answers[2][1] = "java.util package";
        answers[3][1] = "Marker Interface";
        answers[4][1] = "import";
        
        int num1 = 50;
        for(int i =0 ; i<5; i++)
        {
        	answer[i] = new JLabel(answers[i][1]+ "\n" );
	        answer[i].setBounds(1000, num1+70, 600, 30);
	        answer[i].setFont(new Font("Tahoma", Font.PLAIN, 18));
	        getContentPane().add(answer[i]);
	        num1+=50;
        }
        
      //storing the Answers and Score in the Respected Variables to Pass it to the Again Score frame
        A_Score = Score;
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
		if(ae.getSource() == EFA)
		 {
			 this.dispatchEvent(new WindowEvent(this , WindowEvent.WINDOW_CLOSING));
			 JOptionPane.showMessageDialog(this, "Thank you For Playing Quiz Application", "Information", JOptionPane.INFORMATION_MESSAGE);
		 }else if(ae.getSource()== LFA)
		 {
			 setVisible(false);
			 Quiz_Application Q = new Quiz_Application();
			 Q.setVisible(true);
		 }else if(ae.getSource()== CTS)
		 {
			 setVisible(false);
			 Score s = new Score(A_Score, ArrofCheck);
			 s.setVisible(true);
		 }else if(ae.getSource()== RTQ)
		 {
			 setVisible(false);
			 Quiz q = new Quiz();
			 q.setVisible(true);
		 }
	}catch(Exception e)
	{
		JOptionPane.showMessageDialog(this, "Please Start from Splash to Avoid Inconvienece", "Error", JOptionPane.ERROR_MESSAGE);
	}
 }
	
	public static void main(String[] args) {
		
		Answers frame = new Answers(0,null);
		frame.setVisible(true);
}
	 

}


/*

MADE BY:
   Vaibhav Jawadwar 
   copyrighted © by Vaibhav Jawadwar. All rights Reserved.
*/
