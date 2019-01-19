package game;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class TitleScreen extends JPanel implements ActionListener{
	
	private String name = "Flappy Guy of Death";
	private Container c;
	private JFrame menuScreen;
	private JButton startButton;
	
	public TitleScreen() {
		menuScreen = new JFrame("Flappy Guy of Death Menu Screen");
		startButton = new JButton("Start");
		startButton.setPreferredSize(new Dimension(100,100));
		startButton.setBounds(120,150,100,100);
		menuScreen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		c = menuScreen.getContentPane();
		this.setLayout(null);
		this.add(startButton);
		c.add(this);
		menuScreen.setVisible(true);
		this.setPreferredSize(new Dimension(800,600));
		menuScreen.pack();

		
	}

	@Override
	public void paintComponent(Graphics g) {
		g.setFont(new Font(name, 10, 20));
		g.setColor(Color.RED);
		g.drawString(name, 120, 100);
	}
	
	public static void main(String[] args) {
		new TitleScreen();

	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
