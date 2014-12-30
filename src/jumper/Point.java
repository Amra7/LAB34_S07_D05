package jumper;

public class Point {

	private int x;
	private int y;
	
	public Point(int x, int y){
		this.x=x;
		this.y=y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
	
	public void setX( int x){
		this.x = x;
	}
	
	public void setY( int y){
		this.y = y;
	}
	
	public int getDistance(Point other) {
		int dx = (this.x - other.x)*(this.x - other.x);
		int dy = (this.y - other.y) *(this.y - other.y);
		int result = (int)(Math.sqrt(dx + dy));
		
		return  result;
	}
	
	public void move (int speedX, int speedY){
		this.x += speedX;
		this.y += speedY;
	}

	
}
