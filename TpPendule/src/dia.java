import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class dia extends JDialog {
private JPanel panN,panP,panS,panB;
private JLabel n,p,s;
private JComboBox sx;
private JTextField nom,prenom;
private JButton ok ,an;
private JOptionPane jop;
String ge="";
private int key;
//private String [] sex;
public dia(JFrame par,String titr,boolean  m){
	super(par,titr,m);
		this.setSize(400,200);
		init();
		this.setResizable(false);
		this.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setVisible(true);

}
	void init(){
		String []sex ={"Homme","Femme"};
	sx=new JComboBox(sex);
n=new JLabel("Nom :");
p=new JLabel("Prenom :");
s=new JLabel("Sex :");
nom=new JTextField();
nom.setPreferredSize(new Dimension(100,20));
prenom=new JTextField();
prenom.setPreferredSize(new Dimension(100,20));
prenom.setForeground(Color.blue);
nom.setForeground(Color.blue);
nom.setFont(new Font("",Font.BOLD,15));
prenom.setFont(new Font("",Font.BOLD,15));
ok =new JButton ("Enregistré ");
an=new JButton("Annuler");
panN=new JPanel();
panN.add(n);
panN.add(nom);
panP=new JPanel();
panP.add(p);
panP.add(prenom);
	jop=new JOptionPane();
panS=new JPanel();
	
panS.add(s);
	panS.add(sx);
	panB=new JPanel();
	panB.add(ok);
	panB.add(an);
	this.setLayout(new GridLayout(4,0));
	this.add(panN);
	this.add(panP);
	this.add(panS);
	this.add(panB);
	nom.addKeyListener(new soratr());
	prenom.addKeyListener(new soratr());
	
	an.addActionListener(new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent arg0) {
			System.exit(0);
			 
		}});
	ok.addActionListener(new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent arg0) {
			if ((getE()=="" && ge=="" )|| (getKey()==32 || getKey()==8)){
				jop.showConfirmDialog(null,"Veuillez completez une des champs","Attention",JOptionPane.WARNING_MESSAGE);
				//System.exit(1);
			
			}else {
				jop.showConfirmDialog(null,"Bienvenue"
						+ " \t \t "+ nom.getText()+" \t "+prenom.getText(),"Felicitation",JOptionPane.CLOSED_OPTION);
				
				setVisible(false);
			
			
			
			}
		}});
	
}
	class soratr implements KeyListener{

		@Override
		public void keyPressed(KeyEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void keyReleased(KeyEvent a) {
			char op=a.getKeyChar();
			ge=ge+op;
		setE(ge);
	getE();
		System.out.println(a.getKeyCode());
		setKey(a.getKeyCode());
		}

		@Override
		public void keyTyped(KeyEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		}
	void setKey(int j){
		key=j;
	}
	int getKey(){
		return key;
		
	}
	
	void setE(String ko){
		this.ge=ko;
	}
	String getE(){
		return ge;}
	
	
}
