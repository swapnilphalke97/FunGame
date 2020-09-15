package tictoctoe;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.ActionEvent;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.ImageIcon;

public class Piano {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public void mainp() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Piano window = new Piano();
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
	public Piano() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 913, 312);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBackground(Color.BLACK);
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\SWAPNIL\\Downloads\\Coding Download\\Color-white.jpg"));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					
				AudioInputStream audioinputstream = AudioSystem.getAudioInputStream(new File("C:\\Users\\SWAPNIL\\Downloads\\Coding Download\\Music_Note\\C.wav"));
				Clip clip=AudioSystem.getClip();
				clip.open(audioinputstream);
				clip.start();
				}
				catch(Exception ex)
				{
				System.out.print("not working");	
				}
			}
		});
		btnNewButton.setBounds(31, 116, 68, 149);
		frame.getContentPane().add(btnNewButton);
		
		JButton button = new JButton("New button");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					AudioInputStream audioinputstream = AudioSystem.getAudioInputStream(new File("C:\\Users\\SWAPNIL\\Downloads\\Coding Download\\Music_Note\\D.wav"));
					Clip clip=AudioSystem.getClip();
					clip.open(audioinputstream);
					clip.start();}
					catch(Exception ex)
					{
						
					}	
				
			}
		});
		button.setIcon(new ImageIcon("C:\\Users\\SWAPNIL\\Downloads\\Coding Download\\Color-white.jpg"));
		button.setBackground(Color.BLACK);
		button.setBounds(109, 116, 68, 149);
		frame.getContentPane().add(button);
		
		JButton button_1 = new JButton("New button");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					AudioInputStream audioinputstream = AudioSystem.getAudioInputStream(new File("C:\\Users\\SWAPNIL\\Downloads\\Coding Download\\Music_Note\\E.wav"));
					Clip clip=AudioSystem.getClip();
					clip.open(audioinputstream);
					clip.start();}
					catch(Exception ex)
					{
						
					}
			}
		});
		button_1.setIcon(new ImageIcon("C:\\Users\\SWAPNIL\\Downloads\\Coding Download\\Color-white.jpg"));
		button_1.setBounds(187, 116, 68, 149);
		frame.getContentPane().add(button_1);
		
		JButton button_2 = new JButton("New button");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					AudioInputStream audioinputstream = AudioSystem.getAudioInputStream(new File("C:\\Users\\SWAPNIL\\Downloads\\Coding Download\\Music_Note\\F.wav"));
					Clip clip=AudioSystem.getClip();
					clip.open(audioinputstream);
					clip.start();}
					catch(Exception ex)
					{
						
					}
			}
		});
		button_2.setIcon(new ImageIcon("C:\\Users\\SWAPNIL\\Downloads\\Coding Download\\Color-white.jpg"));
		button_2.setBounds(265, 116, 68, 149);
		frame.getContentPane().add(button_2);
		
		JButton button_3 = new JButton("New button");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					AudioInputStream audioinputstream = AudioSystem.getAudioInputStream(new File("C:\\Users\\SWAPNIL\\Downloads\\Coding Download\\Music_Note\\G'.wav"));
					Clip clip=AudioSystem.getClip();
					clip.open(audioinputstream);
					clip.start();}
					catch(Exception ex)
					{
						
					}
			}
		});
		button_3.setIcon(new ImageIcon("C:\\Users\\SWAPNIL\\Downloads\\Coding Download\\Color-white.jpg"));
		button_3.setBounds(343, 116, 68, 149);
		frame.getContentPane().add(button_3);
		
		JButton button_4 = new JButton("New button");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {try {
				AudioInputStream audioinputstream = AudioSystem.getAudioInputStream(new File("C:\\Users\\SWAPNIL\\Downloads\\Coding Download\\Music_Note\\A.wav"));
				Clip clip=AudioSystem.getClip();
				clip.open(audioinputstream);
				clip.start();}
				catch(Exception ex)
				{
					
				}
			}
		});
		button_4.setIcon(new ImageIcon("C:\\Users\\SWAPNIL\\Downloads\\Coding Download\\Color-white.jpg"));
		button_4.setBounds(421, 116, 68, 149);
		frame.getContentPane().add(button_4);
		
		JButton button_5 = new JButton("New button");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					AudioInputStream audioinputstream = AudioSystem.getAudioInputStream(new File("C:\\Users\\SWAPNIL\\Downloads\\Coding Download\\Music_Note\\B.wav"));
					Clip clip=AudioSystem.getClip();
					clip.open(audioinputstream);
					clip.start();}
					catch(Exception ex)
					{
						
					}
			}
		});
		button_5.setIcon(new ImageIcon("C:\\Users\\SWAPNIL\\Downloads\\Coding Download\\Color-white.jpg"));
		button_5.setBounds(499, 116, 68, 149);
		frame.getContentPane().add(button_5);
		
		JButton button_6 = new JButton("New button");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {try {
				AudioInputStream audioinputstream = AudioSystem.getAudioInputStream(new File("C:\\Users\\SWAPNIL\\Downloads\\Coding Download\\Music_Note\\C1.wav"));
				Clip clip=AudioSystem.getClip();
				clip.open(audioinputstream);
				clip.start();}
				catch(Exception ex)
				{
					
				}
			}
		});
		button_6.setIcon(new ImageIcon("C:\\Users\\SWAPNIL\\Downloads\\Coding Download\\Color-white.jpg"));
		button_6.setBounds(577, 116, 68, 149);
		frame.getContentPane().add(button_6);
		
		JButton button_7 = new JButton("New button");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					AudioInputStream audioinputstream = AudioSystem.getAudioInputStream(new File("C:\\Users\\SWAPNIL\\Downloads\\Coding Download\\Music_Note\\D1.wav"));
					Clip clip=AudioSystem.getClip();
					clip.open(audioinputstream);
					clip.start();}
					catch(Exception ex)
					{
						
					}
			}
		});
		button_7.setIcon(new ImageIcon("C:\\Users\\SWAPNIL\\Downloads\\Coding Download\\Color-white.jpg"));
		button_7.setBounds(655, 116, 68, 149);
		frame.getContentPane().add(button_7);
		
		JButton button_8 = new JButton("New button");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_8.setIcon(new ImageIcon("C:\\Users\\SWAPNIL\\Downloads\\Coding Download\\Color-white.jpg"));
		button_8.setBounds(733, 116, 68, 149);
		frame.getContentPane().add(button_8);
		
		JButton button_9 = new JButton("New button");
		button_9.setIcon(new ImageIcon("C:\\Users\\SWAPNIL\\Downloads\\Coding Download\\Color-white.jpg"));
		button_9.setBounds(811, 116, 68, 149);
		frame.getContentPane().add(button_9);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\SWAPNIL\\Downloads\\Coding Download\\pure-black-background-f82588d3.jpg"));
		btnNewButton_1.setBackground(Color.BLACK);
		btnNewButton_1.setForeground(Color.BLACK);
		btnNewButton_1.setBounds(81, 10, 51, 96);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton button_10 = new JButton("New button");
		button_10.setIcon(new ImageIcon("C:\\Users\\SWAPNIL\\Downloads\\Coding Download\\pure-black-background-f82588d3.jpg"));
		button_10.setBounds(159, 10, 51, 96);
		frame.getContentPane().add(button_10);
		
		JButton button_11 = new JButton("New button");
		button_11.setIcon(new ImageIcon("C:\\Users\\SWAPNIL\\Downloads\\Coding Download\\pure-black-background-f82588d3.jpg"));
		button_11.setBounds(314, 10, 51, 96);
		frame.getContentPane().add(button_11);
		
		JButton button_12 = new JButton("New button");
		button_12.setIcon(new ImageIcon("C:\\Users\\SWAPNIL\\Downloads\\Coding Download\\pure-black-background-f82588d3.jpg"));
		button_12.setBounds(394, 10, 51, 96);
		frame.getContentPane().add(button_12);
		
		JButton button_13 = new JButton("New button");
		button_13.setIcon(new ImageIcon("C:\\Users\\SWAPNIL\\Downloads\\Coding Download\\pure-black-background-f82588d3.jpg"));
		button_13.setBounds(470, 10, 51, 96);
		frame.getContentPane().add(button_13);
		
		JButton button_14 = new JButton("New button");
		button_14.setIcon(new ImageIcon("C:\\Users\\SWAPNIL\\Downloads\\Coding Download\\pure-black-background-f82588d3.jpg"));
		button_14.setBounds(622, 10, 51, 96);
		frame.getContentPane().add(button_14);
		
		JButton button_15 = new JButton("New button");
		button_15.setIcon(new ImageIcon("C:\\Users\\SWAPNIL\\Downloads\\Coding Download\\pure-black-background-f82588d3.jpg"));
		button_15.setBounds(705, 10, 51, 96);
		frame.getContentPane().add(button_15);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(222, 184, 135));
		panel.setBounds(10, 10, 889, 255);
		frame.getContentPane().add(panel);
	}
}
