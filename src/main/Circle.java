package main;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import javax.swing.JPanel;

public class Circle extends JPanel implements Runnable{
	
	//private JButton button;
	private Integer x;
	private Integer y;
	private Integer width;
	private Integer height;
	
	public Circle(Rectangle rectangle) {
		initComponents();
		this.setSize(500,500);
		this.setBounds(rectangle.x, rectangle.y, rectangle.width, rectangle.height);
		this.x = 50;
		this.y = 50;
		this.width = 200;
		this.height = 200;
		this.setVisible(true);
	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);
		int red = (int)(Math.random() * 255);
		int green = (int)(Math.random() * 255);
		int blue = (int)(Math.random() * 255);
		g.setColor(new Color(red, green, blue));
		g.fillOval(x, y, width, height);
	}
	
	public void initComponents() {
		
	}

	@Override
	public void run() {
		while(true) {
			repaint();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}		
	}
	
}
