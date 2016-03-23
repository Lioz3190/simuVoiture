package AppliSimu;

import javax.swing.*;
import java.awt.*;

/**
 * Created by valentin on 15/03/16.
 */
public class IHMRoute extends JComponent {
    private int x,y,taille;

    public IHMRoute (int x, int y,int taille){
        this.x = x;
        this.y = y;
        this.taille = taille;
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
        contexteGraphique.drawLine(this.x,this.y,this.taille,this.y);
        contexteGraphique.drawLine(this.x,this.y+20,this.taille,this.y+20);
    }

    private void dessinerRouteVerticale(Graphics contexteGraphique){
        contexteGraphique.drawLine(250,0,250,this.taille);
        contexteGraphique.drawLine(270,0,270,this.taille);
    }
}
