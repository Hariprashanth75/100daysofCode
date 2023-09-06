package Day99WordCounterAppSwing;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class CharacterCount extends JFrame implements ActionListener {

	JLabel lb1, lb2;
	JTextArea ta;
	JButton b;
	JButton pad, text;

	CharacterCount()
	{
		super("This is a character count tool");
		
		lb1= new JLabel("Characters:");
		lb1.setBounds(50, 50, 100, 20);
		
		lb2 = new JLabel("Words:");
		lb2.setBounds(50, 80, 100, 20);
		
		ta = new JTextArea();
		ta.setBounds(50, 110, 300, 200);
		
		 b=new JButton("click");  
	        b.setBounds(50,320, 80,30); 
	        b.addActionListener(this);  
	      
	        pad=new JButton("Pad Color");  
	        pad.setBounds(140,320, 110,30);
	        pad.addActionListener(this);  
	  
	        text=new JButton("Text Color");  
	        text.setBounds(260,320, 110,30);
	        
	        text.addActionListener(this);  
	        
	        add(lb1);
	        add(lb2);
	        add(ta);
	        add(b);
	        add(pad);
	        add(text);  
	          
	        setSize(400,400);  
	        setLayout(null);//using no layout manager  
	        setVisible(true);  
	        setDefaultCloseOperation(EXIT_ON_CLOSE); 
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getSource()==b)
		{
			String text = ta.getText();
			lb1.setText("Characters: " +text.length() );
			
			String[] words = text.split("\\s");
			lb2.setText("Words: "+ words.length);
			
			
		}
		
		else if(e.getSource() == pad)
		{
			Color c=JColorChooser.showDialog(this,"Choose Color",Color.BLUE);  
            ta.setBackground(c);  
		}
		else if(e.getSource()==text){  
            Color c=JColorChooser.showDialog(this,"Choose Color",Color.BLACK);  
            ta.setForeground(c);  
        } 

	}

}
