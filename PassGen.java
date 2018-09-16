package Test4;

import java.awt.Color;
import java.awt.EventQueue;
import java.util.Random;
import java.util.stream.Collectors;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JToggleButton;

public class PassGen extends JFrame {

	private static final long serialVersionUID = -8781984378583548631L;
	private JPanel contentPane;
	private JTextField textField;
	
	String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890".toUpperCase();
	int length = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PassGen frame = new PassGen();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public PassGen() {
		setAlwaysOnTop(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(3, 11, 322, 239);
		String str =  new Random().ints(length, 0, chars.length()).mapToObj(i -> "" + chars.charAt(i)).collect(Collectors.joining());
		textField.setText("password:" + str);
		textField.setEditable(false);
		textField.setColumns(10);
		textField.setBackground(Color.WHITE);
		contentPane.add(textField);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str =  new Random().ints(length, 0, chars.length()).mapToObj(i -> "" + chars.charAt(i)).collect(Collectors.joining());
				textField.setText("password:" + str);
			}
		});
		btnNewButton.setBounds(335, 11, 89, 84);
		contentPane.add(btnNewButton);
		btnNewButton.setText("New");
		
		JButton button = new JButton("New button");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		button.setBounds(335, 166, 89, 84);
		contentPane.add(button);
		button.setText("Exit");
		
		JToggleButton toggleButton = new JToggleButton("26");
		toggleButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String str =  new Random().ints(length, 0, chars.length()).mapToObj(i -> "" + chars.charAt(i)).collect(Collectors.joining());
				length = 26;
				textField.setText("password:" + str);
			}
		});
		toggleButton.setBounds(335, 132, 89, 23);
		contentPane.add(toggleButton);
		
		JToggleButton tglbtnNewToggleButton = new JToggleButton("16");
		tglbtnNewToggleButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str =  new Random().ints(length, 0, chars.length()).mapToObj(i -> "" + chars.charAt(i)).collect(Collectors.joining());
				length = 16;
				textField.setText("password:" + str);
			}
		});
		tglbtnNewToggleButton.setBounds(335, 106, 89, 23);
		contentPane.add(tglbtnNewToggleButton);
	}
}
