package vjezbe;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;

public class Circle extends JPanel implements ActionListener, KeyListener {

	private int x;
	private int y;
	private int radius;
	private int frame = 0;
	private int bodyCount = 1;
	
	public Circle(int x, int y, int radius){
		super();
		this.x=x;
		this.y=y;
		this.radius=radius;	
		requestFocus();
		this.addKeyListener(this);
	}
	
	public void paintComponent (Graphics g){
		super.paintComponent(g);
		g.fillOval(this.x +frame, this.y ,this.radius, this.radius);
		
//		for (int i = 0; i < bodyCount; i++){
//			g.fillOval((int)(Math.random()*500), (int)(Math.random()*500), 30, 30);
//		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		frame++;
		repaint();
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		bodyCount++;
		
	}
}
