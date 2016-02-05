import java.util.ArrayList;

/**
 * Created by Celal on 2-2-2016.
 * Last update 2-2-2016
 */
public class GameObject {

    private ArrayList<Vector2D> vectors;

    private int x, y;
    private int width, height;//Should we allow for non rectangular hitboxes?

    private boolean isTargetable, hasHealth, doesCollideWithTerrain, doesCollideWithObjects;

    /**
     * Creates a new GameObject.
     */
    public GameObject(){
        vectors = new ArrayList<Vector2D>();

    }

    /**
     * Adds the specified Vector2D to this GameObject.
     * @param v The Vector2D to be added
     */
    public void addVector(Vector2D v){
        this.vectors.add(v);
    }

    /**
     * Removes the specified Vector2D from this GameObject.
     * @param v The Vector2D to be removed
     */
    public void removeVector(Vector2D v){
        this.vectors.remove(v);
    }

    /**
     * Method to be overridden by developers to be able to add code to update(). afterUpdate() is called after update(). (Mind == blown)
     */
    public void afterUpdate(){

    }

    /**
     * Updates the GameObject, also calls afterUpdate().
     */
    public final void update(){
        //Update object

        //Call afterUpdate()
        afterUpdate();
    }

    public int getX(){
        return x;
    }

    public void setX(int x){
        this.x = x;
    }

    public int getY(){
        return y;
    }

    public void setY(int y){
        this.y = y;
    }

    public boolean isTargetable() {
        return isTargetable;
    }

    public void setTargetable(boolean targetable) {
        isTargetable = targetable;
    }

    public boolean hasHealth() {
        return hasHealth;
    }

    public void setHasHealth(boolean hasHealth) {
        this.hasHealth = hasHealth;
    }

    public boolean doesCollideWithTerrain() {
        return doesCollideWithTerrain;
    }

    public void setDoesCollideWithTerrain(boolean doesCollideWithTerrain) {
        this.doesCollideWithTerrain = doesCollideWithTerrain;
    }

    public boolean doesCollideWithObjects() {
        return doesCollideWithObjects;
    }

    public void setDoesCollideWithObjects(boolean doesCollideWithObjects) {
        this.doesCollideWithObjects = doesCollideWithObjects;
    }
}
