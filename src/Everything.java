import java.awt.*;
import javax.swing.JPanel;

public class Everything extends JPanel {
	private Color bg;
	private int whichvid;

	public Everything(Color c, int watvid) {
		bg = c;
		this.setBackground(bg);
		whichvid = watvid;
	}



	public void paintComponent(Graphics g) { //paints the browser box
		super.paintComponent(g);
		this.setBackground(bg);
		printoutline(g);
	}

	private void printoutline(Graphics g) {
		g.setColor(Color.darkGray);
		g.drawRect(0, 0, 985, 20); //bottom line
		g.setColor(Color.gray);
		g.fillRect(0, 0, 985, 20); //filling the bar
		g.setColor(Color.RED);
		g.fillRect(935, 0, 50, 20); //red
		g.setColor(Color.YELLOW);
		g.fillRect(885, 0, 50, 20); //yellow
		g.setColor(Color.lightGray);
		g.fillRect(835, 0, 50, 20); //gray
		g.setColor(Color.BLACK);
		g.drawLine(855, 10, 865, 10); //minimize line
		g.drawRect(905, 5, 10, 10); //fullscrene square
		g.drawLine(955, 5, 965, 15); //1/2 of the X
		g.drawLine(955, 15, 965, 5); //1/2 of the X

		g.setColor(Color.black);
		g.fillRect(10, 30, 700, 400); //video box

		g.setColor(Color.lightGray);
		g.fillRect(10, 440, 700, 310); //fullscrene square

		g.setFont(new Font("Arial", Font.PLAIN, 20)); //URL
		g.setColor(Color.BLACK); 

		if(whichvid == 1)
		g.drawString("https://www.mootube.com/watch?v=zqOGDO-kSpE", 1, 17); 

		if(whichvid == 2)
		g.drawString("https://www.mootube.com/watch?v=xjvaHlji7Jo", 1, 17); 

		if(whichvid == 3)
		g.drawString("https://www.mootube.com/watch?v=q58dLWjRTBE&t=477s", 1, 17); 

		g.drawString("Comments:", 11, 460); 
	}

	
	public Color getBg() {
		return bg;
	}
	public void setBg(Color bg) {
		this.bg = bg;
	}
}