import javax.swing.*;
import java.awt.*;
import java.awt.event.*;




class EvenOddApp extends JFrame {

	Container c;
	JLabel labNumber, labMsg;
	JTextField txtNumber;
	JButton btnCheck;
	EvenOddApp(){


		c = getContentPane();
		c.setLayout(new FlowLayout(FlowLayout.CENTER,20,20)); 
		labNumber = new JLabel("Enter Integer ");	
		txtNumber = new JTextField(10);	
		btnCheck = new JButton("Check Even/Odd");
		labMsg = new JLabel("");
		

		Font f = new Font("Arial",Font.BOLD,50);
		labNumber.setFont(f);
		txtNumber.setFont(f);
		btnCheck.setFont(f);
		labMsg.setFont(f);
		
		c.add(labNumber);
		c.add(txtNumber);
		c.add(btnCheck);
		c.add(labMsg);
		
		
		ActionListener a = (ae) -> {
			
			try{

				int num = Integer.parseInt(txtNumber.getText());
				String res = num%2==0?"Even":"Odd";
				labMsg.setForeground(Color.blue);
				labMsg.setText("Result = " + res);
			}catch(NumberFormatException e){
				String msg = "Please enter integers only";
				labMsg.setForeground(Color.red);
				labMsg.setText(msg);
			}

		};
		
		btnCheck.addActionListener(a);
		setVisible(true);
		setSize(700,400);
		setTitle("Even Odd App");
		setLocationRelativeTo(null); 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
	


}





class EvenOddChecker{

	public static void main(String args[]){
	EvenOddApp eo = new EvenOddApp();

}

}