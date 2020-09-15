package tictoctoe;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JScrollBar;
import javax.swing.JSlider;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class mainpage {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mainpage window = new mainpage();
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
	public mainpage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 877, 667);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Fun Games");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("Stencil", Font.PLAIN, 55));
		lblNewLabel.setBounds(269, 114, 423, 82);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Swapnil Phalke");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_1.setBounds(728, 583, 196, 37);
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tictoctoe calltictoc=new tictoctoe();
				calltictoc.NotMain();
				
			}
		});
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\SWAPNIL\\Downloads\\Coding Download\\imagesRNEWR1JO.jpg"));
		btnNewButton.setBounds(67, 255, 188, 166);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Piano p=new Piano();
				p.mainp();
				
				
			}
		});
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\SWAPNIL\\Downloads\\Coding Download\\images316IS4II.jpg"));
		btnNewButton_1.setBounds(326, 255, 196, 166);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Coming Soon");
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 26));
		btnNewButton_2.setBounds(596, 255, 196, 166);
		frame.getContentPane().add(btnNewButton_2);
		
		JLabel lblNewLabel_2 = new JLabel("Tic Toc Toe");
		lblNewLabel_2.setForeground(Color.BLACK);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_2.setBounds(109, 431, 190, 31);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblPiano = new JLabel("PIANO");
		lblPiano.setForeground(Color.BLACK);
		lblPiano.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblPiano.setBounds(395, 431, 190, 31);
		frame.getContentPane().add(lblPiano);
	}
}
