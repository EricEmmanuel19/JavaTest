import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Frame2 extends JFrame {
private JButton bt;
private int i=0;
private boolean ho;
private JLabel lo;
	
public Frame2(){
	
		this.setTitle("Lecture");
	this.lo=new JLabel("BP?");
	this.setSize(400,200);
	this.setLayout(new BorderLayout());
	this.add(lo,BorderLayout.NORTH);
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 Lecture l=new Lecture();
bt =new JButton("next");
this.add(bt,BorderLayout.SOUTH);
//int i=0;
	bt.addActionListener(new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent arg0) {
			if((l.getAr()).size()==i+1)
				bt.setEnabled(false);
				
			lo.setText((String) (l.getAr()).get(i));
			i++;
		
		}});
	this.setVisible(true);
	}

}
