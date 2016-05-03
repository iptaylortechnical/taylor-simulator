package taylors;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import java.awt.Font;

import javax.swing.JPanel;
import javax.swing.JTextPane;

import java.awt.FlowLayout;

import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Date;

public class GUI extends JFrame{

	private final JPanel panel = new JPanel();
	private JTextField txtSd;
	
	private JLabel lblDisplay;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the application.
	 */
	public GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the 
	 */
	private void initialize() {
		setTitle("Taylor Family Simulator");
		setBounds(100, 100, 450, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JLabel lblTaylorFamilyGrowth = new JLabel("Taylor Family Growth Simulator");
		lblTaylorFamilyGrowth.setFont(new Font("Lucida Grande", Font.PLAIN, 19));
		lblTaylorFamilyGrowth.setHorizontalAlignment(SwingConstants.CENTER);
		lblTaylorFamilyGrowth.setBounds(6, 6, 438, 43);
		getContentPane().add(lblTaylorFamilyGrowth);
		
		JLabel lblCopywriteIsaiah = new JLabel("© 2015 Isaiah Taylor");
		lblCopywriteIsaiah.setHorizontalAlignment(SwingConstants.CENTER);
		lblCopywriteIsaiah.setBounds(6, 44, 438, 16);
		getContentPane().add(lblCopywriteIsaiah);
		panel.setBounds(40, 101, 368, 43);
		getContentPane().add(panel);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		txtSd = new JTextField();
		txtSd.setText("Year");
		panel.add(txtSd);
		txtSd.setColumns(10);
		
		JButton btnNewButton = new JButton("Simulate");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int total = 0;
				String txt = txtSd.getText();
				
				long starttime = new Date().getTime();
				
				for(int i = 0; i < 1000; i++){
					MainClass main = new MainClass(Integer.parseInt(txt));
					total += main.tot;
				}
				
				long endtime = new Date().getTime();
				
				System.out.println((endtime-starttime)/1000.0);
				
				int fin = total/1000;
				
				System.out.print(fin);
				
				lblDisplay.setText("By the year " + txt + ", I predict " + fin + " members.");
			}
		});
		panel.add(btnNewButton);
		lblDisplay = new JLabel("Simulations past the year 2125 can take quite a bit.");
		lblDisplay.setHorizontalAlignment(SwingConstants.CENTER);
		lblDisplay.setBounds(6, 201, 438, 16);
		getContentPane().add(lblDisplay);
	}
}
