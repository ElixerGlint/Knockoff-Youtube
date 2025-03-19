import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JSlider;


public class HappyDriver {

	public static void main(String[] args) throws InterruptedException {
		JFrame frame = new JFrame();
		frame.setSize(1030, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Color bgColor = new Color(100,100,0);
		frame.getContentPane().setBackground(bgColor);
		
		Integer[] choices = {1,2,3};
		Integer vidselection = (Integer)(JOptionPane.showInputDialog(null, "What video do you want to watch?", "Video Selector",JOptionPane.QUESTION_MESSAGE,null,choices,choices[0])); //default choice is the last one || THIS IS FOR CREATING DROP DOWN MENUS
		Color temp = JColorChooser.showDialog(null, "What color do you want the browser to be?", Color.white); //first thing

		Color accentcol = new Color(255,255,255);

		if(vidselection == 1) {
			accentcol = JColorChooser.showDialog(null, "What color do you want the accent to be?", Color.green); //first thing
		}
		if(vidselection == 2) {
			accentcol = JColorChooser.showDialog(null, "What color do you want the accent to be?", Color.black); //first thing
		}
		if(vidselection == 3) {
			accentcol = JColorChooser.showDialog(null, "What color do you want the accent to be?", Color.white); //first thing
		}
		

		NewYearPanel Everything = new NewYearPanel(bgColor,vidselection,accentcol);

		frame.add(Everything);
		frame.setTitle("Mootube");

		JSlider yslider = new JSlider(1,0,12,0);
		
		yslider.setPaintTicks(true);
		yslider.setPaintLabels(true);
		yslider.setInverted(true);

		frame.add(yslider,BorderLayout.EAST);
		


		
		Everything.setBg(temp);
		frame.setVisible(true);

		

		while(true) {
			Everything.setCommentsslidervalue(yslider.getValue());
			frame.repaint();
			Thread.sleep(4);
			
		}
	}

}