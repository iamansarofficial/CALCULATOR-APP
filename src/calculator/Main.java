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
		textfield.setBounds(50,25,300,50);
		textfield.setBackground(Color.white);
		
		
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
