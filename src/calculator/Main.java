package calculator;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main implements ActionListener {
	JFrame frame;
	JTextField textfield;
	JButton[] numbersButton=new JButton[10];
	JButton[] functionsButton=new JButton[9];
	JButton addButton,subButton,mulButton,divButton;
	JButton decButton,equButton,delButton,clrButton,negButton;
	JPanel panel;
	Font font =new Font("Ink Free",Font.BOLD,30);
	double num1=0,num2=0,num3=0;
	char operator;
	Main(){
		frame=new JFrame("CALCULATOR");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420,550);
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
		
		functionsButton[0] = addButton;
		functionsButton[1] = subButton;
		functionsButton[2] = mulButton;
		functionsButton[3] = divButton;
		functionsButton[4] = decButton;
		functionsButton[5] = equButton;
		functionsButton[6] = delButton;
		functionsButton[7] = clrButton;
		functionsButton[8] = negButton;
		
		for(int i=0;i<9;i++) {
			functionsButton[i].addActionListener(this);
			functionsButton[i].setFont(font);
			functionsButton[i].setFocusable(false);
		}
		for(int i=0;i<9;i++) {
			numbersButton[i]=new JButton(String.valueOf(i));
			numbersButton[i].addActionListener(this);
			numbersButton[i].setFont(font);
			numbersButton[i].setFocusable(false);
		}
		negButton.setBounds(50,430,100,50);
		delButton.setBounds(150,430,100,50);
		clrButton.setBounds(250,430,100,50);
		
		
		
		frame.add(textfield);
		frame.setVisible(true);
		
	}
	
	
	public static void main(String[] args) {
		Main main=new Main();
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
