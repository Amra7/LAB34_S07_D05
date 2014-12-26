package vjezbe;

import javax.swing.JFrame;
import javax.swing.Timer;

public class MainCircle {
	
    public static void main(String[] args) {
    	
    	Circle c1 = new Circle(10, 400, 40);
    	
    	JFrame window = new JFrame();
       	window.setSize(500, 500);
       	window.setContentPane(c1);
       	
       	
       	Timer t = new Timer(1000/60, c1);
       	t.start();
       	
       	
       	window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	window.setVisible(true);
    	c1.requestFocus(false);
	
}
}
