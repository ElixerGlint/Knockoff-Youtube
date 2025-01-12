/**
    * This represents the moveable objects that go right and left across the screen
    * @param x The initial x-coordinate
    * @param y The initial y-coordinate
    * @author Everett
    */
public class movement {
    private int x;
    private int y;



    /**
    * Constructs a new Movement object with initial x and y coordinates.
    * @param x The initial x-coordinate
    * @param y The initial y-coordinate
    */
    public movement(int x, int y) {
        
        this.x = x;
        this.y = y;
    }

    public void move() {
        if(Math.random() > 0.5) {
            x += (int)(Math.random()*10);
        }
        else {
            x -= (int)(Math.random()*10);
        }
        y+= 1;

        if(y>420) {
            y = 230;
            x = (int)(Math.random()*550) + 70;
        }
        if(x>710 || x < 10) {
            y = 230;
            x = (int)(Math.random()*550) + 70;
        }
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }




    
}
