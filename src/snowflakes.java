public class snowflakes {
    private int x;
    private int y;

    public snowflakes(int x, int y) {
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

        System.out.println(x);
        System.out.println(y);
        y-= 100;
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
