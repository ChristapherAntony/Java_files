import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane.CloseAction;
import javax.swing.plaf.basic.BasicSplitPaneUI.KeyboardDownRightHandler;

public class SwingSamle implements ActionListener {
	JFrame frame;
	
	Boolean isOperatorClicked=false;
	JButton sevenButton,eightButton,nineButton;
	JButton fourButton,fiveButton,sixButton;
	JButton oneButton,twoButton,threeButton,dublezero,nun1Button,nun2Button,nun3Button,nun4Button;
	JButton dotButton,zeroButton,equalButton,percentageButon,backspaceButton;
	JButton divisionButton,mulButton,subButton,addButton,clearButton,neagtiveButton;
	float oldValue,newValue,result;
	char opr;
	
	JTextField field;
	Font myfont=new Font("Arial", Font.BOLD, 40);
	JPanel panel; 
	
	
	SwingSamle(){
		
		frame=new JFrame("Sample Swing");
		frame.setBounds(500, 100, 430,525);
		frame.setBackground(Color.LIGHT_GRAY);
		frame.setLayout(null);
		
		field=new JTextField();
		field.setBounds(15,25,385,80);
		field.setFont(myfont);
		field.setHorizontalAlignment(field.RIGHT);
		field.setEditable(false); 
		frame.add(field);
		
		
		
		nun1Button=new JButton("nun ");
		nun1Button.addActionListener(this);
		nun2Button=new JButton(" ");
		nun2Button.addActionListener(this);
		nun3Button=new JButton(" ");
		nun3Button.addActionListener(this);
		neagtiveButton=new JButton("+/-");
		neagtiveButton.addActionListener(this);
		percentageButon=new JButton("%");
		percentageButon.addActionListener(this);

		sevenButton=new JButton("7");
		sevenButton.addActionListener(this);
		eightButton=new JButton("8");
		eightButton.addActionListener(this);			
		nineButton=new JButton("9");
		nineButton.addActionListener(this);
		mulButton=new JButton("*");
		mulButton.addActionListener(this);
		divisionButton=new JButton("/");
		divisionButton.addActionListener(this);
		
		fourButton=new JButton("4");
		fourButton.addActionListener(this);
		fiveButton=new JButton("5");
		fiveButton.addActionListener(this);
		sixButton=new JButton("6");
		sixButton.addActionListener(this);
		subButton=new JButton("-");
		subButton.addActionListener(this);
		backspaceButton=new JButton("<-");
		backspaceButton.addActionListener(this);
		
		oneButton=new JButton("1");
		oneButton.addActionListener(this);
		twoButton=new JButton("2");
		twoButton.addActionListener(this);
		threeButton=new JButton("3");
		threeButton.addActionListener(this);
		nun4Button=new JButton(" ");
		nun4Button.addActionListener(this);
		clearButton=new JButton("CE");
		clearButton.addActionListener(this);
		
		zeroButton=new JButton("0");
		zeroButton.addActionListener(this);
		dublezero=new JButton("00");
		dublezero.addActionListener(this);
		dotButton=new JButton(".");
		dotButton.addActionListener(this);
		addButton=new JButton("+");
		addButton.addActionListener(this);
		equalButton=new JButton("=");
		equalButton.addActionListener(this);
		
		
		
		
		
		panel = new JPanel();
		panel.setBounds(15, 115, 385,360);
		panel.setLayout(new GridLayout(5,5,10,10));
	
		//panel.setBackground(Color.LIGHT_GRAY);
		
		panel.add(nun1Button);
		panel.add(nun2Button);
		panel.add(nun3Button);
		panel.add(neagtiveButton);
		panel.add(percentageButon);
		
		panel.add(sevenButton);
		panel.add(eightButton);
		panel.add(nineButton);
		panel.add(mulButton);
		panel.add(divisionButton);
		
		panel.add(fourButton);
		panel.add(fiveButton);
		panel.add(sixButton);
		panel.add(subButton);
		panel.add(backspaceButton);

		panel.add(oneButton);
		panel.add(twoButton);
		panel.add(threeButton);
		panel.add(nun4Button);
		panel.add(clearButton);
		
		panel.add(zeroButton);
		panel.add(dublezero);
		panel.add(dotButton);
		panel.add(addButton);
		panel.add(equalButton);
		
		
		frame.add(panel);
		
		
		
		
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);;
		frame.setVisible(true);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

	
	public static void main(String[] args) {
		SwingSamle sm=new SwingSamle();
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==sevenButton) {
			if (isOperatorClicked){field.setText("7");isOperatorClicked=false;}else {field.setText(field.getText()+"7");}
				
		}else if(e.getSource()==eightButton) {
			if (isOperatorClicked){field.setText("8");isOperatorClicked=false;}else {field.setText(field.getText()+"7");}
		}else if(e.getSource()==nineButton) {
			if (isOperatorClicked){field.setText("9");isOperatorClicked=false;}else {field.setText(field.getText()+"7");}
		}else if(e.getSource()==fourButton) {
			if (isOperatorClicked){field.setText("4");isOperatorClicked=false;}else {field.setText(field.getText()+"7");}
		}else if(e.getSource()==fiveButton) {
			if (isOperatorClicked){field.setText("5");isOperatorClicked=false;}else {field.setText(field.getText()+"7");}
		}else if(e.getSource()==sixButton) {
			if (isOperatorClicked){field.setText("6");isOperatorClicked=false;}else {field.setText(field.getText()+"7");}
		}else if(e.getSource()==oneButton) {
			if (isOperatorClicked){field.setText("1");isOperatorClicked=false;}else {field.setText(field.getText()+"7");}
		}else if(e.getSource()==twoButton) {
			if (isOperatorClicked){field.setText("2");isOperatorClicked=false;}else {field.setText(field.getText()+"7");}
		}else if(e.getSource()==threeButton) {
			if (isOperatorClicked){field.setText("3");isOperatorClicked=false;}else {field.setText(field.getText()+"7");}
		}else if(e.getSource()==zeroButton) {
			if (isOperatorClicked){field.setText("0");isOperatorClicked=false;}else {field.setText(field.getText()+"7");}
		}else if(e.getSource()==dublezero) {
			if (isOperatorClicked){field.setText("00");isOperatorClicked=false;}else {field.setText(field.getText()+"7");}
		}else if(e.getSource()==dotButton) {
			if (isOperatorClicked){field.setText(".");isOperatorClicked=false;}else {field.setText(field.getText()+".");}
		}else if(e.getSource()==addButton) {
			opr='+';
			isOperatorClicked=true;
			oldValue=Float.parseFloat(field.getText());
		}else if(e.getSource()==subButton) {
			opr='-';
			isOperatorClicked=true;
			oldValue=Float.parseFloat(field.getText());
		}else if(e.getSource()==mulButton) {
			opr='*';
			isOperatorClicked=true;
			oldValue=Float.parseFloat(field.getText());
		}else if(e.getSource()==divisionButton) {
			opr='/';
			isOperatorClicked=true;
			oldValue=Float.parseFloat(field.getText());
		}else if(e.getSource()==percentageButon) {
			opr='%';
			isOperatorClicked=true;
			oldValue=Float.parseFloat(field.getText());
		}else if(e.getSource()==neagtiveButton) {
			/*opr='+';
			isOperatorClicked=true;*/
		}else if(e.getSource()==clearButton) {
			field.setText(" ");
		}else if(e.getSource()==backspaceButton) {
			
		}else if(e.getSource()==equalButton) {
			newValue=Float.parseFloat(field.getText());
			result=oldValue+newValue;
			
			field.setText(Float.toString(result));
		}
		
		
	}
	
	
	
	
	
}


