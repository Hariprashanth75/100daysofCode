package Day96JavaSwing;
import javax.swing.*;
public class SwingPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame f = new JFrame();
		JButton b = new JButton("Button 1");
		JButton b2 = new JButton("Button 2");
		
		b.setBounds(130, 100, 100, 40);
		b2.setBounds(130, 300, 100, 40);
		
		f.add(b);
		f.add(b2);
		
		f.setSize(500,600);
		f.setLayout(null);
		f.setVisible(true);

	}

}
