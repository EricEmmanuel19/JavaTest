import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JEditorPane;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class pan extends JPanel {
private JMenuBar bar;
private JMenu fich,apropo;
private JMenuItem nouv,score,quiter,ai;
private JLabel lab =new JLabel("");
private JScrollPane sc;
private BorderLayout bod;
private JEditorPane edi; 
private JPanel ed;
private JOptionPane jop;
private JPanel pok ;
private JLabel aff,Don;
public pan(){
pok=new JPanel();
aff=new JLabel ();
this.ed=new JPanel();
//Gp p=new Gp();
this.jop=new JOptionPane();
this.bod=new BorderLayout();
	btPan ol=new btPan();
this.setLayout(bod);
	
this.bar=new JMenuBar();
	this.ai=new JMenuItem("?");
	this.fich=new JMenu("Fichier")	;
	this.apropo=new JMenu("Apropos");
	this.nouv=new JMenuItem("Nouveau");
	this.score=new  JMenuItem("Score");
	this.quiter=new JMenuItem("quiter");
	edi =new JEditorPane();
	
	apropo.add(ai);
	bar.add(fich);
	bar.add(apropo);
	fich.add(nouv);
	fich.add(score);
	fich.add(quiter);
edi.setEditable(false);
this.sc=new JScrollPane();
this.lab=new JLabel();

//this.lab=new JLabel(" \t Bonjour a vous  et Soyez le Bienvenue dans notre Jeu ");
//lab.setLocation(100,500);
//edi.setText("");
btPan k=new btPan();
pok.add(ol);
//Label ll=new Label(k.getT());
lab.setText(ol.getT());
//this.add(bod.NORTH,ll);
this.add(pok,bod.SOUTH);

//nouv.addActionListener(new nListener());

this.Don=new JLabel("couuu");
Don.setHorizontalAlignment(JLabel.CENTER);
Don.setFont(new Font("",Font.BOLD,30));

this.add(Don,BorderLayout.CENTER);

ai.addActionListener(new ActionListener(){
//	Lecture lt=new Lecture();
	@Override
	public void actionPerformed(ActionEvent arg0) {
	jop.showMessageDialog(null,"Ceci est une application developpe par Emmanuel Eric \n"
			+ "  \t Le jeu consiste a trouv� les mot masqu� \n"
			+ " \t A chaque mot trouv� vous aurez 10 points !","",JOptionPane.INFORMATION_MESSAGE);
		//System.exit(0);
	}});

io();
	quiter.addActionListener(new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent arg0) {
		System.exit(0);
			
		}});

	}
	class nListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
		new frame();
			System.exit(0);
		//dia g=new dia(new frame(),"",true);
			
			
	
		}
		
		
	}
	JMenuBar io(){
		
		return bar;}
	
	
}
