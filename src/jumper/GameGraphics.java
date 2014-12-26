package jumper;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class GameGraphics extends JPanel implements ActionListener{
	
	// trenba imati varijable visinu prozora i sirinu prozora
	

	private Timer animation;
	private Body [] elements;
	private int elementsCount;
	
	private int windowWidth;
	private int windowHeigth;

	
	public GameGraphics(int windowWidth, int windowHeigth){
		super();
		animation = new Timer(1000/60, this);
		elements = new Body [3];
		elementsCount = 0;
		// ovo smo stavili samo radi debuginga
		elementsCount = 1;
		elements[0] =  new Oval (0,0,20,30, Color.RED, 3, 1);
		animation.start();
		this.windowWidth = windowWidth;
		this.windowHeigth = windowHeigth;
	}
	
	public void paintComponent (Graphics g) {
		super.paintComponent(g);
		this.setBackground(new Color (164,242,245));
		g.setColor(new Color (54,140,22));
		g.fill3DRect(0, 400, 500, 100, true); // 
		for (int i =0; i<elementsCount; i++){
			elements[i].draw(g);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		repaint();
		
	}
}
