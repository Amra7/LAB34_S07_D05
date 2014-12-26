package Predavanje;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

/* Varijane definicije UGNJEZDENE KLASE*/

// Svaka klasa ima pristup javnim statickim atributima drugih klasa
// Svaka ugnjdezdena klasa ima pristip statickim atributima klase u kojoj se nalazi
// Svaka ugnjezdena klasa moze pristiupiti svim atributima objekta u kojem je ugnjezdena

public class MainFrame  extends JFrame {
	
	
	private JButton mainButton;
	private JButton exitButton;
	private JLabel mainLabel;
	private JPanel mainPanel;
	private Students students;
	

	public MainFrame (Students s){
		
		super("Prozivka");
		this.students=s;
		
        mainButton = new JButton("Sljedeci student");
        mainLabel = new JLabel();
//      NextStudentListener nsl = new NextStudentListener();
        
        /* Varijante C*/
        
    	/* implementiranje ActionListenera u MainFrame klasu mozda nije najbolja ideja.
    	   Stoga ce se zasebno implmentirat ActionListener kao anonimne klase. */
        
        mainButton.addActionListener( new ActionListener (){

			@Override
			public void actionPerformed(ActionEvent e) {
				mainLabel.setText(students.getRandomStudent());			
			}
        	
        });
        
        exitButton = new JButton("Exit");
        
        exitButton.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			}
        	
        });
		
        mainLabel.setText(students.getRandomStudent());
		mainLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		mainPanel = new JPanel();
		mainPanel.setLayout(new BorderLayout());
		mainPanel.add(mainLabel, BorderLayout.NORTH);
		mainPanel.add(mainButton, BorderLayout.CENTER);
		mainPanel.add(exitButton, BorderLayout.SOUTH);
	    this.setContentPane(mainPanel);
		
		this.setSize(400, 300);
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	/* Varijante A*/
	
	// public class NextStudentListener implement ActionListener {
	
	/* Ako klasa bila staticna mogla bi samo pristupati staticnim atributima
	   Kako ne bi pisali narednu klasu kako inner klasu, 
	   prebacili smo interface ActionListener u MainFrame klasu */
	
	
	
	/* Varijante B*/
	
//		@Override
//		public void actionPerformed(ActionEvent e) {
//			
//			/* Varijate 1 i 2 po kojim mozemo uraditi */
//			
//// 1*			JButton source = (JButton)e.getSource();
//// 2*			Object source = e.getSource();
//			
//// 1*		if ( source.getText().equals("Sljedeci student"))
//// 2*		if (  source == mainButton)
//		
//			if ( e.getSource() == mainButton)
//				mainLabel.setText(students.getRandomStudent());
//			else 
//				System.exit(0);
//	}
		


	
}
