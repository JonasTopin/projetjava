package main;

import java.awt.Color;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JPanel;

import controller.ControllerFacade;
import model.ModelFacade;
import showboard.Bone;
import view.ViewFacade;

/**
 * <h1>The Class Main.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public abstract class Main {

    /**
     * The main method.
     *
     * @param args
     *            the arguments
     */
    public static void main(final String[] args) {
        final ControllerFacade controller = new ControllerFacade(new ViewFacade(), new ModelFacade());
        JFrame fenetre = new JFrame();	//instanciation JFrame
        fenetre.setTitle("Lorann_Java_Project");	//titre de la fenetre
        fenetre.setSize(1800, 1000);	//taille de la fenetre
        fenetre.setLocationRelativeTo(null);	//position de la fenetre au centre de la fenetre
        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//permet de fermer la page en cliquant sur la croix
        
        JPanel panel = new JPanel();	//instanciation JPanel
        fenetre.setContentPane(panel);	//JFrame prend en compte le JPanel comme content pane
        fenetre.setContentPane(new Bone());	//affichage de la classe Bone
        fenetre.setVisible(true);	//visibilité de la fenetre
        
        
        
        try {
            controller.start();
        } catch (final SQLException exception) {
            exception.printStackTrace();
        }
    }

}
