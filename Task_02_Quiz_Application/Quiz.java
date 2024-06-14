package Quiz_Application;


import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class Quiz extends JFrame implements ActionListener {
	 JButton Next, lifeline, submit;
	 int Score= 0;
	  String questions[][]= new String[10][10];
	  String answers[][]= new String[5][2];
	  String Userans[][] = new String[5][1];
	   JRadioButton opt1, opt2, opt3, opt4;
	  ButtonGroup groupoptions;
	  JLabel Qno;
	  JLabel Question , Marks;
	  public int count = 0;
	  public int score = 0;
	  String []sel_answer= new String[5];

	public Quiz() {
		
		setResizable(false);
		
		//set the Title and location, size of frame
		setTitle("Quiz Application");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(150, 0, 1200, 750);
		getContentPane().setLayout(null);
		getContentPane().setBackground(Color.white);
		
		// Add the Image on the Frame
		ImageIcon i1 = new ImageIcon(Toolkit.getDefaultToolkit().getImage("/Elipse Applet program files/JAVA_APPLET_1/src/Icons/quiz2.png"));
		JLabel imageLabel = new JLabel(i1);
	     // Add the label to the frame
		 imageLabel.setBounds(0,0,1200,400);
		 getContentPane().add(imageLabel);
		 
		//adding the Next button
		    Next = new JButton("Next");
		    Next.setBounds(900,450,150,50);
	        Next.setVisible(true);
	        Next.addActionListener(this);
	        getContentPane().add(Next);
	        
	        //adding the 50-50 Lifeline Button  button
	        lifeline = new JButton("50-50 lifeline");
	        lifeline.setBounds(900,520,150,50);
	        lifeline.setVisible(true);
	        lifeline.addActionListener(this);
		    getContentPane().add(lifeline);
		    
		    
            //creating the Submit Button
	        submit = new JButton("Submit");
	        submit.setBounds(900,590,150,50);
	        submit.setVisible(true);
	        submit.addActionListener(this);
	        getContentPane().add(submit);
	        submit.setEnabled(false);
	        
		    //creating the Question Number 
		    Qno = new JLabel();
		    Qno.setFont(new Font("Arial", Font.BOLD, 20));
		    Qno.setBounds(20,410,40,60);
		    Qno.setVisible(true);
	        getContentPane().add(Qno);
	        
	       
	        //creating the Marks label to display the Question
	        Marks = new JLabel("10 M");
	        Marks.setForeground(new Color(255, 0, 0));
	        Marks.setFont(new Font("Arial", Font.BOLD, 20));
	        Marks.setBounds(750,420,700,40);
	        Marks.setVisible(true);
	        getContentPane().add(Marks);
	        
	        
	      //creating the Question label to display the Question
	        Question = new JLabel();
	        Question.setFont(new Font("Arial", Font.BOLD, 20));
	        Question.setBounds(60,420,700,40);
	        Question.setVisible(true);
	        getContentPane().add(Question);

	        //creating the JRadioButton to choose one option among them using ButtonGroup
	        opt1 = new JRadioButton();
	        opt1.setBounds(70, 470, 700, 30);
	        opt1.setBackground(Color.WHITE);
	        opt1.setFont(new Font("Dialog", Font.PLAIN, 20));
	        getContentPane().add(opt1);
	        
	        opt2 = new JRadioButton();
	        opt2.setBounds(70, 500, 700, 30);
	        opt2.setBackground(Color.WHITE);
	        opt2.setFont(new Font("Dialog", Font.PLAIN, 20));
	        getContentPane().add(opt2);
	        
	        opt3 = new JRadioButton();
	        opt3.setBounds(70, 530, 700, 30);
	        opt3.setBackground(Color.WHITE);
	        opt3.setFont(new Font("Dialog", Font.PLAIN, 20));
	        getContentPane().add(opt3);
	        
	        opt4 = new JRadioButton();
	        opt4.setBounds(70, 560, 700, 30);
	        opt4.setBackground(Color.WHITE);
	        opt4.setFont(new Font("Dialog", Font.PLAIN, 20));
	        getContentPane().add(opt4);
	        
	
	        groupoptions = new ButtonGroup();
	        groupoptions.add(opt1);
	        groupoptions.add(opt2);
	        groupoptions.add(opt3);
	        groupoptions.add(opt4);
	        
	       
	        //Questions for Quiz Application
	        questions[0][0] = "Which is used to find and fix bugs in the Java programs.?";
	        questions[0][1] = "JDB";
	        questions[0][2] = "JVM";
	        questions[0][3] = "JDK";
	        questions[0][4] = "JRE";

	        questions[1][0] = "What is the return type of the hashCode() method in the Object class?";
	        questions[1][1] = "int";
	        questions[1][2] = "Object";
	        questions[1][3] = "long";
	        questions[1][4] = "void";

	        questions[2][0] = "Which package contains the Random class?";
	        questions[2][1] = "java.util package";
	        questions[2][2] = "java.lang package";
	        questions[2][3] = "java.awt package";
	        questions[2][4] = "java.io package";

	        questions[3][0] = "An interface with no fields or methods is known as?";
	        questions[3][1] = "Runnable Interface";
	        questions[3][2] = "Abstract Interface";
	        questions[3][3] = "Marker Interface";
	        questions[3][4] = "CharSequence Interface";

	        questions[4][0] = "Which keyword is used for accessing the features of a package?";
	        questions[4][1] = "import";
	        questions[4][2] = "package";
	        questions[4][3] = "extends";
	        questions[4][4] = "export";
	        
	        
	        //Answers Of Quiz Application
	        answers[0][1] = "JDB";
	        answers[1][1] = "int";
	        answers[2][1] = "java.util package";
	        answers[3][1] = "Marker Interface";
	        answers[4][1] = "import";
	        
	        enter(count);
	       
	}
	
	public void enter(int count)
	{
    
		//set the Question Number
		Qno.setText(""+ (count + 1) + ".  ");
		
		//set the Question 
		Question.setText(questions[count][0]);
		 
		//set the options for Questions
		opt1.setText(questions[count][1]);
		 opt1.setActionCommand(questions[count][1]);
		 
		opt2.setText(questions[count][2]);
		 opt2.setActionCommand(questions[count][2]);
		 
		opt3.setText(questions[count][3]);
		 opt3.setActionCommand(questions[count][3]);
		 
		opt4.setText(questions[count][4]);
		 opt4.setActionCommand(questions[count][4]);
		
		 //clear the selection of Question once moved to Next Question
		 groupoptions.clearSelection();
	}
	

	public void actionPerformed(ActionEvent e) {
	     
		if(e.getSource() == Next)
		{
			//refresh the Frame to display new Question
			repaint();
			opt1.setEnabled(true);
            opt2.setEnabled(true);
            opt3.setEnabled(true);
            opt4.setEnabled(true);
            
               //Store the Answer in Userans array
			   if(groupoptions.getSelection() == null)
	        	{
	        	Userans[count][0]= "";
	        	}
	        else
	        {
	        	Userans[count][0] = groupoptions.getSelection().getActionCommand();
	        	
	        
	        }	
			
			if(count == 3)
			{
				Next.setEnabled(false);
				submit.setEnabled(true);
			}
			
			//increment the count to display the next question
			count++;
			enter(count);
			
		}else if(e.getSource() == lifeline)
		{
			opt2.setEnabled(false);
            opt4.setEnabled(false);
            lifeline.setEnabled(false);
		}else if(e.getSource()== submit) 
		{
			
			 //Store the Answer in Userans array
	            if (groupoptions.getSelection() == null) {
	            	Userans[count][0] = "";
	            	
	            } else {
	            	Userans[count][0] = groupoptions.getSelection().getActionCommand();
	            	
	            }
	            
	           
	          
	          //Increment the score by 10 if the answer is Correct
	            for (int i = 0; i < Userans.length; i++) {
	            	
	            	// select_ans array to store the selected answer and pass it to the Score Frame
	            	sel_answer[i] = Userans[i][0];
	                
	            	if (Userans[i][0].equals(answers[i][1])) {	                	
	                	score += 10;
	                } else {
	                    score += 0;
	                }
	             }
	          
	            setVisible(false);
	           Score s = new Score(score,  sel_answer);
	            s.setVisible(true);
	            
	           }
		
		}
		
		
	 public static void main(String args[])
		{
				Quiz frame = new Quiz();
				frame.setVisible(true);
		}
	}
	

/*

MADE BY:
   Vaibhav Jawadwar 
   copyrighted © by Vaibhav Jawadwar. All rights Reserved.
*/
