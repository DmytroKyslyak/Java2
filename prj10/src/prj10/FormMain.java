package prj10;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FormMain {

	public static void main(String[] args) {
		JFrame fr = new JFrame();
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fr.setSize(300, 200);
		JPanel panel = new JPanel();
		fr.setContentPane(panel);
		JTextField text = new JTextField("       ");
		JButton button = new JButton("Ok");
		button.addActionListener(
			(e) -> 	{
			text.setText("Hello people!");
		
	}
	);	
		panel.add(text);		
		panel.add(button);
		fr.setVisible(true);

	}

}
