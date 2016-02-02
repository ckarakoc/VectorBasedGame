/**
 * Created by Celal on 2-2-2016.
 * Last update 2-2-2016
 */
public class GameObject {

    /**
     * Creates a new GameObject.
     */
    public GameObject(){

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
