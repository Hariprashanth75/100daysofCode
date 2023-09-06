package Day97SwingConstructor;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SwingConstructor {
	
	JFrame f;
	
	SwingConstructor(){
		f= new JFrame();
		JButton b = new JButton("Click me");
		b.setBounds(130,100,100, 40);  
		f.add(b);
		f.setCursor(null);
		
		f.setSize(400, 500);
		f.setLayout(null);
		f.setVisible(true);
		
	}
	

}
