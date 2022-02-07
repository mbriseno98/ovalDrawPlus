import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Container; 
import java.awt.Color;
import javax.swing.JLabel;


public class OvalDrawPlus extends JPanel {
	
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
	    this.setBackground(Color.BLACK);
	    int panelWidth = getWidth();
        int panelHeight = getHeight();
	   
	g.setColor(Color.BLUE);
	g.fillRect(0,0,panelWidth,panelHeight);
	
	 g.setColor(Color.YELLOW);
	 g.fillOval(0,0,panelWidth,panelHeight);
	//.fill.setBackground(Color.BLACK);
		
}

	/*public void paintComponent(Graphics g){
		 super.paintComponent(g);
		 this.setBackground(Color.BLACK);
		 g.setColor(Color.BLUE);
		 g.fillRect(75, 10, 350, 340);
		 
		 g.setColor(Color.YELLOW);
		 g.fillOval(1,2,482,357);
		 */

	public static void main(String[] args) {
		System.out.println("Oval Draw Plus Starting...");
		JFrame f = new JFrame ("Oval Draw Plus");
		//JLabel label = new JLabel("Hello JLabel Centered",JLabel.CENTER); 
		f.setLocation(250, 150);

	//	f.add(label);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		OvalDrawPLus p = new OvalDrawPLus();
		f.add(p);
		f.setSize(400,500);
		f.setVisible(true);

	}

}
