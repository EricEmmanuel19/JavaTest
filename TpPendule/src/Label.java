import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JLabel;

public class Label extends JLabel {
public Label(){}
	
	void setlabel(String op){
	this.setText(op);
	this.setForeground(Color.GREEN);
Font f=new Font("",Font.BOLD,30);
//this.setPreferredSize(new Dimension(40,20));
this.setFont(f);
this.setHorizontalAlignment(JLabel.CENTER);

}
}
