import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class Paneau extends JPanel {
private JLabel lab;
private String str;
void  getSize(String io){
	
	
}
public Paneau(){
	str=" Bienvenue dans notre Application ";
	
	lab =new JLabel(str);
//	lab.setFont(new Font("s",200,Font.ITALIC)
	
	lab.setForeground(Color.RED);

this.add(lab);
}

}
