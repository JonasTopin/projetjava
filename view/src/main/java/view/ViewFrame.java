package view;
import javax.swing.JFrame;


import model.ConsoleP;

public class ViewFrame extends JFrame  {

	
	private static final long serialVersionUID = 1L;

	public ViewFrame(String map){
		
		this.setTitle("Lorann");
		this.setSize(780, 480);//definie taille de la fenetre (ici on veux 12 images de 34 px)
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setLocationRelativeTo(null);
		
		
		this.add(new ConsoleP(map));
		this.setVisible(true);
		this.setResizable(false);
	}
}