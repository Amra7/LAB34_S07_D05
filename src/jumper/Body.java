package jumper;

import java.awt.Color;
import java.awt.Graphics;
/**
 * Class that determines bodies, 
 * @author amrapoprzanovic
 *
 */
public class Body {

	private Point start;
	private Point center;
	private int width;
	private int heigth;
	private Color color;
	private int speedX;
	private int speedY;
	
	private int minX;
	private int minY;
	private int maxX;
	private int maxY;
	
	private int acceleration;
	
	
	/**
	 * Constructor for class Body
	 * @param x - center of body on coordinate x
	 * @param y - center of body on coordinate y
	 * @param width - width of the body
	 * @param heigth - height of the body
	 * @param color - color of the body
	 * @param speedX - speed of the boy on coordinate x
	 * @param speedY - speed of the boy on coordinate y
	 * @param minX
	 * @param minY
	 * @param maxX
	 * @param maxY
	 */
	public Body ( int x, int y, int width, int heigth, Color color, 
			int speedX, int speedY, int minX, int minY, int maxX, int maxY){
		start = new Point(x,y);
		center = new Point(x + width/2, y + heigth/2);
		this.width = width;
		this.heigth = heigth;
		this.color = color;
		this.speedX = speedX;
		this.speedY = speedY;
		this.minX = minX;
		this.minY = minY;
		this.maxX = maxX;
		this.maxY = maxY;
		this.acceleration = 0;
		
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
		speedY +=acceleration;
		
        if ( (this.getX() + this.getWidth() + speedX) >= maxX && speedX> 0){
		    speedX =0;
		    this.start.setX(maxX - this.getWidth());
		    this.center.setX(maxX - this.getWidth()/2);
        }
        
		if( (this.getY() + this.getHeigth() + speedY) >= maxY && speedY> 0){
		   speedY =0;
		   this.start.setY(maxY - this.getHeigth());
		   this.center.setY(maxY - this.getHeigth()/2);
		}	
		
		if ( (this.getX() + speedX) <= minX && speedX < 0){
			speedX =0;
			this.start.setX(minX);
		    this.center.setX(minX - this.getWidth()/2);
		}
		if ( (this.getY() + speedY) <= minY && speedY < 0){
			speedY =0;
			this.start.setY(minY);
		    this.center.setX(minX - this.getWidth()/2);
		}
		
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
	
	public void jump(){
		if ( this.start.getY() + this.getHeigth() == maxY){
		speedY = -20;
		this.acceleration = 1;
	
		}
	}
	
	// end of class
	
	
	/* varijanta ya move*/
//	if ( (this.getX() + this.getWidth() + speedX) >= maxX && speedX> 0){
//    speedX =  -speedX/ 2;
//    this.start.setX(maxX - this.getWidth());
//    this.center.setX(maxX - this.getWidth()/2);
//}
//
//if( (this.getY() + this.getHeigth() + speedY) >= maxY && speedY> 0){
//   speedY = -speedY/2;
//   this.start.setY(maxY - this.getHeigth());
//   this.center.setY(maxY - this.getHeigth()/2);
//   
//   
//}	
//
//if ( (this.getX() + speedX) <= minX && speedX < 0){
//	speedX = -speedX/ 2;
//	this.start.setX(minX);
//    this.center.setX(minX - this.getWidth()/2);
//}
//if ( (this.getY() + speedY) <= minY && speedY < 0){
//	speedY = -speedY/2;  
//	this.start.setY(minY);
//    this.center.setX(minY - this.getWidth()/2);
//}
//
//this.start.move(speedX, speedY);
//this.center.move(speedX, speedY);
//
//}
}
