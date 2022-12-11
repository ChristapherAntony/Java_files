import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;

import javax.swing.JButton;	//Importing javax.swing package and JButton class
import javax.swing.JFrame;   //Importing javax.swing package and JFrame class
import javax.swing.JLabel;	//Importing javax.swing package and JLabal class
import javax.swing.SwingConstants;

public class Calculator implements ActionListener { //importing ActionListener interface  
	
	JFrame jf;    //Object deceleration , outside Constructor because of jf need global
	JLabel displayLabal;
	public Calculator() {
		jf=new JFrame("Calculator");  //creating new object for JFraem in Calculator class 
		jf.setLayout(null);					// not using setLayout class(it for arranging buttons 
		jf.setSize(600, 600);				// setting size for the window	
		jf.setLocation(500, 100);			/*Moves this component to a new location. The top-left corner of the new location is specified by the x and 
												y parameters in the coordinate space of this component's parent. */
		
		displayLabal=new JLabel(" hello");   // to access buttons of calculator through mouse click, JLabal doesn't support keyboard entry
		displayLabal.setBounds(30,30,540,80); // setBounds is(setSize+setLocation) a method of the JLabal class to add location and size for the component, Moves and resizes this component. The new location of the top-left corner is specified by x and y, and the new size is specified by width and height
		displayLabal.setFont(new Font("Arial", Font.BOLD, 40));
		displayLabal.setBackground(Color.lightGray);// to set color for JLabal
		displayLabal.setOpaque(true);			//If true the component paints every pixel within its bounds.Otherwise, the component may not paint some or all of it s pixels, allowing the underlying pixels to show through. 
		displayLabal.setHorizontalAlignment(SwingConstants.RIGHT); //to set text position in JLabal to move right side of the window
		displayLabal.setForeground(Color.BLACK); // to set color for the JLabal text
		
		jf.add(displayLabal);				// to add JLabal into JFrame 
		
		JButton sevenButton=new JButton(" 7 "); //An implementation of a "push" button. creating an object for 'seven' button.
		sevenButton.setBounds(30,130,80,80);
		sevenButton.setFont(new Font("Arial", Font.BOLD, 40));
		sevenButton.addActionListener(this);
		jf.add(sevenButton);
		
		JButton eightButton=new JButton(" 8 ");
		eightButton.setBounds(130,130,80,80);
		eightButton.setFont(new Font("Arial", Font.BOLD, 40));
		eightButton.addActionListener(this);
		jf.add(eightButton);
		
		JButton nieButton=new JButton("9");
		nieButton.setBounds(230,130,80,80);
		nieButton.setFont(new Font("Arial", Font.BOLD, 40));
		jf.add(nieButton);
		
		JButton fourButton=new JButton("4"); 
		fourButton.setBounds(30,230,80,80);
		fourButton.setFont(new Font("Arial", Font.BOLD, 40));
		jf.add(fourButton);
		
		JButton fiveButton=new JButton("5");
		fiveButton.setBounds(130,230,80,80);
		fiveButton.setFont(new Font("Arial", Font.BOLD, 40));
		jf.add(fiveButton);
		
		JButton sixButton=new JButton("6");
		sixButton.setBounds(230,230,80,80);
		sixButton.setFont(new Font("Arial", Font.BOLD, 40));
		jf.add(sixButton);
		
		JButton oneButton=new JButton("1"); 
		oneButton.setBounds(30,330,80,80);
		oneButton.setFont(new Font("Arial", Font.BOLD, 40));
		jf.add(oneButton);
		
		JButton twoButton=new JButton("2");
		twoButton.setBounds(130,330,80,80);
		twoButton.setFont(new Font("Arial", Font.BOLD, 40));
		jf.add(twoButton);
		
		JButton threeButton=new JButton("3");
		threeButton.setBounds(230,330,80,80);
		threeButton.setFont(new Font("Arial", Font.BOLD, 40));
		jf.add(threeButton);
		
		JButton dotButton=new JButton("."); 
		dotButton.setBounds(30,430,80,80);
		dotButton.setFont(new Font("Arial", Font.BOLD, 40));
		jf.add(dotButton);
		
		JButton zeroButton=new JButton("0");
		zeroButton.setBounds(130,430,80,80);
		zeroButton.setFont(new Font("Arial", Font.BOLD, 40));
		jf.add(zeroButton);
		
		JButton equalButton=new JButton("=");
		equalButton.setBounds(230,430,80,80);
		equalButton.setFont(new Font("Arial", Font.BOLD, 40));
		jf.add(equalButton); 
		
		JButton divisionButton=new JButton("/");
		divisionButton.setBounds(330,130,80,80);
		divisionButton.setFont(new Font("Arial", Font.BOLD, 40));
		jf.add(divisionButton);
		
		JButton mulButton=new JButton("*");
		mulButton.setBounds(330,230,80,80);
		mulButton.setFont(new Font("Arial", Font.BOLD, 40));
		jf.add(mulButton);
		
		JButton subButton=new JButton("-");
		subButton.setBounds(330,330,80,80);
		subButton.setFont(new Font("Arial", Font.BOLD, 40));
		jf.add(subButton);
		
		JButton addButton=new JButton("+");
		addButton.setBounds(330,430,80,80); 
		addButton.setFont(new Font("Arial", Font.BOLD, 40));
		jf.add(addButton);
		 
		jf.setVisible(true);				// make visible the window
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   //to default close on closing window
		
		
	}
	 
	
	
	public static void main(String[] args) {
		
		new Calculator();					//creating obj in main class, 'Calculator c' first portion removed because no use of 'c' in main class
		
		
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		
		
	}



	
}
