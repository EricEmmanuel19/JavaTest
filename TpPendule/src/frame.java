import javax.swing.JFrame;

public class frame extends JFrame {
public frame(){

	this.setSize(800,500);
	this.setTitle("Tableau de pendule");
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	pan p=new pan();
	//	this.setResizable(false);
	this.setJMenuBar(p.io());
	this.setContentPane(p);
	dia d=new dia(this,"Identit�",true);
	this.setLocationRelativeTo(null);
	this.setVisible(true);


//	p.io();
	
	
	
}
	
	
}
