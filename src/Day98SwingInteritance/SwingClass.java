package Day98SwingInteritance;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SwingClass extends JFrame {

	JFrame f;

	SwingClass() {

		
		JButton b = new JButton("Click me");
		b.setBounds(130, 100, 100, 40);
		add(b);
		setCursor(null);

		setSize(400, 500);
		setLayout(null);
		setVisible(true);
	}

}