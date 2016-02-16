package com.vengine;

import javafx.scene.canvas.Canvas;

import java.util.ArrayList;

/**
 * Created by Celal on 2-2-2016.
 * Last update 2-2-2016
 */
public class GameWorld {

    //All GameObjects in this com.vengine.GameWorld
    private ArrayList<GameObject> objects;

    private Vector2D gravityVector;

    //The size of the world in units. Didn't want to use pixels to avoid confusion.
    private int unitsX, unitsY;

    //Some settings for a GameWorld
    private boolean hasGravity;
    private ArrayList<GameObject> gameObjects;

    /**
     * Creates a new GameWorld.
     * A GameWorld has these default properties:
     * hasGravity: false
     */
    public GameWorld() {
        this.objects = new ArrayList<GameObject>();
        this.hasGravity = false;
    }

    /**
     * Creates a new GameWorld with specified size.
     * A GameWorld has these default properties:
     * hasGravity: true
     *
     * @param sizeX The size of the world in the x direction
     * @param sizeY The size of the world in the y direction
     */
    public GameWorld(int sizeX, int sizeY) {
        this.objects = new ArrayList<GameObject>();
        this.hasGravity = false;
        this.unitsX = sizeX;
        this.unitsY = sizeY;
    }

    /**
     * Adds the specified com.vengine.GameObject to this com.vengine.GameWorld.
     *
     * @param object The com.vengine.GameObject to be added.
     */
    public void addGameObject(GameObject object) {
        this.objects.add(object);
    }

    /**
     * Removes the specified com.vengine.GameObject from this com.vengine.GameWorld.
     *
     * @param object The com.vengine.GameObject to be removed.
     */
    public void removeGameObject(GameObject object) {
        this.objects.remove(object);
    }

    /**
     * Updates the com.vengine.GameWorld, also calls afterUpdate().
     */
    public final void update() {
        for (GameObject object : objects) {
            //If gravity is enabled in this world, add the gravityVector to all GameObjects
            if (hasGravity && object.isAffectedByGravity()) {
                object.addVector(gravityVector);
            }
            object.update();
        }

        //Call afterUpdate()
        afterUpdate();
    }

    /**
     * Paints specified coordinates on specified Canvas.
     *
     * @param canvas The canvas to be painted on
     * @param x      The x coordinate of the top left corner of the frame in this GameWorld to be painted
     * @param y      The y coordinate of the top left corner of the frame in this GameWorld to be painted
     * @param width  The width of the frame to be painted
     * @param height The height of the frame to be painted
     */
    public void paint(Canvas canvas, int x, int y, int width, int height) {
        for (GameObject object : objects) {
            if (object.getX() >= x && object.getX() < x + width && object.getY() >= y && object.getY() < y + height) {
                //Object within boundaries

            }
        }
    }

    public void paint(Object object, int x, int y, int width, int height) {

    }

    /**
     * Method to be overridden by developers to be able to add code to update(). afterUpdate() is called after update(). (Mind == blown)
     */
    public void afterUpdate() {

    }

    public Vector2D getGravityVector() {
        return gravityVector;
    }

    public void setGravityVector(Vector2D gravityVector) {
        this.gravityVector = gravityVector;
    }

    public boolean hasGravity() {
        return hasGravity;
    }

    public void setHasGravity(boolean hasGravity) {
        this.hasGravity = hasGravity;
    }

    public static GameWorld read(GameWorldFile file) {
        return null;
    }

    public ArrayList<GameObject> getGameObjects() {
        return objects;
    }

    public void setSize(int x, int y) {
        this.unitsX = x;
        this.unitsY = y;
    }

    public void setSizeX(int x) {
        this.setSize(x, this.unitsY);
    }

    public void setSizeY(int y) {
        this.setSize(this.unitsX, y);
    }

    public int getSizeX() {
        return this.unitsX;
    }

    public int getSizeY() {
        return this.unitsY;
    }

}
