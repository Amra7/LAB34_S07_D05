package jumper;

import java.awt.Color;
import java.awt.Graphics;

public class Body {

	private Point start;
	private Point center;
	private int width;
	private int heigth;
	private Color color;
	private int speedX;
	private int speedY;
	
	public Body ( int x, int y, int width, int heigth, Color color, int speedX, int speedY){
		start = new Point(x,y);
		center = new Point(x + width/2, y + heigth/2);
		this.width = width;
		this.heigth = heigth;
		this.color = color;
		this.speedX = speedX;
		this.speedY = speedY;
		
	}
	
	public void draw (Graphics g){
		g.setColor(color);
		move();
		return;
	}
	
	public boolean checkCollision (Body other){
		int d = this.center.getDistance(other.center);
		int sumRW = this.width/2 + other.width/2;
		int sumRH = this.heigth/2 + other.heigth/2;
		
		if( d > sumRW && d > sumRH )
			return false;
		return true;		
	}
	
	private void move(){
		this.start.move(speedX, speedY);
		this.center.move(speedX, speedY);
		
	}

	public Point getStart() {
		return start;
	}

	public int getWidth() {
		return width;
	}

	public int getHeigth() {
		return heigth;
	}
	
	public int getX (){
		return start.getX();
	}
	
	public int getY (){
		return start.getY();
	}
}
