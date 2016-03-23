package AppliSimu;

import javax.swing.*;
import java.awt.*;

/**
 * Created by valentin on 15/03/16.
 */
public class IHMRoute extends JComponent {
    private int x,y;

    public IHMRoute (int x, int y){
        this.x = x;
        this.y = y;
        initGraphic();
    }

    public void initGraphic(){

    }
    public void paint(Graphics contexteGraphique) {
        super.paint(contexteGraphique);
        dessinerRouteHorizontale(contexteGraphique);
       // dessinerRouteVerticale(contexteGraphique);
    }
    private void dessinerRouteHorizontale(Graphics contexteGraphique){
        contexteGraphique.drawLine(this.x,this.y,this.getWidth(),this.y);
        contexteGraphique.drawLine(this.x,this.y+20,this.getWidth(),this.y+20);
    }

    private void dessinerRouteVerticale(Graphics contexteGraphique){
        contexteGraphique.drawLine(250,this.y,250,this.getHeight());
        contexteGraphique.drawLine(250+20,this.y,250+20,this.y);
    }
}
