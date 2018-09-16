package Test4;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Test4 {

	private JFrame frame;
	private JTextField username;
	private JTextField password;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Test4 window = new Test4();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Test4() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 460, 260);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		username = new JTextField();
		username.setBounds(115, 47, 206, 42);
		frame.getContentPane().add(username);
		username.setColumns(10);
		
		password = new JTextField();
		password.setColumns(10);
		password.setBounds(115, 115, 206, 42);
		frame.getContentPane().add(password);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String name = username.getText();
				String psd = password.getText();
				
				if(name.equals("xd") && psd.equals("lol") || name.equals("dab") && psd.equals("big") || name.equals("gay") && psd.equals("ass")) {
					JOptionPane.showMessageDialog(frame, "Logged in as" + " " + name);
					PassGen gen = new PassGen ();
					gen.setVisible(true);
					frame.dispose();
				}
				else
				{
					JOptionPane.showMessageDialog(frame, "Invalid user name or password");
				}
			}
		});
		btnNewButton.setBounds(152, 168, 122, 42);
		frame.getContentPane().add(btnNewButton);
		btnNewButton.setText("LOGIN");
		
		JLabel lblName = new JLabel("NAME");
		lblName.setBounds(24, 47, 81, 42);
		frame.getContentPane().add(lblName);
		
		JLabel lblPassword = new JLabel("PASSWORD");
		lblPassword.setBounds(24, 115, 81, 42);
		frame.getContentPane().add(lblPassword);
	}
}
