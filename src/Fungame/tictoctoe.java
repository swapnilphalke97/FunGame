package tictoctoe;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JPanel;



import javax.swing.BoxLayout;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Canvas;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.awt.event.ActionEvent;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JEditorPane;
import javax.swing.JProgressBar;
import java.awt.Panel;
import javax.swing.JLabel;
import java.awt.Font;

public class tictoctoe {

	private JFrame frame;
	private static int input;
	static JButton but1 = new JButton("New button");
	static JButton but2 = new JButton("New button");
	static JButton but3 = new JButton("New button");
	static JButton but4 = new JButton("New button");
	static JButton but5 = new JButton("New button");
	static JButton but6 = new JButton("New button");
	static JButton but7 = new JButton("New button");
	static JButton but8 = new JButton("New button");
	static JButton but9 = new JButton("New button");
	static ArrayList<Integer> arrayofblank= new ArrayList<Integer>();
	static ArrayList<Integer> count= new ArrayList<Integer>();
	static int[][] last= {{0,0,0},{0,0,0},{0,0,0}};
	
	
	/**
	 * Launch the application.
	 */
	public void NotMain() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JOptionPane.showMessageDialog(null, "Start the game by clicking");
					tictoctoe window = new tictoctoe();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.'
	 */
	public static void implementation(int i) {
		input=i;
		if(arrayofblank.size()==9)
		{
			JOptionPane.showMessageDialog(null, "Tie");
			
		}
	
	
		
		if(arrayofblank.contains(i))
		{ 
			perform(); }
		else {
			check();
			ActualImplement(input);}
	}
	
	public tictoctoe() {
		initialize();
	
		
		
	}
	
	

	public static void ActualImplement(int i)
	{	
		
	arrayofblank.add(i);
		if(arrayofblank.size()!=9)
		{ 

		    int range =9;

		    int random = (int)(Math.random() * range);
		    do{
		    	//System.out.print("swapnil");
		    	
		        random = (int)(Math.random() * range);
		    }while( (arrayofblank.contains(random) || random==0 ));
		    
		    
		   // System.out.print(random);
		    arrayofblank.add(random);
		     switch(random)
		     {
		     case 1:
		    	 but1.setIcon(new ImageIcon("C:\\Users\\SWAPNIL\\Downloads\\Coding Download\\x.png"));
		    	 last[0][0]=1;
                  break;
		     case 2:
		    	 but2.setIcon(new ImageIcon("C:\\Users\\SWAPNIL\\Downloads\\Coding Download\\x.png"));
		    	 last[0][1]=1;
		    	 break;
		     case 3:
		    	 but3.setIcon(new ImageIcon("C:\\Users\\SWAPNIL\\Downloads\\Coding Download\\x.png"));
		    	 last[0][2]=1;break;
		     case 4:
		    	 but4.setIcon(new ImageIcon("C:\\Users\\SWAPNIL\\Downloads\\Coding Download\\x.png"));
		    	 last[1][0]=1;break;
		     case 5:
		    	 but5.setIcon(new ImageIcon("C:\\Users\\SWAPNIL\\Downloads\\Coding Download\\x.png"));
		    	 last[1][1]=1;break;
		     case 6:
		    	 but6.setIcon(new ImageIcon("C:\\Users\\SWAPNIL\\Downloads\\Coding Download\\x.png"));
		    	 last[1][2]=1;break;
		     case 7:
		    	 but7.setIcon(new ImageIcon("C:\\Users\\SWAPNIL\\Downloads\\Coding Download\\x.png"));
		    	 last[2][0]=1;break;
		     case 8:
		    	 but8.setIcon(new ImageIcon("C:\\Users\\SWAPNIL\\Downloads\\Coding Download\\x.png"));
		    	 last[2][1]=1;break;
		     case 9:
		    	 but9.setIcon(new ImageIcon("C:\\Users\\SWAPNIL\\Downloads\\Coding Download\\x.png"));
		    	 last[2][2]=1;break;
             }
		 check();
              perform();
		     
		     
		   
		}
		
	}
	
	
	
	
	
	private static void perform() {
	
		
		
		 but1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent q) {
					
         but1.setIcon(new ImageIcon("C:\\Users\\SWAPNIL\\Downloads\\Coding Download\\oo.png"));
         last[0][0]=-1;implementation(1);
					
			
				}
			});

			but2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent ew) {
but2.setIcon(new ImageIcon("C:\\Users\\SWAPNIL\\Downloads\\Coding Download\\oo.png"));
last[0][1]=-1;implementation(2);
					
				}
			});

			but3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent ee) {	
				but3.setIcon(new ImageIcon("C:\\Users\\SWAPNIL\\Downloads\\Coding Download\\oo.png"));
				last[0][2]=-1;	implementation(3);
			
				}
			});
			

			but4.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent er) {	
				but4.setIcon(new ImageIcon("C:\\Users\\SWAPNIL\\Downloads\\Coding Download\\oo.png"));
				last[1][0]=-1;implementation(4);
			
				}
			});

			but5.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent et) {	
					last[1][1]=-1;but5.setIcon(new ImageIcon("C:\\Users\\SWAPNIL\\Downloads\\Coding Download\\oo.png"));
				implementation(5);
				
				}
			});

			but6.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent ey) {	
				
				but6.setIcon(new ImageIcon("C:\\Users\\SWAPNIL\\Downloads\\Coding Download\\oo.png"));
				last[1][2]=-1;implementation(6);
				
				
				}
			});

			but7.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent eu) {	
				but7.setIcon(new ImageIcon("C:\\Users\\SWAPNIL\\Downloads\\Coding Download\\oo.png"));
				last[2][0]=-1;	implementation(7);
			
				}
			});

			but8.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent ei) {	
				but8.setIcon(new ImageIcon("C:\\Users\\SWAPNIL\\Downloads\\Coding Download\\oo.png"));
				last[2][1]=-1;implementation(8);
				
				}
			});

			but9.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent eo) {	
				but9.setIcon(new ImageIcon("C:\\Users\\SWAPNIL\\Downloads\\Coding Download\\oo.png"));
				last[2][2]=-1;	implementation(9);
			
				}
			});
		
	}

	
	
public static void check()
{  
	System.out.print(last[0][0]+""+last[1][0]+""+last[2][0]);
	boolean c;
	int[] row1=last[0];
 c= check1and0(row1);
 if(c==true){JOptionPane.showMessageDialog(null, "Win");	}
    int[] row2=last[0];
    c= check1and0(row2);
    if(c==true){JOptionPane.showMessageDialog(null, "Win");	}
int[] row3=last[0];
c= check1and0(row3);
if(c==true){JOptionPane.showMessageDialog(null, "Win");	}
int[] col1= {last[0][0],last[1][0],last[2][0]};
c= check1and0(col1);
if(c==true){JOptionPane.showMessageDialog(null, "Win");	}
int[] col2={last[0][1],last[1][1],last[2][1]};
c= check1and0(col2);
if(c==true){JOptionPane.showMessageDialog(null, "Win");	}
int[] col3={last[0][1],last[1][1],last[2][1]};
c= check1and0(col3);
if(c==true){JOptionPane.showMessageDialog(null, "Win");	}
int[] dig1={last[0][0],last[1][1],last[2][2]};
c= check1and0(dig1);
if(c==true){JOptionPane.showMessageDialog(null, "Win");	}
int[] dig2={last[0][2],last[1][1],last[2][0]};
c= check1and0(dig2);
if(c==true){JOptionPane.showMessageDialog(null, "Win");	}

if(c==true){JOptionPane.showMessageDialog(null, "Win");	}

}

public static boolean check1and0(int[] a)
{
if((a[0]==a[1]) && (a[0]==a[2]) &&  (a[0]==(1 | -1)))
{
	return true;
	}
else {return false;}
}
	
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 877, 715);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 938, 10);
		frame.getContentPane().add(panel);
		
		JLabel lblNewLabel = new JLabel("TIC TOC TOE");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 46));
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setBounds(277, -81, 798, 279);
		frame.getContentPane().add(lblNewLabel);
	
		for(int i=1;i<=1;i++) {
		but1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				but1.setIcon(new ImageIcon("C:\\Users\\SWAPNIL\\Downloads\\Coding Download\\oo.png"));
				last[0][0]=-1;implementation(1);
				
			}
		});
		but1.setIcon(new ImageIcon("C:\\Users\\SWAPNIL\\Downloads\\Coding Download\\untitled.png"));
		but1.setBounds(169, 95, 161, 159);
		frame.getContentPane().add(but1);
		
		
		but2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				but2.setIcon(new ImageIcon("C:\\Users\\SWAPNIL\\Downloads\\Coding Download\\oo.png"));
				last[0][1]=-1;implementation(2);
				
			}
		});
		but2.setIcon(new ImageIcon("C:\\Users\\SWAPNIL\\Downloads\\Coding Download\\untitled.png"));
		but2.setBounds(354, 95, 161, 159);
		frame.getContentPane().add(but2);
		
		
		but3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
			but3.setIcon(new ImageIcon("C:\\Users\\SWAPNIL\\Downloads\\Coding Download\\oo.png"));
			last[0][2]=-1;implementation(3);
			
			}
		});
		but3.setIcon(new ImageIcon("C:\\Users\\SWAPNIL\\Downloads\\Coding Download\\untitled.png"));
		but3.setBounds(541, 95, 161, 159);
		frame.getContentPane().add(but3);
		
		
		but4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
			but4.setIcon(new ImageIcon("C:\\Users\\SWAPNIL\\Downloads\\Coding Download\\oo.png"));
			last[1][0]=-1;implementation(4);
		
			}
		});
		but4.setIcon(new ImageIcon("C:\\Users\\SWAPNIL\\Downloads\\Coding Download\\untitled.png"));
		but4.setBounds(169, 273, 161, 159);
		frame.getContentPane().add(but4);
		
		
		but5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
			but5.setIcon(new ImageIcon("C:\\Users\\SWAPNIL\\Downloads\\Coding Download\\oo.png"));
			last[1][1]=-1;implementation(5);
		
			}
		});
		but5.setIcon(new ImageIcon("C:\\Users\\SWAPNIL\\Downloads\\Coding Download\\untitled.png"));
		but5.setBounds(354, 273, 161, 159);
		frame.getContentPane().add(but5);
		
		
		but6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
			but6.setIcon(new ImageIcon("C:\\Users\\SWAPNIL\\Downloads\\Coding Download\\oo.png"));
			last[1][2]=-1;implementation(6);
		
			}
		});
		but6.setIcon(new ImageIcon("C:\\Users\\SWAPNIL\\Downloads\\Coding Download\\untitled.png"));
		but6.setBounds(541, 273, 161, 159);
		frame.getContentPane().add(but6);
		
	
		but7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
			but7.setIcon(new ImageIcon("C:\\Users\\SWAPNIL\\Downloads\\Coding Download\\oo.png"));
			last[2][0]=-1;implementation(7);
			
			}
		});
		but7.setIcon(new ImageIcon("C:\\Users\\SWAPNIL\\Downloads\\Coding Download\\untitled.png"));
		but7.setBounds(169, 448, 161, 159);
		frame.getContentPane().add(but7);
		
	
		but8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
			but8.setIcon(new ImageIcon("C:\\Users\\SWAPNIL\\Downloads\\Coding Download\\oo.png"));
			last[2][1]=-1;implementation(8);
			
			}
		});
		but8.setIcon(new ImageIcon("C:\\Users\\SWAPNIL\\Downloads\\Coding Download\\untitled.png"));
		but8.setBounds(354, 448, 161, 159);
		frame.getContentPane().add(but8);
		
		
		but9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
			but9.setIcon(new ImageIcon("C:\\Users\\SWAPNIL\\Downloads\\Coding Download\\oo.png"));
			last[2][2]=-1;implementation(9);
			
			}
		});
		but9.setIcon(new ImageIcon("C:\\Users\\SWAPNIL\\Downloads\\Coding Download\\untitled.png"));
		but9.setBounds(541, 448, 161, 159);
		frame.getContentPane().add(but9);
		}
	}
}
