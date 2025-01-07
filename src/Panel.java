import java.awt.*;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeListener;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Panel extends JPanel {
	private Color bg;
	private int whichvid;
	private int frame;
	private int commentsslidervalue;
	String[] commentspossible = new String[4];
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
		File abc = new File("comments.txt");
		try {
			Scanner fileinput = new Scanner(abc);

			for(int i = 0; i < commentspossible.length; i++) {
				commentspossible[i] = fileinput.nextLine();
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		commentsslidervalue = 0;
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
			g.drawString("Merry Christmas!", 11, 462); 
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

		//commentsslidervalue

		for(int i = commentsslidervalue; i < commentsslidervalue + 20; i++) {
			//


			
		}

		System.out.println(commentsslidervalue);






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

		g.setColor(Color.white);
		g.setFont(new Font("Arial", Font.PLAIN, 80)); //URL
		g.drawString("Merry Christmas!", 50, 230); 

		//--------------------------------------------------------------------------------Layer 5 -----(Candy canes)------------------------------------------//



		//--------------------------------------------------------------------------------Layer 6 -----(snowflakes)------------------------------------------//
		g.setColor(Color.WHITE);




		for(int i = 0; i < snow.length; i++) {
			g.fillOval(snow[i].getX(), snow[i].getY(), 10, 10);


			snow[i].move();
		}

		

		//--------------------------------------------------------------------------------Layer 7 ------------------------------------------------------------//


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

		if(whichvid == 1) {
			g.drawString("Step into a tranquil winter wonderland as we capture the enchanting beauty of", 11, 500 + (20) * 1);
			g.drawString("snowfall in this mesmerizing video. Watch as delicate flakes dance gently", 11, 500 + (20) * 2);
			g.drawString("through the crisp air, blanketing everything in their path with a soft,", 11, 500 + (20) * 3);
			g.drawString("glistening layer of white. Immerse yourself in the peaceful atmosphere of a", 11, 500 + (20) * 4);
			g.drawString("snow-covered landscape, where nature's canvas transforms into a breathtaking", 11, 500 + (20) * 5);
			g.drawString("work of art. The camera pans across rolling hills, bare trees, and frozen", 11, 500 + (20) * 6);
			g.drawString("lakes, showcasing the serene majesty of winter's splendor.", 11, 500 + (20) * 7);
			g.drawString("Our HD footage captures the intricate details of individual snowflakes,", 11, 500 + (20) * 8);
			g.drawString("each uniquely shaped and fleeting. Observe how they cling to branches,", 11, 500 + (20) * 9);
			g.drawString("weighing down limbs and creating a picturesque scene of winter's grip", 11, 500 + (20) * 10);
			g.drawString("on nature.", 11, 500 + (20) * 11);
			g.drawString("-- Santa Clause", 11, 500 + (20) * 12);
		}
	}

	private void drawornament() {

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

	public int getCommentsslidervalue() {
		return commentsslidervalue;
	}

	public void setCommentsslidervalue(int commentsslidervalue) {
		this.commentsslidervalue = commentsslidervalue;
	}
	
}