import java.awt.ComponentOrientation;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame frame = new JFrame("hue");
		frame.setSize(800, 400);
		frame.setLayout(new FlowLayout());
		JPanel jp = (JPanel) frame.getContentPane();
		jp.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		JLabel labelHue = new JLabel("HUE\n");
		frame.add(labelHue);
		JLabel labelHue2 = new JLabel("HUEHUE");
		frame.add(labelHue2);
		JLabel labelHue3 = new JLabel("HUEHUEHUE");
		frame.add(labelHue3);
	}

}
