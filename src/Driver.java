import java.awt.Color;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Driver {

	public static void main(String[] args) throws InterruptedException {

		JFrame frame = new JFrame();
		frame.setSize(1000, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Color bgColor = new Color(100,100,0);
		frame.getContentPane().setBackground(bgColor);

		int sparklercount = Integer.parseInt(JOptionPane.showInputDialog(null, "How many sparklers?",1));

		Integer[] choices = {0,1,2,3,4};
		//Integer delta = (Integer)(JOptionPane.showInputDialog(null, "How fast should the day go by?", "DaySpeed",JOptionPane.QUESTION_MESSAGE,null,choices,choices[1])); //default choice is the last one || THIS IS FOR CREATING DROP DOWN MENUS
		Color temp = JColorChooser.showDialog(null, "What color do you want the browser to be?", Color.white); //first thing

		Everything Everything = new Everything(150,bgColor,sparklercount);

		frame.add(Everything);
		int shade = 0;

		/* 
		JSlider yslider = new JSlider(JSlider.VERTICAL,30,700,700);
		yslider.setMinorTickSpacing(10);
		yslider.setMajorTickSpacing(100);
		yslider.setPaintTicks(true);
		yslider.setPaintLabels(true);
		yslider.setInverted(true);

		frame.add(yslider,BorderLayout.EAST);
		*/

		
		
		Everything.setBg(temp);
		frame.setVisible(true);

		while(true) {
			
			
			frame.repaint();
		}
	}

}