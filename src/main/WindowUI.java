package main;

import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class WindowUI extends JFrame implements ActionListener{

	private JButton button;
	private Circle circle1 = new Circle(new Rectangle(0,0,300,400));
	private Circle circle2 = new Circle(new Rectangle(300, 0, 300, 400));
	
	public WindowUI() {
		this.setSize(700, 700);
		this.setLayout(null);
		button = new JButton("Mostrar");
		button.setBounds(0,0, 100, 20);
		button.addActionListener(this);
		this.add(button);
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == button) {
			System.out.println("asdf");
			this.add(circle1);
			this.add(circle2);
			this.repaint();
			new Thread(circle1).start();
			new Thread(circle2).start();
		}
	}
	
	
	
}
