package mvcpackage;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.awt.event.ActionEvent;
import javax.swing.JSplitPane;

public class LoginUI extends JFrame {
	private String url="jdbc:postgresql://localhost:5432/example_psql";
	private String user="postgres";
	private String password="HungLQ2001";
	private void login() {
		try(Connection conn=DriverManager.getConnection(url, user, password)){
			if(conn!=null) {	
				System.out.println("Connection successful");
			}else {
				System.out.println("Connection failed");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	private JPanel contentPane;
	/**
	 * @wbp.nonvisual location=173,344
	 */

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginUI frame = new LoginUI();
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
	public LoginUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 468, 232);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		Button button = new Button("Log in");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		contentPane.add(button);
	}

}
