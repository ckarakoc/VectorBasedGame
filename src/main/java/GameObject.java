import java.util.ArrayList;

/**
 * Created by Celal on 2-2-2016.
 * Last update 2-2-2016
 */
public class GameObject {

    private ArrayList<Vector2D> vectors;

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
     * Updates the GameObject.
     */
    public final void update(){
        //Update object

        //Call afterUpdate()
        afterUpdate();
    }
}
