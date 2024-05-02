package entidade;

import TesteMe.*;
import Swing.*;
import aplicacao.*;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Color;

public class Window extends JFrame {
	private JPanel panel1;
	private JPanel panel2;
	private JPanel panel3;
	
	private JLabel label1;
	private JLabel label2;
	
	JTextField txtField1;
	JTextField txtField2;
	
	private JButton button;
	
	public Window() {
		initContainers();
		addAllComponents();
	}
	
	private void initContainers() {
		this.setTitle("Interface Grafica");
		this.setVisible(true);
		this.setSize(800, 800);
		this.setLocationRelativeTo(null);
		this.setLayout(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		
		panel1 = new JPanel();
		panel1.setSize(700, 700);
		panel1.setBackground(Color.LIGHT_GRAY);
		panel1.setLayout(null);
		this.add(panel1);
		
		panel2 = new JPanel();
		panel2.setLayout(null);
		panel2.setBounds(0, 0, 500, 100);
		panel1.add(panel2);
		
		panel3 = new JPanel();
		panel3.setLayout(null);
		panel3.setBounds(0, 100, 500, 100);
		panel1.add(panel3);

	}
	
	
	private void addAllComponents(){
		label1 = new JLabel("Nome: ");
		label1.setForeground(Color.black);
		label1.setFont(new Font ("Arial", Font.BOLD, 24));
		label1.setBounds(0, 0, 100, 100);
		label1.setBackground(Color.MAGENTA);
		label1.setOpaque(true);
		panel2.add(label1);
		
		txtField1 = new JTextField();
		txtField1.setBackground(Color.GRAY);
		txtField1.setForeground(Color.black);
		txtField1.setCaretColor(Color.CYAN);
		txtField1.setBounds(100, 0, 400, 100);
		txtField1.setFont(new Font("Arial", Font.PLAIN, 24));
		panel2.add(txtField1);
		
		
		label2 = new JLabel("Email: ");
		label2.setForeground(Color.black);
		label2.setFont(new Font ("Arial", Font.BOLD, 24));
		label2.setBounds(0, 0, 100, 100);
		label2.setBackground(Color.yellow);
		label2.setOpaque(true);
		panel3.add(label2);
		
		txtField2 = new JTextField();
		txtField2.setBackground(Color.GRAY);
		txtField1.setForeground(Color.black);
		txtField2.setCaretColor(Color.CYAN);
		txtField2.setBounds(100, 0, 400, 100);
		txtField2.setFont(new Font("Arial", Font.PLAIN, 24));
		panel3.add(txtField2);
		
		button = new JButton("Envie");
		button.setBounds(400, 200, 100, 100);
		panel1.add(button);
		
		
		confButtonListener();
		
		public void confButtonListener() {
			button.addActionListener(new ActionListener() {
				public void actionPerfomed(ActionEvent e) {
					if(txtFiled.getText().length == 0) JOptionPane.showMessageDialog(null, "Nao é possível enviar algum nada", "ERROR", JOptionPane.ERROR_MESSAGE);
					else JOptionPane.showMessageDialog(null, "Seu nome é: " + txtField1.getText(), "INFO", JOptionPane.INFORMATION_MESSAGE);
				}
			});
		}
		
	}
}
