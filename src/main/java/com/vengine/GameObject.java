package com.vengine;

import java.util.ArrayList;

/**
 * Created by Celal on 2-2-2016.
 * Last update 2-2-2016
 */
public class GameObject {

    private ArrayList<Vector2D> vectors;

    private int x, y;
    private int width, height;//Should we allow for non rectangular hitboxes?

    private boolean isTargetable,
            hasHealth,
            doesCollideWithTerrain,
            doesCollideWithObjects,
            isAffectedByGravity;

    /**
     * Creates a new com.vengine.GameObject.
     * Sets certain default settings:
     * A GameObject has per default these settings:
     * isTargetable: true
     * hasHealth: true
     * doesCollideWithTerrain: true
     * doesColligeWithObjects: false
     * isAffectedByGravity: true
     */
    public GameObject() {
        vectors = new ArrayList<Vector2D>();
        this.setIsTargetable(true);
        this.setHasHealth(true);
        this.setDoesCollideWithTerrain(true);
        this.setDoesCollideWithObjects(false);
        this.setIsAffectedByGravity(true);
    }

    /**
     * Adds the specified com.vengine.Vector2D to this com.vengine.GameObject.
     *
     * @param v The com.vengine.Vector2D to be added
     */
    public void addVector(Vector2D v) {
        this.vectors.add(v);
    }

    /**
     * Removes the specified com.vengine.Vector2D from this com.vengine.GameObject.
     *
     * @param v The com.vengine.Vector2D to be removed
     */
    public void removeVector(Vector2D v) {
        this.vectors.remove(v);
    }

    /**
     * Method to be overridden by developers to be able to add code to update(). afterUpdate() is called after update(). (Mind == blown)
     */
    public void afterUpdate() {

    }

    /**
     * Updates the com.vengine.GameObject, also calls afterUpdate().
     */
    public final void update() {
        //Update object

        //Calculate moving direction and distance from all Vector2Ds in this com.vengine.GameObject
        moveObject();

        //Call afterUpdate()
        afterUpdate();
    }

    /**
     * This method handles the adding of all Vector2Ds in ArrayList<Vector2D> vectors together and lastly adds them to the current coordinates.
     */
    private void moveObject() {
        //This Vector2D will be the final Vector2D resulting from adding all Vector2Ds together.
        Vector2D resultVector = new Vector2D();

        for (Vector2D v : vectors) {
            //Added x and y values to resultVector
            resultVector.setX(resultVector.getX() + v.getX());
            resultVector.setY(resultVector.getY() + v.getY());
        }

        //Remove all Vector2Ds from vectors
        /*
            DESIGN PROBLEM:
                Should we remove all Vector2Ds, then developers would have to re-add Vector2Ds that always occur.
                We could remove just the gravityVector, since that Vector2D is always added in the GameWorld.update() method. But then developers have to remove Vector2Ds that are not the gravityVector manually.
         */
        vectors = new ArrayList<Vector2D>();

        //Finally, add the resultVector x and y values to the current coordinate.
        this.x += resultVector.getX();
        this.y += resultVector.getY();
    }

    public ArrayList<Vector2D> getVectors() {
        return vectors;
    }

    /**
     * Returns the X value of the coordinates that this GameObject is at.
     *
     * @return int
     */
    public int getX() {
        return x;
    }

    /**
     * Sets the X value of the coordinates that this GameObject is at.
     *
     * @param x New value for x
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * Returns the Y value of the coordinates that this GameObject is at.
     *
     * @return int
     */
    public int getY() {
        return y;
    }

    /**
     * Sets the Y value of the coordinates that this GameObject is at.
     *
     * @param y New value for y
     */
    public void setY(int y) {
        this.y = y;
    }

    /**
     * The isTargetable property determines whether this GameObject can be hit by other GameObjects.
     *
     * @return boolean
     */
    public boolean isTargetable() {
        return isTargetable;
    }

    /**
     * The isTargetable property determines whether this GameObject can be hit by other GameObjects.
     *
     * @param targetable New value for isTargetable
     */
    public void setIsTargetable(boolean targetable) {
        isTargetable = targetable;
    }

    /**
     * The hasHealth property determines whether this GameObject has health and is therefore killable. Changing this property when isTargetable is true has no effect.
     *
     * @return boolean
     */
    public boolean hasHealth() {
        return hasHealth;
    }

    /**
     * The hasHealth property determines whether this GameObject has health and is therefore killable. Changing this property when isTargetable is true has no effect.
     *
     * @param hasHealth New value for hasHealth
     */
    public void setHasHealth(boolean hasHealth) {
        this.hasHealth = hasHealth;
    }

    /**
     * The doesCollideWithTerrain property determines whether this GameObject can move through terrain or not.
     *
     * @return boolean
     */
    public boolean doesCollideWithTerrain() {
        return doesCollideWithTerrain;
    }

    /**
     * The doesCollideWithTerrain property determines whether this GameObject can move through terrain or not.
     *
     * @param doesCollideWithTerrain New value for doesCollideWithTerrain
     */
    public void setDoesCollideWithTerrain(boolean doesCollideWithTerrain) {
        this.doesCollideWithTerrain = doesCollideWithTerrain;
    }

    /**
     * The doesCollideWithObjects property determines whether this GameObject can move through other GameObjects or not.
     *
     * @return boolean
     */
    public boolean doesCollideWithObjects() {
        return doesCollideWithObjects;
    }

    /**
     * The doesCollideWithObjects property determines whether this GameObject can move through other GameObjects or not.
     *
     * @param doesCollideWithObjects New value for doesCollideWithObjects
     */
    public void setDoesCollideWithObjects(boolean doesCollideWithObjects) {
        this.doesCollideWithObjects = doesCollideWithObjects;
    }

    /**
     * The isAffectedByGravity property determines whether this GameObject is affected by gravity.
     *
     * @return boolean
     */
    public boolean isAffectedByGravity() {
        return this.isAffectedByGravity;
    }

    /**
     * The isAffectedByGravity property determines whether this GameObject is affected by gravity.
     *
     * @param isAffectedByGravity New value for isAffectedByGravity
     */
    public void setIsAffectedByGravity(boolean isAffectedByGravity) {
        this.isAffectedByGravity = isAffectedByGravity;
    }


}
