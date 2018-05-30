package view;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import showboard.Bone;



/**
 * <h1>The Class ViewFacade provides a facade of the View component.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public class ViewFacade implements IView {

    /**
     * Instantiates a new view facade.
     */
    public ViewFacade() {
        super();
        JFrame fenetre = new JFrame();	//instanciation JFrame
        JPanel panel = new JPanel();	//instanciation JPanel
        
        fenetre.setTitle("Lorann_Java_Project");	//titre de la fenetre
        fenetre.setSize(800,550);	//taille de la fenetre
        fenetre.setLocationRelativeTo(null);	//position de la fenetre au centre de l'ecran
        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//permet de couper le programme en cliquant sur la croix
        
        fenetre.setContentPane(panel);	//JFrame prend en compte le JPanel comme content pane
        fenetre.setBackground(Color.black);	//couleur de fond
        fenetre.setContentPane(new Bone());	//affichage de la classe Bone
        fenetre.setVisible(true);	//visibilité de la fenetre
    }

    /*
     * (non-Javadoc)
     * @see view.IView#displayMessage(java.lang.String)
     */
    @Override
    public final void displayMessage(final String message) {
        JOptionPane.showMessageDialog(null, message);
    }

}
