package TesteMe;

import javax.swing.*;
import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

public class FirstScreen {

	public static void main(String[] args) {
		
		JFrame frame = new javax.swing.JFrame();
		
		frame.setSize(1000, 800); // 
		frame.setResizable(true);
		frame.setLocationRelativeTo(null);
		frame.setLayout(null);
		
		//JButton b = new JButton();
		//frame.add(b, BorderLayot.CENTER);
		//b.setSize(100, 100);
		
		JPanel panel = new JPanel();
		panel.setSize(100, 100);
		panel.setBackground(Color.white);
		frame.add(panel);
		
		JLabel label = new JLabel("Texto aqui");
		label.setBackground(Color.cyan);
		label.setSize(400, 300);
		label.setFont(new Font("Arial", Font.BOLD, 24));
		label.setOpaque(true);
		panel.add(label);
		
		JTextField textfield = new JTextField();
		textfield.setBounds(200, 200, 200, 200);
		panel.add(textfield);
		
		
		
		frame.setVisible(true);  // tornar o jframe visivel
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

	}

}
