package AppliSimu;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import DomaineVoiture.Voiture;

public class CommandeVoiture extends JPanel implements ActionListener{
	
	private JButton boutonAccelerer;
	private JButton boutonInverserDirection;
	private JButton droite , gauche;
	private Voiture maVoiture;
	private IHMRoute route;
	
	
	public CommandeVoiture (JFrame fenetre, Voiture maVoiture) {
		
		super();
		this.setLayout(new FlowLayout());
 
		boutonAccelerer = new JButton("Accelerer");
		boutonAccelerer.addActionListener(this);
		this.add(boutonAccelerer);

		boutonInverserDirection = new JButton("Changer direction");
		boutonInverserDirection.addActionListener(this);

		droite = new JButton("Droite");
		droite.addActionListener(this);

		gauche = new JButton("Gauche");
		gauche.addActionListener(this);
		this.add(gauche);
		this.add(droite);
		this.add(boutonInverserDirection);

		fenetre.add(this);
		this.maVoiture = maVoiture;
	}


	@Override
	public void actionPerformed(ActionEvent event) {
		Object bouton = event.getSource();
		if (bouton == boutonAccelerer)
			maVoiture.accelerer();
		else if ( bouton == boutonInverserDirection )
			maVoiture.inverserDirection();
		else if ( bouton == droite)
			maVoiture.directionDroite();
		else
			maVoiture.directionGauche();
	}
	

}
