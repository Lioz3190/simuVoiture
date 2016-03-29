package AppliSimu;

import DomaineRoute.Route;

import javax.swing.*;
import java.awt.*;

/**
 * Created by valentin on 15/03/16.
 */
public class IHMRoute extends JComponent {
    private Route route;

    public IHMRoute (Route maRoute){
        this.route = maRoute;
        initGraphic();
    }

    public void initGraphic(){
        this.repaint();
    }
    public void paint(Graphics contexteGraphique) {
        super.paint(contexteGraphique);
        dessinerRouteHorizontale(contexteGraphique);
        dessinerRouteVerticale(contexteGraphique);
    }
    private void dessinerRouteHorizontale(Graphics contexteGraphique){
        contexteGraphique.drawLine(route.getX(), route.getY(),route.getTaille(),route.getY());
        contexteGraphique.drawLine(route.getX(),route.getY()+20,route.getTaille(),route.getY()+20);
    }

    private void dessinerRouteVerticale(Graphics contexteGraphique){
        contexteGraphique.drawLine(250,0,250,route.getTaille());
        contexteGraphique.drawLine(270,0,270,route.getTaille());
    }
}
