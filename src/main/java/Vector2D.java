/**
 * Created by Lars on 02/02/2016.
 */
public class Vector2D {

    private int x, y;

    /**
     * Creates a new Vector with specified power in x and y directions.
     * @param x The power in the x axis.
     * @param y The power in the y axis.
     */
    public Vector2D(int x, int y){
        this.x = x;
        this.y = y;
    }

    /**
     * Creates a new zero Vector.
     */
    public Vector2D(){
        this.x = 0;
        this.y = 0;
    }

    /**
     * Sets the value of the power in the x axis.
     * @param x The new power
     */
    public void setX(int x){
        this.x = x;
    }

    /**
     * Sets the value of the power in the y axis.
     * @param y The new power
     */
    public void setY(int y){
        this.y = y;
    }

    /**
     * Returns the power in the x axis.
     * @return
     */
    public int getX(){
        return this.x;
    }

    /**
     * Returns the power in the y axis.
     * @return
     */
    public int getY(){
        return this.y;
    }

    /**
     * Calculates and returns the length of this Vector.
     * @return The length of this Vector
     */
    public double getLength(){
        return Math.sqrt(((double)((x*x)+(y*y))));
    }

    /**
     * Calculates the rotation of this Vector relative to the x axis.
     * @return The rotation in degrees, with a full rotation being 360 degrees
     */
    //TODO calculate rotation
    public int getRotation(){
        int rot = 0;

        return rot;
    }
}
