import java.awt.Color;
import java.awt.Event;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;

import javax.swing.JButton;	//Importing javax.swing package and JButton class
import javax.swing.JFrame;   //Importing javax.swing package and JFrame class
import javax.swing.JLabel;	//Importing javax.swing package and JLabal class
import javax.swing.SwingConstants;

public class Calculator implements ActionListener { //importing ActionListener interface  
	
	Boolean isOperatorClicked=false;
	
	String oldValve;
	String operator;
	char opr;
	JFrame jf;    //Object deceleration , outside Constructor because of jf need global
	JLabel displayLabal;
	
	JButton sevenButton,eightButton,nineButton;
	JButton fourButton,fiveButton,sixButton;
	JButton oneButton,twoButton,threeButton,dublezero,nunButton;
	JButton dotButton,zeroButton,equalButton,percentageButon,backspaceButton;
	JButton divisionButton,mulButton,subButton,addButton,clearButton,neagtiveButton;

	
	public Calculator() {
		jf=new JFrame("Calculator");  //creating new object for JFraem in Calculator class 
		jf.setLayout(null);					// not using setLayout class(it for arranging buttons 
		jf.setSize(430,525);				// setting size for the window	
		jf.setLocation(500, 100);			/*Moves this component to a new location. The top-left corner of the new location is specified by the x and 
												y parameters in the coordinate space of this component's parent. */
		
		displayLabal=new JLabel();   // to access buttons of calculator through mouse click, JLabal doesn't support keyboard entry
		displayLabal.setBounds(15,25,385,80); // setBounds is(setSize+setLocation) a method of the JLabal class to add location and size for the component, Moves and resizes this component. The new location of the top-left corner is specified by x and y, and the new size is specified by width and height
		displayLabal.setFont(new Font("Arial", Font.BOLD, 40));
		displayLabal.setBackground(Color.lightGray);// to set color for JLabal
		displayLabal.setOpaque(true);			//If true the component paints every pixel within its bounds.Otherwise, the component may not paint some or all of it s pixels, allowing the underlying pixels to show through. 
		displayLabal.setHorizontalAlignment(SwingConstants.RIGHT); //to set text position in JLabal to move right side of the window
		displayLabal.setForeground(Color.BLACK); // to set color for the JLabal text
		
		jf.add(displayLabal);				// to add JLabal into JFrame 
		
		nunButton=new JButton(" ");
		nunButton.setBounds(15,130,70,60); 
		nunButton.setFont(new Font("Arial", Font.BOLD, 20));
		nunButton.addActionListener(this);
		jf.add(nunButton);
		
		nunButton=new JButton(" ");
		nunButton.setBounds(95,130,70,60);
		nunButton.setFont(new Font("Arial", Font.BOLD, 20));
		nunButton.addActionListener(this);
		jf.add(nunButton);
		
		nunButton=new JButton("  ");
		nunButton.setBounds(175,130,70,60);
		nunButton.setFont(new Font("Arial", Font.BOLD, 20));
		nunButton.addActionListener(this);
		jf.add(nunButton);
		
		neagtiveButton=new JButton("+/-");
		neagtiveButton.setBounds(255,130,70,60); 
		neagtiveButton.setFont(new Font("Arial", Font.BOLD, 20));
		neagtiveButton.addActionListener(this);
		jf.add(neagtiveButton);
		
		percentageButon=new JButton(" % ");
		percentageButon.setBounds(335,130,70,60);
		percentageButon.setFont(new Font("Arial", Font.BOLD, 20));
		percentageButon.addActionListener(this);
		jf.add(percentageButon);
		
		sevenButton=new JButton(" 7 "); //An implementation of a "push" button. creating an object for 'seven' button.
		sevenButton.setBounds(15,200,70,60);
		sevenButton.setFont(new Font("Arial", Font.BOLD, 30));
		sevenButton.addActionListener(this);
		jf.add(sevenButton);
		
		eightButton=new JButton(" 8 ");
		eightButton.setBounds(95,200,70,60);
		eightButton.setFont(new Font("Arial", Font.BOLD, 30));
		eightButton.addActionListener(this);
		jf.add(eightButton);
		
		nineButton=new JButton("9");
		nineButton.setBounds(175,200,70,60);
		nineButton.setFont(new Font("Arial", Font.BOLD, 30));
		nineButton.addActionListener(this);
		jf.add(nineButton);
		
		fourButton=new JButton("4"); 
		fourButton.setBounds(15,270,70,60);
		fourButton.setFont(new Font("Arial", Font.BOLD, 30));
		fourButton.addActionListener(this);
		jf.add(fourButton);
		
		fiveButton=new JButton("5");
		fiveButton.setBounds(95,270,70,60);
		fiveButton.setFont(new Font("Arial", Font.BOLD, 30));
		fiveButton.addActionListener(this);
		jf.add(fiveButton);
		
		sixButton=new JButton("6");
		sixButton.setBounds(175,270,70,60);
		sixButton.setFont(new Font("Arial", Font.BOLD, 30));
		sixButton.addActionListener(this);
		jf.add(sixButton);
		
		oneButton=new JButton("1"); 
		oneButton.setBounds(15,340,70,60);
		oneButton.setFont(new Font("Arial", Font.BOLD, 30));
		oneButton.addActionListener(this);
		jf.add(oneButton);
		
		twoButton=new JButton("2");
		twoButton.setBounds(95,340,70,60);
		twoButton.setFont(new Font("Arial", Font.BOLD, 30));
		twoButton.addActionListener(this);
		jf.add(twoButton);
		
		threeButton=new JButton("3");
		threeButton.setBounds(175,340,70,60);
		threeButton.setFont(new Font("Arial", Font.BOLD, 30));
		threeButton.addActionListener(this);
		jf.add(threeButton);
		
		
		
		zeroButton=new JButton("0");
		zeroButton.setBounds(15,410,70,60);
		zeroButton.setFont(new Font("Arial", Font.BOLD, 30));
		zeroButton.addActionListener(this);
		jf.add(zeroButton);
		
		dublezero=new JButton("00");
		dublezero.setBounds(95,410,70,60);
		dublezero.setFont(new Font("Arial", Font.BOLD, 30));
		dublezero.addActionListener(this);
		jf.add(dublezero);
		
		dotButton=new JButton("."); 
		dotButton.setBounds(175,410,70,60);
		dotButton.setFont(new Font("Arial", Font.BOLD, 30));
		dotButton.addActionListener(this);
		jf.add(dotButton);
		
		equalButton=new JButton("=");
		equalButton.setBounds(335,410,70,60);
		equalButton.setFont(new Font("Arial", Font.BOLD, 30));
		equalButton.addActionListener(this);
		jf.add(equalButton); 
		
		divisionButton=new JButton("/");
		divisionButton.setBounds(335,200,70,60);
		divisionButton.setFont(new Font("Arial", Font.BOLD, 30));
		divisionButton.addActionListener(this);
		jf.add(divisionButton);
		
		mulButton=new JButton("*");
		mulButton.setBounds(255,200,70,60);
		mulButton.setFont(new Font("Arial", Font.BOLD, 30));
		mulButton.addActionListener(this);
		jf.add(mulButton);
		
		subButton=new JButton("-");
		subButton.setBounds(255,270,70,60);
		subButton.setFont(new Font("Arial", Font.BOLD, 30));
		subButton.addActionListener(this);
		jf.add(subButton);
		
		addButton=new JButton("+");
		addButton.setBounds(255,340,70,130); 
		addButton.setFont(new Font("Arial", Font.BOLD, 30));
		addButton.addActionListener(this);
		jf.add(addButton);
		
		clearButton=new JButton("CE");
		clearButton.setBounds(335,340,70,60); 
		clearButton.setFont(new Font("Arial", Font.BOLD, 20));
		clearButton.setForeground(Color.RED);
		clearButton.addActionListener(this);
		jf.add(clearButton);
		
		backspaceButton=new JButton("C");
		backspaceButton.setBounds(335,270,70,60); 
		backspaceButton.setFont(new Font("Arial", Font.BOLD, 20));
		backspaceButton.addActionListener(this);
		jf.add(backspaceButton);
		 
		jf.setVisible(true);				// make visible the window
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   //to default close on closing window
		
		
	}
	 
	
	
	public static void main(String[] args) {
		
		new Calculator();					//creating obj in main class, 'Calculator c' first portion removed because no use of 'c' in main class
		
		
	}


 
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==sevenButton) {     						 // to get seven button action
			if(isOperatorClicked) {
				displayLabal.setText("7"); 								//.setText to print text in JLabal
				isOperatorClicked=false;
			}else {
				displayLabal.setText(displayLabal.getText()+"7"); 		//.getText to get already printed text
			}
		}else if(e.getSource()==eightButton) {     						 
			if(isOperatorClicked) {
				displayLabal.setText("8"); 
				isOperatorClicked=false; 
			}else {
				displayLabal.setText(displayLabal.getText()+"8"); 		
			}	      
		}else if(e.getSource()==nineButton) {     						 
			if(isOperatorClicked) {
				displayLabal.setText("9"); 
				isOperatorClicked=false; 
			}else {
				displayLabal.setText(displayLabal.getText()+"9"); 		
			}	      
		}else if(e.getSource()==fourButton) {     						 
			if(isOperatorClicked) {
				displayLabal.setText("4"); 
				isOperatorClicked=false; 
			}else {
				displayLabal.setText(displayLabal.getText()+"4"); 		
			}	      
		}else if(e.getSource()==fiveButton) {     						 
			if(isOperatorClicked) {
				displayLabal.setText("5"); 
				isOperatorClicked=false; 
			}else {
				displayLabal.setText(displayLabal.getText()+"5"); 		
			}	      
		}else if(e.getSource()==sixButton) {     						 
			if(isOperatorClicked) {
				displayLabal.setText("6"); 
				isOperatorClicked=false; 
			}else {
				displayLabal.setText(displayLabal.getText()+"6"); 		
			}	      
		}else if(e.getSource()==oneButton) {     						 
			if(isOperatorClicked) {
				displayLabal.setText("1"); 
				isOperatorClicked=false; 
			}else {
				displayLabal.setText(displayLabal.getText()+"1"); 		
			}	      
		}else if(e.getSource()==twoButton) {     						 
			if(isOperatorClicked) {
				displayLabal.setText("2"); 
				isOperatorClicked=false; 
			}else {
				displayLabal.setText(displayLabal.getText()+"2"); 		
			}	      
		}else if(e.getSource()==threeButton) {     						 
			if(isOperatorClicked) {
				displayLabal.setText("3"); 
				isOperatorClicked=false; 
			}else {
				displayLabal.setText(displayLabal.getText()+"3"); 		
			}	      
		}else if(e.getSource()==dotButton) {     						 
			if(isOperatorClicked) {
				displayLabal.setText("."); 
				isOperatorClicked=false; 
			}else {
				displayLabal.setText(displayLabal.getText()+"."); 		
			}	      
		}else if(e.getSource()==zeroButton) {     						 
			if(isOperatorClicked) {
				displayLabal.setText("0"); 
				isOperatorClicked=false; 
			}else {
				displayLabal.setText(displayLabal.getText()+"0"); 		
			}
			
			
		}else if(e.getSource()==dublezero) {     						 
			if(isOperatorClicked) {
				displayLabal.setText("00"); 
				isOperatorClicked=false; 
			}else {
				displayLabal.setText(displayLabal.getText()+"00"); 		
			}
			
			
		}else if(e.getSource()==neagtiveButton) {
			if(isOperatorClicked) {
				displayLabal.setText(Character.toString('-')); 
				isOperatorClicked=false; 
			}else {
				displayLabal.setText(Character.toString('-')+displayLabal.getText()); 		
			}
			
		}else if(e.getSource()==divisionButton) {
			isOperatorClicked=true;
			opr='/';
			oldValve=displayLabal.getText();				// assign current displayLabal value into a string
		}else if(e.getSource()==percentageButon) {
			isOperatorClicked=true;
			opr='%';
			oldValve=displayLabal.getText();				// assign current displayLabal value into a string
		}else if(e.getSource()==mulButton) {
			isOperatorClicked=true;
			opr='*';
			oldValve=displayLabal.getText();
		}else if(e.getSource()==subButton) {
			isOperatorClicked=true;
			opr='-';
			oldValve=displayLabal.getText();
		}else if(e.getSource()==addButton) {
			isOperatorClicked=true;
			opr='+';
			oldValve=displayLabal.getText();
		}else if(e.getSource()==clearButton) {
			displayLabal.setText("");
		}else if(e.getSource()==backspaceButton) {
			displayLabal.setText(displayLabal.getText().substring(0, displayLabal.getText().length() - 1));
		}else if(e.getSource()==equalButton) {
			String newValue=displayLabal.getText();			// assign latest values in displayLable into a new string
			float newValueF=Float.parseFloat(newValue);    // to convert String newValue into float
			float oldValueF=Float.parseFloat(oldValve);		// to convert oldValue into a float for calculations
								
			float result=0;
			
			switch (opr) {
			case '+':result=oldValueF+newValueF; 
				break;
			case '-':result=oldValueF-newValueF; 
				break;	
			case '*':result=oldValueF*newValueF; 
				break;
			case '/':result=oldValueF/newValueF; 
				break;
			case '%':result=(oldValueF/newValueF)*100; 
			break;		
			}
			
			displayLabal.setText(Float.toString(result));
		}
		
		
	}



	
}
