package day18_wrapper;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Addition extends JFrame {
	private JLabel firstNumLbl;
	private JLabel secondNumLbl;
	private JLabel resultLbl;
	
	
	private JTextField firstNumberField;
	private JTextField secondNumberField;
	private JTextField resultField;
	
	public Addition() {
		setSize(800, 600);//gives size to the box
		//setBounds(200, 200, 500, 300);// where u want to display
		setLocationRelativeTo(null);// always displays in the center
		setResizable(false);// can not change size
		//setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		
		//Creating object of label
		firstNumLbl=new JLabel("Enter first Number ");
		secondNumLbl=new JLabel("Enter second Number ");
		resultLbl=new JLabel("The result is ");
		
		
		//Creating object of textfield
		 firstNumberField=new JTextField();
		 secondNumberField=new JTextField()	;
		 resultField=new JTextField();
		 
		//adding components to fram
		 
		 
		add(firstNumLbl).setBounds(5, 5, 200, 40);
		add(secondNumLbl).setBounds(5, 55, 200, 40);
		add(resultLbl).setBounds(5, 105, 300, 40);
		
		
		
		
		add(firstNumberField).setBounds(215, 5, 300, 40);
		 add(secondNumberField).setBounds(215, 55, 300, 40);
		 add(resultField).setBounds(215, 105, 300, 40);
		
		
		setVisible(true);// makes the box visible
		
	}

	public static void main(String[] args) {
		new Addition();
	
		

	}

}
