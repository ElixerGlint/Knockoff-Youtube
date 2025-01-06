import java.awt.*;
import javax.swing.JPanel;

public class Panel extends JPanel {
	private Color bg;
	private int whichvid;
	private int frame;
	snowflakes tempflake1 = new snowflakes((int)(Math.random()*550) + 70, 230);
	snowflakes tempflake2 = new snowflakes((int)(Math.random()*550) + 70, 250);
	snowflakes tempflake3 = new snowflakes((int)(Math.random()*550) + 70, 270);
	snowflakes tempflake4 = new snowflakes((int)(Math.random()*550) + 70, 290);
	snowflakes tempflake5 = new snowflakes((int)(Math.random()*550) + 70, 310);
	snowflakes tempflake6 = new snowflakes((int)(Math.random()*550) + 70, 330);
	snowflakes tempflake7 = new snowflakes((int)(Math.random()*550) + 70, 350);
	snowflakes tempflake8 = new snowflakes((int)(Math.random()*550) + 70, 370);
	snowflakes[] snow = {tempflake1, tempflake2,tempflake3,tempflake4,tempflake5,tempflake6,tempflake7,tempflake8};

	public Panel(Color c, int watvid) {
		bg = c;
		this.setBackground(bg);
		whichvid = watvid;
		frame = 0;
	}



	public void paintComponent(Graphics g) { //paints everything
		super.paintComponent(g);
		this.setBackground(bg);
		printoutline(g);
		drawdesc(g);
		drawvideobox(g);
		drawcomments(g);
		if(whichvid == 1) {
			video1(g, frame, snow);
			frame++;
		}
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

		g.setColor(Color.gray); //Making the video title
		g.fillRect(10, 440, 700, 30); //title square

		g.setFont(new Font("Arial", Font.PLAIN, 20)); //URL
		g.setColor(Color.BLACK); 

		if(whichvid == 1) {
			g.drawString("https://www.mootube.com/watch?v=zqOGDO-kSpE", 1, 17); 
			g.drawString("Merry Christmas! - Santa Clause", 11, 462); 
		}
		

		if(whichvid == 2) {
			g.drawString("https://www.mootube.com/watch?v=xjvaHlji7Jo", 1, 17); 
			g.drawString("Happy New Year! - The New Year Man", 11, 462); 
		}
		

		if(whichvid == 3) {
			g.drawString("https://www.mootube.com/watch?v=q58dLWjRTBE&t=477s", 1, 17); 
			g.drawString("Happy Holidays! - Glastonbury High School", 11, 462); 
		}
		
	}

	private void drawcomments(Graphics g) {
		g.setColor(Color.lightGray);
		g.fillRect(720, 30, 260, 720); //comments square

		g.setFont(new Font("Arial", Font.PLAIN, 20)); //URL
		g.setColor(Color.BLACK); 

		g.drawString("Comments:", 721, 50); 

		//use a doc to store all of the comments

		String filecomments = "comments.txt";
		//Scanner fileinput = new Scanner(new File(filecomments)); //creating the reader
		//Cant create a scanner for some reason, that is my problem


		/*
        
        PrintWriter fileoutput = new PrintWriter(new File(file2)); //and the writer

        translator(fileinput, fileoutput); //translating the scentance (and pulling/pushing data from the files names given)

        fileoutput.close(); //MANDATORY TO CLOSE TO SAVE
        fileinput.close();
        input.close(); 
		 



		|-----------------------------------------------------------------------------------------------------------------------------
		 */


	}

	private void video1(Graphics g, int frame, snowflakes[] snow) {
		frame = frame%10; //change depending on the amount of frames in the animation

		g.setColor(Color.lightGray);
		g.setFont(new Font("Arial", Font.PLAIN, 20)); //URL

		Color darkgreen = new Color(0, 100, 0);

		//--------------------------------------------------------------------------------Layer 0 ------------------------------------------------------------//
		g.setColor(Color.red);
		g.fillRect(10, 30, 700, 400); //video box
		//--------------------------------------------------------------------------------Layer 1 ------------------------------------------------------------//
		g.setColor(Color.lightGray);
		//--------------------------------------------------------------------------------Layer 2 ------------------------------------------------------------//
		g.setColor(darkgreen);
		g.fillRect(10, 30, 700, 50); //video box
		g.fillRect(10, 380, 700, 50); //video box
		//--------------------------------------------------------------------Layer 3 (TOP GREEN) -------------------------------------------------------------//

		int[] xPoints = {10, 100, 100}; //far left
        int[] yPoints = {80, 80, 150};
		g.fillPolygon(xPoints,yPoints,3);

		int[] xPoints2 = {10, 200, 200};
        int[] yPoints2 = {80, 80, 130};
		g.fillPolygon(xPoints2,yPoints2,3);

		int[] xPoints3 = {160, 160, 300};
        int[] yPoints3 = {120, 80, 80};
		g.fillPolygon(xPoints3,yPoints3,3);

		int[] xPoints4 = {290, 390, 390}; //far left
        int[] yPoints4 = {80, 80, 150};
		g.fillPolygon(xPoints4,yPoints4,3);

		for(int i = 0; i < xPoints.length; i++) {
			xPoints[i] += 370;
			xPoints2[i] += 370;
			xPoints3[i] += 370;
		}


		//---------------------------------------------------------------------BOTTOM-------------------------------------------------------------------
		g.fillPolygon(xPoints,yPoints,3);
		g.fillPolygon(xPoints2,yPoints2,3);
		g.fillPolygon(xPoints3,yPoints3,3);

		int[] xPoints5 = {10, 100, 100}; //far left
        int[] yPoints5 = {80 + 300, 80 + 300, 150 + (-140) + 300};
		g.fillPolygon(xPoints5,yPoints5,3);

		int[] xPoints6 = {10, 200, 200};
        int[] yPoints6 = {80 + 300, 80 + 300, 130 + (- 100) + 300};
		g.fillPolygon(xPoints6,yPoints6,3);

		int[] xPoints7 = {160, 160, 300};
        int[] yPoints7 = {120 + 300 + (-80), 80 + 300, 80 + 300};
		g.fillPolygon(xPoints7,yPoints7,3);

		int[] xPoints8 = {290, 390, 390}; //far left
        int[] yPoints8 = {80+ 300, 80+ 300, 150+ (-140) + 300};
		g.fillPolygon(xPoints8,yPoints8,3);


		for(int i = 0; i < xPoints.length; i++) {
			xPoints5[i] += 370;
			xPoints6[i] += 370;
			xPoints7[i] += 370;
		}

		g.fillPolygon(xPoints5,yPoints5,3);
		g.fillPolygon(xPoints6,yPoints6,3);
		g.fillPolygon(xPoints7,yPoints7,3);

		//--------------------------------------------------------------------------------Layer 4 ------------------------------------------------------------//

		g.setColor(Color.lightGray);
		g.setFont(new Font("Arial", Font.PLAIN, 80)); //URL
		g.drawString("Merry Christmas!", 50, 230); 

		//--------------------------------------------------------------------------------Layer 5 -----(snowflakes)------------------------------------------//
		g.setColor(Color.WHITE);




		for(int i = 0; i < snow.length; i++) {
			g.fillOval(snow[i].getX(), snow[i].getY(), 10, 10);


			snow[i].move();
		}

		

		//--------------------------------------------------------------------------------Layer 13 ------------------------------------------------------------//


		//frame system
		//g.setColor(Color.lightGray);
		//g.drawString(String.valueOf(frame), 300, 150); 
		//snow will only be effected by the frame

	}


	private void drawdesc(Graphics g) {
		g.setColor(Color.lightGray);
		g.fillRect(10, 440 + 40, 700, 270); //fullscrene square

		g.setFont(new Font("Arial", Font.PLAIN, 20)); //URL
		g.setColor(Color.BLACK); 

		g.drawString("Description:", 11, 460 + 40);
	}

	private void drawvideobox(Graphics g) {
		g.setColor(Color.black);
		g.fillRect(10, 30, 700, 400); //video box
	}

	
	public Color getBg() {
		return bg;
	}
	public void setBg(Color bg) {
		this.bg = bg;
	}
}