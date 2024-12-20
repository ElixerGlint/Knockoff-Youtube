import java.awt.Color;
import java.awt.Graphics;

public class Browseroutline {
	private int x, y, sparkleCount;

	public Browseroutline(int x, int y, int sparkleCount) {
		super();
		this.x = x;
		this.y = y;
		this.sparkleCount = sparkleCount;
	}
	
	public void drawSparkler(Graphics g) {
		g.setColor(Color.red);
		g.fillRect(x, y, 20,40);
		for(int i = 0;i<sparkleCount;i++) {
			g.setColor(Color.yellow);
			int randoX = (int)(Math.random()*21)+x;
			int randoY = y-10-(int)(Math.random()*21);
			g.drawLine(x+10, y, randoX, randoY);
		}
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getSparkleCount() {
		return sparkleCount;
	}

	public void setSparkleCount(int sparkleCount) {
		this.sparkleCount = sparkleCount;
	}
	

}