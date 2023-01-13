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
	Font font =new Font()
	
	Main(){
		
	}
	
	
	public static void main(String[] args) {
		Main main=new Main();
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
