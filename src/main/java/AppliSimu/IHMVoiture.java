package AppliSimu;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;

import DomaineVoiture.Voiture;

public class IHMVoiture extends JFrame implements Observer{

	private double paramatreConversionMetresPixels = 0.5;
	private Voiture maVoiture;
	private CommandeVoiture maCommandeVoiture;
	private IHMRoute route ;
	
	private void initGraphique() {
		this.setTitle("Simulateur de Voiture");
		this.setSize(505, 505);

		this.maCommandeVoiture = new CommandeVoiture(this, maVoiture);
		this.setVisible(true);

	}
	
	public IHMVoiture(Voiture maVoiture, IHMRoute maRoute) {
		super();
		this.maVoiture = maVoiture;
		this.route = maRoute;
		maVoiture.addObserver(this);
		initGraphique();
	}

	public IHMVoiture() {
		super();
		initGraphique();
		this.maVoiture = null;

	}
	
	public int calculerPositionPixels(int xMetres) {
		return (int) (paramatreConversionMetresPixels * xMetres);	
	}

	@Override
	public void update(Observable arg0, Object arg1) {
		this.repaint();
	}

	@Override
	public void paint(Graphics contexteGraphique) {
		super.paint(contexteGraphique);
		contexteGraphique.setColor(Color.red);
		dessinerRouteHorizontale(contexteGraphique);
		dessinerVoiture(contexteGraphique);
	}

	private void dessinerRouteHorizontale(Graphics contexteGraphique){
		contexteGraphique.drawLine(0,295,this.getWidth(),295);
		contexteGraphique.drawLine(0,320,this.getWidth(),320);
	}

	private void dessinerRouteVerticale(Graphics contexteGraphique){
		contexteGraphique.drawLine(0,295,this.getWidth(),295);
		contexteGraphique.drawLine(0,320,this.getWidth(),320);
	}


	private void dessinerVoiture(Graphics contexteGraphique) {
		int xMetres = maVoiture.getX();
		int xPixel = calculerPositionPixels(xMetres);
		contexteGraphique.fillRect(xPixel, 300, 30, 15);
	}
	
}