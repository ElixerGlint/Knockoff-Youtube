import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JSlider;


public class Driver {

	public static void main(String[] args) throws InterruptedException {
		JFrame frame = new JFrame();
		frame.setSize(1030, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Color bgColor = new Color(100,100,0);
		frame.getContentPane().setBackground(bgColor);

		//int sparklercount = Integer.parseInt(JOptionPane.showInputDialog(null, "How many sparklers?",1));

		Integer[] choices = {1,2,3};
		Integer vidselection = (Integer)(JOptionPane.showInputDialog(null, "What video do you want to watch?", "Video Selector",JOptionPane.QUESTION_MESSAGE,null,choices,choices[0])); //default choice is the last one || THIS IS FOR CREATING DROP DOWN MENUS
		Color temp = JColorChooser.showDialog(null, "What color do you want the browser to be?", Color.white); //first thing

		Panel Everything = new Panel(bgColor,vidselection);

		frame.add(Everything);
		frame.setTitle("Mootube");

		
		JSlider yslider = new JSlider(1,0,100,0);
		
		yslider.setPaintTicks(true);
		yslider.setPaintLabels(true);
		yslider.setInverted(true);

		frame.add(yslider,BorderLayout.EAST);
		

		
		
		Everything.setBg(temp);
		frame.setVisible(true);

		while(true) {
			
			
			frame.repaint();
		}
	}

}