import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JSlider;

public class aDriver {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        JFrame frame = new JFrame();
		frame.setSize(1000, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Color bgColor = new Color(100,100,0);
		frame.getContentPane().setBackground(bgColor);

		int sparklercount = Integer.parseInt(JOptionPane.showInputDialog(null, "How many sparklers?"));




		Integer[] choices = {0,1,2,3,4};
		Integer delta = (Integer)(JOptionPane.showInputDialog(null, "How fast should the day go by?", "DaySpeed",JOptionPane.QUESTION_MESSAGE,null,choices,choices[1])); //default choice is the last one || THIS IS FOR CREATING DROP DOWN MENUS
		Color temp = JColorChooser.showDialog(null, "What color sbould the sky be", Color.white); //first thing

		Everything Screen = new Everything();

        /* 
		frame.add(MMXXV);
		int shade = 0;

		JSlider yslider = new JSlider(JSlider.VERTICAL,30,700,700);
		yslider.setMinorTickSpacing(10);
		yslider.setMajorTickSpacing(100);
		yslider.setPaintTicks(true);
		yslider.setPaintLabels(true);
		yslider.setInverted(true);

		frame.add(yslider,BorderLayout.EAST);

		frame.setVisible(true);
		while(true) {
			bgColor = new Color(0,0,shade);
			MMXXV.setBg(bgColor);
			Thread.sleep(20);
			shade+=delta;
			shade = Math.min(shade, 255); //very standard out of bounds solution
			shade = Math.max(shade, 0);  //very standard out of bounds solution (FOR EXAMPLE PONG, DOSENT GO PAST)
			if(shade==0||shade==255)
				delta*=-1;
			MMXXV.changey(yslider.getValue());
			frame.repaint();
		}
        */


        //the slider should change the 
    }
}
