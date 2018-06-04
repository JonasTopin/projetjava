package view;
import javax.swing.JFrame;


import model.ConsoleP;

/**
 * 
 * @author Eloïse FRANCOIS eloise.francois@viacesi.fr
 *
 */
public class ViewFrame extends JFrame  {

	
	private static final long serialVersionUID = 1L;

/**
 * @param map
 * Define the size of the window */
	public ViewFrame(String map){
		
		this.setTitle("Lorann");
		this.setSize(780, 480);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setLocationRelativeTo(null);
		
		
		this.add(new ConsoleP(map));
		this.setVisible(true);
		this.setResizable(false);
	}
}