import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Lecture {
private ArrayList <String> ar;
	public Lecture( ){
	ar=new ArrayList<String>();
		File f=new File("Fiche.txt");
try {
	BufferedReader buf=new BufferedReader(new InputStreamReader(new FileInputStream(f)));
try {
	String lire=buf.readLine();
	int i=0;
	while(lire!=null){
	
		 lire=buf.readLine();
		ar.add(lire);
	System.out.println("lecture des fichier dans l'array :"+ar.get(i));
		lire=buf.readLine();
i++;
	}
lire=buf.readLine();

buf.close();
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

} catch (FileNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}}
ArrayList getAr(){
	return ar;}

int getNombre(){
	return 0;}

}






