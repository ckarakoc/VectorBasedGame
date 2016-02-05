import javafx.scene.canvas.Canvas;

import java.util.ArrayList;

/**
 * Created by Celal on 2-2-2016.
 * Last update 2-2-2016
 */
public class GameWorld{

    //All GameObjects in this GameWorld
    private ArrayList<GameObject> objects;

    //The size of the world in units. Didn't want to use pixels to avoid confusion.
    private int unitsX, unitsY;

    /**
     * Creates a new GameWorld.
     */
    public GameWorld(){
        this.objects = new ArrayList<GameObject>();
    }

    /**
     * Adds the specified GameObject to this GameWorld.
     * @param object The GameObject to be added.
     */
    public void addGameObject(GameObject object){
        this.objects.add(object);
    }

    /**
     * Removes the specified GameObject from this GameWorld.
     * @param object The GameObject to be removed.
     */
    public void removeGameObject(GameObject object){
        this.objects.remove(object);
    }

    /**
     * Updates the GameWorld, also calls afterUpdate().
     */
    public final void update(){
        for(GameObject object : objects){
            object.update();
        }
        afterUpdate();
    }

    /**
     * Paints specified coordinates on specified Canvas.
     * @param canvas
     * @param x
     * @param y
     * @param width
     * @param height
     */
    public void paint(Canvas canvas, int x, int y, int width, int height){
        for(GameObject object : objects){
            if(object.getX() >= x && object.getX() < x + width && object.getY() >= y && object.getY() < y + height){
                //Object within boundaries

            }
        }
    }

    /**
     * Method to be overridden by developers to be able to add code to update(). afterUpdate() is called after update(). (Mind == blown)
     */
    public void afterUpdate(){

    }
}
