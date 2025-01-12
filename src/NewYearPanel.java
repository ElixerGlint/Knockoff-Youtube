import java.awt.*;
import java.io.File; //using collections
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import javax.swing.JPanel;

public class NewYearPanel extends JPanel {
	private Color bg;
	private int whichvid;
	private int frame;
	private int commentsslidervalue;
	private Color accentcolor;
	String[] commentspossible = new String[20];
	movement tempflake1 = new movement((int)(Math.random()*550) + 70, 230);
	movement tempflake2 = new movement((int)(Math.random()*550) + 70, 250);
	movement tempflake3 = new movement((int)(Math.random()*550) + 70, 270);
	movement tempflake4 = new movement((int)(Math.random()*550) + 70, 290);
	movement tempflake5 = new movement((int)(Math.random()*550) + 70, 310);
	movement tempflake6 = new movement((int)(Math.random()*550) + 70, 330);
	movement tempflake7 = new movement((int)(Math.random()*550) + 70, 350);
	movement tempflake8 = new movement((int)(Math.random()*550) + 70, 370);
	movement[] snow = {tempflake1, tempflake2,tempflake3,tempflake4,tempflake5,tempflake6,tempflake7,tempflake8};

	movement tempconfetti = new movement((int)(Math.random()*550) + 70, 230);
	movement tempconfetti2 = new movement((int)(Math.random()*550) + 70, 250);
	movement tempconfetti3 = new movement((int)(Math.random()*550) + 70, 270);
	movement tempconfetti4 = new movement((int)(Math.random()*550) + 70, 290);
	movement tempconfetti5 = new movement((int)(Math.random()*550) + 70, 310);
	movement tempconfetti6 = new movement((int)(Math.random()*550) + 70, 330);
	movement tempconfetti7 = new movement((int)(Math.random()*550) + 70, 350);
	movement tempconfetti8 = new movement((int)(Math.random()*550) + 70, 370);
	movement[] confetti = {tempconfetti, tempconfetti2,tempconfetti3,tempconfetti4,tempconfetti5,tempconfetti6,tempconfetti7,tempconfetti8};

	public NewYearPanel(Color c, int watvid, Color secondcolor) {
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
			Collections.shuffle(Arrays.asList(commentspossible)); //THIS WAS MY FIRST TIME USING COLLECTIONS TO RANDOMIZE AN ARRAY, I did research to find it
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		commentsslidervalue = 0;

		accentcolor = secondcolor;
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
		if(whichvid == 2) {
			video2(g, frame, confetti);
			frame++;
		}
		if(whichvid == 3) {
			video3(g, frame);
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

		g.setFont(new Font("Arial", Font.PLAIN, 20)); 
		g.setColor(Color.BLACK); 

		g.drawString("Comments:", 721, 50); 

		//commentsslidervalue
		g.setFont(new Font("Arial", Font.PLAIN, 25)); 
		int counter = 0;
		for(int i = commentsslidervalue; i < commentsslidervalue + 8; i++) {
			g.drawString(commentspossible[i], 721, 85 + counter*85); //base value used to be 70
			counter++;
		}
	}

	private void video1(Graphics g, int frame, movement[] snow) {

		g.setColor(Color.lightGray);
		g.setFont(new Font("Arial", Font.PLAIN, 20)); //URL

		Color darkgreen = new Color(0, 100, 0);
		
		//--------------------------------------------------------------------------------Layer 0 ------------------------------------------------------------//
		g.setColor(Color.red);
		g.fillRect(10, 30, 700, 400); //video box
		//-----------------------------------------------------------------------------Layer BALLS ------------------------------------------------------------//
		g.setColor(Color.white);
		g.drawLine(25, 50, 25, 250);
		g.drawLine(60, 50, 60, 140);
		g.drawLine(150, 50, 150, 140);
		g.drawLine(240, 50, 240, 140);
		g.drawLine(310, 50, 310, 140);
		g.drawLine(420, 50, 420, 140);
		g.drawLine(520, 50, 520, 160);
		g.drawLine(620, 50, 620, 130);
		g.drawLine(690, 50, 690, 250);

		g.setColor(accentcolor);
		g.fillOval(11, 240, 30, 30);
		g.fillOval(46, 140, 30, 30);
		g.fillOval(135, 120, 30, 30);
		g.fillOval(225, 140, 30, 30);
		g.fillOval(295, 110, 30, 30);
		g.fillOval(405, 130, 30, 30);
		g.fillOval(505, 150, 30, 30);
		g.fillOval(605, 120, 30, 30);
		g.fillOval(675, 240, 30, 30);

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
	}

	private void video2(Graphics g, int frame, movement[] confetti) { //--------------------------------------VIDEO 2-----------------------------------------------------------
		//--------------------------------------------------------------------------BG-----------------------------------------------------------
		for(int i = 0; i < 255; i++) {
			Color abc =  new Color (i,255,0);
			g.setColor(abc);
			g.drawLine(10+i, 30, 10+i, 430);
		}

		for(int i = 0; i < 255; i++) {
			Color abc =  new Color (255,255-i,0);
			g.setColor(abc);
			g.drawLine(10+255+i, 30, 255+10+i, 430);
		}
		for(int i = 0; i < 190; i++) {
			Color abc =  new Color (255,0,i);
			g.setColor(abc);
			g.drawLine(10+255+255+i, 30,255+ 255+10+i, 430);
		}

		//--------------------------------------------------------------------------TEXT-----------------------------------------------------------


		g.setColor(accentcolor);

		for(int i = 0 ; i < confetti.length; i++) {
			g.fillRect(confetti[i].getX(), confetti[i].getY()-10, 60, 20);


			confetti[i].move();
		}

		
		g.setColor(Color.black);
		g.setFont(new Font("Arial", Font.PLAIN, 70)); //URL
		g.drawString("HAPPY NEW YEAR!", 29, 250);
		g.setColor(Color.white);
		g.drawString("HAPPY NEW YEAR!", 32, 253);

	}

	private void video3(Graphics g, int frame) { //--------------------------------------VIDEO 2-----------------------------------------------------------
		g.setColor(Color.black);
		g.fillRect(10, 30, 700, 400); //video box
		//DialogInput

		g.setFont(new Font("Lucida Handwriting", Font.BOLD, 80));
		g.setColor(accentcolor);

		g.drawString("Happy", 60, 180); 
		g.drawString("Holidays", 230, 300); 

		g.setColor(Color.blue);
		g.drawString("-GHS", 380, 400); 

		g.setColor(Color.white);
		if(frame%10 < 5) {
			drawsnowflake(g, 80, 80, frame % 10 + 5);
			drawsnowflake(g, 280, 80, frame % 10 * 5);
			drawsnowflake(g, 550, 130, frame % 10 * 20);
			drawsnowflake(g, 170, 270, frame % 10 * 10);
			drawsnowflake(g, 660, 370, frame % 10 * 7);
			drawsnowflake(g, 300, 340, frame % 10 * 3);
			drawsnowflake(g, 80, 380, frame % 10 * 10);
		}
		else {
			drawsnowflake(g, 80, 80, 30 - frame%10 * 5);
			drawsnowflake(g, 280, 80, 45 - frame%10 * 5);
			drawsnowflake(g, 550, 130, 200 - frame % 10 * 20);
			drawsnowflake(g, 170, 270, 100 - frame % 10 * 10);
			drawsnowflake(g, 660, 370, 70 - frame % 10 * 7);
			drawsnowflake(g, 300, 340, 30 - frame % 10 * 3);
			drawsnowflake(g, 80, 380, 100 - frame % 10 * 10);
		}
		
		
		try {
			Thread.sleep(20);
		} catch (Exception e) {
		}
		
	}

	private void drawsnowflake (Graphics g, int x, int y, int stretch) {
		g.drawLine(x-stretch, y-stretch, x+stretch, y+stretch);
		g.drawLine(x+stretch, y-stretch, x-stretch, y+stretch);
		g.drawLine(x, y-stretch, x, y+stretch);
		g.drawLine(x-stretch, y, x+stretch, y);
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

		if(whichvid == 2) {
			g.drawString("Experience the magic of a vibrant rainbow confetti fall! This enchanting video", 11, 500 + (20) * 1);
			g.drawString("captures the joy and excitement of a celebration as colorful confetti pieces", 11, 500 + (20) * 2);
			g.drawString("gently float downwards against a stunning rainbow backdrop. The camera pans", 11, 500 + (20) * 3);
			g.drawString("across the screen, showcasing the delicate movement of the confetti as it", 11, 500 + (20) * 4);
			g.drawString("drifts lazily through the air. The rainbow hues perfectly complement the", 11, 500 + (20) * 5);
			g.drawString("pastel shades of the confetti, creating a visually striking contrast that", 11, 500 + (20) * 6);
			g.drawString("pops against the neutral background. Perfect for adding a touch of whimsy", 11, 500 + (20) * 7);
			g.drawString("and festivity to any project, this video is ideal for wishing others that,", 11, 500 + (20) * 8);
			g.drawString("you may know a happy, happy new year. The new year man posted this video,", 11, 500 + (20) * 9);
			g.drawString("he is a recent global phenomenon due to his work with wishing everbody he", 11, 500 + (20) * 10);
			g.drawString("knows a happy new year.", 11, 500 + (20) * 11);
			g.drawString("-- The Happy New Year Man", 11, 500 + (20) * 12);
		}

		if (whichvid == 3)  {
			g.drawString("A simple winter scene featuring snowflakes that grow and shrink. The", 11, 500 + (20) * 1);
			g.drawString("video displays the phrase 'Happy Holidays' against a blank", 11, 500 + (20) * 2);
			g.drawString("background. Snowflakes appear, enlarge, and then disappear. The", 11, 500 + (20) * 3);
			g.drawString("animation repeats continuously. There's no sound or additional", 11, 500 + (20) * 4);
			g.drawString("effects beyond the snowflakes. The video runs for approximately 3", 11, 500 + (20) * 5);
			g.drawString("minutes. It's suitable as a quiet screensaver or background for", 11, 500 + (20) * 6);
			g.drawString("social media posts during the holiday season. The content is", 11, 500 + (20) * 7);
			g.drawString("straightforward and lacks complexity, focusing solely on the", 11, 500 + (20) * 8);
			g.drawString("described snowflake animation and text.", 11, 500 + (20) * 9);
			g.drawString("", 11, 500 + (20) * 10);
			g.drawString("", 11, 500 + (20) * 11);
			g.drawString("-- Glastonbury High School", 11, 500 + (20) * 12);
		}
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