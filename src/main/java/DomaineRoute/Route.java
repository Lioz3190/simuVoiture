package DomaineRoute;

/**
 * Created by Lioz-MBPR on 29/03/16.
 */
public class Route {
    private int x , y, taille;

    public Route(int x , int y , int taille ){
        this.x = x;
        this.y = y;
        this.taille = taille;
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public int getTaille(){
        return taille;
    }
}
