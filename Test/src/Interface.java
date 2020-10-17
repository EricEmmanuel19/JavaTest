import java.awt.Dimension;

import javax.swing.JFrame;

public class Interface extends JFrame {
public Interface(){
	this.setSize(new Dimension(800,500));
	this.setTitle("Ecran du test ");
this.setLocationRelativeTo(null);
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setContentPane(new Paneau());
	this.setVisible(true);
}
	
}
