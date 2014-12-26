package Predavanje;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Callout {
public static void main(String[] args) {
	
	Students students = new Students();
	
	JFrame mainWindow = new MainFrame(students);	
	mainWindow.setVisible(true);
	
	
}
}
