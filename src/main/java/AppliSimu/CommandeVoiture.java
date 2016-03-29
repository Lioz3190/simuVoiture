package AppliSimu;

import java.awt.*;
import java.awt.event.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import DomaineVoiture.Voiture;

public class CommandeVoiture extends JPanel implements ActionListener{
	
	private JButton boutonAccelerer;
	private JButton boutonInverserDirection;
	private JButton droite , gauche,arreter;
	private Voiture maVoiture;
	private IHMRoute route;
	
	
	public CommandeVoiture (JFrame fenetre, final Voiture maVoiture) {
		
		super();
		this.setLayout(new FlowLayout());

		boutonAccelerer = new JButton("Accelerer");
		boutonAccelerer.addActionListener(this);
		this.add(boutonAccelerer);
		boutonAccelerer.setFocusable(false);
		boutonInverserDirection = new JButton("Changer direction");
		boutonInverserDirection.addActionListener(this);
		boutonInverserDirection.setFocusable(false);
		droite = new JButton("Droite");
		droite.addActionListener(this);
		droite.setFocusable(false);
		gauche = new JButton("Gauche");
		gauche.addActionListener(this);
		gauche.setFocusable(false);
		this.add(gauche);
		this.add(droite);
		this.add(boutonInverserDirection);

		fenetre.add(this);
		this.maVoiture = maVoiture;
			this.addKeyListener(new KeyAdapter() {
				@Override
				public void keyPressed(KeyEvent e) {
					super.keyPressed(e);
					if (e.getKeyCode() == 32) {
						maVoiture.arreter();
					}
				}
			});
		this.setFocusable(true);

	}



	public void actionPerformed(ActionEvent event) {
		Object bouton = event.getSource();
		if (bouton == boutonAccelerer)
			maVoiture.accelerer();
		else if (bouton == boutonInverserDirection)
			maVoiture.inverserDirection();
		else if (bouton == droite)
			maVoiture.directionDroite();
		else
			maVoiture.directionGauche();

	}
}
