import java.util.ArrayList;

/**
 * Created by Celal on 2-2-2016.
 * Last update 2-2-2016
 */
public class GameWorld{

    private ArrayList<GameObject> objects;

    /**
     * The size of the world in units. Didn't want to use pixels to avoid confusion.
     */
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
    public void add(GameObject object){
        this.objects.add(object);
    }

    /**
     * Removes the specified GameObject from this GameWorld.
     * @param object The GameObject to be removed.
     */
    public void remove(GameObject object){
        this.objects.remove(object);
    }

    /**
     * Updates the GameWorld.
     */
    public final void update(){

        afterUpdate();
    }

    /**
     * Method to be overridden by developers to be able to add code to update(). afterUpdate() is called after update(). (Mind == blown)
     */
    public void afterUpdate(){

    }
}
