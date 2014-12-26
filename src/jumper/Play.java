package jumper;

import javax.swing.JFrame;
// kada se Window (JFRame) resize-a nove vrijednosti njegovog prozora poslati u Game graphics
public class Play {
public static void main(String[] args) {
	
	JFrame  window = new JFrame("Game");
	window.setSize(500, 500);
	GameGraphics gg = new GameGraphics(500, 500);
	window.setContentPane(gg);
	
	// gg.get window height i width
	// dodamo ActionListerner na resize-anje prozora, a dodjemo ga kao anaonimu klasu
	
	window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	window.setVisible(true);
	window.r // ovjdje nesto resajzati
	
	
}
}
