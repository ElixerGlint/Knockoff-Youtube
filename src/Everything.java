import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class Everything extends JPanel {
	private int moonWidth; private Color bg;
	
	public Everything(int mw, Color c, int sCount) {
		moonWidth = mw; bg= c;
		this.setBackground(bg);
		
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		this.setBackground(bg);
		g.setColor(Color.yellow);
		g.drawOval(0, 0, moonWidth, moonWidth);
		g.setColor(Color.darkGray);
		g.fillOval(0, 0, moonWidth, moonWidth);
		
	}
	public int getMoonWidth() {
		return moonWidth;
	}
	public void setMoonWidth(int moonWidth) {
		this.moonWidth = moonWidth;
	}
	public Color getBg() {
		return bg;
	}
	public void setBg(Color bg) {
		this.bg = bg;
	}
}