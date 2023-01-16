package calculator;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main implements ActionListener {
	JFrame frame;
	JTextField textfield;
	JButton[] numbersButton=new JButton[10];
	JButton zerob,oneb,twob,threeb,fourb,fiveb,sixb,sevenb,eightb,nineb;
	JButton[] functionsButton=new JButton[9];
	JButton addButton,subButton,mulButton,divButton;
	JButton decButton,equButton,delButton,clrButton,negButton;
	JPanel panel;
	Font font =new Font("Ink Free",Font.BOLD,30);
	double num1=0,num2=0,result=0;
	boolean opclicked=false;
	char operator;
	int operatora=0;
	Main(){
		frame=new JFrame("CALCULATOR");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420,550);
		frame.getContentPane().setBackground( Color.black );
		frame.setLayout(null);
		
		textfield=new JTextField();
		textfield.setFont(font);
		textfield.setBounds(50,25,300,50);
		textfield.setBackground(Color.white);
		textfield.setEditable(false);
		
		addButton=new JButton("+");
		subButton=new JButton("-");
		mulButton=new JButton("*");
		divButton=new JButton("/");
		decButton=new JButton(".");
		clrButton=new JButton("Clr");
		delButton=new JButton("Del");
		equButton=new JButton("=");
		negButton=new JButton("(-)");
		
		zerob=new JButton("0");
		oneb=new JButton("1");
		twob=new JButton("2");
		threeb=new JButton("3");
		fourb=new JButton("4");
		fiveb=new JButton("5");
		sixb=new JButton("6");
		sevenb=new JButton("7");
		eightb=new JButton("8");
		nineb=new JButton("9");
		
		
		functionsButton[0] = addButton;
		functionsButton[1] = subButton;
		functionsButton[2] = mulButton;
		functionsButton[3] = divButton;
		functionsButton[4] = decButton;
		functionsButton[5] = equButton;
		functionsButton[6] = delButton;
		functionsButton[7] = clrButton;
		functionsButton[8] = negButton;
		
		numbersButton[0]=zerob;
		numbersButton[1]=oneb;
		numbersButton[2]=twob;
		numbersButton[3]=threeb;
		numbersButton[4]=fourb;
		numbersButton[5]=fiveb;
		numbersButton[6]=sixb;
		numbersButton[7]=sevenb;
		numbersButton[8]=eightb;
		numbersButton[9]=nineb;
		
		
		
		for(int i=0;i<9;i++) {
			functionsButton[i].addActionListener(this);
			functionsButton[i].setFont(font);
			functionsButton[i].setFocusable(false);
			functionsButton[i].setBackground(Color.orange);
			functionsButton[i].setForeground(Color.white);
			functionsButton[i].setCursor(new Cursor(Cursor. HAND_CURSOR));
		}
		for(int i=0;i<10;i++) {
			//numbersButton[i]=new JButton(String.valueOf(i));
			numbersButton[i].addActionListener(this);
			numbersButton[i].setFont(font);
			numbersButton[i].setBackground(Color.gray);
			numbersButton[i].setForeground(Color.white);
			numbersButton[i].setFocusable(false);
			numbersButton[i].setCursor(new Cursor(Cursor. HAND_CURSOR));
		}
		negButton.setBounds(50,430,100,50);
		delButton.setBounds(150,430,100,50);
		clrButton.setBounds(250,430,100,50);
		
		
		
		panel = new JPanel();
		panel.setBounds(50, 100, 300, 300);
		panel.setLayout(new GridLayout(4,4,10,10));
		panel.setBackground(Color.black);
		

		panel.add(numbersButton[1]);
		panel.add(numbersButton[2]);
		panel.add(numbersButton[3]);
		panel.add(addButton);
		panel.add(numbersButton[4]);
		panel.add(numbersButton[5]);
		panel.add(numbersButton[6]);
		panel.add(subButton);
		panel.add(numbersButton[7]);
		panel.add(numbersButton[8]);
		panel.add(numbersButton[9]);
		panel.add(mulButton);
		panel.add(decButton);
		panel.add(numbersButton[0]);
		panel.add(equButton);
		panel.add(divButton);

		
		frame.add(panel);
		frame.add(delButton);
		frame.add(clrButton);
		frame.add(negButton);
		frame.add(textfield);
		frame.setVisible(true);
		
	}
	
	
	public static void main(String[] args) {
		Main m=new Main();
	}


	@Override
	public void actionPerformed(ActionEvent e) {
	
	if(e.getSource()==sevenb)	{
        if(opclicked) {
			textfield.setText("7");
			opclicked=false;	
		}else  {
		textfield.setText(textfield.getText()+"7");
		}
		
	} else if(e.getSource()==eightb) {
		
		if(opclicked) {
			textfield.setText("8");
			opclicked=false;	
		}else {
		textfield.setText(textfield.getText()+"8");
		}
		
	}else if(e.getSource()==nineb) {
		
		if(opclicked) {
			textfield.setText("9");
			opclicked=false;	
		}else {
		textfield.setText(textfield.getText()+"9");
		}
	}else if(e.getSource()==fourb) {
		
		if(opclicked) {
			textfield.setText("4");
			opclicked=false;	
		}else {
		textfield.setText(textfield.getText()+"4");
		}
	}else if(e.getSource()==fiveb) {
		
		if(opclicked) {
			textfield.setText("5");
			opclicked=false;	
		}else {
		textfield.setText(textfield.getText()+"5");
		}
	}else if(e.getSource()==sixb) {
		
		if(opclicked) {
			textfield.setText("6");
			opclicked=false;	
		}else {
		textfield.setText(textfield.getText()+"6");
		}
	}else if(e.getSource()==oneb) {
		
		if(opclicked) {
			textfield.setText("1");
			opclicked=false;	
		}else {
		textfield.setText(textfield.getText()+"1");
		}
	}else if(e.getSource()==twob) {
		
		if(opclicked) {
			textfield.setText("2");
			opclicked=false;	
		}else {
		textfield.setText(textfield.getText()+"2");
		}
	}else if(e.getSource()==threeb) {
		
		if(opclicked) {
			textfield.setText("3");
			opclicked=false;	
		}else {
		textfield.setText(textfield.getText()+"3");
		}
	}else if(e.getSource()==zerob) {
		
		if(opclicked) {
			textfield.setText("0");
			opclicked=false;	
		}else {
		textfield.setText(textfield.getText()+"0");
		}
	}else if(e.getSource()==decButton) {
		
		if(opclicked) {
			textfield.setText(".");
			opclicked=false;	
		}else {
		textfield.setText(textfield.getText()+".");
		}
	}else if(e.getSource()==equButton) {
		
		opclicked=true;	
		num1=Double.parseDouble(textfield.getText());
		
		switch(operator){
		case 1:	
		num1=num2/num1;
		textfield.setText(num1+"");
		break;
		case 2:	
		num1=num1*num2;
		textfield.setText(num1+"");
		break;
		case 3:	
		num1=num2-num1;
		textfield.setText(num1+"");
		break;
		case 4:	
		num1=num1+num2;
		textfield.setText(num1+"");
		break;
		}
		
	operatora=0;
		
	}else if(e.getSource()==addButton) {
		
		opclicked=true;	
		num1=Double.parseDouble(textfield.getText());
		
		switch(operator){
		case 1:	
		num1=num2/num1;
		textfield.setText(num1+"");
		break;
		case 2:	
		num1=num1*num2;
		textfield.setText(num1+"");
		break;
		case 3:	
		num1=num2-num1;
		textfield.setText(num1+"");
		break;
		case 4:	
		num1=num1+num2;
		textfield.setText(num1+"");
		break;
		}
		num2=Double.parseDouble(textfield.getText());
		operator=4;
		textfield.setText("+");
	}else if(e.getSource()==mulButton) {
		
		opclicked=true;	
		num1=Double.parseDouble(textfield.getText());
		
		switch(operator){
		case 1:	
		num1=num2/num1;
		textfield.setText(num1+"");
		break;
		case 2:	
		num1=num1*num2;
		textfield.setText(num1+"");
		break;
		case 3:	
		num1=num2-num1;
		textfield.setText(num1+"");
		break;
		case 4:	
		num1=num1+num2;
		textfield.setText(num1+"");
		break;
		}
		num2=Double.parseDouble(textfield.getText());
		operator=2;
		textfield.setText("x");
	}else if(e.getSource()==subButton) {
		
		opclicked=true;	
		num1=Double.parseDouble(textfield.getText());
		
		switch(operator){
		case 1:	
		num1=num2/num1;
		textfield.setText(num1+"");
		break;
		case 2:	
		num1=num1*num2;
		textfield.setText(num1+"");
		break;
		case 3:	
		num1=num2-num1;
		textfield.setText(num1+"");
		break;
		case 4:	
		num1=num1+num2;
		textfield.setText(num1+"");
		break;
		}
		num2=Double.parseDouble(textfield.getText());
		operator=3;
		textfield.setText("-");
	}else if(e.getSource()==divButton) {
		
		opclicked=true;	
		num1=Double.parseDouble(textfield.getText());
		
		switch(operator){
		case 1:	
		num1=num2/num1;
		textfield.setText(num1+"");
		break;
		case 2:	
		num1=num1*num2;
		textfield.setText(num1+"");
		break;
		case 3:	
		num1=num1-num2;
		textfield.setText(num1+"");
		break;
		case 4:	
		num1=num1+num2;
		textfield.setText(num1+"");
		break;
		}
		num2=Double.parseDouble(textfield.getText());
		operator=1;
		textfield.setText("/");
	}else if(e.getSource()==clrButton) {
		textfield.setText(""); 
		num1=0;
		num2=0;
	}else if(e.getSource()==negButton) {
		double temp = Double.parseDouble(textfield.getText());
		temp*=-1;
		textfield.setText(String.valueOf(temp));
	}

	}
}
